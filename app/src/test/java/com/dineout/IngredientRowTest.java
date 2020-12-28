package com.dineout;

import com.dineout.code.Model.admin.IngredientRow;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientRowTest {

    IngredientRow  IngredientRow;

    @Before
    public void setup() throws Exception{
        IngredientRow = new IngredientRow("Potato" , "20");
    }

    @Test
    public void testGetName() {
        assertEquals("Potato", IngredientRow.getName());
    }

    @Test
    public void testSetName() {
        IngredientRow.setName("Onion");
        assertEquals("Onion", IngredientRow.getName());

    }

    @Test
   public void testGetQuantity() {
        assertEquals("20", IngredientRow.getQuantity());
    }

    @Test
    public void testSetQuantity() {
        IngredientRow.setQuantity("2");
        assertEquals("2", IngredientRow.getQuantity());
    }

}
