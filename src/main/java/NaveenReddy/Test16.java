package NaveenReddy;

public class Test16 {

   static int age ;
    String name ;

    static {
        System.out.println(age);
        System.out.println("static block");
    }
    void m1(){
        System.out.println(age+" : "+name);
    }



    public static void main(String[] args) {
        Test16 test16 = new Test16();
        test16.age = 18;
        test16.name = "Sameer";
        test16.m1();

    }
}
