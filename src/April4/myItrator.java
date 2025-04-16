package April4;

import java.util.ArrayList;
import java.util.*;

public class myItrator {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(10);

        //remove only single element whichever find first. not all remove
//        if(list1.contains(10)){
//            list1.remove();
//        }

        System.out.println("List:- "+list1);

//        for(Integer e: list1){
//            if(list1.contains(10)){
//               // list1.remove(); // its not possible. it create exception ".ConcurrentModificationException" access
//                // we are trying to access already in used list and try to porform opration on it. thats why it shows exception
//            }
//        }

        // for solution to this is used Iterator

//        Iterator<Integer> itr  = list1.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }


        ListIterator<Integer> itr1 = list1.listIterator();
        System.out.println("hasPrevious"+itr1.hasPrevious());
        //System.out.println("----"+itr1.previous());
        //System.out.println("hasNext"+itr1.hasNext());
        while (itr1.hasNext()){
            Integer next = itr1.next();
            System.out.println(next);
            System.out.println("NextIndex: "+itr1.nextIndex());
//            Integer Previous  = itr1.previous();
//            System.out.println("----"+itr1.previous());
        }
      //  System.out.println("----"+itr1.previous());
        System.out.println("hasPrevious"+itr1.hasPrevious());
        System.out.println("hasNext"+itr1.hasNext());
       // System.out.println("Next"+itr1.next());
       // System.out.println("Previous"+itr1.previous());


        // Removing element from the iterator
        /*Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()){
            Integer next = itr.next();
            if(next == 10){
                itr.remove();
            }
            //System.out.println(itr.next());
        }*/


       // System.out.println(list1);
    }
}
