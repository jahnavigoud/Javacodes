package Array;

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
