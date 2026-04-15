package Array;

//Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
//Input:
// nums = [2, 3, 5, -2, 7, -4]
//Output:
// 15
public class maxSubArray {
    public static int maxSubArray(int[] arr){
        int maxSum = arr[0];
        int currentSum = 0;
        for(int num:arr){
            currentSum += num;
        maxSum = Math.max(maxSum,currentSum);
        if(currentSum <0) {
            currentSum = 0;
         }
        }
        return maxSum;
    }
    public static void main(String[] args) {

        int[] nums1 = {2, 3, 5, -2, 7, -4};
        System.out.println("Output 1: " + maxSubArray(nums1));

        int[] nums2 = {-2, -3, -7, -2, -10, -4};
        System.out.println("Output 2: " + maxSubArray(nums2));
    }
}
