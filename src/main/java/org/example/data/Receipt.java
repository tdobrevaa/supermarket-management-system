package org.example.data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Receipt implements Serializable {
    private long serialNumber;
    private Cashier cashier;
    private LocalDateTime dateTime;
    private List<ReceiptItem> receiptItems;
    private double total;

    public Receipt(long serialNumber, Cashier cashier, LocalDateTime dateTime, List<ReceiptItem> receiptItems, double total) {
        this.serialNumber = serialNumber;
        this.cashier = cashier;
        this.dateTime = dateTime;
        this.receiptItems = new ArrayList<>();
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

    public List<ReceiptItem> getReceiptItems() {
        return receiptItems;
    }

    public void setReceiptItems(List<ReceiptItem> receiptItems) {
        this.receiptItems = receiptItems;
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
                ", receiptItems=" + receiptItems +
                ", total=" + total +
                '}';
    }
}
