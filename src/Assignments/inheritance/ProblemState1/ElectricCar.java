package Assignments.inheritance.ProblemState1;

public class ElectricCar extends Car{
    protected int batteryCapacity ;

    public ElectricCar(int batteryCapacity,int numDoors) {
        super(numDoors);
        this.batteryCapacity = batteryCapacity;
    }
    public void chargeBattery(){
        System.out.println("charge battery");
    }
//    public void displayInfo(){
//        System.out.println("ElectricCar Class Called---");
//    }

//    @Override
//    public String toString() {
//        return "ElectricCar{" +
//                "batteryCapacity=" + batteryCapacity +
//                ", NumDoors=" + NumDoors +
//                '}';
//    }
}
