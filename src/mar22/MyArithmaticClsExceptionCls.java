package mar22;

public class MyArithmaticClsExceptionCls {
// Runtime Exception
   void MathOpration(){
       try{
           int i = 10;
           int j = 0;
           int result = i/j;
           System.out.println(result);
       }catch(ArithmeticException e){
           System.out.println(e);
       }
//       catch (Exception e){
//           //Exception is parent cls exception. we cant used it as first catch exception. its should be in last.
//           System.out.println(e);
//       }
       finally {
           System.out.println("All the time finally block execute... even if exception occur.. it does not matter we write catch block or not...");
       }
   }
}
