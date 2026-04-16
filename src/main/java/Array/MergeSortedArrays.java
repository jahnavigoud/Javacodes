package Array;

import java.util.Arrays;

//Given two sorted integer arrays nums1 and nums2, merge both the arrays into a single array sorted in non-decreasing order.
//The final sorted array should be stored inside the array nums1 and it should be done in-place.
//Array nums1 has a length of m + n, where the first m elements denote the elements of nums1 and rest are 0s whereas nums2 has a length of n.
//Input : nums1 = [-5, -2, 4, 5, 0, 0, 0], nums2 = [-3, 1, 8]
//Output : [-5, -3, -2, 1, 4, 5, 8]
//Explanation : The merged array is: [-5, -3, -2, 1, 4, 5, 8], where [-5, -2, 4, 5] are from nums1 and [-3, 1, 8] are from nums2

//hint m= valid numbers in num1, n= no of elements in nums2 k= num1+num2-1

//Time : O(n+m) space O(n)
public class MergeSortedArrays {
    public static void merge(int[] num1,int m,int[] num2,int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(num1[i]>num2[j]){
                num1[k--] = num1[i--];
            }else {
                num1[k--] = num2[j--];
            }
        }
        while(j>=0){
            num1[k--] = num2[j--];
        }
    }
    public static void main(String[] args) {

        int[] nums1 = {-5, -2, 4, 5, 0, 0, 0};
        int[] nums2 = {-3, 1, 8};
        merge(nums1, 4, nums2, 3);

        System.out.println("Output 1: " + Arrays.toString(nums1));

        int[] nums3 = {0, 2, 7, 8, 0, 0, 0};
        int[] nums4 = {-7, -3, -1};
        merge(nums3, 4, nums4, 3);

        System.out.println("Output 2: " + Arrays.toString(nums3));
    }
}
