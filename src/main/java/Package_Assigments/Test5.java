package Package_Assigments;

public class Test5 {
    public static void main(String[] args) {
        int number = 2025;
        int original = number;
        int OD = number;
        int count = 0;
        int sum =0;
        int digit =0;

//        while (number>0){
//            count = count +1;
//            number = number/10;
//        }
//        System.out.println(count+" count of digits");

        while(original>0){ //
            sum = sum +original % 10;
            count = count +1;
            original = original/10;
        }
        System.out.println(sum+" sum of digits");
        System.out.println(count+" count of digits");


        while (OD >0){
            digit = OD % 10; // 2025 ---> 5
            if(digit % 2 ==0){
                System.out.println(digit+"    even number");
            }else {
                System.out.println(digit+"  odd number");
            }
            OD = OD/10;
        }

    }
}
