package Assignments.inheritance.ProblemState2_poly;

public class FullTimeEmployee extends Employee{
    int monthlySalary;
    FullTimeEmployee(String name, int id, int salary) {
        super(name, id);
        monthlySalary = salary;
    }

    @Override
    public int calculatePay() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", Name='" + Name + '\'' +
                ", Id=" + Id +
                '}';
    }
}
