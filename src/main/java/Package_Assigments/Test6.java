package Package_Assigments;

public class Test6 {
    public static void main(String[] args) {
        int number = 2025;
        int count = 0;
        int sum =0;

        System.out.println(number% 10);
        while (number!=0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);

    }
}
