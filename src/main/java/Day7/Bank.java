package Day7;

import Day6.B;

public class Bank {
    public void m1(){
        System.out.println("Bank");
    }
}
class SBI extends Bank  {
    public void m1(){
        System.out.println("balance of SBI Bank");
    }
}
class icici extends Bank  {
    public void m1(){
        System.out.println("balance of icici Bank");
    }
}

class Money {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.m1();

        b = new SBI();
        b.m1();

        b = new icici();
        b.m1();



    }
}

