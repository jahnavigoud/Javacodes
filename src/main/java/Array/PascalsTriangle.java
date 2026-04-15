package Array;

//Write a program to generate Pascal's triangle. In Pascal’s triangle, each number is the sum of the two numbers directly above it as shown in the figure below:
//Input: N = 5, r = 5, c = 3
//Output: Element at position (r, c): 6
//N-th row of Pascal’s triangle: 1 4 6 4 1
//First n rows of Pascal’s triangle:
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
public class PascalsTriangle {
    public static int getElement(int r, int c){
        return nCr(r-1,c-1);
    }
    public static int nCr(int n, int r){
        int res =1;
        for(int i=0;i<r;i++){
            res = res * (n-i);
            res = res /(i+1);
        }
        return res;
    }
    public static void printNthRow(int n){
        int res =1;
        System.out.print(res + " ");

        for(int i=1;i<n;i++){
            res = res*(n-1);
            res=res / i;
            System.out.print(res + " ");
        }
    }
    public static void printTriangle(int n){
        for(int i =1;i<=n;i++){
            int res=1;
            System.out.print(res + " ");
            for(int j =1;j<i;j++){
                res = res*(i-j);
                res = res / j;
                System.out.print(res+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int N = 5;
        int r = 5, c = 3;

        // ✅ Element at (r, c)
        int element = getElement(r, c);
        System.out.println("Element at (" + r + "," + c + ") = " + element);

        System.out.println("----------------------");

        // ✅ N-th row
        System.out.print("N-th Row: ");
        printNthRow(N);

        System.out.println("----------------------");

        // ✅ First N rows
        System.out.println("Pascal Triangle:");
        printTriangle(N);
    }
}
//Find element at position (r, c)
//Print Nth row
//Print first N rows
//time : O(n^2) space O(1)
