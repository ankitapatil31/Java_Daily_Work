package april29.Streams;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mainCls {
    public static void main(String[] args) {
        List<String> username = new ArrayList<String>(List.of("Ankita","tanvi","Hemant","Hemant","divyek"));
        List<String> usersStream = username.stream()
                .filter(n-> n.length()==6)
                .distinct().collect(Collectors.toList());

        System.out.println(usersStream);


        List<Integer> number = new ArrayList<Integer>(Arrays.asList(2,3,4,5,66,2,1,44,5,5));
        List<Integer> num = number.stream()
                .filter(n->n%2==0)
                .map(   n->{n = n*n; return n; }).findFirst().stream().collect(Collectors.toList());
        System.out.println(num);
    }

}
