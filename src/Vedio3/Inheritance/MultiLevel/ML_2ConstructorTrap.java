package Vedio3.Inheritance.MultiLevel;

class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        System.out.println("B");
    }
}

class C extends B {
    C() {
        System.out.println("C");
    }
}


public class ML_2ConstructorTrap {
     static void main(String[] args) {
        C obj = new C();
    }
}
