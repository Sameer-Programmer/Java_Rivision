package Day3;
// Sorting
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int [] a = {2,5,6,7,8,9,1,3,4,5,8,9,13};
        for(int i =0; i<a.length; i++){
            for(int j = i+1; j<a.length; j++){
               if(a[i]>a[j]){
                   int temp = a[i];  // doubt how we can store a Integer single dimensional stored in temp of only datatype of int
                   a[i] = a[j];
                   a[j] = temp;
               }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
