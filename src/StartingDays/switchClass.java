package StartingDays;

import java.util.Scanner;

public class switchClass {
    public static void main( String[] arg ){
        System.out.println("Welcome to my own calculator");
        System.out.println("For Addition Enter 1");
        System.out.println("For Subtraction Enter 2");
        System.out.println("For Multiplication Enter 3");
        System.out.println("For Division Enter 4");
        Scanner scan = new Scanner(System.in);
        int userResponse = scan.nextInt();
        System.out.println("Enter two Number: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        switch (userResponse){
            case 1:

                System.out.println("value of two number: x = "+x+ " and Y = "+y);
                System.out.println("Addition of two number is = "+ (x+y));
                break;
            case 2:

                System.out.println("value of two number: x = "+x+ " and Y = "+y);
                System.out.println("Subtraction of two number is = " +(x-y));
                break;
            case 3:

                System.out.println("value of two number: x = "+x+ " and Y = "+y);
                System.out.println("Multiplication of two number is = " +(x*y));
                break;
            case 4:

                System.out.println("value of two number: x = "+x+ " and Y = "+y);
                System.out.println("Division of two number is = " +(x/y));
                break;
            default:
                System.out.println("Invalid Input: you Enter "+userResponse);
                break;
        }
    }
}
