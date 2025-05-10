package Day2;

public class Test16 {
    public static void main(String[] args) {
        String s = "Sameer Electricals";
        String sl = s.toLowerCase();
       String sr = sl.replace(" ","");
        System.out.println(sr);
        int vowelsCount = 0;
        int consonentsCount = 0;

        char [] ch = sl.toCharArray();

        for(char x : ch){
            if(x == 'a' || x == 'e' || x == 'i' || x== '0' || x == 'u'){
                vowelsCount = vowelsCount +1;
                System.out.print(x+"   ");
            } else {
                consonentsCount = consonentsCount +1;
            }
        }

        System.out.println(vowelsCount);
        System.out.println(consonentsCount);




    }
}
