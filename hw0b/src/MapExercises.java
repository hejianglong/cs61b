import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> num = new HashMap<>();
        for (int i = 'a'; i <= 'z'; i++) {
            num.put((char)i, i - 96);
        }
        return num;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> num = new HashMap<>();
        for (Integer n :
                nums) {
            num.put(n,n * n);
        }
        return num;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> nums = new HashMap<>();
        int count;
        for (String word :
                words) {
            count = 0;
            for (String wordN :
                    words) {
                if (word.equals(wordN)) {
                    count++;
                }
            }
            nums.put(word, count);
        }
        return nums;
    }
}
