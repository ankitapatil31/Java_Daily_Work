package mar22;

import java.util.Locale;

public class MyNullPointerExceptionCls {
    void NullPointerException(){
      //  finally{} not allowed
        try{
            String str = "Ankita";
            str = null;
            String s1 = str.toLowerCase();
            System.out.println(s1);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Block Execute all time");
        }

    }
}
