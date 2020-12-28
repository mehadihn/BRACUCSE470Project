package com.dineout;

import com.dineout.code.Model.admin.Employee;
import com.dineout.code.Model.admin.Menu;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {
    Menu menu;

    @Before
    public void setUp() throws Exception {
        menu = new Menu("Chicken Briyani", "30", "Indian", "150");
    }

    @Test
    public void testGetDishName(){
        assertEquals("Chicken Briyani" , menu.getDishName());
    }

    @Test
    public void testGetEstimatedTime(){
        assertEquals("30" , menu.getEstimatedTime());
    }

    @Test
    public void testGetType(){
        assertEquals("Indian" , menu.getType());
    }

    @Test
    public void testGetPrice(){
        assertEquals("150" , menu.getPrice());
    }

    @Test
    public void testSetPrice(){
        menu.setPrice("200");
        assertEquals("200" , menu.getPrice());
    }

    @Test
    public void testSetType(){
        menu.setType("Chinese");
        assertEquals("Chinese" , menu.getType());
    }

    @Test
    public void testSetEstimateTime(){
        menu.setEstimatedTime("40");
        assertEquals("40" , menu.getEstimatedTime());
    }

}
