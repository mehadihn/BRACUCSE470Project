package com.dineout;

import com.dineout.code.Model.admin.Table;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TableTest {
    Table table;

    @Before
    public void setup() throws Exception{
        table = new Table ("10101" , "Occupy" , "4");
    }

    @Test
    public void testGetTableID(){
        assertEquals("10101", table.getTableID());
    }

    @Test
    public void testGetStatus(){
        assertEquals("Occupy", table.getStatus());
    }

    @Test
    public void testGetCapicity(){
        assertEquals("4", table.getCapacity());
    }

    @Test
    public void testSetCapicity(){
        table.setCapacity("5");
        assertEquals("5", table.getCapacity());
    }

    @Test
    public void testSetTableID(){
        table.setTableID("10102");
        assertEquals("10102", table.getTableID());
    }

    @Test
    public void testSetTableStatus(){
        table.setStatus("Free");
        assertEquals("Free", table.getStatus());
    }


}
