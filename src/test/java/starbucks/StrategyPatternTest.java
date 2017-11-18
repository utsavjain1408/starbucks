

package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StrategyPatternTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StrategyPatternTest
{
    IApp app ;
    
    /**
     * Default constructor for test class StrategyPatternTest
     */
    public StrategyPatternTest()
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
        app = new AppAuthProxy() ;
    }


    @Test
    public void testLandscape()
    {
        // Login to App
        app.touch(1,5);
        app.touch(2,5);
        app.touch(3,5);
        app.touch(4,5);
        // Put in Landscape Mode   
        app.landscape();
        app.execute("B");
        // Validate App is in Landscape Mode 
        // (replace with correct assert)
        assertEquals( app.screen(),"MyCards" ); ;
    }

    @Test
    public void testPortrait()
    {
        // Login to App
        app.touch(1,5);
        app.touch(2,5);
        app.touch(3,5);
        app.touch(4,5);

        // Put in Portrait Mode
        app.portrait();
        app.execute("B");
        assertEquals( app.screen(),"Payments" ); ;
        // Validate App is in Landscape Mode 
        // (replace with correct assert)
      //  assertTrue( false ) ;
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
