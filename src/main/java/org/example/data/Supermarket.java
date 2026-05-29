package org.example.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Supermarket implements Serializable {
    private List<Cashier> cashiers;
    private List<Good> goods;
    private List<Receipt> receipts;

    public Supermarket(List<Cashier> cashiers, List<Good> goods, List<Receipt> receipts) {
        this.cashiers = new ArrayList<>();
        this.goods = new ArrayList<>();
        this.receipts = new ArrayList<>();
    }

    public List<Cashier> getCashiers() {
        return cashiers;
    }

    public void setCashiers(List<Cashier> cashiers) {
        this.cashiers = cashiers;
    }

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }

    public List<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<Receipt> receipts) {
        this.receipts = receipts;
    }

    @Override
    public String toString() {
        return "Supermarket{" +
                "cashiers=" + cashiers +
                ", goods=" + goods +
                ", receipts=" + receipts +
                '}';
    }
}
