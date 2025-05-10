package Day8_Pass_Value_Reference;
// pass by Value
public class Furniture {

    int length = 10;

    public void m1(int length){
        System.out.println(length);
    }

    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        int x = 20;
        furniture.m1(x);
      //  furniture.m1(furniture.length);


    }
}
