//Write a program to ask the user for their name and display 
import java.util.*;
public class Dname {

    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        //Prompt the user for their name and age
        System.out.print("Please enter the user name: ");
        String name = scn.nextLine();

        System.out.print("Please enter the user age: ");
        int age  = scn.nextInt();
        System.out.println("Hello " + name + " ! " );
        System.out.print("You are "  + age + " year's old.");
        scn.close();
    }
}