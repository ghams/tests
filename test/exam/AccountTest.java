/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class AccountTest {

    Account acc = new Account();

    public AccountTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setOwner method, of class Account.
     */
    @Test
    public void testSetOwner() {
        try {
            acc.setOwner(null);
        } catch (IllegalArgumentException ex) {
            assertEquals("Illegal owner", ex.getMessage());
        }
        try {
            acc.setOwner("");
        } catch (IllegalArgumentException ex) {
            assertEquals("Illegal owner", ex.getMessage());
        }
    }

    /**
     * Test of setIRate method, of class Account.
     */
    @Test
    public void testSetIRate() {
        try {
            acc.setIRate(-1);
        } catch (IllegalArgumentException ex) {
            assertEquals("Illegal interest rate", ex.getMessage());
        }
    }

    @Test
    public void testConstructor() {
        try {
            new Account("", 100, 12);
        } catch (IllegalArgumentException ex) {
            assertEquals("Illegal owner", ex.getMessage());
        }
        try {
            new Account(null, 100, 12);
        } catch (IllegalArgumentException ex) {
            assertEquals("Illegal owner", ex.getMessage());
        }
        try {
            new Account("Hola", 100, -1);
        } catch (IllegalArgumentException ex) {
            assertEquals("Illegal interest rate", ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Account.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Account.main(args);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}