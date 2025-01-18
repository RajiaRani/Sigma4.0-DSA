import java.util.*;
public class Cmodule {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int mod = x % y;
        System.out.print(mod);
    }
}