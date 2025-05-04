package april29;

public class SportManagement {
    int counter = 0;

    public void run(){
        int value = (int) (Math.random() * 10.0);
        IPlay play =()-> System.out.println("Playing "+counter++ +" time");
        for(int i = 0; i< value;i++){
            play.play();
        }
    }
}
