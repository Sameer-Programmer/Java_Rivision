package Day1;

public class Test9 {
    public static void main(String[] args) {
      int num [][]={ {2,3,4},
              {5,6,7}
      } ;

      for(int x[] : num){
          for (int y : x){
              System.out.println(y +" ");
          }
          System.out.println();
      }



    }
}
