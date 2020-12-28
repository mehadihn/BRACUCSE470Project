package com.dineout;

import com.dineout.code.Model.billing.DishPrice;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DishPriceTest {

    DishPrice dishPrice;

    @Before
    public void setup() throws Exception{
        dishPrice = new DishPrice("Pizza", "500", "30" , "Fast Food");
    }

    @Test
    public void testGetDishname(){
        assertEquals("Pizza" , dishPrice.getDishname());
    }

    @Test
    public void testGetPrice(){
        assertEquals("500" , dishPrice.getPrice());
    }

    @Test
    public void testGetEstimatedtime(){
        assertEquals("30" , dishPrice.getEstimatedtime());
    }

    @Test
    public void testGetTypeofdish(){
        assertEquals("Fast Food" , dishPrice.getTypeofdish());
    }

    @Test
    public void testSetTypeofdish(){
        dishPrice.setTypeofdish("Italian");
        assertEquals("Italian" , dishPrice.getTypeofdish());
    }

    @Test
    public void testSetEstimatedtime(){
        dishPrice.setEstimatedtime("60");
        assertEquals("60" , dishPrice.getEstimatedtime());
    }

    @Test
    public void testSetPrice(){
        dishPrice.setPrice("600");
        assertEquals("600" , dishPrice.getPrice());
    }

    @Test
    public void testSetDishname(){
        dishPrice.setDishname("Burger");
        assertEquals("Burger" , dishPrice.getDishname());
    }
}
