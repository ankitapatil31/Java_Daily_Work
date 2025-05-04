package april22;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        List<String> phonenumber = new ArrayList<>(List.of("234234322","344444444"));
        Map<employee,Integer> map = new HashMap<>();
        employee e1 = new employee(2,"Ankita",phonenumber);
        map.put(e1,200);
        employee e2 = new employee(1,"Janvi",phonenumber);
        map.put(e2,200);

        System.out.println(map.get(e2));
        System.out.println(e1.getPhoneNum().add("111111"));
        System.out.println(e1.toString());
    }


}
