package String;

public class MissingNumber {
    public static void main(String[] args){
        int[] arr = {1,2,3,5};
        int n=5;
        int expectedsum = n*(n+1)/2;
        int actualsum =0;
        for(int num:arr){
            actualsum+=num;
        }
        int missingnum = expectedsum-actualsum;
        System.out.print(missingnum);
    }
}
//Time: O(n) space :O(1)
