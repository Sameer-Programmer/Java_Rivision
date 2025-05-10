package Day3;

public class Test2 {
    public static void main(String[] args) {
        int a[][] = {{4,5,6},{5,6,7}};

        System.out.println(a.length);
        System.out.println(a[0].length);

        for(int i =0 ; i<a.length; i++){
            for(int j =0; j<a[0].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
