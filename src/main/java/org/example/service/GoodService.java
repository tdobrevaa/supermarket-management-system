package org.example.service;

import org.example.data.Good;

import java.time.LocalDate;

public interface GoodService {
    public double calculateSellingPrice(Good good, double foodSurcharge, double nonFoodSurcharge);

    public double reduceSellingPrice(Good good, double sellingPrice, int setNumberDays, double discount);

    public boolean isGoodExpired(Good good);

    public void isQuantityEnough(Good good, int requestedQuantity);
}
