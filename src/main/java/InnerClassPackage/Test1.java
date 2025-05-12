package InnerClassPackage;

class Hall {
    public void m1 (){
        System.out.println(" Hall");
    }

     class Bedroom{
        public void m2 (){
            System.out.println(" Room in Hall");
        }
    }

}




public class Test1 {
    public static void main(String[] args) {
        Hall hall = new Hall();
        hall.m1();
// Bedroom b1 = new Bedroom();

        Hall.Bedroom b1 = hall. new Bedroom();
        b1.m2();


    }
}
