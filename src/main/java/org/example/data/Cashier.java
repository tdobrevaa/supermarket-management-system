package org.example.data;

import java.io.Serializable;

public class Cashier implements Serializable {
    private long id;
    private String name;
    private double monthSalary;

    public Cashier(long id, String name, double monthSalary) {
        this.id = id;
        this.name = name;
        this.monthSalary = monthSalary;
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

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", monthSalary=" + monthSalary +
                '}';
    }
}
