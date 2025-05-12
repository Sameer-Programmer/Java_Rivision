package InnerClassPackage;

class A {
    public void m1 (){
        System.out.println(" Hall");
    }
}






public class Annonymus_Innerclass {
    public static void main(String[] args) {
        A a = new A()
        {
            public void m1 (){
                System.out.println(" Hall of Annonymus inner class");
            }
        };
        a.m1();


    }
}
