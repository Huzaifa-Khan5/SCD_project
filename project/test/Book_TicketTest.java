/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ubaid
 */
public class Book_TicketTest {
    
    public Book_TicketTest() {
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
     * Test of jButton2MouseClicked method, of class Book_Ticket.
     */
    @Test
    public void testJButton2MouseClicked() {
        System.out.println("jButton2MouseClicked");
        MouseEvent evt = null;
        Book_Ticket instance = new Book_Ticket();
        instance.jButton2MouseClicked(evt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jButton1ActionPerformed method, of class Book_Ticket.
     */
    @Test
    public void testJButton1ActionPerformed() {
        System.out.println("jButton1ActionPerformed");
        ActionEvent evt = null;
        Book_Ticket instance = new Book_Ticket();
        instance.jButton1ActionPerformed(evt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Book_Ticket.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Book_Ticket.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
