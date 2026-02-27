package Vedio3.Inheritance.MultiLevel;

class A1 {
    int x = 10;
}

class B1 extends A1 {
    int x = 20;
}

class C1 extends B1 {
    int x = 30;
}
public class ML_2VariableTrap {
    static void main() {
        A1 obj=new B1();
        System.out.println(obj.x);
    }
}
