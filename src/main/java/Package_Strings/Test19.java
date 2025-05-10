package Package_Strings;

public class Test19 {
    public static void main(String[] args) {

        // Goal to print the duplicates in the string
        String GivenString = "Automation Testing";
        char ch [] = GivenString.toCharArray();
        int count =0;
        for(int i = 0 ; i<GivenString.length(); i++){
            for(int j = i+1;j<GivenString.length();j++){
                if(ch[i] == ch[j]){
                    System.out.print(ch[i]);
                    count = count+1;
                }
            }
        }
        System.out.println("\n"+count);
    }
}
