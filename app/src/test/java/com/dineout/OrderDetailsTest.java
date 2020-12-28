package com.dineout;

import com.dineout.code.Model.order.OrderDetails;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderDetailsTest {
    OrderDetails orderDetails;

    @Before
    public void setup() throws Exception{
        orderDetails = new OrderDetails("Tehari" , 40 , "1", 1, 0 , 1);
    }

    @Test
    public void testGetDishname() {
        assertEquals("Tehari", orderDetails.getDishname());
    }

    @Test
    public void testGetEstimatedtime() {
        assertEquals(40, orderDetails.getEstimatedtime());
    }

    @Test
    public void testGetOrderid() {
        assertEquals("1", orderDetails.getOrderid());
    }

    @Test
    public void testGetPriority() {
        assertEquals(1, orderDetails.getPriority());
    }

    @Test
    public void testGetServings() {
        assertEquals(0, orderDetails.getServings());
    }

    @Test
    public void testGetStatus() {
        assertEquals(1, orderDetails.getStatus());
    }

    @Test
    public void testSetDishname() {
        orderDetails.setDishname("Pizza");
        assertEquals("Pizza", orderDetails.getDishname());
    }

    @Test
    public void testSetEstimatedtime() {
        orderDetails.setEstimatedtime(50);
        assertEquals(50, orderDetails.getEstimatedtime());
    }

    @Test
    public void testSetOrderid() {
        orderDetails.setOrderid("90");
        assertEquals("90", orderDetails.getOrderid());
    }

    @Test
    public void testSetPriority() {
        orderDetails.setPriority(2);
        assertEquals(2, orderDetails.getPriority());
    }

    @Test
    public void testSetServings() {
        orderDetails.setServings(1);
        assertEquals(1, orderDetails.getServings());
    }

    @Test
    public void testSetStatus() {
        orderDetails.setStatus(1);
        assertEquals(1, orderDetails.getStatus());
    }
}
