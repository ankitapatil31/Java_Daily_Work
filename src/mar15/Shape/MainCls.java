package mar15.Shape;

public class MainCls {
    public static void main(String[] args) {

       //  this are the normal flow
       /*

        SquareCls squareCls = new SquareCls();
        System.out.println("Square of side "+ squareCls.area());

        CircleCls circleCls = new CircleCls();
        System.out.println("redius of Circle "+ circleCls.area());

        */

        //upcasting

        // creating a object of child class and assign it to parent class

        SquareCls shapeCLs = new SquareCls();
        System.out.println("upcasting square  "+ shapeCLs.area());


    }
}
