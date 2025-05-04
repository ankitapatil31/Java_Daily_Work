package AllTopics.Abstract;

public class Abstract_With_InnerCls {
}

// abstract class with inner abstract class implimentaton...

abstract class parent{
    parent(){
        System.out.println("parent Counstructor called..");
    }
    abstract void parentabstractMethod();
    void parentnormalMethod(){
        System.out.println(" normal method in parent class...");
    }
    abstract class inner{
        abstract void innerabstractMethods();
        void innerNormalMethod(){
            System.out.println("Normal method in inner class...");
        }
    }
}



class child extends parent{

    child(){
        System.out.println("child construstor called...");
    }
    @Override
    void parentabstractMethod() {
        System.out.println(" parent class abstract method impliment in child class");
    }
    class  innerchild extends inner{

        @Override
        void innerabstractMethods() {
            System.out.println("inner class abstract method impliment in child inner class");
        }
    }
}

