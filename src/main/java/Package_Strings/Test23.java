package Package_Strings;

public class Test23 {
    public static void main(String[] args) {
        String s1 = "sameer";
        String s2 = new String("sameer");
        String s3 = "sameer";

        boolean result1 = s1==s2; // Objects
        boolean result2 = s1.equals(s2); // values
        System.out.println(result1);
        System.out.println(result2);
    }
}
