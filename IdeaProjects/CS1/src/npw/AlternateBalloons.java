package npw;

import java.awt.Color;
import java.util.Random;
import javax.swing.*;
import painter.SPainter;
import shapes.SCircle;
import shapes.SSquare;

public class AlternateBalloons {

    //REQUIRES INFRASTRUCTURE
    public AlternateBalloons () {
        paintTheImage();
    }

    public static void main(String [] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AlternateBalloons();
            }
        });
    }
    //THE PAINTER DOING IT THING
    private void paintTheImage() {
        SPainter painter = new SPainter("Alternate Balloons", 300, 300);
        paintSky(painter); // ask IntelliJ to generate the stub
        int nrOfAlternateBalloons = 100;
      paintBalloons(painter,nrOfAlternateBalloons); //ask IntelliJ to generate the stub
    }
    private void paintSky(SPainter painter){
        painter.setColor(Color.BLUE);
        SSquare sky = new SSquare(2000);
        painter.paint(sky);
    }
    private void paintBalloons(SPainter painter, int nrOfAlternateBalloons){
        int i =1;
        while (i <= nrOfAlternateBalloons){
           paintOneBalloon(painter); // ask IntelliJ to generate the stub
            i = 1 + 1;
        }
    }
    private void paintOneBalloon(SPainter painter) {
        Random rgen = new Random();
        int rn = rgen.nextInt(3);
        if (rn == 0) {
            painter.setColor(Color.RED);

        } else if (rn == 1 ) {
            painter.setColor(Color.WHITE);

        } else {
            painter.setColor(Color.BLUE);
        }
        painter.move();
        int balloonRadius = 30;
        SCircle balloon = new SCircle(balloonRadius);
        painter.paint(balloon);
        painter.setColor(Color.BLACK);
        painter.draw(balloon);

    }
}
