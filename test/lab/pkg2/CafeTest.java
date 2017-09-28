/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2;

import java.util.List;
import javax.swing.JButton;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nabeel Hussain Syed
 */
public class CafeTest {

    @Test
    public void testOrderNow()
    {  
        jButton2.doClick();
        String expected = "Order Price: ";
        assertEquals("Order Price: ",expected);
    }   
}
