package PolyMorphism;

class A {
    public void m1 (){
        System.out.println("Sameer");
    }
}

class B extends A {
    public void m1 (){
        System.out.println("Imran");
    }
}




public class Test1 {
    public static void main(String[] args) {
//        A a = new A();
//        a.m1();

        B b = new B();
        b.m1();




    }
}
