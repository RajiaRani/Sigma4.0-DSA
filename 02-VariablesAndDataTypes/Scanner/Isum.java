// Enter the cost of 3 items from the user(using float data types) - a pencil, a pen , a eraser. You have to output the total cost of the item back to the user and their bill.
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
import java.util.*;
public class Isum {

    public static void main(String args[]){
        Scanner  scn = new Scanner(System.in);
        System.out.print("Enter pencile price: ");
        float pencil = scn.nextInt();

        System.out.print("Enter pen price: ");
        float pen = scn.nextInt();

        System.out.print("Enter eraser price: ");
        float eraser = scn.nextInt();
        
        float total = pen + pencil + eraser;

        System.out.println("Bill is " + total);

        //Add on - with 18% GST
        float newTotal = total +(0.18f * total);
        System .out.print("Bill with 18% GST = " + newTotal);

    }
}