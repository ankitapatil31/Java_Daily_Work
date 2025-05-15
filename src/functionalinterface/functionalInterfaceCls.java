package functionalinterface;

public class functionalInterfaceCls implements FuncationalInterface,FunctionalInterface2{

    @Override
    public void display() {
        System.out.println("ovrride methods...");
    }
    // here if we have same name default method in both interface then we need to override it
    // within implimentaed class and call it like wise...
    @Override
    public void FunctionalInterfacemethod() {
        FunctionalInterface2.super.FunctionalInterfacemethod();
    }
}
