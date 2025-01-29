public class PassingArrayAsArrgument {
    public static void updateMarks(int arr[]){
       for(int i=0; i<arr.length; i++){
         arr[i] = arr[i] + 1;
       }
    }
    public static void main(String[] args) {
        int arr[] = { 78, 90, 80};
       updateMarks(arr);
       for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
       }
    }
}
