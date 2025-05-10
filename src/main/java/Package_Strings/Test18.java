package Package_Strings;

public class Test18 {
    public static void main(String[] args) {
        // Goal to print the repeted values

        String s = "SAMEERELECTRICALS";
       char [] ch =  s.toCharArray();
       int count =0;
       int length = s.length();
       for(int i = 0 ; i<length; i++){
           for(int j = i+1; j<length-1; j++){
               if(ch[i]==ch[j]){
                   System.out.println(ch[i] +"  duplicated"+count);
               }
           }
       }

    }
}
