package mar25;

public class MainCLs {
    public static void main(String[] args) {
        // Static Inner Class
        System.out.println("\n --- Static Inner Class Output --- ");
        myStaticInnerCls.myInner obj = new myStaticInnerCls.myInner();
        obj.show();
        myStaticInnerCls.myInner.InnerShow();
        // Member Inner Class
        System.out.println("\n --- Member Inner Class Output --- ");
        //Local Inner Class
        System.out.println("\n --- Local Inner class Output --- ");

        //Anonymous Class Implementation
        /*
         * Anonymous Class has a Cls which has no Name...
         * It used for implimenting Interface / Abstract Class Method to Override.
         * It generally used when we have 1/2 menthods in interface/ abstract class...
        */
        System.out.println("\n --- anonymous Inner Class OutPut --- ");
        AnnoymusCls obj1 = new AnnoymusCls() {
            @Override
            public void show() {
                class AnonymousInnerInsideInnerClass{
                    public void Display1(){
                        System.out.println("anonymous Inner cls Inside Inner cls methods");
                    }
                }
                AnonymousInnerInsideInnerClass obj = new AnonymousInnerInsideInnerClass();
                obj.Display1();
            }
        };
        // Lambda Format
        // AnnoymusCls obj2 = () -> System.out.println("Implement Interface Show Method");
        obj1.show();

    }
}
