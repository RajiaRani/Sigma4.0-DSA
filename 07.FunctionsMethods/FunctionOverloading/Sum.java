package FunctionOverloading;

public class Sum {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        int ans = sum(2,2);
        int ans2 = sum(2,2,2);
        System.out.println("a+b = " + ans);
        System.out.println("a+b+b = " + ans2);
    }
}
