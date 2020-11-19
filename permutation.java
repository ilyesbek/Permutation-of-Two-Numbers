import java.util.Scanner;

public class permutation {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Please give a number as 1st variable: ");
        int a = myScan.nextInt();

        System.out.println("Please give a number as 2nd variable: ");
        int b = myScan.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("The new variable of a is: "+a);
        System.out.println("The new variable of b is: "+b);      
       
    }

}