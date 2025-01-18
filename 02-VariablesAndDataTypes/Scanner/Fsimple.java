//Write a program to input the principal amount, rate of interest, and time (in years). 
//Calculate and display the simple interest using the formula:
//Simple Interest = (Principal * Rate * Time) / 100

//In real-world scenarios, interest rates and principal amounts can be in decimals. 
//Using float or double is a better choice for variables like rate and principal.

import java.util.*;
public class Fsimple {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

         // Input principal, rate, and time
        System.out.print("Enter the principal amount:");
        float principal = scn.nextInt();// Using float for accuracy

        System.out.print("Enter the rate of interest:");
        float rate = scn.nextInt();// Using float for accuracy

        System.out.print("Enter the time(in YEARS):");
        float time = scn.nextInt();// Using float for accuracy
        
         // Calculate simple interest
        float ans = (principal * rate * time)/100;
         // Display the result
        System.out.print("Simple Interest = " + ans);
        scn.close();
    }
}



