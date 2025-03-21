package mar1;

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main (String[] arg){
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array Element:- \n");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("\n Display Array Element:- ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
