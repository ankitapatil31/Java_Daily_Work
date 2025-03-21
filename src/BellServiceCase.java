import java.util.Scanner;

public class BellServiceCase {
    public static void main(String[] args){
        System.out.println("Welcome to the Bell Service Center");
        System.out.println("***********************************");
        System.out.println("For English Press 1");
        System.out.println("For French Press 2");
        Scanner scan = new Scanner(System.in);
        int language = scan.nextInt();
        switch (language){
            case 1:
                System.out.println("for billing issue press 1");
                System.out.println("for technical issue press 2");
                System.out.println("for sales regarding issue press 3");
                System.out.println("to talk to our customer service associate press 4");

                
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid Input. Please Select valid Input");
        }
    }
}
