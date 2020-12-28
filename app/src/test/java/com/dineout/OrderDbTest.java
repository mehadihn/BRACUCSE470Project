package com.dineout;

import com.dineout.code.Model.kitchen.OrderDb;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderDbTest {
    OrderDb orderDb;

    @Before
    public void setup() throws Exception{
        orderDb = new OrderDb("11111" , 0 , "10101" , "13:30 Saturday");
    }

    @Test
    public void testGetId(){
        assertEquals("11111" , orderDb.getId());
    }

    @Test
    public void testGetStatus() {
        assertEquals(0 , orderDb.getStatus());
    }

    @Test
    public void testGetTableID() {
        assertEquals("10101" , orderDb.getTableID());
    }

    @Test
    public void testGetTimestamp() {
        assertEquals("13:30 Saturday" , orderDb.getTimestamp());
    }

    @Test
    public void testSetId() {
        orderDb.setId("121212");
        assertEquals("121212" , orderDb.getId());
    }

    @Test
    public void testSetStatus() {
        orderDb.setStatus(1);
        assertEquals(1 , orderDb.getStatus());
    }

    @Test
    public void testSetTableID() {
        orderDb.setTableID("9999");
        assertEquals("9999" , orderDb.getTableID());
    }

    @Test
    public void testSetTimestamp() {
        orderDb.setTimestamp("15:30 Monday");
        assertEquals("15:30 Monday" , orderDb.getTimestamp());
    }
}
