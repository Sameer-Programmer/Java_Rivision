package Package_1;

public class Test13 {
    public static void main(String[] args) {
        // Goal to reverse a string through index

        String s = "PEERA";
        String reverse = "";
       char ch [] =s.toCharArray();

       for(int i = s.length()-1; i >= 0; i--){
           reverse = reverse +ch[i];
       }
        System.out.println(reverse);
    }
}
