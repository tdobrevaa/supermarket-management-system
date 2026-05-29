package org.example.data;

import java.io.Serializable;

public class ReceiptItem implements Serializable {
    private Good good;
    private double sellingPrice;
    private int quantity;

    public ReceiptItem(Good good, int quantity) {
        this.good = good;
        this.quantity = quantity;
    }

    public ReceiptItem(Good good, double sellingPrice, int quantity) {
        this.good = good;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ReceiptItem{" +
                "good=" + good +
                ", sellingPrice=" + sellingPrice +
                ", quantity=" + quantity +
                '}';
    }
}
