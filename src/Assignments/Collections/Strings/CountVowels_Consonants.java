package Assignments.Collections.Strings;

public class CountVowels_Consonants {
    public static void main(String[] args) {
        String str = "AEIOs ";
        int vowelsCount = CountOfVowels(str);
        System.out.println("Number of Vowels : "+ vowelsCount);
        int ConsonantsCount = str.length() - vowelsCount;
        System.out.println("Number of Consonants : "+ ConsonantsCount);
    }
    public static int CountOfVowels(String str){
        str = str.toLowerCase();
        int count = 0;
        for(int i = 0; i<str.length(); i++){
           char charecter = str.charAt(i);
            if(charecter=='a'|| charecter == 'e'|| charecter=='i'|| charecter == 'o'||charecter == 'u'){
                count ++;
            }
        }
        return count;
    }
}
