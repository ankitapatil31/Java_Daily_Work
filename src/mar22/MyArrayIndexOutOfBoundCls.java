package mar22;

public class MyArrayIndexOutOfBoundCls {
    void ArrayIndexOut(){
        try{
            int[] ary = {1,2,3,4};
            for(int i = 0; i < 7; i++){
                System.out.println(ary[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Array Index Out of bound finally block");
        }

    }
}
