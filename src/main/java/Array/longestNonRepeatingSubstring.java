package Array;

import java.util.Arrays;

public class longestNonRepeatingSubstring {
    public int longestNonRepeatingSubstring(String s){
        int n=s.length();
        int hashlength = 256;
        int[] hash = new int[hashlength];
        Arrays.fill(hash,-1);
        int l=0,r=0,maxlength=0;
        while(r<n){
            if(hash[s.charAt(r)] > l){
                l= Math.max(hash[s.charAt(r)]+1,l);
            }
            int len = r-l+1;
            maxlength = Math.max(len,maxlength);
            hash[s.charAt(r)] = r;
            r++;
        }
return maxlength;
    }
    public static void main(String[] args) {
        String s = "cadbzabcd";

        // Create an instance of the Solution class
        longestNonRepeatingSubstring sol = new longestNonRepeatingSubstring();

        int result = sol.longestNonRepeatingSubstring(s);

        // Output the maximum length
        System.out.println("The maximum length is:");
        System.out.println(result);
    }
}
