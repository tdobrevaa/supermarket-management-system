package org.example.data;

import java.time.LocalDateTime;
import java.util.List;

public class Receipt {
    private long serialNumber;
    private Cashier cashier;
    private LocalDateTime dateTime;
    private List<Good> goods;
    private double total;

    public Receipt(long serialNumber, Cashier cashier, LocalDateTime dateTime, List<Good> goods, double total) {
        this.serialNumber = serialNumber;
        this.cashier = cashier;
        this.dateTime = dateTime;
        this.goods = goods;
        this.total = total;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "serialNumber=" + serialNumber +
                ", cashier=" + cashier +
                ", dateTime=" + dateTime +
                ", goods=" + goods +
                ", total=" + total +
                '}';
    }
}
