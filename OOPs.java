
class Pen{
    String color;
    String type; // ball points, gel


public void write(){
    System.out.println("Writing " + "color "+ color);
}

public void printColor(){
    System.out.println(this.color);

}





}


class Student{
    String name;
    int age;
    Student(Student s2){


        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){

    }

public void printinfo(){
 System.out.println(this.name);
 System.out.println(this.age);
}

}
public class OOPs{
public static void main(String[] args) {

Student s1 = new Student();

s1.name="Bassam";
s1.age=21;


Student s2 = new Student(s1);
s2.printinfo();

}
}