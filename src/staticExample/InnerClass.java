package staticExample;

public class InnerClass {
    static class Test {
        Test(String name) {
            System.out.println(name);
        }
      }
        static void main() {
            Test t = new Test("Pratik");
        }
}
//outer class cannot be static
//💡 Why Outer Class Cannot Be static in Java?
//
//In Java, static means:
//
//        “Belongs to the class, not to an object.”
//
//But here’s the twist:
//
//An outer (top-level) class already belongs to itself.
//
//There is nothing above it.
// class New {
//     static class Test {
//      Test(String name){
//          System.out.println(name);
//      }
//    }
//}
