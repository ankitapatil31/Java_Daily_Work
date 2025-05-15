package functionalinterface;


@FunctionalInterface
public interface FuncationalInterface {
    void display();
    static void info(){
        System.out.println("static methods in functional interface");
    }

    default void FunctionalInterfacemethod(){
        System.out.println("FunctionalInterface 1 default method call...");
    }
}
