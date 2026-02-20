package SingletonClass;

public class Singleton {
     int rollNo=23;
    private static Singleton instance;
    private Singleton(){

    }
    public static Singleton createInstance(){
        if(instance==null){
            instance= new Singleton();
        }
        return instance;
    }
}
