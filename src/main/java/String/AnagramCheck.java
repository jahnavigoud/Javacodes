package String;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args){
        String str1 = "silent";
        String str2 = "listen";
        if(str1.length() == str2.length()){
            System.out.println("Anagram");
            return;
        }
        char[] str11 = str1.toCharArray();
        char[] str22 = str2.toCharArray();
        Arrays.sort(str11);
        Arrays.sort(str22);
        if(Arrays.equals(str11,str22)){
            System.out.println("Anagram");
        }else {
            System.out.println("not anagram");
        }

    }
}
//time:O(nlogn)
//space: o(n)
