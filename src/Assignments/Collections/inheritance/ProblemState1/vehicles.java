package Assignments.Collections.inheritance.ProblemState1;

public class vehicles {
    private String make;
    private int model;
    private int year;

    vehicles(){
        this.make = "";
        this.model = 0;
        this.year = 0;
    }

    public String getMake() {
        return make;
    }

    public int getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    public  void Start(){
        System.out.println("vehicle Start---");
    }
    public void Stop(){
        System.out.println("vehicle Stop----");
    }
    public void DisplayInfo(){
        System.out.println("Make"+make);
        System.out.println("Model"+model);
        System.out.println("year"+ year);
    }
    public void displayInfo(){
        System.out.println("vehicles Class Called---");
    }
}
