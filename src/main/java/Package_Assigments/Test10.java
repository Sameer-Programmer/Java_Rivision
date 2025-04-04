package Package_Assigments;

public class Test10 {
    public static void main(String[] args) {
        int a[] = {1,1,2,3,4,5,6,7,8,9,0};
        int number = 1;
        boolean status = false;
        int count = 0;

        for (int x :a){
            if(number == x){
                count = count+1;
                System.out.println(" element found ");
                status = true;
            }
        }
        System.out.println(" count     "+count+" the duplicate number is   "+number);
        if(status == false){
            System.out.println(" Not Found");
        }
    }
}
