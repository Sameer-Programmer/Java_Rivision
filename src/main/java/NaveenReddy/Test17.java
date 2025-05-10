package NaveenReddy;

public class Test17 {
    private int balance ;
    private String Name;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}


class Demo {
    public static void main(String[] args) {
        Test17 test17 = new Test17();
        test17.setBalance(4000);
        test17.setName("Sameer");
        System.out.println(test17.getBalance()+"   :"+test17.getName());
    }



}
