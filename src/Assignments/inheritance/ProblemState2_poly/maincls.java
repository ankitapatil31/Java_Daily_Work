package Assignments.inheritance.ProblemState2_poly;

public class maincls {
    public static void main(String[] args) {
        Employee e;
        e = new FullTimeEmployee("ankita",2,2000);
        System.out.println(e.toString());
        System.out.println("FullTimeEmployee Salary : "+e.calculatePay());

        e = new PartTimeEmployee(12,48,"neha",3);
        System.out.println(e.toString());
        System.out.println("PartTimeEmployee salary : " +e.calculatePay());
    }
}
