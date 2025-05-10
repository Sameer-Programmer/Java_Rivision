package NaveenReddy;

public class Test7 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        int w = 40;


        boolean b1 =  x>y && x>z  &&  x<w; // F AND F AND T
        System.out.println(b1);

        boolean b2 =  x>y || x>z  ||  x>w; // F OR F OR F
        System.out.println(b2);


        boolean b3 =  x<y || x<z  ||  x<w; // T OR T OR T
        System.out.println(b3);

        boolean b4 =  x<y && x<z  &&  x<w; // T OR T OR T
        System.out.println(b4);

        boolean b5 = x<y;
        System.out.println(!b5);

    }
}
