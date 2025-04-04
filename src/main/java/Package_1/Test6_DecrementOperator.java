package Package_1;

public class Test6_DecrementOperator {
    public static void main(String[] args) {
        System.out.println("Postdecrement");
        int x =20;
        x--;
        System.out.println(x);
        int result = x--; // post decrement
        System.out.println(result);
        System.out.println(x); //

        System.out.println("Predecrement");
        int y =30;
        y--;
        System.out.println(y);
        int result1 = --y; // post decrement
        System.out.println(result1);
        System.out.println(y); //

    }
}
