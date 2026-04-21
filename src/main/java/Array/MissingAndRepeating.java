package Array;

// array nums of size n containing values from [1, n] and each value appears exactly once in the array, except for A, which appears twice and B which is missing.
//Input:
// nums = [3, 5, 4, 1, 1]
//Output:
// [1, 2]  1 appears twice in the array, and 2 is missing from the array. So the output is [1, 2].

// sum = n(n+1)/2;
//exceptedsquaresum = n*(n+1)(2n+1)/6;
// x= sum - exceptedsum
//y=(squaresum -exceptedsum)/x
//A = (x+y)/2
//B = Y-A;

//Time : O(n) space O(1)
public class MissingAndRepeating {
    public static int[] findNumbers(int[] arr){
        int n=arr.length;
        long sum=0,squaresum=0;
        for(int arrs:arr){
            sum += arrs;
            squaresum += arrs * arrs;
        }
        long exceptedsum = (long) n * (n + 1) / 2;
        long exceptedsquaresum = (long) n * (n + 1) * (2 * n + 1)/6;
        long x = sum - exceptedsum;
        long y = (squaresum - exceptedsquaresum) / x;
        int A = (int) (x + y)/2;
        int B = (int) (y - A);
        return new int[]{A,B};
    }
    public static void main(String[] args) {

        int[] nums1 = {3, 5, 4, 1, 1};
        int[] res1 = findNumbers(nums1);
        System.out.println("Output 1: [" + res1[0] + ", " + res1[1] + "]");

        int[] nums2 = {1, 2, 3, 6, 7, 5, 7};
        int[] res2 = findNumbers(nums2);
        System.out.println("Output 2: [" + res2[0] + ", " + res2[1] + "]");
    }
}
