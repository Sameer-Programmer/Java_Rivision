package DayLearn;



class Animal {
  String name;
  public void sound(){
    System.out.println("Animal Makes Sound");
  }
}
class Cat extends  Animal {
  public void bark(){
    System.out.println("Wooh Wooh");
  }
}

public class Main {
    public static void main(String[] args) {
    
    Animal animal = new Cat();
    animal.name = "Wild";
    System.out.println(animal.name);
    animal.sound();
    
    Cat cat = (Cat) animal;
    cat.bark();
    System.out.println(cat.name);

    
      
  }
}
