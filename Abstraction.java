abstract class Animal{
        Animal(){
        System.out.println("You created an animal");
    }
   abstract public void walk();
   public void eat(){
    System.out.println("Animal eats");

   }
//no need to show this to user
    
}
class Horse extends Animal{
Horse(){
    System.out.println("You created a Horse");
}

    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on two legs");
    }
}
public class Abstraction {
    //Mean important things to show user and unncessary one hide
public static void main(String[] args) {
    Horse horse = new Horse();
    horse.walk();
    horse.eat();
}


}
