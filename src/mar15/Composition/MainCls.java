package mar15.Composition;

public class MainCls {
    public static void main(String[] args) {

        Name name = new Name("Ankita","Mahendra", "Patil");

        Employee emp1 = new Employee(1,name,"ankita@gmail.com");
        System.out.println(emp1);
        System.out.println(emp1.getName().getFirstName());
       // Employee emp2 = new Employee(2,"ankita2","patil@gmail.com");
    }
}





class mycls{

}