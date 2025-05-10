package Package_Assigments;

public class Test19 {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        System.out.print(num1 +"  "+num2);

        for(int i = 2; i<10; i++){
            sum = num1+num2;
            System.out.print("  "+sum); // sum =1
            num1 = num2; //1
            num2 = sum; //1

        }

    }
}
