package Vedio1;

public class V1_ConstructorOverloading {
    public static void main(String[] args) {
        student s=new student();
        student s2=s;
        s.roll=123;
        System.out.println(s2.roll);
    }

}
class student{
    int roll;
    float marks;
    student(){
        System.out.println("default");
        this(19,200);
    }
    student(int roll,float marks){
        System.out.println("parameterised");
    }
}
