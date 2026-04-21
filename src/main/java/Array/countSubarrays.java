package Array;

import java.util.HashMap;
import java.util.Map;
//Given an array of integers A and an integer B. Find the total number of subarrays having bitwise XOR of all elements equal to k.
//Input: A = [4, 2, 2, 6, 4] , k = 6
//Output: 4
//Time : O(n) space : O(n)
public class countSubarrays {
    public int countSubarrays(int[] arr,int k){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixxor =0;
        int count =0;
        for(int arrs:arr){
            prefixxor ^= arrs;
            int target = prefixxor ^ k;
            if(map.containsKey(target)){
                count += map.get(target);
            }
            map.put(prefixxor, map.getOrDefault(prefixxor,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = {4, 2, 2, 6, 4};
        int k = 6;
        countSubarrays sol = new countSubarrays();
        System.out.println(sol.countSubarrays(A, k));
    }
}
