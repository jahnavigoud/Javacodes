package Array;

import java.util.HashSet;
import java.util.Set;

//Return the length of the longest sequence of consecutive integers. The integers in this sequence can appear in any order.
//Input:
// nums = [100, 4, 200, 1, 3, 2]
//Output:
// 4

//Time : O(n) space : O(N)
public class longestConsecutive {
    public int longestConsecutive(int[] arr){
        int n=arr.length;
        if(n==0) return 0;
        int longest=1;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int count =0;
        for(int sets: set){
            if(!set.contains(sets-1)){
                count =1;
               int current = sets;
               while(set.contains(current+1)){
                   current = current +1 ;
                   count = count+1;
               }
               longest = Math.max(longest,count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        // Input array
        int[] a = {100, 4, 200, 1, 3, 2};

        // Create an instance of Solution class
        longestConsecutive solution = new longestConsecutive();

        // Call the function to get the longest consecutive sequence length
        int ans = solution.longestConsecutive(a);

        // Print the result
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
