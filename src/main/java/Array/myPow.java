package Array;

//Implement the power function pow(x, n) , which calculates the x raised to n i.e. xn.

//hint : if x = 0 return 1.0
//if x=1 return x;
//if even x %2 =0 return pow(x*x, n/2)
// if odd x return x*pow(x,n-1)

public class myPow {
    public double myPow(double x, int n){
        if(n < 0){
            return 1.0 /pow(x,-n);
        }
        return pow(x,n);
    }
    public double pow(double x, int n){
        if(n == 0) return 1.0;
        if(n == 1) return x;
        if(n%2 == 0) return pow(x*x, n/2);
        return x*pow(x,n-1);
    }
        public static void main(String[] args) {
            myPow sol = new myPow();
            double x = 2.0;
            int n = 10;
            double result = sol.myPow(x, n);
            System.out.println(x + "^" + n + " = " + result);
        }
}
