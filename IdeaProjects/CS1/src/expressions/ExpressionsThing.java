package expressions;

import java.awt.Color;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SCircle;

//The construction of arithmetic..

public class ExpressionsThing {
    public static void main(String[] args) {

        double one = 3.14 * 5 + 5; // Wrong Expression
        System.out.println( "one = " + one);

        double two = 3.14 * (5 + 5);
        System.out.println("two = " + two);
        double three = (3.14 * (5 + 5));
        System.out.println("three = " + three);

        double four = (3.14 * 2 + 3);
        System.out.println("four = " + four);

        double five = (55.0/2.0);
        System.out.println("five = " + five);

        double six = (65.0/2.0);
        System.out.println("six = " + six);

        double eight = (3.14 * (11.3 * 11.3));
        System.out.println("eight = " + eight);



    }
}