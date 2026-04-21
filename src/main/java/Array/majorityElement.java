package Array;

// The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.
//Input:
// nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]
//Output:
// 7
//Explanation:
// The number 7 appears 5 times in the 9-sized array, making it the most frequent element.

//Hint : fisrt find the ele, then check increase the count if ele = arr[i] then check if count > n/2 if yes return ele else -1

// Time O(n) for loop space =O(1) no extra space
public class majorityElement {
    public static int majorityElement(int[] arr){
        int n=arr.length;
        int count =0;
        int ele =0;
        for(int i=0;i<n;i++){
            if(count == 0){
                count = 1;
                ele = arr[i];
            }else if(ele == arr[i]){
                count++;
            }else {
                count--;
            }
        }
        int count1 =0;
        for(int i=0;i<n;i++){
            if(arr[i] == ele){
                count1++;
            }
        }
        if(count1 > n/2){
            return ele;
        }
        return -1;
    }
        public static void main(String[] args) {
            int[] arr = {2, 2, 1, 1, 1, 2, 2};

            // Create an instance of Solution class
            majorityElement sol = new majorityElement();

            // Call the majorityElement function
            int ans = sol.majorityElement(arr);

            // Print the majority element
            System.out.println("The majority element is: " + ans);
        }
}
