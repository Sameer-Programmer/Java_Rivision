package Day1;

public class Test2 {
    public static void main(String[] args) {
        String s = "Sameer";

        String reverse = "";

        char [] ch = s.toCharArray();

        for(int i = s.length()-1; i >= 0;    i-- ){
            reverse = reverse +s.charAt(i);
        }

        System.out.println(reverse);

    }
}
