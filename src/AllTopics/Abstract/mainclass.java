package AllTopics.Abstract;

public class mainclass {
    public static void main(String[] args) {
        // below calls is for abstract inner class and abstract class
//        child outer = new child();
//        outer.parentabstractMethod();
//        outer.parentnormalMethod();
//
//        child.innerchild inner = outer.new innerchild();
//        inner.innerabstractMethods();
//        inner.innerNormalMethod();

        // below code is for static/ normal block and final in abstract class
        System.out.println("\n\n\n ----Static Block / normal block/ final methods---\n");
        Abstract_With_Static obj = new Abstract_With_Static() {
            @Override
            void displayDetails() {
                System.out.println("Abstract method...");
                return;
            }
        };
        obj.finalmethod();
        obj.displayDetails();
        obj.ImplimentedDisplay();
        // static method call with class name.
        Abstract_With_Static.info();

        // here we call final class method inside abstract class...
        Abstract_With_Static.demo e = obj.new demo();
        e.demomethod();

    }
}
