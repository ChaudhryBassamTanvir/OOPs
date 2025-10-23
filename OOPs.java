
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
public class OOPs{
public static void main(String[] args) {
    Pen pen1 = new Pen();
    pen1.color="Blue";
    pen1.type="gel";

    pen1.write();


    Pen pen2 = new Pen();
    pen2.color="Black";
    pen2.type="ballpoint"; 


    
    pen2.printColor();
    pen1.printColor();
}
}