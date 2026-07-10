package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstnonRepeating {
    public static void main(String[] args){
        String str = "abcdabc";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("the first non repeating charcter "+entry.getKey());
                return;
            }
        }
        System.out.println("no repeating character");
    }
}
//Time & space : o(n)
