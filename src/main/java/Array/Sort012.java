package Array;

import java.util.Arrays;

//Given an array nums consisting of only 0, 1, or 2.
//Input: nums = [1, 0, 2, 1, 0]
//Output: [0, 0, 1, 1, 2]
//Explanation: The nums array in sorted order has 2 zeroes, 2 ones and 1 two

//hint: 0 to low-1 -> 0, low to mid-1 -> 1, mid to high -> 2

// space : O(n) time : O(1)
public class Sort012 {
    public static void sortColors(int[] arr){
        int low =0, mid=0,high=arr.length-1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                low++;
                mid++;
            } else if(arr[mid] == 1){
                mid++;
            } else {
                swap(arr,mid,high);
                high--;
            }
        }
    }
    private static void swap(int[] arr, int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void main(String[] args) {

        int[] nums1 = {1, 0, 2, 1, 0};
        sortColors(nums1);
        System.out.println("Output 1: " + Arrays.toString(nums1));

        int[] nums2 = {0, 0, 1, 1, 1};
        sortColors(nums2);
        System.out.println("Output 2: " + Arrays.toString(nums2));
    }
}
