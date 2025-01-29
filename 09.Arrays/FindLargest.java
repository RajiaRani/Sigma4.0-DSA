public class FindLargest {
    public static int findLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {22, 78, 1, 7, 90, 100, 23, 56, 900};
        int result = findLargest(arr);
        System.out.print("Largest Number = " + result + " ");
    }
}
