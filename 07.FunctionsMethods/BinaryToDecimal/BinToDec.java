package BinaryToDecimal;

public class BinToDec {
    public static void binToDec(int binNum){
        int decNum = 0;
        int power = 0;
        int myBinNum = binNum;
        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)(Math.pow(2, power)));
            power++;
            binNum = binNum / 10;

        }
        System.out.print("Decimal of " + myBinNum + " =  " + decNum);
    }
    public static void main(String[] args) {
        binToDec(111);
    }
}
