import java.util.*;
public class Calculator {
    public static void main(String args[]){
   Scanner scn = new Scanner(System.in);
   System.out.print("Enter first number : ");
   int a = scn.nextInt();
   System.out.print("Enter second number : ");
   int b= scn.nextInt();

   System.out.print("Enter operation you want to performed: ");
   char operator = scn.next().charAt(0);

   switch (operator) {
    case '+':
    System.out.print(a+b);
    break;
    case '-':
    System.out.print(a-b);
    break;
    case '*':
    System.out.print(a*b);
    break;
    case '/':
    System.out.print(a/b);
    break;
    default:
    System.out.print(a%b);
        break;
   }
    }
}
