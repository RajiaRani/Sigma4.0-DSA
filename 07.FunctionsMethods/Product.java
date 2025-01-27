public class Product {
    public static int findProduct(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int ans = findProduct(2, 2);
        System.out.print("Product of two number " + ans);
    }
}
