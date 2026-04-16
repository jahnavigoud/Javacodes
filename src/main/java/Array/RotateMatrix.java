package Array;

//Given an N * N 2D integer matrix, rotate the matrix by 90 degrees clockwise.
//Input :matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
//output: matrix = [[7, 4, 1], [8, 5, 2], [9, 6, 3]]
//Hint: first traverse a matri, then reverse each row 90 degrees
// time: O(n^2) space O(1)

public class RotateMatrix {
    public static void rotate(int[][] matrix){
        int n= matrix.length;
        for(int i=0;i<n;i++){
            for(int j =i;j<n;j++){
                swap(matrix,i,j,j,i);
            }
        }
        for(int i=0;i<n;i++){
            int left=0,right=n-1;
            while(left<right){
                swap(matrix,i,left,i,right);
                left++;
                right--;
            }
        }
    }
    private static void swap(int[][] matrix, int i1,int j1,int i2,int j2){
        int temp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2]=temp;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate(matrix);

        System.out.println("Rotated Matrix:");
        printMatrix(matrix);
    }
}
