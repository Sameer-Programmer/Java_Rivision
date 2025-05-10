package package_4_Arrays;

public class Test3 {
    public static void main(String[] args) {
        //int a[][] = new int[4][5];
        int b[][] = {
                {10,20},//0
                {30,40},//1
                {50,60} //2
        };
        System.out.println(b.length +"     Rows"); // rows 3
        System.out.println(b[0].length+ "    Coloumns"); //2 coloumns

        for (int i =0 ; i< b.length;i++){
                for (int j = 0 ; j< b[0].length;j++){
                    System.out.print(b[i][j]+"  ");
                }
            System.out.println( );
        }

    }
}
