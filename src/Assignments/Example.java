package Assignments;

public class Example {
    int i = 0;

        public static void main(String[] args) {
           // demo2.info();
            double amt = 20f;
            float i = 20;
        }
    }

    interface demo {

    static void info(){
        System.out.println("static in parent class ");
    }
    }
    class demo2 implements demo{
     void display(){
         System.out.println("Display");
     }
//     static void info(){
//         System.out.println("Static in child class");
//     }
    }
