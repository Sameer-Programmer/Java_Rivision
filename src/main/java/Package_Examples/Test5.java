package Package_Examples;

public class Test5 {
    public static void main(String[] args) {

        String s = "Sameer";
       String reverse = "";
       char values [] = s.toCharArray();

        for(char x : values) {
            reverse = x +reverse;
        }
        System.out.println(reverse);

       //reverse = reverse +x;
      //  System.out.println(""+'s');
       // System.out.println(""+'s'+'a');


//        //reverse = x+ reverse;
//        System.out.println('s'+"");
//       System.out.println('a'+"s");
    }
}
