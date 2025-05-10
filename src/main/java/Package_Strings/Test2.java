package Package_Strings;

public class Test2 {
    public static void main(String[] args) {
        String s1 = "Welcome";
        int length = s1.length();
        System.out.println(length);
        String reverse = "";
        // for(int i = length-1; i>length; i--)
//         int i = 6 ;        6>=0---> -1>=0 condition failed
        //                    -1<7 // always true -- continius run
        //                     6>7, // always false so loop breaks at stat only

        for(int i = length-1; i>=0; i--){
          reverse = reverse + s1.charAt(i) ;
            System.out.println(reverse+"  "+i);
        }
        System.out.println(reverse+"  final");
    }
}
