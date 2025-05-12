package Annonimus;
// Anonymus Objects in Java
class A {
    A(){
        System.out.println(" Method m1 -class A");
    }

    public void m1(){
        System.out.println(" void m1");
    }
}




public class Test1 {
    public static void main(String[] args) {
        new A().m1();
    }
}
