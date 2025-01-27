public class HollowRectanglePattern {
    public static void findPattern(int row, int col){
             //outer loop -- means rows
             for(int i=1; i<=row; i++){
                //inner loop -- columns
                for(int j=1; j<=col; j++){
                    if( i==1 || i==row || j==1 || j==col){
                        System.out.print(" * ");
                    } else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
             }

    }
    public static void main(String[] args) {
   findPattern(5, 6);
    }
}
