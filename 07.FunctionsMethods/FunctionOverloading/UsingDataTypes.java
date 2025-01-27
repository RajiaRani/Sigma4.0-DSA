package FunctionOverloading;

public class UsingDataTypes {
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
   public static void main(String[] args) {
        System.out.println("Interger sum = " + sum(9,9));
        System.out.println("Float sum = " + sum(9.9f,9.9f));
    }
}
