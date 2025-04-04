package Package_Assigments;

public class Test2 {
    public static void main(String[] args) {
        int x = 121;
        int Original = x;
        int result = 0 ;
        int container = x%10; // to get the Last number //5
        int container2 = x/10; // to remove the Lastnumber //1234
        System.out.println(container);
        System.out.println(container2);
        while (x>0){
            result =result *10 + x%10;
            x = x/10;
        }
        System.out.println(result);
        if (result == Original){
            System.out.println( "Number is Palindrome number");
        }

    }
}
