package Day1;

public class Test11 {
    public static void main(String[] args) {
        int num [][]={ {2,3,4},
                {5,6,7}
        } ;


        for(int [] tray : num){
            for (int x :tray){
                System.out.println(x+" ");
            }
            System.out.println();
        }
    }
}
