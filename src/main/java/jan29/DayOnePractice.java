package jan29;

import java.util.*;

/**
 * Created by arambul on 1/29/17.
 */
public class DayOnePractice {

    public DayOnePractice () {

    }
    /**
     * Tells if the string contains unique characters
     * @param theString the string to evaluate
     * @return true if the string contains only unique characters. false if there are duplicate characters.
     */
     static public boolean isUniqueCharacterString(final String theString) {

        if (theString == null) {
            throw new IllegalArgumentException("Cannot pass empty or null");
        }

        char[] characters = theString.toCharArray();
        Arrays.sort(characters);

        char previousChar = '\0';
        for (char character: characters) {
            if (character == previousChar ) {
                return false;
            }
            else {
                previousChar = character;
            }
        }
        return true;
    }

    /**
     * Remove duplicates from an unsorted list
     * @param unsortedList the unsorted list
     */
     static public List<String> removeListDuplicates(final List<String> unsortedList)  {

        if (unsortedList == null || unsortedList.size() < 1) {
            throw  new IllegalArgumentException("Cannot pass null or empty list");
        }

        for (int i = 0; i < unsortedList.size() - 1; i++)
        {
            String currentString = unsortedList.get(i);
            for (int j = i + 1; j < unsortedList.size(); j++) {
                if (currentString.equals(unsortedList.get(j))) {
                    unsortedList.remove(j);
                }
            }
        }

         return unsortedList;
    }
}



