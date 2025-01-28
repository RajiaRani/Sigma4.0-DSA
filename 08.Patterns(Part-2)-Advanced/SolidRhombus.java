public class SolidRhombus {
    public static void solidRhombus(int n){
        for(int i=1; i<=n; i++){
            //for spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //for Stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solidRhombus(7);
    }
}
