package Vedio3.Inheritance.multipleInheritance;
interface Header{
    default void show(){
        System.out.println("Hello Header");
    }

}
interface Footer{
    default void show(){
        System.out.println("Hello Footer");
    }
}
class Middle implements Header,Footer{
   public void show(){
       Header.super.show();
   }
}
public class MU_2DefaultTrap {
    static void main() {
        Middle m=new Middle();
        m.show();
    }
}
