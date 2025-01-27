public class HollowRectanglePattern {
    public static void findPattern(int totRow, int totCol) {
        // outer loop -- means rows
        for (int i=1; i<=totRow; i++) {
            // inner loop -- columns
            for (int j=1; j<=totCol; j++) {
                if (i==1 || i==totRow || j==1 || j==totCol) {
                    System.out.print("*"); // dont give the gap or extar space like this " * " becuase that extra space will count as one empty cell
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        findPattern(5, 5);
    }
}
