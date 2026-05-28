package org.example.service;

import org.example.data.CashDesk;
import org.example.data.Receipt;
import org.example.data.ReceiptItem;

import java.util.List;

public interface CashDeskService {
    public Receipt processSale(CashDesk cashDesk, List<ReceiptItem> requestedItems, double customerMoney, double foodSurcharge, double nonFoodSurcharge, int setNumberDays, double discount, long receiptNumber);
}
