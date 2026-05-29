package org.example.service;

import org.example.data.CashDesk;
import org.example.data.Cashier;
import org.example.data.Good;
import org.example.data.Supermarket;

public interface SupermarketService {
    public double calculateExpenses(Supermarket supermarket);
    public double calculateSellsIncome(Supermarket supermarket);
    public double calculateProfit(Supermarket supermarket);
}
