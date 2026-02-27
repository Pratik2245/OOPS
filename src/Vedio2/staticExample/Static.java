package Vedio2.staticExample;

public class Static {
    static void main() {
      fun();
    }
    public static void fun(){
//        cannot access the not static stuff in statis function
//        Greeting();
        System.out.println("Hello world");
//        Static s=new Static();
//        s.Greeting();
    }
    public void Greeting(){
        fun();
        System.out.println("Good morning");
    }
}
