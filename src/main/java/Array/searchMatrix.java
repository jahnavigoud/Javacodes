package Array;

//The elements of each row are sorted in non-decreasing order. Moreover, the first element of a row is greater than the last element of the previous row (if it exists). You are given an integer ‘target’, and your task is to find if it exists in the given 'mat' or not.

//Input :mat = [ [1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12] ], target = 8
//Output :True.
//Explanation :The target = 8 exists in the 'mat' at index (1, 3).

// hind use binary search
public class searchMatrix {
    public static boolean searchMatrix(int[][] matrix, int target){
        int n= matrix.length;;
        int m= matrix[0].length;
        int low = 0, high = n*m -1;
        while(low <= high){
            int mid = (low+high)/2;
            int row = mid / m;
            int col = mid % m;
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target ){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[][] mat1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println("Output 1: " + searchMatrix(mat1, 8));

        int[][] mat2 = {
                {1, 2, 4},
                {6, 7, 8},
                {9, 10, 34}
        };

        System.out.println("Output 2: " + searchMatrix(mat2, 78));
    }
}
