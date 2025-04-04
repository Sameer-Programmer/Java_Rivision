package Package_1;

public class Test5_Increment_Operator {
    public static void main(String[] args) {
        // Increment
        int value1;
        value1 =10;
        value1++; // value = value+1
        System.out.println(value1); // 10+1 = 11

        // Postincrement
        int result = value1++; // here 11 is directly assigned to result
        // so when we print result it will print 11
        System.out.println(result); // 11
        System.out.println(value1); // Post incrementation happened here

        // Preincrement
        int x = 20;
        int result1 = ++x;
        System.out.println(x);
        System.out.println(result1);

    }
}
