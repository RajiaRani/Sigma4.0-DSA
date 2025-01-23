//Q - Write a java program to get a number from user and print whether it is positive or negative ?
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
         int num = scn.nextInt();
        if( num > 0){
            System.out.print("Number is greater than 0");
        } else{
            System.out.print("Number is less than 0");
        }
    }
}
