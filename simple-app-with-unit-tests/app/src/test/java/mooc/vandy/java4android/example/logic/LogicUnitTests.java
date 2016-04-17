package mooc.vandy.java4android.example.logic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.magnum.autograder.junit.Rubric;
import mooc.vandy.java4android.example.logic.Logic;
import mooc.vandy.java4android.example.logic.tools.TestingOutputInterface;
import mooc.vandy.java4android.example.ui.OutputInterface;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 * </ p>
 * https://en.wikipedia.org/wiki/Unit_testing
 */
public class LogicUnitTests {

    // value for setting max 'time' in each test, before it 'times out'
    private static final long TIMEOUT = 100;
    // the test logic interface instance variable
    LogicInterface mLogic;
    // the test output interface instance variable
    OutputInterface mOut;

    /**
     * This method is special because of the '@Before' annotation before it.
     * </ p>
     * Ideally each unit test should be able to (and they are in this project) be
     * independent of the others. This means that each unit test and external state of the program
     * wont impact other unit tests. This annotation is meant to save time/effort of developers,
     * by allowing the 'setup' steps of each test to be localize (also reduces accidental typo
     * errors, etc.
     */
    @Before
    public void setupClassesForEachTest() {
        mOut = new TestingOutputInterface(); // create a test output interface instance.
        mLogic = new Logic(mOut); // create a test logic instance w/ our 'testing' output interface
    }

    /**
     * This is our custom 'Rubric' annotation. This allows us to extend the standard JUnit unit testing
     * framework and incorporate additional data into the test that is not normally possible. This
     * data includes the name of this test, the goal of this test, the amount of points this individual
     * test case is worth, and a reference field that will assist you in figuring out how to resolve
     * any issues you might have that would cause you to not get full credit, by either describing
     * where to look for where the material was covered or other information.
     */
    @Rubric(
            // the name of this test
            value = "TheUniqueNameOfThisTest",
            // the goal of this test
            goal = "This Describes the goal of this individual test case.",
            // how many points this individual test is worth.
            points = 10.0,
            // reference of where this material is covered.
            reference = "This field will reference where the material that covers this content is. "
    )
    @Test(timeout = TIMEOUT)
    public void testRectangleArea() {

        /*
         * The '@Test' annotation identifies methods that are individual test cases.
         * </ p>
         * The 'timeout' number tells the JUnit framework how many ms (1/1000th of a second) the test
         * can run before it is considered to have failed it. This is useful when checking that code is
         * not stuck inside an infinite loop, or checking some other time-bounds that makes sense for
         * that individual software and unit of code being tested.
         */

         // In a normal test, code would go here to test something...
    }



    @Rubric(
            value = "testAddInts",
            goal = "The goal of this test is to check 'addInt' and make sure it adds properly",
            points = 10.0,
            // This example 'reference' output is for demonstration purposes only
            reference = "See Module 2, Lesson 'Basic Math Concepts' for more help."
    )
    @Test
    public void testAddInts() {
        /**
         * These are tests within this 'test method'.
         * </p>
         * Each and every 'assert' statement must return true for the entire method to be a 'pass'.
         * </p>
         * If any test failes, the entire test is shown as 'failed', and the output will inform you
         * of which exact 'assert' statement wasn't valid. So that you can 'debug' your application.
         */
        assertEquals(2, mLogic.addInts(1, 1));
        assertEquals(0, mLogic.addInts(1, -1));
        assertEquals(-2, mLogic.addInts(-1, -1));
        assertEquals(0, mLogic.addInts(-1, 1));
        assertEquals(1, mLogic.addInts(0, 1));
        assertEquals(1, mLogic.addInts(1, 0));
        assertEquals(0, mLogic.addInts(0, 0));
        assertEquals(5, mLogic.addInts(2, 3));
        assertEquals(5, mLogic.addInts(4, 1));
        assertEquals(0, mLogic.addInts(-4, 4));
    }


    @Rubric(
            value = "testAddInts",
            goal = "The goal of this test is to check 'addInt' and make sure it adds properly",
            points = 10.0,
            // This example 'reference' output is for demonstration purposes only
            reference = "See Module 2, Lesson 'Basic Math Concepts' for more help."
    )
    @Test
    public void testStringConcat() {
        /**
         * These are tests within this 'test method'.
         * </p>
         * Each and every 'assert' statement must return true for the entire method to be a 'pass'.
         * </p>
         * If any test failes, the entire test is shown as 'failed', and the output will inform you
         * of which exact 'assert' statement wasn't valid. So that you can 'debug' your application.
         */

        String a = "cat";
        String b = "dog";
        String c = "unicorn";
        String ab = "catdog";
        String ac = "catunicorn";
        String aa = "catcat";

        /*
         * 'assertFalse' and 'assertTrue' useful when you only need to check the value of a
         * boolean variable or expression.
         */
        assertFalse(a.equals(mLogic.concatStrings(a, b)));
        assertTrue(aa.equals(mLogic.concatStrings(a,a)));


    }

    /*
     * Note that this test class is short and only has 2 'tests' within in.
     * </p>
     * This test class does not have what is called "having good coverage". 'coverage' is the
     * percentage '%' of the code that is unit tested.
     * </p>
     * This test class doesn't test the 'int multiplyInts (int a, int b)' method of Logic.java.
     * </p>
     * Therefore even if 'all' the unit tests passed, there could still easily be logic bugs in the
     * project.
     * </p>
     * This is why it is crucial to make
     *
     *    1) good unit tests that fully test all edge cases
     *    2) test classes that have as high a coverage as possible, helping to ensure as few bugs
     *       as possible in the project.
     *
     */

}
