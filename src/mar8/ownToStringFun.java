package mar8;

import mar1.Employeecls;

public class ownToStringFun {
    public static void main(String[] args) {
        Employeecls emp = new Employeecls("Ankita","ankita@gmail.com");
        System.out.println(emp.toString()); //mar1.Employeecls@53d8d10a
        /*
        * Default behavior is when we print object. it call internally like this [ emp.toString() ]
        * */
    }
}
