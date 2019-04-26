package npw;

import painter.SPainter;
import shapes.SCircle;
import shapes.SSquare;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class AlternateBalloons {

    //The requored INFRASTRUCTURE
    public AlternateBalloons () {
        paintTheImage();
    }

    public static void main(String [] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AlternateBalloons();
            }
        });
    }
    //Paint the image......
    private void paintTheImage() {
        SPainter painter = new SPainter("Alternate Balloons", 600, 600);
        paintSky(painter); // ask IntelliJ to generate the stub
        int nrOfAlternateBalloons = 300;
      paintBalloons(painter,nrOfAlternateBalloons); //ask IntelliJ to generate the stub
    }
    private void paintSky(SPainter painter){
        painter.setColor(Color.LIGHT_GRAY);
        SSquare sky = new SSquare(2000);
        painter.paint(sky);
    }
    private void paintBalloons(SPainter painter, int nrOfAlternateBalloons){
        int i =1;
        while (i <= nrOfAlternateBalloons){
            paintOneBalloon(painter); // ask IntelliJ to generate the stub
            i = i + 1;
        }
    }
    private void paintOneBalloon(SPainter painter) {
        Random rgen = new Random();
        int rn = rgen.nextInt(3);
        if (rn == 0) {
            painter.setColor(Color.BLUE);

        } else if (rn == 1 ) {
            painter.setColor(Color.BLACK);

        } else {
            painter.setColor(Color.ORANGE);
        }
        painter.move();
        int balloonRadius = 10;
        SCircle balloon = new SCircle(balloonRadius);
        painter.paint(balloon);
        painter.setColor(Color.WHITE);
        painter.draw(balloon);

    }
}
