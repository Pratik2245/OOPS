package Vedio3;

public class BoxWeight extends Box{

    BoxWeight(BoxWeight other){
        super(other);
    }
    BoxWeight(double weight){
        this.weight=weight;
        System.out.println(this.weight);
    }
    double weight;
    BoxWeight(double width,double height,double breadth,double weight){
        super(width,height,breadth);

        System.out.println(super.breadth);//why are we accessing the upper class data using super beacuse if both the classes have same then if we refer through the this then it will refer to the current class variables
        this.weight=weight;
    }
}
