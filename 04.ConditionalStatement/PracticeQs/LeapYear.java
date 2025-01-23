import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0 ));


        if( x && ( y || z)){
            System.out.print(year + " is a Leap year.");
        } 
        else {
            System.out.print(year + " is Not a Leap year.");  
        }

    }
}
