package String;

public class RotateK {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int k=3;
        k=k%arr.length;//check if k is small than arr length
        rotate(arr,0,arr.length-1);
        rotate(arr,0,k-1);
        rotate(arr,k,arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void rotate(int[] arr, int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
          start++;
          end--;
}
}
}
//Time: O(n) space:O(1)