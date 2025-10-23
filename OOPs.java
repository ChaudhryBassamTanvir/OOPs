
class Pen{
    String color;
    String type; // ball points, gel


public void write(){
    System.out.println("Writing ");
}



}
public class OOPs{
public static void main(String[] args) {
    Pen pen1 = new Pen();
    pen1.color="Blue";
    pen1.type="gel";

    pen1.write();
}
}