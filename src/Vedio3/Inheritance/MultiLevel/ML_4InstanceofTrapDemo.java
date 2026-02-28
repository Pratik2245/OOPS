package Vedio3.Inheritance.MultiLevel;
class Animal1 {
}

class Mammal extends Animal1 {
}

class Dog1 extends Mammal {
}


public class ML_4InstanceofTrapDemo {
    static void main() {
        Dog1 d=new Dog1();
        System.out.println(d instanceof Animal1);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Dog1);
    }
}
