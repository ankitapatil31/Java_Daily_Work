package Assignments.Collections.inheritance.ProblemState1;

public class Car extends vehicles{
    protected  int NumDoors;

    public Car(int numDoors) {
        NumDoors = numDoors;
    }

    public int getNumDoors() {
        return NumDoors;
    }
    public void displayInfo(){
        System.out.println("Car Class Called---");
    }

    @Override
    public String toString() {
        return "Car{" +
                "NumDoors=" + NumDoors +
                '}';
    }
}
