
//calculates the total marks and percentage based on the user's input for 5 subjects.
import java.util.*;

public class Jgrade {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

     // Prompt the user to enter marks for 5 subjects
        System.out.println("Enter marks for 5 subjects (out of 100 each):");

        // Input marks for each subject
        int subject1 = scn.nextInt();
        int subject2 = scn.nextInt();
        int subject3 = scn.nextInt();
        int subject4 = scn.nextInt();
        int subject5 = scn.nextInt();

         // Calculate total marks
         int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

         // Calculate percentage
         float percentage = (totalMarks / 500.0f) * 100;
 
         // Display total and percentage
         System.out.println("Total Marks: " + totalMarks);
         System.out.println("Percentage: " + percentage + "%");
 
         scn.close();

    }
    }