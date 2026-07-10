package String;

public class SecondLargest {
    public static void main(String[] args){
        int[] arr = {25,2,23,45,3};
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                secondlargest = largest;
                largest = num;
            }else if(num>secondlargest && num != largest){
                secondlargest = num;

            }
        }
        System.out.println(secondlargest);
    }
}

//Time :O(n)  space :O(1)

