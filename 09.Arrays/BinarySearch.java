public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // condition:1
            if (arr[mid] == key) {
                return mid;
            }

            // condition 2
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // NOT FOUND
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 90 };
        int key = 90;
        int result = binarySearch(arr, key);
        System.out.print("The key index = " + result + " ");


    }
}
