package Daily_Practice_Package;

// Goal to print the Finnaci Series
public class Test1 {
    public static void main(String[] args) {

        int c1 = 0;
        int c2 = 1;
        int sum = 0;
        System.out.print(c1 + " "+c2);

        for (int i = 2; i <= 10; i++) {
            sum = c1+c2;
            System.out.print(" "+sum);
            c1 = c2; // now c1 = 
            c2 = sum;//
        }
    }
}
