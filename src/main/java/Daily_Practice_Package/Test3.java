package Daily_Practice_Package;
/*
To Reverse the string
 */
public class Test3 {
    public static void main(String[] args) {
        String s = "SAMEER";
        String reverse = " ";
        int length=s.length();
        System.out.println(length);
        //  5;  5>=0
        for(int i =length-1; i>= 0; i--){
            reverse = reverse +s.charAt(i);
        }
        System.out.println(reverse);
    }
}
