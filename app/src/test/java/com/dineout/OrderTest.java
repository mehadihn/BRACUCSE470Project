package com.dineout;

import com.dineout.code.Model.kitchen.Order;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderTest {
    Order order;

    @Before
    public void setup() throws Exception{
        order = new Order ("Cooking" , "Burger");
    }

    @Test
    public void testGetStatus() {
        assertEquals("Cooking", order.getStatus());
    }

    @Test
    public void testGetItemName() {
        assertEquals("Burger", order.getItemName());
    }

    @Test
    public void testSetStatus(){
        order.setStatus("Cooked");
        assertEquals("Cooked", order.getStatus());
    }

    public void testSetItemName() {
        order.setItemName("Ice Cream");
        assertEquals("Ice Cream", order.getItemName());
    }

}
