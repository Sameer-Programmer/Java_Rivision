package Day9;

public class A {

    protected int age ;
    protected void m1(){
        System.out.println("Protected Method called from package Day9         ");
    }
}

class B {
    public static void main(String[] args) {
        A a = new A();
        a.age = 10;
        a.m1();
    }
}
