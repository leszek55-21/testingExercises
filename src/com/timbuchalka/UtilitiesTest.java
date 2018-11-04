package com.timbuchalka;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities utilities;
    @Before
    public void beforeTest() {
        utilities = new Utilities();
    }

    @Test
    public void everyNthChar () {
        assertArrayEquals(new char[] {'e', 'l'}, utilities.everyNthChar("hello".toCharArray(), 2));
//        assertNull(utilities.everyNthChar(null, 3));
        assertArrayEquals(new char[] {'e'}, utilities.everyNthChar("he".toCharArray(), 2));
    }

    @Test
    public void removePairs () {
       assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
       assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));

    }

    @Test
    public void converter () {
        assertEquals(300, utilities.converter(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void converter_arithmException () throws Exception{
       utilities.converter(10, 0);

    }

    @Test
    public void nullIfOddLength () {
        assertNull("Should return null", utilities.nullIfOddLength("aaaaa"));
        assertNotNull("Should not return null", utilities.nullIfOddLength("aaaa"));

    }
}