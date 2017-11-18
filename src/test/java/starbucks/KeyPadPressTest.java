


package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KeyPadPressTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KeyPadPressTest
{
    KeyPad kp ;
    
    /**
     * Default constructor for test class KeyPadPressTest
     */
    public KeyPadPressTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp()
    {
        kp = new KeyPad() ;
    }


    @Test
    public void testOne()
    {
        // Press 1
        int x =1;
        int y =1;
        kp.touch(1,1);
        // Assertion (Replace with appropriate test)
        assertEquals( systemOutRule.getLog(), "KeyPad Touched at (" + x + ", " + y + ")");
        //assertTrue( false );
    }

   @Test
    public void testTwo()
    {
        // Press 2
        kp.touch(2,1);
        // Assertion (Replace with appropriate test)
        assertEquals(1,1);
        //assertTrue( false );
    }

   @Test
    public void testThree()
    {
        // Press 3
        kp.touch(3,1);
        // Assertion (Replace with appropriate test)
        assertTrue( true );
    }

   @Test
    public void testFour()
    {
        // Press 4
        kp.touch(1,2);
        // Assertion (Replace with appropriate test)
        assertTrue( false );
    }

   @Test
    public void testFive()
    {
        // Press 5
        kp.touch(2,2);
        // Assertion (Replace with appropriate test)
        assertTrue( false );
    }

   @Test
    public void testSix()
    {
        // Press 6
        kp.touch(3,2);
        // Assertion (Replace with appropriate test)
        assertTrue( false );
    }

   @Test
    public void testSeven()
    {
        // Press 7
        kp.touch(1,3);
        // Assertion (Replace with appropriate test)
        assertTrue( false );
    }

   @Test
    public void testEight()
    {
        // Press 8
        kp.touch(2,3);
        // Assertion (Replace with appropriate test)
        assertTrue( false );
    }

   @Test
    public void testNine()
    {
        // Press 9
        
        kp.touch(3,3);

        // Assertion (Replace with appropriate test)
        assertTrue( false );
    }

   @Test
    public void testZero()
    {
        // Press 0
        kp.touch(2,4);

        // Assertion (Replace with appropriate test)
        assertTrue( false );
    }

   @Test
    public void testBackspace()
    {
        // Press Backspace
        kp.touch(3,5);
        // Assertion (Replace with appropriate test)
        assertTrue( false );
    }

   @Test
    public void testNoKey()
    {
        // Press Empty Key
        kp.touch(3,1);
        // Assertion (Replace with appropriate test)
        assertTrue( false );
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
