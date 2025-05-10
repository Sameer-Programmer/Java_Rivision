package NaveenReddy;
class Laptop {
    int price;
    String model;

    public String toString(){;
        return model +" :  "+price;
    }
}




public class Test18 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.price = 8000;
        laptop1.model = "Lenova";


        System.out.println(laptop1);
        System.out.println(laptop1.toString());


    }
}
