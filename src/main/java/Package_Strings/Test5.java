package Package_Strings;

public class Test5 {
    public static void main(String[] args) {
        int n = 12345;
        int r = 0;

        while (n!=0){
            int lastn = n%10;  // Get the LastNumber 5
            r =r*10 +lastn;
            System.out.println(r+ "             ");
            n = n/10; // remove the LastNumber now remove 5
        }
        System.out.println(r);
    }
}
