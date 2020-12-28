package com.dineout;

import com.dineout.code.Model.kitchen.AttendanceDb;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttendanceDbTest {
    AttendanceDb attendanceDb;

    @Before
    public void setup() throws Exception{
        attendanceDb = new AttendanceDb("1010101" , true);
    }

    @Test
    public void testGetId() {
        assertEquals("1010101" , attendanceDb.getId());
    }

    @Test
    public void getPresent() {
        assertEquals(true, attendanceDb.getPresent());
    }

    @Test
    public void testSetId() {
        attendanceDb.setId("011111");
        assertEquals("011111" , attendanceDb.getId());
    }

    @Test
    public void testSetPresent() {
        attendanceDb.setPresent(false);
        assertEquals(false, attendanceDb.getPresent());
    }


}
