package Vedio3.Inheritance.SingleInheritance;
class Animal{
    Animal(){
        System.out.println("Animal Class");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog class");
    }
}
public class S_1First {
    static void main() {
        Dog d=new Dog();
    }
}
