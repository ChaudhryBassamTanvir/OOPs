interface Animal{
//Properties can be Public Static or final 
int eyes=2; // this is final

    public void walk();
    //interface has no constructor
    //no implementation of Methods
}

interface Herbivore{

}

class Horse implements Animal, Herbivore{
  public  void walk(){
        System.out.println("Walks on 4 legs ");
    }
}
class Pupil{
    String name;
    static String school;
}

public class InterfaceConcept {
    public static void main(String[] args) {
        Horse horse = new Horse();
horse.walk();

Pupil.school="Al-Bassam";
Pupil s1= new Pupil();
s1.name="Bassam";
System.out.println(s1.school);



    }
}
//static mean objects has same school name mean one time it can be change and access through class name 
