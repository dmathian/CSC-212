
package npw;

import java.awt.Color;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SRectangle;


public class RedCross {

    //THE SOLUTION TO THE BLUE DOT PROBLEM

    private void paintTheImage() {
        SPainter klee = new SPainter("Red Cross", 600,600);
        SRectangle rectangle = new SRectangle(500, 100);
        klee.setColor(Color.RED);
        klee.paint(rectangle);
        klee.tl();
        klee.paint(rectangle);
    }

    //REQUIRED INFRASTRUCTURE

    public RedCross() {
        paintTheImage();
    }

    public static void main(String [] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run () {
                new RedCross();
            }
        });
    }
}
