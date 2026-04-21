package Array;

//Given an array of N + 1 size, where each element is between 1 and N. Assuming there is only one duplicate number, your task is to find the duplicate number.
// Input: arr = [1, 3, 4, 2, 2]
//Output: 2
//Time: O(n) space O(1)

public class FindDuplicate {
    public static int findDuplicate(int[] arr){
        int slow = arr[0];
        int fast = arr[0];
        do{
            slow=arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);
        slow = arr[0];
        while(slow != fast){
            slow= arr[slow];
            fast = arr[fast];
        }
        return slow;

    }
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 4, 2, 2};
        System.out.println("Duplicate: " + findDuplicate(arr1));

        int[] arr2 = {3, 1, 3, 4, 2};
        System.out.println("Duplicate: " + findDuplicate(arr2));
    }
}
