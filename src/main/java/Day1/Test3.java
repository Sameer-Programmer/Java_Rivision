package Day1;

public class Test3 {
    public static void main(String[] args) {
        String s = "Sameer";
        String reverse = "";
        char [] ch = s.toCharArray();


        for(char x :ch){
            reverse =  x+reverse ;

        }
        System.out.println(reverse);


    }
}
