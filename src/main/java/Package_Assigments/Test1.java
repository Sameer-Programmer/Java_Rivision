package Package_Assigments;

public class Test1 {
    public static void main(String[] args) {
        // Agenda to print the reverse of number
        int x = 1234;
        int reverse = 0;

        while(x!=0){
           // to get  the lastnumber %
           // to remove the last number /
            reverse = reverse * 10 + (x % 10) ; // 1234---> 4
             x = x/10 ; //1234
        }
        System.out.println(reverse);
        System.out.println(6/10);
    }
}
/*
Loop 1
// 4
// 123

Loop 2
40+123%10== 43 == reverse
123/10 == 12

Loop 3
430+2 = 432
12/10 = 1

Loop 4
4320+1
 */
