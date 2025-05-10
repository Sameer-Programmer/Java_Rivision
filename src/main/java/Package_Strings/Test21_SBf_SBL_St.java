package Package_Strings;

public class Test21_SBf_SBL_St {
    public static void main(String[] args) {
       String s = "Sameer";
         s.concat(" Naveen");
         System.out.println(s);   // Immutable

        StringBuffer stringBuffer = new StringBuffer("Welcome");
        stringBuffer.append(" to java Programming");
        System.out.println(stringBuffer);  // Mutable

        StringBuilder sb = new StringBuilder("Welcome");
        sb.append("to Banglore");
        System.out.println(sb); // Mutable





    }
}
