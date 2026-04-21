package Array;

//Return the number of unique ways to go from the top-left cell (matrix[0][0]) to the bottom-right cell (matrix[m-1][n-1]).
//Movement is allowed only in two directions from a cell: right and bottom.
public class uniquePaths {
    public int uniquePaths(int m, int n){
        return path(m,n);
    }
    public int path(int m,int n){
        int[] prev = new int[n];
        for(int i = 0 ;i<m;i++){
            int[] temp =new int[n];
            for(int j =0;j<n;j++){
                if(i==0 && j ==0){
                    temp[j] = 1;
                    continue;
                }
                int up = (i>0) ? prev[j]:0;
                int down = (j>0) ? temp[j-1]:0;
                temp[j]= up+down;
            }
            temp=prev;
        }
        return prev[n - 1];
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        uniquePaths sol = new uniquePaths();
        System.out.println("Number of ways: " + sol.uniquePaths(m, n));
    }
}
