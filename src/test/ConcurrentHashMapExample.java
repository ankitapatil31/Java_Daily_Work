package test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    static Map<Integer, String> map = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {
        Runnable writer = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Value" + i);
            }
        };

        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(writer);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Size: " + map.size()); // Expected: 2000
    }
}
