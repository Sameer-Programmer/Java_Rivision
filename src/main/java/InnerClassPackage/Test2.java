package InnerClassPackage;
// Agenda to implement abstract menthods in main class
abstract class Drink {
    abstract  public void m1 ();
    abstract  public void m2 ();
}




public class Test2 {
    public static void main(String[] args) {
        Drink d = new Drink() {
            @Override
            public void m1() {
                System.out.println(" sameer");
            }

            public void m2() {
                System.out.println(" sameer_imran");
            }
        };

        d.m1();
        d.m2();
    }
}
