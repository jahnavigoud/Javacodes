package Array;

//Input Format: N = 5, array[] = {5,4,3,2,1}
//Result: 10
//Explanation: we have a reverse sorted array and we will get the maximum inversions as for i < j we will always find a pair such that A[j] < A[i]. Example: 5 has index 0 and 3 has index 2 now (5,3) pair is inversion as 0 < 2 and 5 > 3 which will satisfy out conditions and for reverse sorted array we will get maximum inversions and that is (n)*(n-1) / 2.For above given array there is 4 + 3 + 2 + 1 = 10 inversions.
public class countInversions {
    public static int countInversions(int[] arr){
        return mergesort(arr,0,arr.length-1);
    }
    private static int mergesort(int[] arr, int low,int high){
        int count =0;
        if(low < high){
            int mid = (low+high)/2;

        count += mergesort(arr,low,mid);
        count += mergesort(arr,mid+1,high);
        count += merge(arr,low,mid,high); }
        return count;
    }
    private static int merge(int[] arr, int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int count =0;
        int i=low, j=mid+1, k =0;
        while(i<=mid && j<=high){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else {
                temp[k++]= arr[j++];
                 count += (mid-i+1);
            }

        }
        while(i<= mid){
            temp[k++] = arr[i++]; }
        while(j <= high){
            temp[k++] = arr[j++];
        }
        for (i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }

        return count;
    }
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        System.out.println("Output 1: " + countInversions(arr1));

        int[] arr2 = {5,4,3,2,1};
        System.out.println("Output 2: " + countInversions(arr2));

        int[] arr3 = {5,3,2,1,4};
        System.out.println("Output 3: " + countInversions(arr3));
    }

}
