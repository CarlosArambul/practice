package jan29;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by arambul on 1/29/17.
 */
public class DayOnePracticeTest {


    @Test
    public void testAssertions () {

        DayOnePractice practice = new DayOnePractice();

        // unique
        assertTrue(practice.isUniqueCharacterString("abc"));

        // not unique
        assertFalse(practice.isUniqueCharacterString("aabbcc"));

    }

    @Test
    public void testDuplicates () {

        DayOnePractice practice = new DayOnePractice();

        List<String> theList = new ArrayList<String>();
        theList.add("1");
        theList.add("2");
        theList.add("3");
        theList.add("4");
        theList.add("5");
        theList.add("1");

        // Remove the duplicates
        theList = practice.removeListDuplicates(theList);

        // Should not have duplicates
        assertTrue(!hasDuplicate(theList));

        // adding a duplicate
        theList.add("5");

        // it will pass if there is a duplicate
        assertTrue(hasDuplicate(theList));

    }

    public static <T> List getDuplicate(final Collection<T> list) {
        final List<T> duplicatedObjects = new ArrayList<T>();
        Set<T> set = new HashSet<T>() {
            @Override
            public boolean add(T e) {
                if (contains(e)) {
                    duplicatedObjects.add(e);
                }
                return super.add(e);
            }
        };
        for (T t : list) {
            set.add(t);
        }
        return duplicatedObjects;
    }

    public static <T> boolean hasDuplicate(Collection<T> list) {
        if (getDuplicate(list).isEmpty())
            return false;
        return true;
    }
}