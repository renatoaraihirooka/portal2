package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

//https://www.youtube.com/watch?v=ZXjgEoSAnxY
//https://www.youtube.com/watch?v=84kUf9ycr9A

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {

        assertTrue( true );
        System.out.println("TESTE OKKKKKKKKKKKKKKKKKKKKKK23");
        String testExecutionKey = System.getProperty("testExecutionKey");
        System.out.println("Test Execution Key: " + testExecutionKey);
    }
}
