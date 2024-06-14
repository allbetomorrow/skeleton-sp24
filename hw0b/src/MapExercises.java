import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character, Integer> ret = new HashMap<>();
        for (char i = 'a'; i <= 'z'; i++) {
            ret.put(i, i - 'a' + 1);
        }
        return ret;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer, Integer> ret = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            int value = nums.get(i);
            ret.put(value, value * value);
        }
        return ret;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String, Integer> ret = new HashMap<>();
        for (String cur : words) {
            if (ret.containsKey(cur)) {
                ret.put(cur, ret.get(cur) + 1);
            } else {
                ret.put(cur, 1);
            }
        }
        return ret;
    }
}
