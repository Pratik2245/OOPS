package staticExample;
//this is a demo to show the initialisation of static variables using static block
public class staticBlock {
    static int a;
    static int b;
    static void main() {
        System.out.println("Hello world");
        System.out.println(a);
        System.out.println(b);
    }
    static {
        System.out.println("Hi i am static block");
        a=100;
        b=100;
    }
}
