package Interfaces;

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}
class Hello implements B,A{

    @Override
    public void show() {
        B.super.show();
    }
}
public class I_Implementation {
}
