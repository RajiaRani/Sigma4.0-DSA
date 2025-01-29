public class LinearSearch {
    public static int linearSearch(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i; //target index
            } 
        }
        return -1; // Not found
    }
    
    public static void main(String[] args) {
        int arr[] = { 24, 7, 8, 90, 56, 1, 2, 5, 11,9};
        int target = 2;
       int result =  linearSearch(arr, target);
       if(result == -1){
        System.out.println("Element not found");
       } else{
        System.out.println("Element found at index: " + result);
       }
    }
}
