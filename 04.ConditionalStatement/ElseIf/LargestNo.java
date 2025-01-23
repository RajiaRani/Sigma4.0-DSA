//Print the largest of 3
public class LargestNo {

    public static void main(String args[]) {
        int a = 10;
        int b = 34;
        int c = 3;
        if (a >= b && a >= c) {
            System.out.print("Largest number is :" + a);
        }
         else if (b >= c) {
            System.out.print("Largest number is :" + b);
        } 
        else {
            System.out.print("Largest number is :" + c);
        }

    }
}