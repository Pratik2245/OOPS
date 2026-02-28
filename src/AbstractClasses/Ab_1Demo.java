package AbstractClasses;

abstract class Animal {

    abstract void sound(); // must be implemented
    Animal(){
        System.out.println("Animal Initalised");
    }
    void sleep() {
        System.out.println("Animal sleeps");
    }
}
class Dog extends Animal {


    void sound() {
        System.out.println("Dog barks");
    }
}
public class Ab_1Demo {
    static void main() {
//        Dog d=new Dog();
//        d.sound();
        Animal a=new Dog();
        a.sleep();
    }
}
