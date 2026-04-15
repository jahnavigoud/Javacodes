package Array;

import java.util.Arrays;
//find next lexicographically greater permutation
//Input: Arr[] = {1,3,2}
//Output: {2,1,3}
//Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} , {3,2,1}}. So, the next permutation just after {1,3,2} is {2,1,3}.

public class nextPermutation {
    public static void nextPermutation(int[] arr){
        int n=arr.length;
        int i=n-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,n-1);
    }
    private static void swap(int[] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private static void reverse(int[] arr, int left, int right){
        while(left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 2};
        nextPermutation(arr1);
        System.out.println("Output 1: " + Arrays.toString(arr1));

        int[] arr2 = {3, 2, 1};
        nextPermutation(arr2);
        System.out.println("Output 2: " + Arrays.toString(arr2));
    }
}

//hint
//Find breakpoint (pivot)
//Traverse from right
//Find first index i such that
//arr[i] < arr[i+1]
//Find next greater element
//From right, find element > arr[i]
//Swap them
//Reverse the right part
//Reverse from i+1 → end
