package com.dineout;

import com.dineout.code.Model.billing.DishOrder;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.security.spec.ECField;

public class DishOrderTest {
    DishOrder dishOrder;

    @Before
    public void setup() throws Exception{
        dishOrder = new DishOrder(1 , "500");
    }

    @Test
    public void testGetQuantity(){
        assertEquals(1 , dishOrder.getQuantity());
    }

    @Test
    public void testSetQuantity(){
        dishOrder.setQuantity(4);
        assertEquals(4 , dishOrder.getQuantity());
    }

    @Test
    public void testGetTotal(){
        assertEquals(500 , dishOrder.getTotal());
    }
}
