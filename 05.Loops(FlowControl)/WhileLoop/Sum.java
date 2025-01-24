//Example 2: Calculate the Sum of First N Natural Numbers
public class Sum {

    public static void main(String args[]){
        int n = 10;
        int sum = 0; 
        int i = 1;
        while ( i<= n){
            sum+=i; // Add the current value of i to sum
            i++; //increment

        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}