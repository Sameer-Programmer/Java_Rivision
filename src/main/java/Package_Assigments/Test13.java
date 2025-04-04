package Package_Assigments;

public class Test13 {
    public static void main(String[] args) {
        int a[] = {1,3,4};
        int sum =0;
        int max = 0;
        int missing;
        int Actualsum;

        for(int x : a){
            sum = sum +x;
            if(x>max){ //1>0
                max = x;  //1  // we are storing in Max
            }
        }


        System.out.println(sum+"         sum");
        System.out.println(max+"      max");
        Actualsum = (max*(max+1))/2;
        System.out.println(Actualsum+"         Actualsum");
        missing = Actualsum -sum;
        System.out.println(missing+"         missing");


    }
}
//  for (int y : a){
//        if(y > max){  // 1>0 // 3>1 // 4>3
//max = y;
//            }
//                    }