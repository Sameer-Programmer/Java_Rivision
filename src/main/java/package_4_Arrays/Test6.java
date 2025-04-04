package package_4_Arrays;

public class Test6 {
    public static void main(String[] args) {

        // Search Elements in a Array
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 4};
        int search = 4;
        boolean status = false;
        for(int i =0 ; i<a.length; i++){
            if(search == a[i]){
                System.out.println("found    "+search);
                status = true;
            }
        }

        if(status == false){
            System.out.println("Not found");
        }
    }

}


