package StartingDays;

public class VowelClass {
    public static void main( String[] arg ){
        char str = 'a';
        boolean result = str == 'A' || str == 'a' || str == 'E' || str == 'e'||str == 'I' || str == 'i' || str == 'O' || str == 'o' || str == 'U' || str == 'u';
        if(result){
            System.out.println("this charecters are vowels");
        }
        else {
            System.out.println("this are consonants");
        }
    }
}
