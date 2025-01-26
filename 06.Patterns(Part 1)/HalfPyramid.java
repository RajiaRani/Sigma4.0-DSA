//Print Half-Pyramid patterns
// 1
// 12
// 123
// 1234
// 12345

public class HalfPyramid {
    public static void main(String[] args) {
        //outerloop
        for( int line = 1; line<=5; line++){
            //inner
            for ( int i = 1; i<=line; i++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
