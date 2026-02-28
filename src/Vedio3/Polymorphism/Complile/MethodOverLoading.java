package Vedio3.Polymorphism.Complile;

public class MethodOverLoading {
    int add(int a, String b) {
        System.out.println(a + b);
        return 1;
    }

    double add(String a, double b) {
        System.out.println(a + b );
        return Double.parseDouble(a);
    }
    void show(int a) {
        System.out.println("int");
    }

    void show(char a) {
        System.out.println("char");
    }

    static void main() {
        MethodOverLoading m=new MethodOverLoading();
        m.add(12,"13.4");
        m.show('A');
    }
}
