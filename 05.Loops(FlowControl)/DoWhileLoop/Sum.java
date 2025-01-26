// Sum of First N Natural Numbers
public class Sum {
    public static void main(String[] args) {
       int n = 10;
       int counter = 0;
       int sum = 0;
       do{
         sum+=counter;
         counter++;
       } while(counter<=n); 
       System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
