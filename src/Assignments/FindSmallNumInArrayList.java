package Assignments;

import java.util.*;

public class FindSmallNumInArrayList {
    public static void main(String[] args) {
        Integer[] arr = {10,20,30};
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(5);
        System.out.println(list);

//        // Using Collections utility methods
//        int min = Collections.min(list);
//        int max = Collections.max(list);
//
//        System.out.println("Small Number: " + min);
//        System.out.println("Big Number: " + max);

        int small_num = list.get(0);
        int big_value = 0;
        for(Integer e : list){
            if (e < small_num){
                small_num = e;
            }
            if(e>big_value)
            {
                big_value = e;
            }

        }
        System.out.println("Small Number"+small_num);
        System.out.println("big Number"+big_value);

    }
}
