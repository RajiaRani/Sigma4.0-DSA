public class SpiralMatrix {
    public static void spiralMatrix(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Traverse from left to right (Top Row)
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++; // Move down

            // Traverse from top to bottom (Right Column)
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--; // Move left

            // Traverse from right to left (Bottom Row) - only if there's a new row to process
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
                endRow--; // Move up
            }

            // Traverse from bottom to top (Left Column) - only if there's a new column to process
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++; // Move right
            }
        }

        System.out.println(); // Print newline at the end
    }

    public static void main(String[] args) {
        int matrix[][] = { 
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 },
            { 10, 11, 12 },
            { 14, 15, 16 },
            { 17, 18, 19 } 
        };

        spiralMatrix(matrix);
    }
}
