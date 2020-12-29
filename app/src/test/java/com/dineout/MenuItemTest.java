package com.dineout;

import com.dineout.code.Model.order.MenuItem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuItemTest {
    MenuItem menuItem;

    @Before
    public void setup() throws Exception{
        menuItem = new MenuItem("Beef Steak", "Beef" , "1");
    }

    @Test
    public void testGetDishName() {
        assertEquals("Beef Steak", menuItem.getDishName());
    }

    @Test
    public void getIngredientName() {
        assertEquals("Beef", menuItem.getIngredientName());
    }

    @Test
    public void testGetQuantity() {
        assertEquals("1", menuItem.getQuantity());
    }

    @Test
    public void testSetDishName() {
        menuItem.setDishName("Chicken Steak");
        assertEquals("Chicken Steak", menuItem.getDishName());
    }

    @Test
    public void setIngredientName() {
        menuItem.setIngredientName("Chicken");
        assertEquals("Chicken", menuItem.getIngredientName());
    }

    @Test
    public void testSetQuantity() {
        menuItem.setQuantity("2");
        assertEquals("2", menuItem.getQuantity());
    }
}
