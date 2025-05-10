package Package_Examples;

public class Test2 {
    public static void main(String[] args) {
         // to find given number is Prime or not

        int n = 6;
        for(int i =2; i<n; i++){
            if(n%i==0){
                System.out.println("not Prime Nmber");
                return;
            }
        }
        System.out.println("  prime number");


    }
}
