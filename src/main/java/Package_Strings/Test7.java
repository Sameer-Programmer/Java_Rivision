package Package_Strings;

public class Test7 {
    public static void main(String[] args) {
        String amount = "$50,20,30";
        String amount1 = amount.replace("$","");
        System.out.println(amount1);
        String amount2 = amount1.replace(",","");
        System.out.println(amount2);
    }
}
