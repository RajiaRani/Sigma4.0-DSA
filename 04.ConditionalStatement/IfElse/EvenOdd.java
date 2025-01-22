import java.util.*;
public class EvenOdd {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any number you want for check its even or odd :");
        int a = scn.nextInt();
        // int a = 5;
        if(a%2 == 0){
            System.out.print("Number is EVEN");
        } else{
            System.out.print("Number is ODD");
        }
    }
}