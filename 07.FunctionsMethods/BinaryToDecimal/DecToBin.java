package BinaryToDecimal;

public class DecToBin {
    public static void decToBin(int decNum){
        int binNum = 0;
        int power = 0;
        int myDecNum = decNum;
        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (rem *(int)(Math.pow(10,power)));
            power++;
            decNum = decNum/2;
        }
        System.out.print("Binary form of " + myDecNum + " = " + binNum);
    }
    public static void main(String[] args) {
        decToBin(7);
    }
}
