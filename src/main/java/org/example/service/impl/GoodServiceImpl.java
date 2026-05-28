package org.example.service.impl;

import org.example.data.Good;
import org.example.enums.Category;
import org.example.exceptions.NotEnoughQuantityException;
import org.example.service.GoodService;

import java.time.LocalDate;

public class GoodServiceImpl implements GoodService {

    @Override
    public double calculateSellingPrice(Good good, double foodSurcharge, double nonFoodSurcharge) {
        if (good.getCategory() == Category.FOOD) {
            return good.getDeliveryPrice() * (1 + foodSurcharge);
        }
        else {
            return good.getDeliveryPrice() * (1 + nonFoodSurcharge);
        }
    }

    @Override
    public double reduceSellingPrice(Good good, double sellingPrice, int setNumberDays, double discount) {
        LocalDate days = LocalDate.now().plusDays(setNumberDays);
        if (good.getExpiryDate().isBefore(days) && !isGoodExpired(good)) {
            return sellingPrice * (1 - discount);
        }
        return sellingPrice;
    }

    @Override
    public boolean isGoodExpired(Good good) {
        return good.getExpiryDate().isBefore(LocalDate.now());
    }

    @Override
    public void isQuantityEnough(Good good, int requestedQuantity) {
        if (requestedQuantity > good.getQuantity()) {
            throw new NotEnoughQuantityException("Not enough quantity of " + good.getName() + ". Quantity needed: " + (requestedQuantity - good.getQuantity()));
        }
    }
}
