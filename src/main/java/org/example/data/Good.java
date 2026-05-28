package org.example.data;

import org.example.enums.Category;

import java.time.LocalDate;

public class Good {
    private long id;
    private String name;
    private double deliveryPrice;
    private Category category;
    private LocalDate expiryDate;
    private int quantity;

    public Good(long id, String name, double deliveryPrice, Category category, LocalDate expiryDate, int quantity) {
        this.id = id;
        this.name = name;
        this.deliveryPrice = deliveryPrice;
        this.category = category;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deliveryPrice=" + deliveryPrice +
                ", category=" + category +
                ", expiryDate=" + expiryDate +
                ", quantity=" + quantity +
                '}';
    }
}
