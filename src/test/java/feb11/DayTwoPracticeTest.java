package feb11;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jan29.DayOnePractice;

import java.util.*;

public class DayTwoPracticeTest {

	@Test
    public void testAssertions () {

        DayOnePractice practice = new DayOnePractice();

        // unique
        assertTrue(practice.isUniqueCharacterString("abc"));

        // not unique
        assertFalse(practice.isUniqueCharacterString("aabbcc"));

    }
	
}
