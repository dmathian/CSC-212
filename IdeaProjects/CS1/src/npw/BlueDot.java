/*
*program to paint a blue dot in the context of the Nonrepresentational
* painting World, NPW
 */

package npw;

import java.awt.Color;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SCircle;


public class BlueDot {

    //THE SOLUTION TO THE BLUE DOT PROBLEM

    private void paintTheImage() {
        SPainter klee = new SPainter("Blue Dot", 600,600);
        SCircle dot = new SCircle(200);
        klee.setColor(Color.BLUE);
        klee.paint(dot);
    }

    //REQUIRED INFRASTRUCTURE

    public BlueDot() {
        paintTheImage();
    }

    public static void main(String [] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run () {
                new BlueDot();
            }
        });
    }
}
