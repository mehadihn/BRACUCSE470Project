package com.dineout;

import com.dineout.code.Model.admin.Employee;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class EmployeeTest {

    Employee employee;

    @Before
    public void setUp() throws Exception {
        employee = new Employee("100", "John Doe", "johndoe@restaurant.com", "john", "Accountant", "100", "");
    }

    @Test
    public void testGetId() {
        assertEquals("100", employee.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", employee.getName());
    }

    @Test
    public void testGetEmail() {
        assertEquals("johndoe@restaurant.com", employee.getEmail());
    }

    @Test
    public void testGetSpecialty() {
        assertEquals("Accountant", employee.getSpecialty());
    }

    @Test
    public void getSalary() {
        assertEquals("100", employee.getSalary());
    }

}
