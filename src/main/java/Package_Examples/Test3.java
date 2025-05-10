package Package_Examples;

public class Test3 {
    public static void main(String[] args) {
        int a = 23;
        if(a==1 || a== 0 ){
            System.out.println(" Not prime number");
        }
        int count= 0;

        if(a>1) {

            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    count = count + 1;
                }
            }
        }

        if(a>1){
            if(count == 2){
                System.out.println("prime");
            }else {
                System.out.println("not prime");
            }
        }


    }
}
