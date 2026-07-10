package String;

public class StringPermutation {
    public static void main(String[] args){
        String str = "ABC";
        permute(str.toCharArray(),0);
    }
    public static void permute(char[] chars,int index){
        if(index == chars.length-1){
            System.out.println(new String(chars));
            return;
        }
        for(int i=index;i<chars.length;i++){
            char temp = chars[index];
            chars[index]=chars[i];
            chars[i]=temp;
            permute(chars,index+1);
            temp = chars[index];
            chars[index]=chars[i];
            chars[i]=temp;
        }
    }
}

//time: O(n*n!), space :O(n)