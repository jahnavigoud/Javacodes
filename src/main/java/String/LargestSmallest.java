package String;

public class LargestSmallest {
    public static void main(String[] args){
        int[] arr = {10,5,25,3,50};
        int largest = arr[0];
        int smallest = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }else {
                smallest = arr[i];
            }
        }
        System.out.println("largest :"+largest);
        System.out.println("smallest :"+smallest);
    }
}
//Time: O(n) , space :O(1)
