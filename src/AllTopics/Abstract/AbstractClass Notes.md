--- About Sbract Class---
1. we can write static block/ normal block/ static methods in abstract class
    normal block only call we any object create... otherwise it will not called...
    for ex:
       public static void main(String[] args) {
        Abstract_With_Static.info();
        // here it called static  block and static method only...
       }
    we can define static methods in an abstract class that can be called independently without an object.
2. we cant create object of abstract class but if we impliment abstract method using lambda while create obj then we can used that class object.
    MediaDevice obj = new MediaDevice("asd"){
    @Override
    public void displayDetails(){
    return;
    }
    };
    obj.ImplimentedDisplay();
    MediaDevice.info();
// refer problem statement for abstract class
3.  An abstract is a Java modifier:  applicable for classes and methods in Java but not for
4.  Constructors are allowed.
5.  There can be a final method in abstract class but any abstract method in abstract class can not be declared as final
6.  If a class contains at least one abstract method then compulsory should declare a class
7.  We can use the abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract
    child.innerchild inner = outer.new innerchild();

8.  we can define final class inside abstract class.. and how we can called it:
    Abstract_With_Static.demo e = obj.new demo();
    e.demomethod();