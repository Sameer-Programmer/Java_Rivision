package Day2;
/*
Sameer Electricals = input
reemas slacirtcele = Output
 */
public class Test12 {
    public static void main(String[] args) {
    String givenword = "Sameer Electricals";
    String reversewords = " ";
    String [] pieces = givenword.split(" ");
        System.out.println(pieces[0]);
        System.out.println(pieces[1]);
        // Sameer

        for(int i =0 ; i < pieces.length; i++){
            String word = pieces[i];
            String revword = "";
            for(int j = word.length()-1 ; j>=0; j--){
                revword = revword + word.charAt(j);
            }

            reversewords = reversewords + revword + " ";
        }

        System.out.println(reversewords);


    }
}
