package functionalinterface.PredicateFunctionalInterface;

import java.util.function.Predicate;

public class calculate {
    public boolean arthimaticopration(int num, Predicate<Integer> predicate){
        return predicate.test(num);
    }
}
