package Package_Strings;

public class Test1 {
    public static void main(String[] args) {
        String s = "sameer bhai";
        String p = "peera";
        String a = "   APPLE    ";
        String b1 = "Banglore";
        String b2 = "Banglore";
        String b3 = "banglore";


        System.out.println(s.contains("ameefr")); // string should be sequence
        System.out.println(s.contains("s"));
        System.out.println(s.contains("S"));
        System.out.println(s.contains(p));

        System.out.println(a.trim());
        System.out.println(s.trim());


        System.out.println(s.length());
        System.out.println(s.length());
        System.out.println(p.length());


        System.out.println(s.concat(p));


        System.out.println(s.charAt(0));

        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));
        System.out.println(b1.equalsIgnoreCase(b3));

        System.out.println(s.replace('s','Z'));
        System.out.println(s.replace("sam","xyz"));

        // upper case and Lowercase
        System.out.println(s.toUpperCase());
        System.out.println(p.toLowerCase());

        String email = "Sameer@gmail.com";
        /*
        to Extract the Sameer by substring method

         */
        String e = email.substring(0,6);
        System.out.println(e);

        /* split() -> solit method
        to Extract or split  the string  by deliminator
        Example : abc123@gmail.com
        Here is the deeliminator is @,.

         */





    }
}
