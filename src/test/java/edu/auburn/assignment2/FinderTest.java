package edu.auburn.assignment2;

import org.junit.Test;

import static edu.auburn.assignment2.Finder.*;
import static org.junit.Assert.*;

public class FinderTest {

    @Test
    public void testFindMax() {
        int[] array = {1, 3, 4, 0, 2};
        String max = findMax(array);
        assertEquals("4", max);
    }

    @Test
    public void testFindMin() {
        int[] array = {1, 3, 4, 0, 2};
        String min = findMin(array);
        assertEquals("0", min);
    }

    @Test
    public void testFindMaxForNull() {
        int[] array = null;
        String max = findMax(array);
        assertEquals(null, max);
    }

    @Test
    public void testFindMinForNull() {
        int[] array = null;
        String min = findMin(array);
        assertEquals(null, min);
    }

    @Test
    public void testFindMaxForEmpty() {
        int[] array = {};
        String max = findMax(array);
        assertEquals(null, max);
    }

    @Test
    public void testFindMinForEmpty() {
        int[] array = {};
        String min = findMin(array);
        assertEquals(null, min);
    }
}