package Array;

import java.util.HashMap;
import java.util.Map;

//Given an array containing both positive and negative integers, we have to find the length of the longest subarray with the sum of all elements equal to zero.
//Input:
// N = 6, array[] = {9, -3, 3, -1, 6, -5}
//Result:
// 5

//Time : O(n) space : O(1)
public class maxLen {
    public int maxLen(int[] arr,int n){
        Map<Integer, Integer> map = new HashMap<>();
        int max_index = 0;
        int sum =0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum == 0){
               max_index = i+1;
            } else{
                if(map.containsKey(sum)){
                    max_index = Math.max(max_index,i - map.get(sum));
                } else {
                    map.put(sum,i);
                }
            }

        }
        return max_index;
    }
    public static void main(String[] args) {
        // sample input
        int[] A = new int[]{9, -3, 3, -1, 6, -5};
        // compute size
        int n = A.length;
        // compute result
        int ans = new maxLen().maxLen(A, n);
        // print result
        System.out.println(ans);
    }
}
