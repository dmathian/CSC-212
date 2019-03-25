package npw;

import java.awt.Color;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SCircle;


public class Target {

    //THE SOLUTION TO THE BLUE DOT PROBLEM

    private void paintTheImage() {
        SPainter klee = new SPainter("Red Dot", 600,600);
        SCircle dot = new SCircle(200);
        klee.setColor(Color.RED);
        klee.paint(dot);

        SCircle dotM = new SCircle(130);
        klee.setColor(Color.WHITE);
        klee.paint(dotM);

        SCircle dotS = new SCircle(70);
        klee.setColor(Color.RED);
        klee.paint(dotS);

         }

    //REQUIRED INFRASTRUCTURE

    public Target() {
        paintTheImage();  }
    public static void main(String [] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run () {
                new Target();
            }
        });
    }
}

