package Package_Assigments;

public class Test16 {
    public static void main(String[] args) {
        // agenda to  know the Given Number is prime is not
        int value = 7;
        int count = 0;
       // System.out.println(9%1);
      //  System.out.println(9/1);


        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                count = count + 1;
            }
        }
                if(count == 2 ){
                    System.out.println("The Given Number is a PrimeNumber   :" + value);
                }else {
                    System.out.println("The Given Number is a not PrimeNumber   :" + value);
                }
            }

        }
