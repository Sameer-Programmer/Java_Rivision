package Package_Assigments;

public class Test4 {
    public static void main(String[] args) {
        int x = 987654321;
        int result = 0;
        System.out.println(x%10);  // to get last number
        System.out.println(x/10);  // to remove last Number

        while (x>0){
            result = result *10 + (x%10);
            System.out.println(result);
            x = x/10;
            System.out.println(x);
        }
        System.out.println(result);
    }
}
