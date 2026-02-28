package Vedio3.Inheritance.multipleInheritance;
interface A {
    void show();
    void display();
}

interface B {
    void display();
}

class C implements A, B {

    public void show() {
        System.out.println("Show from A");
    }

    public void display() {
        System.out.println("Display from B");
    }
}
public class MU_1Example
{
    static void main() {

        C c = new C();
        c.show();
        c.display();
    }
}
