package Array;

import java.util.ArrayList;
import java.util.List;

public class majorityElementTwo {
    public List<Integer> majorityElementTwo(int[] arr){
        int n = arr.length;
        int count1=0, count2=0;
        int ele1=0, ele2=0;
        for(int i=0;i<n;i++){
            if(count1 == 0 && ele2 != arr[i]){
                count1=1;
                ele1=arr[i];
            }else if(count2 == 0 && ele1 != arr[i]){
                count2=1;
                ele2=arr[i];
            }else if(ele1 == arr[i]){
                count1++;
            }else if(ele2 == arr[i]){
                count2++;
            }else {
                count1--;
                count2--;
            }
        }
        count1=0;count2=0;
        for(int i=0;i<n;i++){
            if(ele1 == arr[i]){
               count1++;
            }
            if(ele2 == arr[i]){
                count2++;
            }
        }
        int min = n/3 + 1;
        List<Integer> result = new ArrayList<>();
        if(count1 >=min) result.add(ele1);
        if(count2 >= min && ele1 != ele2) result.add(ele2);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};

        majorityElementTwo sol = new majorityElementTwo();
        List<Integer> ans = sol.majorityElementTwo(arr);

        System.out.print("The majority elements are: ");
        for (int it : ans) {
            System.out.print(it + " ");
        }
        System.out.println();
    }
}
