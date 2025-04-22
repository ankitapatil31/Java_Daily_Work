package Assignments.Collections.Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Ankita";
        if(isStringPalindrome(str)){
            System.out.println("String is Palindrom");
        }
        else
            System.out.println("Not Palindrom...");

    }
    public static boolean isStringPalindrome(String str){
        // reverse the orignal String
        String dummyStr = "";

        for (int i = str.length()-1; i>=0;i--){
            dummyStr = dummyStr+str.charAt(i);
        }
        // check revers string is equal with orignal string.
        return str.equals(dummyStr);
    }
}
