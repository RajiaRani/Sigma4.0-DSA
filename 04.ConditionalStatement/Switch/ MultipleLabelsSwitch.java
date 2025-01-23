public class  MultipleLabelsSwitch {
    public static void main(String[] args) {
        int number = 10;

        switch (number) {
            case 1, 3, 5, 7, 9:
                System.out.println("Odd number");
                break;
            case 2, 4, 6, 8, 10:
                System.out.println("Even number");
                break;
            default:
                System.out.println("Number is neither odd nor even within the range.");
        }
    }
}
