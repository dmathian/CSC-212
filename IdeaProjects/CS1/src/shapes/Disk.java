package shapes;

import java.util.Arrays;

public class Disk {

    private static Arrays diamond;

    public static void main(String[] args) {
        SSquare square = new SSquare(200);

       SCircle disk = square.inscribingCircle();
       System.out.println("diak = " + disk.toString());
       System.out.println("diamond = " + diamond.toString());

    }
}
