package mar8;

public class myImmutableString {
    public static void main(String[] args) {
        // inmutable String ( Store in string constant pool in heap)
        String s1 = "Ankita";
        System.out.println(s1);

        String s2 = s1.concat("Patil");
        System.out.println(s1); // Ankita
        System.out.println(s2); // Ankita Patil

        /*
        * Reason behind this out put:-
        *
        *  it cant change the actual object of memory in string pool.
        *  instated its create new object in string pool with new name.
        *  thats why we call it as immutable strings.
        *
        *  [--------Own language note------]
        *
        *  karan s1 ha ankita navach object la point out karat ahe jo ki string contant pool
        *  made ahe.. je ki change hot nhi.. mhnun tyala immutable mhntat.
        *
        *  jari concat kel tr to new object create karto.
        *  refer img
        * */

    }

}
