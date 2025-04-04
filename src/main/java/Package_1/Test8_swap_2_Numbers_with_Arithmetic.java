package Package_1;

public class Test8_swap_2_Numbers_with_Arithmetic {
    public static void main(String[] args) {
        // swap of 2 numbers by arithmatic
        int a = 20;
        int b = 30;
        a = a+b; // a= 50
        b = a-b; // 50- 30 ---> 20
        a = a-b  ; // 50 - 20 --> 30

        System.out.println(b+ "    value of b is 20");
        System.out.println(a+ "    value of a is 30");
    }
}
