package Assignments.inheritance.ProblemState1;

public class Motorcycle extends vehicles{
    protected int numCylinders ;

    public Motorcycle(int numCylinders){
        super();
        numCylinders = numCylinders;
    }

    public int getNumCylinders() {
        return numCylinders;
    }
    public void displayInfo(){
        System.out.println("Motorcycle Class Called---");
    }
}
