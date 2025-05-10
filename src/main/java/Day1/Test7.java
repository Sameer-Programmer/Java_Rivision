package Day1;

public class Test7 {
    public static void main(String[] args) {
       int n1[][] = new int[5][6];



        for (int i =0 ; i<5;i++){
            for(int j =0 ; j<6; j++){
                 n1 [i][j] = (int)(Math.random()*100);
                System.out.print(n1[i][j]+" ");
            }
            System.out.println();
        }

//       for (int i =0 ; i<4;i++){
//           for(int j =0 ; j<5; j++){
//               System.out.print(n1[i][j]+" ");
//           }
//           System.out.println();
//       }



    }
}
