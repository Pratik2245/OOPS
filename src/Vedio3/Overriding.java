package Vedio3;
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Overriding {
    static void main() {
        Animal d=new Dog();
        d.sound();
    }
}
