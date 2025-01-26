//Print Inverted-Star Pattern
// ***** 
// ****
// ***
// **
// *
// public class InvertedStar {
//     public static void main(String[] args) {
//         //outer loop
//         for(int line = 5; line>=1; line--){
//             //inner loop
//             for(int star=line; star>=1; star--){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }




public class InvertedStar {
    public static void main(String[] args) {
        //outer loop
        int n = 5;
        for(int line = 1; line<=5; line++){
            //inner loop
            for(int star=1; star<=n-line+1; star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

