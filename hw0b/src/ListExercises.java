import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        if (L.isEmpty()) return 0;
        int sum = 0;
        for (int i = 0; i < L.size(); i++) {
            sum += L.get(i);
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> ret = new ArrayList<Integer>();
        for (Integer integer : L) {
            if (integer % 2 == 0) {
                ret.add(integer);
            }
        }
        return ret;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < L1.size(); i++) {
            if (L2.contains(L1.get(i))) {
                ret.add(L1.get(i));
            }
        }

        return ret;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            String curString = words.get(i);
            for (int j = 0; j < curString.length(); j++) {
                if (curString.charAt(j) == c) {
                    count++;
                }
            }
        }
        return count;
    }
}
