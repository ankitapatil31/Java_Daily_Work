package mar8;

public class myMutableString {
    public static void main(String[] args) {
        //stringBuffer and Stringbuilder (store in heap)

        StringBuffer str1 = new StringBuffer("Ankita");
        System.out.println(str1);
        System.out.println("After Append \n");
        StringBuffer str2 = str1.append("Patil");
        System.out.println(str1); // AnkitaPatil
        System.out.println(str2); // AnkitaPatil

        /*
        * stringbuffer and stringbuilder are mutable means basically it change the actual
        * object of memory. not create new object.
        * */
    }
}
