package com.dineout;

import com.dineout.code.Model.kitchen.DishDb;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DishDbTest {

    DishDb dishDb;

    @Before
    public void setup() throws Exception{
        dishDb = new DishDb("Steak" , "70" , "2000" , "Meat");
    }

    @Test
    public void testGetDishName(){
        assertEquals("Steak" , dishDb.getDishName());
    }

    @Test
    public void testGetEstimatedTime(){
        assertEquals("70" , dishDb.getEstimatedTime());
    }

    @Test
    public void testGetPrice(){
        assertEquals("2000" , dishDb.getPrice());
    }

    @Test
    public void testGetType(){
        assertEquals("Meat" , dishDb.getType());
    }

    @Test
    public void testSetType(){
        dishDb.setType("Fast Food");
        assertEquals("Fast Food" , dishDb.getType());
    }

    @Test
    public void testSetPrice() {
        dishDb.setPrice("2500");
        assertEquals("2000", dishDb.getPrice());
    }

    @Test
    public void testSetEstimatedTime(){
        dishDb.setEstimatedTime("90");
        assertEquals("90" , dishDb.getEstimatedTime());
    }

    @Test
    public void testSetDishName(){
        dishDb.setDishName("Beef Steak");
        assertEquals("Beef Steak" , dishDb.getDishName());
    }

}
