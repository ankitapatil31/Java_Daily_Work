package Assignments.inheritance.ProblemState2_poly;

public class PartTimeEmployee extends Employee{
    int hours;
    int payRate;


    PartTimeEmployee(int hours, int payrate, String name, int id) {
        super(name, id);
        this.hours = hours;
        this.payRate = payrate;
    }

    @Override
    public int calculatePay() {
        return payRate*hours;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "hours=" + hours +
                ", payRate=" + payRate +
                ", Name='" + Name + '\'' +
                ", Id=" + Id +
                '}';
    }
}
