public class CallbyValue {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a " + a);
        System.out.println("Value of b " + b);
        return;
    }
    public static void main(String[] args) {
        swap(2,8);

    } 
}
