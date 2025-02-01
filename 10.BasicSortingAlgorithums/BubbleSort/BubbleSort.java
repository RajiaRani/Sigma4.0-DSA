public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        // outer loop
        // i = 1 to n-1
        for (int i = 0; i < n - 1; i++) { 
            // inner loop
            // j=1 to n-i
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // For print the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) { // Fixed loop
            System.out.print(arr[i] + " "); // Print in one line
        }
        System.out.println(); // New line after printing

    }

    public static void main(String[] args) {
        int arr[] = { 1, 9, 10, 67, 89, 33, 5, 2, 11, 80, 45, 32 };
        bubbleSort(arr);
        printArray(arr);
    }
}
