package Vedio3.Polymorphism.Runtime;
class Anna {
    static void show() {
        System.out.println("Anna");
    }

}

class Hello extends Anna{
  static void show(){
      System.out.println("Hello");
  }
}
public class finalClass {
    static void main() {
        Anna a=new Hello();
        a.show();
    }
}
