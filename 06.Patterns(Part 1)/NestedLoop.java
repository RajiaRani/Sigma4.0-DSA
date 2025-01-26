//Print the stars in the form of 
// *
// ** 
// ***
// ****
// *****
//we will use the Nested Loops

public class NestedLoop {
    public static void main(String args[]){
    //Outer loop
    for(int line = 1; line<=5; line ++){
        //Inner loop
        for(int star=1; star<=line; star++){
            System.out.print(" * ");
        }

        System.out.println();
    }
    }
}
