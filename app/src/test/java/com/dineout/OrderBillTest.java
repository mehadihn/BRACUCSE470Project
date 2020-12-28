package com.dineout;

import com.dineout.code.Model.billing.OrderBill;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class OrderBillTest {

    OrderBill orderBill;

    @Before
    public void setup() throws Exception{
        orderBill = new OrderBill();
    }

    @Test
    public void testGetTime(){
        assertEquals("0" , orderBill.getTime());
    }

    @Test
    public void testGetTable(){
        assertEquals("0" , orderBill.getTable());
    }

    @Test
    public void testSetTime(){
        assertEquals("0" , orderBill.getTime());
    }
}
