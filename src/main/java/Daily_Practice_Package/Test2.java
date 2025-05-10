package Daily_Practice_Package;
// To Print the Fibnnaci series
// 0,1,1,2,3,5----
public class Test2 {
    public static void main(String[] args) {
        int container1 = 0;
        int container2 = 1;
        int sum = 0;



        System.out.print(container1+" "+container2);
        for(int i =2; i<10; i++){
           sum = container1+container2;
            System.out.print(" " +sum);
            container1 = container2;
            container2 = sum;

        }

    }
}
