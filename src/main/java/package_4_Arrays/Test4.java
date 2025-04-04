package package_4_Arrays;

public class Test4 {
    public static void main(String[] args) {
        int a[][] = new int[4][5];
        int b[][] = {
                {10,20},//0
                {30,40},//1
                {50,60},
                {70,80}//2
        };
        System.out.println(b.length +"     Rows"); // rows 3
        System.out.println(b[0].length+ "    Coloumns"); //2 coloumns


        for(int arr[] :b){
            for( int x :arr){
                System.out.print(x+ "  ");
            }
            System.out.println();


        }

    }
}
