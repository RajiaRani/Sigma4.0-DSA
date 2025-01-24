public class ReverseNumber {
    public static void main(String[] args) {
        int n = 10899;
        while ( n > 0){
          int lastDigit = n % 10; // to get the last digit
          System.out.print(lastDigit + " ");
           n = n / 10; // to remove the last digit
        }
        System.out.println();
    }
}
