package Package_Examples_String;

public class Test1 {
    public static void main(String[] args) {
        // Goal to reverse the string
        String s = "Automation";
        String reverse = "";
       char ch [] = s.toCharArray();
       for(char x : ch){
           reverse = x +reverse;
       }
        System.out.println(s);
        System.out.println(reverse);
    }
}
