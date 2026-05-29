package org.example.service.impl;

import org.example.data.Cashier;
import org.example.data.Good;
import org.example.data.Receipt;
import org.example.data.Supermarket;
import org.example.service.SupermarketService;

public class SupermarketServiceImpl implements SupermarketService {
    @Override
    public double calculateExpenses(Supermarket supermarket) {
        double salaries = 0;
        double deliveries = 0;

        for (Cashier cashier : supermarket.getCashiers()) {
            salaries += cashier.getMonthSalary();
        }

        for(Good good : supermarket.getGoods()) {
            deliveries += good.getDeliveryPrice() * good.getQuantity();
        }
        return salaries + deliveries;
    }

    @Override
    public double calculateSellsIncome(Supermarket supermarket) {
        double sellsIncome = 0;
        for (Receipt receipt : supermarket.getReceipts()) {
            sellsIncome += receipt.getTotal();
        }
        return sellsIncome;
    }

    @Override
    public double calculateProfit(Supermarket supermarket) {
        return calculateSellsIncome(supermarket) - calculateExpenses(supermarket);
    }
}
