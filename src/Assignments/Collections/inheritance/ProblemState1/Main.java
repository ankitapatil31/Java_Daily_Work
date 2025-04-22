package Assignments.Collections.inheritance.ProblemState1;

public class Main {
    public static void main(String[] args) {
        vehicles obj1 = new Car(2);
        obj1.DisplayInfo();
        //System.out.println(obj1.getNumDoors());
        ElectricCar obj2 = new ElectricCar(200,2);
        obj2.chargeBattery();
        obj2.displayInfo();
        obj2.NumDoors = 10;
        System.out.println(obj2.toString());
    }
}
