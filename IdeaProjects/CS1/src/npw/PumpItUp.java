package npw;

import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SSquare;
import java.awt.*;


public class PumpItUp {

    //THE SOLUTION TO THE BLUE DOT PROBLEM

    private void paintTheImage() {
        SPainter painter = new SPainter("Pump It Up",600,600);
        SSquare square = new SSquare(150);
        paintYellowSquare(painter,square);
        paintRedSquares(painter,square);

            }

    private void paintYellowSquare(SPainter painter, SSquare square) {

        painter.setColor(Color.YELLOW);
        painter.paint(square);
    }
    private void paintRedSquares(SPainter painter, SSquare square) {

        painter.setColor(Color.GRAY);
        painter.mfd(square.side());
        painter.paint(square);
        painter.moveToCenter();

        painter.setColor(Color.RED);
        painter.mrt(square.side());
        painter.mfd(square.side());
        painter.paint(square);
        painter.moveToCenter();

        painter.setColor(Color.RED);
        painter.mfd(square.side());
        painter.mlt(square.side());
        painter.paint(square);
        painter.moveToCenter();


        painter.setColor(Color.GRAY);
        painter.mlt(square.side());
        painter.paint(square);
        painter.moveToCenter();

        painter.setColor(Color.GRAY);
        painter.mrt(square.side());
        painter.paint(square);
        painter.moveToCenter();

        painter.setColor(Color.GRAY);
        painter.mbk(square.side());
        painter.paint(square);
        painter.moveToCenter();


        painter.setColor(Color.BLUE);
        painter.mrt(square.side());
        painter.mbk(square.side());
        painter.paint(square);
        painter.moveToCenter();


        painter.setColor(Color.BLUE);
        painter.mlt(square.side());
        painter.mbk(square.side());
        painter.paint(square);
        painter.moveToCenter();

    }

    //REQUIRED INFRASTRUCTURE

    public PumpItUp() {
        paintTheImage();
    }

    public static void main(String [] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run () {
                new PumpItUp();
            }
        });
    }
}
