package Wrapper_class_Learn;

public class Test1 {
    public static void main(String[] args) {

        double d1 = 10;
        Double doubleref = d1; // Autoboxing


        Integer integer = 8;
        int x = integer; // unboxing



        String s = "100";
        Integer integer1 = Integer.valueOf(s);
        System.out.println(integer1);


        int container = 33;

        String Sw = String.valueOf(container);
        System.out.println(Sw+44);


        String gy = "45";
        Integer iy = Integer.valueOf(gy);
        System.out.println(iy+10);

        String ss = "77";

        int num2 = Integer.parseInt(ss);
        System.out.println(num2+1);



        /*
        String str = "50";
        int num = Integer.parseInt(str); // String → int
        System.out.println(num + 10);    // Output: 60
         */







    }
}
