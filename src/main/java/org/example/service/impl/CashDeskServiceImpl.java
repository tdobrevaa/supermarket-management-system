package org.example.service.impl;

import org.example.data.CashDesk;
import org.example.data.Good;
import org.example.data.Receipt;
import org.example.data.ReceiptItem;
import org.example.exceptions.NotEnoughMoneyException;
import org.example.service.CashDeskService;
import org.example.service.GoodService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CashDeskServiceImpl implements CashDeskService {
    private GoodService goodService;

    public CashDeskServiceImpl(GoodService goodService) {
        this.goodService = goodService;
    }

    @Override
    public Receipt processSale(CashDesk cashDesk, List<ReceiptItem> requestedItems, double customerMoney, double foodSurcharge, double nonFoodSurcharge, int setNumberDays, double discount, long receiptNumber) {
        List<ReceiptItem> soldItems = new ArrayList<>();
        double total = 0;

        for (ReceiptItem item : requestedItems) {
            Good good = item.getGood();
            int requestedQuantity = item.getQuantity();

            if (goodService.isGoodExpired(good)) {
                continue;
            }

            goodService.isQuantityEnough(good, requestedQuantity);

            double price = goodService.calculateSellingPrice(good, foodSurcharge, nonFoodSurcharge);

            price = goodService.reduceSellingPrice(good, price, setNumberDays, discount);

            good.setQuantity(good.getQuantity() - requestedQuantity);

            total += price * requestedQuantity;
            soldItems.add(new ReceiptItem(good, price, requestedQuantity));

        }

        if (customerMoney < total) {
            throw new NotEnoughMoneyException("Not enough money. Total: " + total + ". Money needed: " + (total - customerMoney));
        }
        return new Receipt(receiptNumber, cashDesk.getCashier(), LocalDateTime.now(), soldItems, total);
    }
}
