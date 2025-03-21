package StartingDays;

import java.util.Scanner;

public class ArithmaticCalculator {
    static class ArithmaticOprations{
        public int addition(int i,int j){
            return i+j;
        }
        public int subtraction(int i,int j){
            return i-j;
        }
        public int divistion(int i,int j){
            return i/j;
        }
        public int multiplication(int i,int j){
            return i*j;
        }
    }
    public static void main(String[] args){
        int userInput = 0;
        ArithmaticOprations arithmaticOprations = new ArithmaticOprations();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("*********Welcome to calculator********");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("0. exit");
            System.out.println("Enter your Choice:- ");
            userInput = scanner.nextInt();
            int i = 0;
            int j = 0;
            switch (userInput){
                case 1:
                    System.out.println("Enter the value for i");
                    i=scanner.nextInt();
                    System.out.println("Enter the value for j");
                    j=scanner.nextInt();
                    System.out.println("Addition of two Number:- "+ arithmaticOprations.addition(i,j));
                    break;
                case 2:
                    System.out.println("Enter the value for i");
                    i=scanner.nextInt();
                    System.out.println("Enter the value for j");
                    j=scanner.nextInt();
                    System.out.println("Subtraction of two Number:- "+ arithmaticOprations.subtraction(i,j));
                    break;
                case 3:
                    System.out.println("Enter the value for i");
                    i=scanner.nextInt();
                    System.out.println("Enter the value for j");
                    j=scanner.nextInt();
                    System.out.println("Divition of two Number:- "+ arithmaticOprations.divistion(i,j));
                    break;
                case 4:
                    System.out.println("Enter the value for i");
                    i=scanner.nextInt();
                    System.out.println("Enter the value for j");
                    j=scanner.nextInt();
                    System.out.println("Subtraction of two Number:- "+ arithmaticOprations.multiplication(i,j));
                    break;
                default:
                    if(userInput != 0){
                        System.out.println("Invalid Input");
                        System.out.println("do you want to continue? (Y/N)");
                        String userchoice = scanner.next();
                        if(userchoice.equals("Y") || userchoice.equals("y")){
                            System.out.println("continue block");
                            continue;
                        }
                        else {
                            userInput = 0;
                            break;
                        }
                    }
                    break;
            }
        }while (userInput != 0);
    }
}
