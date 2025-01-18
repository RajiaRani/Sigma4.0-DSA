// In a program, input 3 numbers : A, B, C. you have to find the avaerage of these 3 numbers?
// Average formula = sum of those numbers / number
import java.util.*;
public class Gaverage {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print(" Enter the 1st number :");
        int A = scn.nextInt();

        System.out.print(" Enter the 2nd number:");
        int B = scn.nextInt();

        System.out.print("Enter  the 3rd number: ");
        int C = scn.nextInt();

        int average = (A + B + C) / 3;
        System.out.print(" Final Average : " + average);

    }
}