package Day12;

public class Animal {
    String colour = "White" ;
void eat (){
    System.out.println("Eating .......");
}

Animal(){
    System.out.println("Parent Class" +
            " Constructer");
}


}

class Dog extends Animal{
    String colour = "Black" ;

    void m1(){
        System.out.println(colour);
        System.out.println(super.colour);
        super.eat();
    }

    Dog(){
        System.out.println("Dog _subclass " +
                "Constructer");

    }

}
