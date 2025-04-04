package Package_Assigments;

public class Test9 {
    public static void main(String[] args) {
        int a[] = {1,1,2,3,4,5,6,7,8,9,0};
        int search = 1;
        boolean status = false;
        int count = 0;

        for(int x:a){
            if(x==search){
                System.out.println(search +"  the Element u are searching is  found");
                status = true;
                count  = count+1;
            }
        }
        System.out.println(count+ " times  Repeated or found "+ " the number is  "+search);

        if(status == false){
            System.out.println("Not found");
        }





    }
}
