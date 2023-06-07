package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
    }
    
        public void testSortingAppWithNoArguments() {
            String[] args = new String[0];
            SortingApp.main(args);
            
        }


        public void testSortingAppWithOneArgument() {
            String[] args = {"5"};
            SortingApp.main(args);
           
        }


        public void testSortingAppWithTenArguments() {
            String[] args = {"9", "5", "2", "8", "1", "6", "3", "7", "4", "0"};
            SortingApp.main(args);
           
        }


        public void testSortingAppWithMoreThanTenArguments() {
            String[] args = {"9", "5", "2", "8", "1", "6", "3", "7", "4", "0", "10"};
            SortingApp.main(args);
            
        }
    }
}
