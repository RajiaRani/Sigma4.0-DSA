// In a program , input the side of a square. You have to output the area of the square?
//Formula = side * side
import java.util.*;
public class Hsquare {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the side: ");
        int side = scn.nextInt();
        int area = side * side;
        System.out.print("Area of square = " + area);
    }
}