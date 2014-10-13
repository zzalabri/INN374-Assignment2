/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sales;

import java.util.UUID;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manuel Brauer
 */
public class ResourcePlannerTest {
    
    public ResourcePlannerTest() {
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
     * Test of inStock method, of class ResourcePlanner.
     */
    @Test
    public void testInStock() throws Exception {
        System.out.println("inStock");
        String offerId = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ResourcePlanner instance = (ResourcePlanner)container.getContext().lookup("java:global/classes/ResourcePlanner");
        instance.inStock(offerId);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareStock method, of class ResourcePlanner.
     */
    @Test
    public void testPrepareStock() throws Exception {
        System.out.println("prepareStock");
        
        // CASE: Audi A3
        String model = "Audi A3";
        int expResult = 7;
        int result = ResourcePlanner.prepareStock(model);
        assertEquals("Unexpected delay time",expResult, result);
        
        // CASE: Hyundai i30
        model = "Hyundai i30";
        expResult = 3;
        result = ResourcePlanner.prepareStock(model);
        assertEquals("Unexpected delay time",expResult, result);
        
        // CASE: VW Phaeton
        model = "VW Phaeton";
        expResult = 21;
        result = ResourcePlanner.prepareStock(model);
        assertEquals("Unexpected delay time",expResult, result);
        
        // CASE: unknown
        model = UUID.randomUUID().toString();
        expResult = 30;
        result = ResourcePlanner.prepareStock(model);
        assertEquals("Delay time for unknown car model is wrong",expResult, result);
    }
    
}
