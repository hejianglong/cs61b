import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int sum = 0;
        if (L.size() == 0) {
            return 0;
        }
        for (Integer num :
                L) {
            sum += num;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> M = new ArrayList<>();
        for (Integer num :
                L) {
            if (num % 2 == 0) {
                M.add(num);
            }
        }
        if (M.size() == 0) {
            return null;
        } else {
            return M;
        }
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> sameNum = new ArrayList<>();
        for (Integer num1 :
                L1) {
            for (Integer num2 :
                    L2) {
                if (num1.compareTo(num2) == 0) {
                    sameNum.add(num1);
                }
            }
        }
        return sameNum;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int oldCount = 0;
        int newCount = 0;
        int sum = 0;
        String m = String.valueOf(c);
        for (String wor :
                words) {
            oldCount = wor.length();
            newCount = wor.replace(m,"").length();
            sum += (oldCount - newCount);
        }
        return sum;
    }
}
