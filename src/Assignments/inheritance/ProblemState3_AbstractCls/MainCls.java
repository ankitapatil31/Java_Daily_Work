package Assignments.inheritance.ProblemState3_AbstractCls;

public class MainCls {
    public static void main(String[] args) {
        MediaDevice obj = new AudioPlayer("tere name","tere name","ankita..");
        //obj.play();
        obj.displayDetails();

        MediaDevice obj2 = new VideoPlayer("pyar tera", "prem", 200);

        obj2.displayDetails();



    }
}
