public class FindFactorial {
    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n ; i++){
            f = f*i;
        }
        return f;
    }
    public static int binCoff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binCoff = fact_n/ (fact_r * fact_nmr);
        return binCoff;
    }
    public static void main (String args[]){
     int ans = factorial(3);
     System.out.println("Factorial is " + ans);
     int res = binCoff(5, 2);
     System.out.println("BinomialCoffienent = "+ res);
    }
}
