package main;

import static org.junit.Assert.*;
import org.junit.Test;

public class ExceptionTest {

    @Test
    public void testSuccess() {
        giveMeEven(2);
    }
//
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionOne() {
        giveMeEven(3);
    }
//
    @Test
    public void testExceptionTwo() {
        try {
            giveMeEven(3);
            fail("Should throw an error!");
        } catch (IllegalArgumentException e) {
            // should throw an exception.
        }
    }
//
    @Test
    public void testExceptionTwoWithDetail() {
        try {
            giveMeOdd(8 / 2);
            fail();
        } catch (IllegalArgumentException e) {
            String msg = e.getMessage();
            assertEquals("OH, COME ON. 4 is not odd!", msg);
        }
    }
//
    private void giveMeEven(int i) {
        if (i % 2 == 1)
            throw new IllegalArgumentException("NOT EVEN!");
    }

    private void giveMeOdd(int i) {
        if (i % 2 == 0)
            throw new IllegalArgumentException("OH, COME ON. " + i
                            + " is not odd!");
    }
}

