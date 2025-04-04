package Package_Assigments;

public class Test3 {
    public static void main(String[] args) {
        int number = 123456;
        int result = 0;

        while (number!=0 ){
           result = result +1;
            System.out.println(result + " Now this is the Count");
           number = number/10;
            System.out.println(number+" Now this is the Number");
        }
        System.out.println(result);
    }
}
