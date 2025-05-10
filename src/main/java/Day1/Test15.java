package Day1;

public class Test15 {

    int age =10 ;
    public void m1(Test15 ref){
        System.out.println(age);
    }

    public static void main(String[] args) {
        Test15 test15 = new Test15();
        System.out.println(test15.age);
        test15.m1(test15);
    }
}
