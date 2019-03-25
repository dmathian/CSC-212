/*
* Program that prints 100 red, yellow and orange balloons in a blue sky.
* it will features commands
 */

package npw;

import java.awt.Color;
import java.util.Random;
import javax.swing.*;
import painter.SPainter;
import shapes.SCircle;
import shapes.SSquare;

public class Balloons {

    //REQUIRES INFRASTRUCTURE
    public Balloons () {
        paintTheImage();
    }

    public static void main(String [] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Balloons();
            }
        });
    }
    //THE PAINTER DOING IT THING
private void paintTheImage() {
       SPainter painter = new SPainter("Balloons", 600, 600);
       paintSky(painter); // ask IntelliJ to generate the stub
     int nrOfBalloons = 100;
    paintBalloons(painter,nrOfBalloons); //ask IntelliJ to generate the stub

}
private void paintSky(SPainter painter){
      painter.setColor(Color.BLUE);
      SSquare sky = new SSquare(2000);
    painter.paint(sky);
}
private void paintBalloons(SPainter painter, int nrOfBalloons){
        int i =1;
        while (i <= nrOfBalloons){
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
           painter.setColor(Color.orange);

        } else {
            painter.setColor(Color.YELLOW);
        }
        painter.move();
        int balloonRadius = 20;
        SCircle balloon = new SCircle(balloonRadius);
        painter.paint(balloon);
        painter.setColor(Color.BLACK);
        painter.draw(balloon);


}
}
