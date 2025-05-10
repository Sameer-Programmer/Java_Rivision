package Day4;

public class Test1 {
    static int bankId;                                    // variable  Stored in Method area
    String nameOfAccountHolder ;                            // variable Stored in Heap nameOfAccountHolder
    double balance;                                         // variable Stored in Heap balance

    public static void m1(){                                // m1()->call store in Method area
        System.out.println("Bank Details");                 // where it is Getting Stored
    }

    public void getInfo(int bankId, String nameOfAccountHolder,double balance){
        Test1.bankId= bankId;                                   // stack variable and value
        this.nameOfAccountHolder = nameOfAccountHolder;         //stack variable and value
        this.balance = balance;                                 // stack variable and value
        System.out.println(bankId +" : "+nameOfAccountHolder+" :"+balance);// where it is Getting Stored
        Test1.m1();// where it is Getting Stored
    }


    public static void main(String[] args) {
        Test1 test1 = new Test1();
        // Test 1 - Class Name -> Method Area
        // test 1===> stack
        // Test1 object -- Heap
        test1.getInfo(1,"Sameer bhai",45000.50);
        // get.info ()---> call stored in where

    }
}
/*
Stack


static Variable - bankId
test1 -> reference Variable

Heap
instance Variable balance
String Pool Area = nameOfAccountHolder
Object of Test1
 */