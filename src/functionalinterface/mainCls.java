package functionalinterface;

public class mainCls {
    public static void main(String[] args) {
        functionalInterfaceCls obj = new functionalInterfaceCls();
        obj.display();
        obj.FunctionalInterfacemethod();
        // call static methode with functional interface class
        FuncationalInterface.info();
    }
}
