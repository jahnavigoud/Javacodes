package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//you need to return an array of all the unique quadruplets [arr[a], arr[b], arr[c], arr[d]] such that their sum is equal to a given target.
//Input Format:arr[] = [1,0,-1,0,-2,2], target = 0
//Result: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

//time : o(n^3) space: O(1)
public class fourSum {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1; j < n; j++) {
                if (j > i+1 && arr[j] == arr[j - 1]) continue;
                ;
                int left = j + 1, right = n - 1;
                while (left < right) {
                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == target) {
                        ans.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                        while (left < right && arr[left] == arr[left + 1]) left++;
                        while (left < right && arr[left] == arr[right - 1]) right--;
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;

        fourSum obj = new fourSum();
        List<List<Integer>> ans = obj.fourSum(arr, target);

        for (List<Integer> quad : ans) {
            System.out.println(quad);
        }
    }
}
