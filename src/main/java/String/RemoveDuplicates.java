package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
        String str ="programmer";
        Set<Character> set = new LinkedHashSet<>();
        for(char ch:str.toCharArray()){
            set.add(ch);
        }
        StringBuilder result = new StringBuilder();
        for(char ch:set){
            result.append(ch);
        }
        System.out.println(result);

    }
}
//space and time : O(n)

