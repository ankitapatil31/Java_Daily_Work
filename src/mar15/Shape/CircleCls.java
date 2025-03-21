package mar15.Shape;

public class CircleCls  extends ShapeCLs{
     int redius = 5;

     CircleCls(){
         System.out.println("CircleCls constructor call");
     }
     @Override
     public double area(){
         return (Math.PI * redius * redius);
     }
}
