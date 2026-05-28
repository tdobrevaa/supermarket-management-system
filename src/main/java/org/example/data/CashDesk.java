package org.example.data;

public class CashDesk {
    private long id;
    private Cashier cashier;

    public CashDesk(long id, Cashier cashier) {
        this.id = id;
        this.cashier = cashier;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    @Override
    public String toString() {
        return "CashDesk{" +
                "id=" + id +
                ", cashier=" + cashier +
                '}';
    }
}
