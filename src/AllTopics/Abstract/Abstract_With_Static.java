package AllTopics.Abstract;

abstract public class Abstract_With_Static {
    String name;
    static int i = 0;

    abstract void displayDetails();
    // final method in abstract class
    final void finalmethod(){
        System.out.println("Its final method in abstract class");
    }
    void ImplimentedDisplay(){
        System.out.println("Normal Methods in abstract Class...");
    }
    // normal Block
    {
        System.out.println("Normal Block---"+i);
    }
    // Static Block
    static {
        i++;
        System.out.println("Static Block.."+i);
    }
    // Static methods
    static void info(){
        System.out.println("Static method in abstract Class");
        System.out.println("Value of i..."+ (++i));
    }
    final class demo{
        void demomethod(){
            System.out.println("final class method : demo---");
        }
    }

//    public static void main(String[] args) {
//        Abstract_With_Static.info();
//    }
}




