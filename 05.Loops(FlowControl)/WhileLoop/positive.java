import java.util.Scanner;

public class positive {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number;
        while(true){
            System.out.print("Enter a positive number: ");
            number = scn.nextInt();

            if (number > 0) {
                break; // Exit the loop if the input is positive
            }

            System.out.println("Invalid input. Please try again.");
        }

        System.out.println("You entered: " + number);
        scn.close();
        }
    }
