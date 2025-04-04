package Package_Assigments;

public class Test14 {
    public static void main(String[] args) {

        // agenda to print the Missing number in a array

        int a [] = {1,2,4,5,6};
        int sum =0 ;
        int max = 0;
        int actualsum;
        int missing;
        int count=0;


        for(int x : a){
            sum = sum +x;
            if(x>max){
                max = x;
            }
            if(x>0){
                count = count+1;
            }
        }
        System.out.println(count+"     count");

        System.out.println(sum+ "     sum of numbers in the array ");
        System.out.println(max+"      Maximum number the array ");
        actualsum = (max*(max+1))/2;
        System.out.println(actualsum+"      ActualMax number the array ");
        missing = actualsum -sum;
        System.out.println(missing+"     Missing number the array ");












    }
}
