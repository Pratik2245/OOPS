package Vedio3;

public class Box {
    double height;
    double width;
    double breadth;

    Box(){
        super(); //object class
        this.height=-1;
        this.width=-1;
        this.breadth=-1;
    }

    Box(double height,double width,double breadth){
        System.out.println("Box class initialisation");

        this.height=height;
        this.width=width;
        this.breadth=breadth;
    }
    Box(Box b){
        System.out.println(b.breadth);
        System.out.println(b.height);
        System.out.println(b.width);
    }
}
