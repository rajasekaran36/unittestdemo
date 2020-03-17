package com.kgisl.raja;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

import java.util.ArrayList;

import com.kgisl.raja.model.Employee;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * EmployeeTest
 */
public class EmployeeTest {
    @BeforeClass
    public static void setup() {
        System.out.println("@BeforeClass");
    }
 
    @Before
    public void setupThis() {
        System.out.println("@Before");
    }
 
    @Test
    @Ignore
    public void method() {
        org.junit.Assert.assertTrue(new ArrayList().isEmpty());
    }
    @Test
    public void getEmployeeNameTest(){
        Employee e = new Employee();
        e.setName("Shiva");
        assertEquals(e.getName(), "Shiva");
        
    }

    @Test
    public void assem(){
        System.setProperty("dev", "ubuntu");

        assumeTrue("ubuntucheck","ubuntu".equals(System.getProperty("dev")));
        
    }
 
    @After
    public void tearThis() {
        System.out.println("@After");
    }
 
    @AfterClass
    public static void tear() {
        System.out.println("@AfterClass");
    }
}