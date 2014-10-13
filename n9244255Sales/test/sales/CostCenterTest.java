/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sales;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sales.data.WorkOrder;

/**
 *
 * @author Manuel Brauer
 */
public class CostCenterTest {
    
    public CostCenterTest() {
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
     * Test of getQuote method, of class CostCenter.
     */
    @Test
    public void testGetQuote() {
        System.out.println("getQuote");
        
        // CASE: uninsured customer with Audi A3
        WorkOrder wo = null;
        int expResult = 42;
        int result = CostCenter.getQuote(wo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        // CASE: partially insured customer with Hyundai i30
        
        // CASE: fully insured customer with VW Phaeton
        
        // CASE: customer with unknown car
    }
    
}
