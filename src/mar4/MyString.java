package mar4;

public class MyString {
    public static void main(String[] args) {
//        String s1 = "org";
//        String s2 = "Apple";
//        String s3 = new String("org");
//        System.out.println(s1==s2); // check reference
//        System.out.println(s1==s3);
//        System.out.println(s1.equals(s3)); // check content
//        System.out.println(s1.equals(s2));
        String s = "Geeks";
        String r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {

            ch = s.charAt(i);
            r = ch + r;

        }

        System.out.println(r);

    }
}
