package String;

import java.util.HashSet;

public class duplicateNum {
    public static void main(String[] arg) {
        int[] arr = {2, 5, 6, 3, 2, 7, 5};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.print(num+" ");
            }
        }
    }
}
//Time :O(n)  space :O(n)
