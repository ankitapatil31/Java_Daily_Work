package April4;

import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {
        int [] arr = {11,12,13,14,15,11,1,4,2,13};
        List<int[]> list = Arrays.asList(arr);

        list.addAll(Collections.singleton(arr));
    }
}
