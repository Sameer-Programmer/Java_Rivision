package Package_Assigments;

public class Test12 {
    public static void main(String[] args) {
        int a[] = {1,3,4};

        int sum =0;
        int count =0;
        int actualsum;
        int missing;
        for(int x :a){
            if(x>0){
                count = count+1;
            }
            sum = sum+x;
        }
        System.out.println(sum);
        System.out.println(count);

        actualsum = (count*count+1)/2;
        System.out.println(actualsum);
        missing = actualsum -sum;
        System.out.println(missing);

    }
}
