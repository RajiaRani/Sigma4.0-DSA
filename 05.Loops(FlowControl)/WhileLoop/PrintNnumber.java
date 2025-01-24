//print number from 1 to n

import java.util.Scanner;

public class PrintNnumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int counter = 1;
        while( counter <=  number){
            System.out.println(counter + " ");
            counter++;
        }
    }
}