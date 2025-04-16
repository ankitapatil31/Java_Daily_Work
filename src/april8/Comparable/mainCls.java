package april8.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class mainCls {
    public static void main(String[] args) {
        ProductList p1 = new ProductList(5,"bag","Good qulity");
        ProductList p2 = new ProductList(2,"bag","Good qulity");
        ProductList p3 = new ProductList(3,"bag","Good qulity");
        List<ProductList> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println("Before sorting : "+list);

        Collections.sort(list);

        System.out.println("After sorting : "+ list);
    }
}
