package com.dineout;

import com.dineout.code.Model.order.Cart;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class cartTest {
    Cart cart;

    @Before
    public void setup() throws Exception{
        Cart cart = new Cart("Pasta" , 2);
    }

    @Test
    public void testGetAddedname() {
        assertEquals("Pasta" , cart.getAddedname());
    }

    @Test
    public void testGetQuantity() {
        assertEquals(2 , cart.getQuantity());
    }

    @Test
    public void testSetAddedname() {
        cart.setAddedname("Fried Rice");
        assertEquals("Fried Rice" , cart.getAddedname());
    }

    @Test
    public void testSetQuantity() {
        cart.setQuantity(3);
        assertEquals(3 , cart.getQuantity());
    }

}
