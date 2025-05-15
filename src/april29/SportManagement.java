package april29;

import java.util.concurrent.atomic.AtomicInteger;

public class SportManagement {
   // int counter = 0;

    public void run(){
       // int counter = 0; // we can used it but not modify..
        AtomicInteger counter = new AtomicInteger(0);
        int value = (int) (Math.random() * 10.0);

        IPlay play =()-> System.out.println("Playing "+ counter.get() +" time");
        for(int i = 0; i< value;i++){
            play.play();
        }
    }
}
