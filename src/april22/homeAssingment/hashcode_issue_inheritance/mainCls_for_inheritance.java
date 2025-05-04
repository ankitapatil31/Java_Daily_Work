package april22.homeAssingment.hashcode_issue_inheritance;

import java.util.*;

public class mainCls_for_inheritance {
    public static void main(String[] args) {
        employeecls_for_inheritance c1 = new employeecls_for_inheritance(101, "Ankita", List.of("123456"));
        //employeecls_for_inheritance c2 = new employeecls_for_inheritance(101, "Ankita", List.of("123456"));
        ChildCls c2 = new ChildCls(101, "Ankita", List.of("123456"), 99);
        Map<ChildCls, Integer> obj1 = new HashMap<>();
        obj1.put(c2,122);
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c1));
    }
}
