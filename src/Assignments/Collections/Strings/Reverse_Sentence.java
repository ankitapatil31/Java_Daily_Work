package Assignments.Collections.Strings;

public class Reverse_Sentence {
    public static void main(String[] args) {
        String words = "Java Programming is Fun";
        System.out.println(reverseWords(words));

    }
    public static String reverseWords(String str){
        String[] words = str.split(" ");

        String DummyStr = "";
        System.out.println(words.length);
        for(int i = words.length-1; i>=0; i--){
            DummyStr = DummyStr+" "+words[i];
        }
        return DummyStr;
    }
}
