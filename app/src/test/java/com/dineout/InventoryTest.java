package com.dineout;

import com.dineout.code.Model.billing.DishOrder;
import com.dineout.code.Model.order.Inventory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InventoryTest {
    Inventory inventory;

    @Before
    public void setup() throws Exception{
        inventory = new Inventory("Garlic" , 50 , 10);
    }

    @Test
    public void testGetName() {
        assertEquals("Garlic" , inventory.getName());
    }

    @Test
    public void testGetPrice() {
        assertEquals(50 , inventory.getPrice());
    }

    @Test
    public void testGetQuantity() {
        assertEquals(10 , inventory.getQuantity());
    }

    @Test
    public void testSetName() {
        inventory.setName("Onion");
        assertEquals("Onion" , inventory.getName());
    }

    @Test
    public void testSetPrice() {
        inventory.setPrice(100);
        assertEquals(100 , inventory.getPrice());
    }

    @Test
    public void testSetQuantity() {
        inventory.setQuantity(200);
        assertEquals(200 , inventory.getQuantity());
    }
}
