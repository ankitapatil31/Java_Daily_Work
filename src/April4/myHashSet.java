package April4;

import java.util.*;

public class myHashSet {
    public static void main(String[] args) {

        System.out.println("------HashSet----");
        HashSet<Integer> hashset = new HashSet<Integer>();
        hashset.add(10);
        hashset.add(20);
        hashset.add(10);
        hashset.add(null);
        hashset.add(null);
        System.out.println(hashset);

        System.out.println("\n-------TreeSet------");
        TreeSet<String> treeset = new TreeSet<String>();
        treeset.add("anki");
        treeset.add("tanvi");
        treeset.add("govi");
        treeset.add("anki");
       //treeset.add(null);
        System.out.println(treeset);

        System.out.println("\n--------linkedhashset---------");

        LinkedHashSet<Float> linkedHashSet = new LinkedHashSet<Float>();
        linkedHashSet.add(12.3f);
        linkedHashSet.add(12.3f);
        linkedHashSet.add(15.3f);
        linkedHashSet.add(14.3f);
        linkedHashSet.add(null);
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);

        System.out.println("\n------------Works---------------");
        Integer [] arr = {11,12,13,14,15,11,1,4,2,13};
        Set<Integer[]> set = new HashSet<>();
        set.add(arr);
        System.out.println(set);

    }
}
