public class SmallestNumber {
    public static int findSmallest(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 0, 6, 7, 8, 9, 10 };
        int result = findSmallest(arr);
        System.out.print("Smallest Number = " + result + " ");
    }
}
