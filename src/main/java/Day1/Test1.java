package Day1;

public class Test1 {

    String mobile;
    static String manufacture;
    double  price;
    static  int ram;

    public void m1() {
        System.out.println(mobile + "  " + manufacture + " " + price);
    }

    public static void m2(int ram , String manufacture){
        System.out.println(ram + "  " + manufacture );
    }

    public static void main(String[] args) {

        Test1.m2(4, "Ikea");


       Test1 test1 = new Test1();
       test1.mobile = "Sony";
       test1.manufacture = "China";
       test1.price = 31500;
       test1.m1();
       test1.m2(4,"Sameer");

        Test1 test2 = new Test1();
        test2.mobile = "Nokia";
        test2.manufacture = "China";
        test2.price = 15000;
        test2.m1();


        manufacture = "USA";
        test1.m1();
        test2.m1();





    }
}
