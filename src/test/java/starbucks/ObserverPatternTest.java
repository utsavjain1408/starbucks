


package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * The test class ObserverPatternTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ObserverPatternTest
{

    KeyPad k = null;
    PinEntryMachine p = null;
    
    /**
     * Default constructor for test class ObserverPatternTest
     */
    public ObserverPatternTest()
    {

    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        k = new KeyPad();
        p = new PinEntryMachine();
        k.attach(p);
       /* Passcode pc =  new Passcode();
        k.setNext(pc);
        pc.setNext(new Spacer());*/
        // Set up Key Pad and Pin Entry Machine
        // Using Observer Pattern  
    }


    @Test
    public void testOneKey()
    {
        // Key Pad Press 1
        k.touch(1,5);
        // Assert D1 is "1" (replace with appropriate test)
        assertEquals( p.d1(),"1"); ;
    }

    @Test
    public void testTwoKeys()
    {
        // Key Pad Press 1 and 2
        k.touch(1,5);
        k.touch(2,5);
        // Assert D1 and D2 are correct
        // (replace with appropriate test)
        assertEquals( p.d1(),"1"); ;
        assertEquals( p.d2(),"2"); ;
    }

    @Test
    public void testThreeKeys()
    {
        // Key Pad Press 1, 2 and 3
        // Key Pad Press 1 and 2
        k.touch(1,5);
        k.touch(2,5);
        k.touch(3,5);
        // Assert D1 and D2 are correct
        // (replace with appropriate test)
        assertEquals( p.d1(),"1");
        assertEquals( p.d2(),"2");
        assertEquals( p.d3(),"3");
        // Assert D1, D2 and D3 are correct
        // (replace with appropriate test)

     }

    @Test
    public void testFourKeys()
    {
        // Key Pad Press 1, 2 and 3
        // Key Pad Press 1 and 2
        k.touch(1,5);
        k.touch(2,5);
        k.touch(3,5);
        k.touch(4,5);
        // Assert D1 and D2 are correct
        // (replace with appropriate test)
        assertEquals( p.d1(),"1");
        assertEquals( p.d2(),"2");
        assertEquals( p.d3(),"3");
        assertEquals( p.d4(),"4");
        // Assert D1, D2 and D3 are correct
        // (replace with appropriate test)
    }

   @Test
    public void testBackspace()
    {
        // Key Pad Press 1, 2 and 3
        // Key Pad Press 1 and 2
        k.touch(1,5);
        k.touch(2,5);
        k.touch(3,5);
        k.touch(4,5);
        // Assert D1 and D2 are correct
        // (replace with appropriate test)
        assertEquals( p.d1(),"1");
        assertEquals( p.d2(),"2");
        assertEquals( p.d3(),"3");
        assertEquals( p.d4(),"4");
        // Assert D1, D2 and D3 are correct
        // (replace with appropriate test)

        k.touch(3,8);
        assertEquals( p.d4(),"");
        // Key Pad Press 1, 2, 3 and 4 and then backspace


        // Assert D1, D2, D3, D4 are correct
        // (replace with appropriate test)
//        assertTrue( false ) ;

    }
    


    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
