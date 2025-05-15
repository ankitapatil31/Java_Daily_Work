package functionalinterface;

@FunctionalInterface
public interface FunctionalInterface2 {
    void display();
    default void FunctionalInterfacemethod(){
        System.out.println("FunctionalInterface 2 default method call...");
    }

}
