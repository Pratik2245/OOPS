package Vedio1;

import org.w3c.dom.ls.LSOutput;

public class V1_final {
    public static void main() {
        final int a=30;
        System.out.println(a);
        System.out.println(a);
        System.out.println("Hello world");
        final  Student student=new Student();
//        when a non primitive is final you cannot reassign it
//        student =new Student();
        System.out.println(student.rollno);

    }

}

class Student{
    int rollno=10;
    String name="pratik";

}