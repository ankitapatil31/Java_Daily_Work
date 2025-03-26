package mar25;

public class MemberInnerClass {
    // Class Within a Class is Call as Member Inner Class
    public void Display(){
        System.out.println("Disply");
    }
    class InnerCls {
        public void Display(){
            System.out.println("Inner Display method");
        }
    }
}
