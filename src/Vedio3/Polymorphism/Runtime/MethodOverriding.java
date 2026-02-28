package Vedio3.Polymorphism.Runtime;
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    static void main() {

//        down casting  the overall down is the down casting
        Animal a=new Dog();//upcasting
        Dog d=(Dog)a;
        d.bark();
    }
}
