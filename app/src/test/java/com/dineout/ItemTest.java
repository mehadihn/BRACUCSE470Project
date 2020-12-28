package com.dineout;

import com.dineout.code.Model.admin.Item;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void setup() throws Exception{
        item = new Item("Burger", "100", "10", "1");
    }

    @Test
    public void testGetName(){
        assertEquals("Burger" , item.getName());
    }

    @Test
    public void testGetPrice(){
        assertEquals("100" , item.getPrice());
    }

    @Test
    public void testGetQuantity(){
        assertEquals("10" , item.getQuantity());
    }

    @Test
    public void testGetThreshold(){
        assertEquals("1" , item.getThreshold());
    }

    @Test
    public void testSetPrice(){
        item.setPrice("200");
        assertEquals("200" , item.getPrice());
    }


}
