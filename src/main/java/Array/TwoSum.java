package Array;

import java.util.Arrays;

//1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
//
//2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.
 //Time: O(nlogn) space : O(n)
public class TwoSum {
    public String twoSumExists(int[] arr, int target){
        int n = arr.length;
        int[][] num = new int[n][2];
        for(int i=0;i<n;i++){
            num[i][0] = arr[i];
            num[i][1] = i;
        }
        Arrays.sort(num,(a,b) -> Integer.compare(a[0],b[0]));
        int left =0;int right = n-1;
        while(left <=right){
            int sum = num[left][0]+num[right][0];
            if(sum == target){
                return "YES";
            } else if(sum < target){
                left++;
            }else {
                right--;
            }
        }
        return "NO";
    }
    public int[] twoSumIndices(int[] arr, int target){
        int n=arr.length;
        int[][] num = new int[n][2];
        for(int i=0;i<n;i++){
            num[i][0] = arr[i];
            num[i][1]= i;
        }
        Arrays.sort(num,(a,b) -> Integer.compare(a[0],b[0]));
        int left =0;int right = n-1;
        while(left <=right){
            int sum = num[left][0]+num[right][0];
            if(sum == target){
                return new int[] {num[left][1], num[right][1]};
            } else if(sum < target){
                left++;
            }else {
                right--;
            }
        }
        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        TwoSum sol = new TwoSum();
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        System.out.println(sol.twoSumExists(arr, target)); // Output: YES
        int[] res = sol.twoSumIndices(arr, target);
        System.out.println("[" + res[0] + ", " + res[1] + "]"); // Output: [1, 3]
    }
}
//other solution

//public static int[] twoSum(int[] arr, int target) {
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//
//            int complement = target - arr[i];
//
//            if (map.containsKey(complement)) {
//                return new int[]{map.get(complement), i};
//            }
//
//            map.put(arr[i], i);
//        }
//
//        return new int[]{-1, -1};
//    }
