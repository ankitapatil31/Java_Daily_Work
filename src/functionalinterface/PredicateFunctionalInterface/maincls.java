package functionalinterface.PredicateFunctionalInterface;

import java.util.function.Predicate;

public class maincls {
    public static void main(String[] args) {
        calculate obj = new calculate();
        // pass predicate as parameter
        System.out.println(obj.arthimaticopration(10, i -> i > 7));

        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18);

        // Calling Predicate method
        System.out.println(lesserthan.test(10));
    }
}
