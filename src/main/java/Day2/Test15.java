package Day2;
/*
input String = "Sameer Learn Java";
Output String = "reemas nrael lvaj";
 */
public class Test15 {
    public static void main(String[] args) {

        String words = "Sameer Learn Java";
        String rwords = " ";
        String [] pieces = words.split(" ");
        int numberOfwords = pieces.length;
        System.out.println(numberOfwords);

        for(int i =0; i<pieces.length; i++){
            String word = pieces[i];
            String rword = " ";
            for(int j = word.length()-1; j>=0;j--){
                rword = rword +word.charAt(j);
            }
            rwords = rwords +rword+ " ";
        }

        System.out.println(rwords);











    }
}
