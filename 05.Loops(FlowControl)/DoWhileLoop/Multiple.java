//Keep Entering numbers till user enter multiple of 10. eg: 20,30,40,50,100,200,400.....

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number ");
            int number = sc.nextInt();
            if (number % 10 == 0) {
                break;
            }
            System.out.println(number);
        } while (true);
    }
}
