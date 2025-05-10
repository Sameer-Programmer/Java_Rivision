package Daily_Practice_Package;

/*
To Print the Given Number is Prime or Not
 */

public class Test4 {
    public static void main(String[] args) {
        int num = 22;
        int count = 0;

        System.out.println(22 % 1); //0
        System.out.println(22 % 22); //0


        for(int i = 1 ; i<=num; i++) {
            if(num % i == 0){
                count = count +1;
            }
        }


        if(count ==2) {
            System.out.println(" Prime");
        }
        else {
            System.out.println(" NOTPrime");
            }

    }
}
