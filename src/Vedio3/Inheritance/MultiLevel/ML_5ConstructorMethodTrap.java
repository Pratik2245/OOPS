package Vedio3.Inheritance.MultiLevel;
class Base{
    Base(){
        System.out.println("Base constructor starts");
        show();   // method call inside constructor
        System.out.println("Base constructor ends");
    }
    public void show(){
        System.out.println("Show Base");
    }
}
class Derived extends Base{
    Derived(){
        show();
    }
    public void show()
    {
        System.out.println("Show from Derived");
    }
}
public class ML_5ConstructorMethodTrap {
    static void main() {
//     Derived d=new Derived();//calls the derived class method in the base class constructor
        Base b=new Base();
    }
}
