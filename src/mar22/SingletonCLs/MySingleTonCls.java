package mar22.SingletonCLs;

/*
Remember the key points while defining a class as a singleton class that is while designing a singleton class:

Make a constructor private.
Write a static method that has the return type object of this singleton class. Here, the concept of Lazy initialization is used to write this static method.
 */
public class MySingleTonCls {
    public static MySingleTonCls single_instance = null;
    private MySingleTonCls(){
        System.out.println("Hello I am a string part of Singleton class");
    }

    public static MySingleTonCls GetInstance(){
        if (single_instance == null){
            single_instance = new MySingleTonCls();
        }
        return single_instance;
//        it Return Multiple Object
//        MySingleTonCls Obj = new MySingleTonCls();
//        return Obj;
    }
}
