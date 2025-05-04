package april22;

import java.util.*;

public class mainCls {
    public static void main(String[] args) {
        Map<student, Integer> map = new HashMap<>();
        map.put(new student("ankita",1),222);
        map.put(new student("Janvi",2),1211);
        System.out.println(map.get(new student("ankita", 1)));

        System.out.println(map);

        student s1 = new student("ankita",1);
        student s2 = new student("ankita",1);

        System.out.println(s1.hashCode());
        s1.setName("Ashuuu");
        System.out.println(map.get(s1));
        System.out.println(s1.hashCode());
        System.out.println("---------------------");
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));

    }
}
