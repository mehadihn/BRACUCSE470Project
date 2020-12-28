package com.dineout;

import com.dineout.code.Model.admin.Employee;
import com.dineout.code.Model.kitchen.EmployeeDb;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeDbTest {
    EmployeeDb employeeDb;

    @Before
    public void setup() throws Exception{
        employeeDb = new EmployeeDb ("johndoe@restaurant.com" , "1111111", "John Doe", "qwert", "10000" , "Chinese Food", "Chef");
    }

    @Test
    public void testGetEmail() {
        assertEquals("johndoe@restaurant.com" , employeeDb.getEmail());
    }

    @Test
    public void testGetId() {
        assertEquals("1111111" , employeeDb.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe" , employeeDb.getName());
    }

    @Test
    public void testGetPassword() {
        assertEquals("qwert" , employeeDb.getPassword());
    }

    @Test
    public void testGetSalary() {
        assertEquals("10000" , employeeDb.getSalary());
    }

    @Test
    public void testGetSpeciality() {
        assertEquals("Chinese Food" , employeeDb.getSpeciality());
    }

    @Test
    public void testGetType() {
        assertEquals("Chef" , employeeDb.getType());
    }

    @Test
    public void testSetType() {
        employeeDb.setType("Waiter");
        assertEquals("Waiter" , employeeDb.getType());
    }

    @Test
    public void testSetSpeciality() {
        employeeDb.setSpecialty("Maxican Food");
        assertEquals("Maxican Food" , employeeDb.getSpeciality());
    }

    @Test
    public void testSetSalary() {
        employeeDb.setSalary("20000");
        assertEquals("20000" , employeeDb.getSalary());
    }

    @Test
    public void testSetName() {
        employeeDb.setName("Jane Doe");
        assertEquals("Jane Doe" , employeeDb.getName());
    }

}
