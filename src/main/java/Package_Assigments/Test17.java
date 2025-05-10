package Package_Assigments;

public class Test17 {
    public static void main(String[] args) {
        /* To Print the Fibonacci Series
        Example :0, 1,1,2,3,5,8,13.............
        0 ,1 = 1  //
        1,1 = 2
         */
        int n1 =0 ;
        int n2 =1;
        int sum =0 ;
        for(int i =2; i<10; i++ ){
           sum  = n1+n2;
            System.out.print(" "+sum);
            n1 = n2;
            n2 = sum;
        }


    }
}
