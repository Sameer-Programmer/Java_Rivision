package Package_Strings;

public class Test9 {
    public static void main(String[] args) {
        String s1 = "Sameer";
        String s2 = "Sameer";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String t1 = "Tea";  // One Object
        String t2 = new String("Tea"); // 2nd Object
        System.out.println(t1==t2);   // false  == Compares Two Objects
        System.out.println(s1.equals(s2)); // true --- .equals Compares values of Object


        StringBuffer buffer1= new StringBuffer("Coffee");
        StringBuffer buffer2 = new StringBuffer("Coffee");
        System.out.println(buffer1==buffer2);   // false
        System.out.println(buffer2.equals(buffer2)); // true

        StringBuilder b1 = new StringBuilder("Milk");
        StringBuilder b2 = new StringBuilder("Milk");
        System.out.println(b1==b2);   // false
        System.out.println(b2.equals(b2)); // true


    }
}
