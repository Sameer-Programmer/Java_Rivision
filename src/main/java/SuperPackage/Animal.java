package SuperPackage;

class Animal {
    Animal(){
        System.out.println("Parentclass Default " +
                "Constructer");
    }

    Animal(int n){
        System.out.println("Parentclass Parameterized" +
                "  Constructer");
    }
}
class Dog extends Animal {

    Dog(){
        System.out.println("Childclass Default " +
                "Constructer");
    }

    Dog(int legs){
        super(legs);
        System.out.println("Childclass Parameterized " +
                " Constructer");
    }
}