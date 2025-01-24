
//Factorial Calculation
public class Factorial {
public static void main(String[] args) {
    int n = 5; // Number to calculate factorial
    int factorial = 1;
    while(n > 0){
        factorial *= n; // Multiply by current value of n
        n--;
    }
    System.out.println("Factorial: " + factorial);
}
    
}