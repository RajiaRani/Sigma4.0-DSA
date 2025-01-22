import java.util.*;
public class Income {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int income = scn.nextInt();
        int tax;

        if(income < 500000){
          tax = 0;
        } 
        else if( income >= 500000 && income <10000000){
            tax = (int) (income * 0.2);
        }
        else{
            tax = (int) (income * 0.3);
        }
        System.out.println("your tax is " + tax);
    }
}