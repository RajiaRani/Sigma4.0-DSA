import java.util.*;
public class Income {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your annual income : ");
         long income = scn.nextLong();
        if(income >= 5000000){
           System.out.print("You have to pay the income tax , because your annual income more than 4L.");
        } else{
            System.out.print("You no need to pay the income tax");
        }
    }
}