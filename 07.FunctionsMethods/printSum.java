import java.util.Scanner;

public class printSum {
    public static int findSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st no: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd no: ");
        int b = sc.nextInt();
        findSum(a, b);
    }
}
