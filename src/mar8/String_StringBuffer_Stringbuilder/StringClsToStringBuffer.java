package mar8.String_StringBuffer_Stringbuilder;

public class StringClsToStringBuffer {
    public static void main(String[] args) {
        // Custom input string
        String s = "Geeks";

        // Converting String object to StringBuffer object
        // by creating object of StringBuffer class
        StringBuffer sbr = new StringBuffer(s);

        // Reversing the string
        sbr.reverse();

        // Printing the reversed string
        System.out.println( "String to String Buffer converted  "+sbr);
        System.out.println("String value:  "+s);

        // Converting String object to StringBuilder object
        StringBuilder sbl = new StringBuilder(s);

        // Adding it to string using append() method
        sbl.append("forGeeks");

        // Print and display the above appended string
        System.out.println(sbl);

        // StringBuffer to Stringbuilder
        StringBuilder strBuilder = new StringBuilder(" New String Builder");

        StringBuffer strBuffer = new StringBuffer(strBuilder);

        System.out.println("Converting String builder to String buffer "+strBuffer.reverse());

    }
}
