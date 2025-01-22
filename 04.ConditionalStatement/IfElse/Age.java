import java.util.*;

public class Age {

    public static void main(String args[]){
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter your original age: ");
      int age = scn.nextInt();
      
        // int age = 18;
        if(age>=18){
            System.out.print("adult: you can drive , vote");
        } else{
            System.out.print("Sorry , you are Not adult");
        }
    }
}