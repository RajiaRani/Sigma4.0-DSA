public class Butterfly {
    public static void Butterfly(int n) {
        // For 1st half
        for (int i = 1; i <= n; i++) {

            // For stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // For Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // For star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half
        for (int i = n; i >= 1; i--) {

            // For stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // For Spaces
            for (int j = 1; j<= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // For star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
      Butterfly(5);
    }
}
