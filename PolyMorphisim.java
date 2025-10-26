 class Student{
    String name;
    int age;
//polymorphism

public void printInfo(String name){
     System.out.println(name);
}
public void printInfo(int age){
     System.out.println(age);
}
public void printInfo(String name, int age) {
    System.out.println(name + " " + age);
}


}


public class PolyMorphisim {
    //Poly means many morphism means form
    //two types
    //Function overloading and Function overriding
    //overloading is compile time and Overriding is run time 
    public static void main(String[] args) {
Student s1 = new Student();

s1.name="Bassam";
s1.age=21;
//function overloading
//parameters or return type  must be different

s1.printInfo(s1.name,s1.age);


    }
}
