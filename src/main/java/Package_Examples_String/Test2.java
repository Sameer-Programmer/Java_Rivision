package Package_Examples_String;

public class Test2 {
    public static void main(String[] args) {
        // Goal to remove white spaces, reverse , find the duplicates , Palindrome
        String s = "M AD  A M";
        String s2 = s.replaceAll("\\s","");
        System.out.println(s2);
        String reverse = "";
        int count =0;
        int duplicatcount =0;
         char ch [] = s2.toCharArray();
         for(char x :ch ){
             reverse = x +reverse;
             count ++;

         }
        System.out.println(reverse);
        System.out.println(count);

      for(int i =0 ; i<s2.length(); i++){
          for(int j = i+1; j<s2.length(); j++){
              if(ch[i]==ch[j]){
                  System.out.println(ch[i] +" got duplicated");
                  duplicatcount ++;
              }
          }
      }
        System.out.println(duplicatcount+"      duplicatcount");

      if(reverse.equals(s2)) {
          System.out.println("Given String is Palindrome");
      }else{
          System.out.println("Given String is NOT  Palindrome");
      }




    }
}
