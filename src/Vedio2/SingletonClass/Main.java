package Vedio2.SingletonClass;

public class Main {
    static void main() {
        Singleton s=Singleton.createInstance();
        System.out.println(s.rollNo);
        s.rollNo=25;
        Singleton s2=Singleton.createInstance();
        System.out.println(s2.rollNo);
    }
}
