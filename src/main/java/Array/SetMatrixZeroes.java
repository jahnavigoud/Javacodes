package Array;
//Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix..
// Input Matrix 1:
//1 1 1
//1 0 1
//1 1 1
//Output Matrix 1:
//1 0 1
//0 0 0
//1 0 1
public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        boolean flagColZero = false;
        for(int i=0;i<row;i++){
            if(matrix[i][0] == 0){
                flagColZero = true;
            }
            for(int j=1;j<col;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] =0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=1;i<row;i++){
           for(int j=1;j<col;j++){
               if(matrix[i][0]==0 || matrix[0][j]==0){
                   matrix[i][j] = 0;
               }
           }
        }

        if(matrix[0][0]== 0){
            for(int j =0;j<col;j++){
                matrix[0][j]=0;
            }
        }
        if(flagColZero){
            for(int i = 0;i<row;i++){
                matrix[i][0] = 0;
            }
        }

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

        // ✅ Example 1
        int[][] matrix1 = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        System.out.println("Input Matrix 1:");
        printMatrix(matrix1);

        setZeroes(matrix1);

        System.out.println("Output Matrix 1:");
        printMatrix(matrix1);

        System.out.println("----------------------");

        // ✅ Example 2
        int[][] matrix2 = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };

        System.out.println("Input Matrix 2:");
        printMatrix(matrix2);

        setZeroes(matrix2);

        System.out.println("Output Matrix 2:");
        printMatrix(matrix2);
    }
}

// first step1: take flag =false start from i=0 to row then check if matrix[i][0]=0 if yes mark flag=true j=1 to col then check
// matrix[i][j] == 0 if yes then make matrix[i][0] =0, matrix[0[pj]=0
// step 2: start from i =1 to row, j=1 to col then check matrix[i][0] =0 or matrix[0][j] = 0 then make ,matrix[i][j]=0;
//step3: check if matrix[0][0] =0 then start j = 0 to col, mark matrix[0][j]=0
//step4:check if flag = true then start i=0 to col then mark matrix[i][0] = 0

