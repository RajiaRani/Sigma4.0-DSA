//Find the smallest number between 3 numbers
public class SmallestNo {

    public static void main(String args[]){
        int x = 2;
        int y = 7;
        int z = 0;
        if( x<y && x<z){
            System.out.print("Smallest number is :" + x);
        } else if( y<x && y<z){
            System.out.print("Smallest number is :" + y);
    } else {
        System.out.print("Smallest number is :" + z);
    }
    }
}