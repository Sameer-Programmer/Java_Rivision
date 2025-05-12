package Pass_Value_Reference;
// Pass by Reference

public class Animal {

    static int catage = 5;
    int runspeed = 30;

    public static void m1(Animal ref){
        System.out.println(catage); // Directly calling the static variable
    }

    public static void m2(Animal ref){
        System.out.println(ref.runspeed); // calling instance variable with Obj
    }


    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal.m1(animal); // Pass by reference
        Animal.m2(animal);  // Pass by reference


// General Calling way
        System.out.println(catage);
        System.out.println(animal.runspeed);
    }

}
