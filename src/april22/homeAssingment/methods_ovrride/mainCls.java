package april22.homeAssingment.methods_ovrride;

import java.util.*;

public class mainCls {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("212112121");
        list.add("23223233");
        employeeCls obj1 = new employeeCls(1,"asd",list);
        employeeCls obj2 = new employeeCls(1,"asd",list);


        Map<employeeCls,Integer> map = new HashMap<>();
        map.put(obj1,1222);
        map.put(obj2,33333);


        // when none of the method override

       /*
        // commet out both method from employee class then check this block of code
        System.out.println(map.toString()); // both objects of map return..
        System.out.println(map.get(new employeeCls(1,"asd",list))); // null
        System.out.println(map.get(obj1)); // return 1222
        System.out.println(obj1.hashCode()); // 1406718218
        System.out.println(obj2.hashCode()); // 245257410

        */

        // when only hashcode method override

        System.out.println(map.toString()); // all objects of map
        System.out.println(map.get(new employeeCls(1,"asd",list))); // null
        System.out.println(map.get(obj1)); // 1222
        System.out.println(obj1.hashCode()); // 69484574
        System.out.println(obj2.hashCode()); // 69484574



//        // when only equal method override
        System.out.println("-----------------------------------");
        System.out.println(map.toString()); // all object of map shown
        System.out.println(map.get(new employeeCls(1,"asd",list))); // null
        System.out.println(map.get(obj1)); // 1222
        System.out.println(obj1.hashCode()); // 1406718218
        System.out.println(obj2.hashCode()); // 245257410

//        // when both hashcode and equals method override

        System.out.println("-----------------------------------");
        System.out.println(map.toString()); // only one object {employeeCls{Id=1, Name='asd', PhoneNum=[212112121, 23223233]}=33333}
        System.out.println(map.get(new employeeCls(1,"asd",list))); //
        System.out.println(map.get(obj1)); //
        System.out.println(obj1.hashCode()); // 69484574
        System.out.println(obj2.hashCode()); // 69484574

        System.out.println(obj1.getPhoneNum().add("43434444")); // to Prevent and achieve
        // security make fully immutable class.. and return clone object

        System.out.println(map.toString());

    }
}
