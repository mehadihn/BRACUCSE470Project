package com.dineout;

import com.dineout.code.Model.hall.DB.NotificationClass;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotificationClassTest {
    NotificationClass notificationClass;

    @Before
    public void setup() throws Exception{
        notificationClass = new NotificationClass("Chicken" , true , "13:30");
    }

    @Test
    public void testGetItemName() {
        assertEquals("Chicken" , notificationClass.getItemName());
    }

    @Test
    public void testIsRead() {
        assertEquals(true , notificationClass.isRead());
    }

    @Test
    public void testGetTime() {
        assertEquals("13:30" , notificationClass.getTime());
    }

    @Test
    public void testSetItemName() {
        notificationClass.setItemName("Mutton");
        assertEquals("Mutton" , notificationClass.getItemName());
    }

    @Test
    public void testSetRead() {
        notificationClass.setRead(false);
        assertEquals(false , notificationClass.isRead());
    }

    @Test
    public void testSetTime() {
        notificationClass.setTime("14:00");
        assertEquals("14:00" , notificationClass.getTime());
    }
}
