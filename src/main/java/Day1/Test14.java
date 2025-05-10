package Day1;
// Agenda to Implement Pass by Value
public class Test14 {
int age =10;
public void m1(int age){
    System.out.println(age);
}

    public static void main(String[] args) {
        Test14 test14 = new Test14();
        int x =5;
        test14.m1(x);
    }

}





