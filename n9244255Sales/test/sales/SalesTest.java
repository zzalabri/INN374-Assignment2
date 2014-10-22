package sales;

import n9244255sales.Sales;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import n9244255sales.data.Customer;
import n9244255sales.data.State;
import n9244255sales.data.WorkOrder;

/**
 *
 * @author Manuel Brauer
 */
public class SalesTest {
    
    public SalesTest() {
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
     * Test of request method, of class Sales.
     */
    @Test
    public void testRequest() throws Exception {
        System.out.println("request");
        Customer customer = new Customer();
        customer.setPlateNumber("12345A");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Sales instance = (Sales)container.getContext().lookup("java:global/classes/Sales");
        WorkOrder expResult = new WorkOrder("5#42", customer.getPlateNumber());
        expResult.setQuote(42);
        WorkOrder result = instance.request(customer);
        assertEquals(0, result.getDelay());
        assertEquals(State.Quote, result.getState());
        assertEquals(expResult.getQuote(), result.getQuote());
        container.close();
    }

    /**
     * Test of acceptQuote method, of class Sales.
     */
    @Test
    public void testAcceptQuote() throws Exception {
        System.out.println("acceptQuote");
        String id = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Sales instance = (Sales)container.getContext().lookup("java:global/classes/Sales");
        WorkOrder expResult = null;
        WorkOrder result = instance.acceptQuote(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reject method, of class Sales.
     */
    @Test
    public void testReject() throws Exception {
        System.out.println("reject");
        // CASE: reject Quote
        // TODO: create Quote
        String id = "5342";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Sales instance = (Sales)container.getContext().lookup("java:global/classes/Sales");
        instance.reject(id);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        // CASE: reject Offer
        
        // CASE: reject unknown
    }

    /**
     * Test of acceptDelay method, of class Sales.
     */
    @Test
    public void testAcceptDelay() throws Exception {
        System.out.println("acceptDelay");
        String id = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Sales instance = (Sales)container.getContext().lookup("java:global/classes/Sales");
        instance.acceptDelay(id);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
