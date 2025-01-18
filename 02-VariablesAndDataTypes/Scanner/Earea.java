//Area of a Rectangle
import java.util.*;
public class Earea {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the radius value in decimal form: ");
        float r = scn.nextFloat();
        float area = 3.14f *r *r;
        System.out.print("Area of Rectangle is : " + area);
    }
}