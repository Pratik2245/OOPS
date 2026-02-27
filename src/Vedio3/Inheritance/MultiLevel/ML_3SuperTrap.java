package Vedio3.Inheritance.MultiLevel;

class Parent {
    Parent(int num) {
        System.out.println("Parent constructor called");
    }
}

class Child extends Parent {
    Child() {
        super(24);//you need to insert the super or else it will give error
        System.out.println("Child constructor called");
    }
}
public class ML_3SuperTrap {
    static void main() {
     Child c=new Child();
    }
}
