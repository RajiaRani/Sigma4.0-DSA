public class Selection {
    public static void selection(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] =temp;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 6, 9, 2, 3, 1, 0, 8, 7, 4, 5};
        selection(arr);
        printArray(arr);
    }
}
