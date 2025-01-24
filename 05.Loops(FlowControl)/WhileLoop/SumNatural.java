import java.util.Scanner;

public class SumNatural {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scn.nextInt(); // n = 3   sum = 1+2+3 = 6
        int sum = 0;
        int i = 1; //counter
        while ( i <= num){
            sum+= i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}