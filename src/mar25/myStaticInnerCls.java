package mar25;

public class myStaticInnerCls {
    public void show(){
        System.out.println("Show Methods");
    }
    static class myInner{
        public void show(){
            System.out.println("Inner Show Method");
        }
        public static void InnerShow(){
            System.out.println("Static Inner Show Methods");
        }
    }
}

