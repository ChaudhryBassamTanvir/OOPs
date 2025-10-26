
import java.util.*;

import bank.*;


class Shape{
public void area(){
    System.out.println("Display area");
}


}
class Triangle extends Shape{
 public void area(int l, int h){
    System.out.println(1/2*l*h);
 }
}

class EquileteralTraingle extends Triangle{
    public void area(int l, int h){
    System.out.println(1/2*l*h);
    }
}



class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}





public class Inheritance {
    public static void main(String[] args) {
        Triangle t1= new Triangle();
    bank.Account account1 = new bank.Account();
    account1.name = "Customer1";
    }
}


//4 types of inheritance in java
//Single level
//mutilevel
//Hierarchial Inheritance
//Hybrid Inheritance (all inheritance)
//Multiple inheritance in java is Interface