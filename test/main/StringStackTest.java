/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jessy and Laura
 */
public class StringStackTest {

    public Stack s;

    @Before
    public void setup() throws Exception {
        s = new StringStack(5); // keep size of 5 !!
    }

    /**
     * tests if stack is empty after initialization
     *
     * use assert - assertTrue to check it's empty
     */
    @Test
    public void testIsEmpty() throws Exception {
        assertEquals(true, s.isEmpty());
    }

    /**
     * tests if stack is empty after pushing
     *
     * use assert - assertFalse to check it's not empty
     */
    @Test
    public void testIsNotEmpty() throws Exception {
        s.push("Test Item");
        assertEquals(false, s.isEmpty());
    }

    /**
     * tests push and pop function
     *
     * do following test - use push, 1 or x times - use pull, as often as you
     * use push - use isEmpty to check that's empty again - assert every content
     * of the stack in the correct ordering
     *
     * @throws Exception
     */
    @Test
    public void testPushPop() throws Exception {
        String[] testData = new String[]{"Test Item1", "Test Item2", "Test Item3"};
        Arrays.stream(testData).forEach(str -> s.push(str));
        for (int i = testData.length - 1; i > -1; i--) {
             assertEquals(testData[i], s.pop());
        }
        assertEquals(true, s.isEmpty());
    }


    /**
     * tests if you first push something, than pop it its still the same String
     */
    @Test
    public void testSameString() throws Exception{
        String test = "Test";
        s.push(test);
        assertEquals(test, s.pop());
    }

    /**
     * tests  if exception is thrown when too much is pushed
     */
    @Test(expected = IllegalStateException.class)
    public void testOverflow() throws Exception{
        for (int i = 0; i <= 10; i++) {
            s.push("more");
        }
    }

    /**
     * tests if you pop an empty stack a exception is thrown
     */
    @Test(expected = IllegalStateException.class)
    public void testEmptyPop() throws Exception{
        s.pop();
    }

}
