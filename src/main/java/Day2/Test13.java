package Day2;
/*
Sameer bhai
reemas  iahb
 */




public class Test13 {
    public static void main(String[] args) {
      String s = "Sameer Bhai";
      String reversedwords = "";
      String [] pieces = s.split(" ");
        System.out.println(pieces[0]);
        System.out.println(pieces[1]);

        // first Loop - for the String Array no reverse
        // Second for loop -- to reverse the each word

        for(int i =0 ; i<pieces.length; i++){
            String word = pieces[i];
            String reverseword = " ";
            for(int j = word.length()-1; j>=0; j--){
                reverseword = reverseword +word.charAt(j);
            }
            reversedwords = reversedwords +reverseword +" ";
        }

        System.out.println(reversedwords.trim());





    }
}
