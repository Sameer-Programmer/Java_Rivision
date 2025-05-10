package Package_Assigments;

public class Test18 {
    public static void main(String[] args) {
        // 0 1 1 2
        // 0 1  --> achieved
        // 1 (0+1) --> achived by sum
        // 2 ---->
        // 3
        int bucket1  = 0;
        int bucket2  = 1;
        int jar;

        System.out.print(bucket1+"   "+bucket2+"   ");

        for(int i = 2 ; i<10; i++){
            //1 =   0        + 1
            jar = bucket1 + bucket2; //1    // 1
            System.out.print(jar+"    ");
            //     = 1
            bucket1  = bucket2; // 1
            bucket2 = jar; //1
        }

    }
}
