package com.dineout.code.Model.order;

import java.util.Date;

//Contains details about ingridients ,their status,expiry e.t.c

public class Inventory {
    public String name;
    public Date expiryDate;
    public int price;
    public int quantity;

    public Inventory(String name, Date expiryDate, int price, int quantity) {
        this.name = name;
        this.expiryDate = expiryDate;
        this.price = price;
        this.quantity = quantity;
    }

    public Inventory(String name,  int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {

        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
