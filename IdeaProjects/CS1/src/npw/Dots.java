package npw;


import painter.SPainter;
import shapes.SCircle;

import javax.swing.*;
import java.awt.*;

public class Dots {
    //THE SOLUTION TO THE BLUE DOT PROBLEM

       public void drawTop(SPainter paintBrush, SCircle smallDot, SCircle smallerDot, SCircle bigDot){

           // smallDot
           paintBrush.setColor(Color.BLUE);
           paintBrush.mrt(230);
           paintBrush.mfd(200);
           paintBrush.paint(smallDot);
           paintBrush.moveToCenter();

           //smallDot2
           paintBrush.setColor(Color.RED);
           paintBrush.mrt( 100);
           paintBrush.mfd(60);
           paintBrush.paint(smallDot);
           paintBrush.moveToCenter();


           //smallerDot
           paintBrush.setColor(Color.GRAY);
           paintBrush.mlt( 100);
           paintBrush.mfd(60);
           paintBrush.paint(smallerDot);
           paintBrush.moveToCenter();

           //bigDot
           paintBrush.setColor(Color.BLUE);
           paintBrush.mlt(200);
           paintBrush.mfd(230);
           paintBrush.paint(bigDot);
           paintBrush.moveToCenter();

       }
    public void drawBottom(SPainter paintBrush, SCircle smallDot, SCircle smallerDot, SCircle bigDot){

        //smallDot
        paintBrush.setColor(Color.BLUE);
        paintBrush.mrt(200);
        paintBrush.mbk(230);
        paintBrush.paint(smallDot);
        paintBrush.moveToCenter();


        //smallerDot2
        paintBrush.setColor(Color.RED);
        paintBrush.mrt( 100);
        paintBrush.mbk(60);
        paintBrush.paint(smallDot);
        paintBrush.moveToCenter();

        //smallerDot
        paintBrush.setColor(Color.GRAY);
        paintBrush.mlt( 100);
        paintBrush.mbk(60);
        paintBrush.paint(smallerDot);
        paintBrush.moveToCenter();

        //bigDot
        paintBrush.setColor(Color.BLUE);
        paintBrush.mlt(200);
        paintBrush.mbk(230);
        paintBrush.paint(bigDot);
        paintBrush.moveToCenter();

    }

    // GENERAL SIZE.
    private void paintTheImage() {

           SPainter paintBrush = new SPainter("Dot", 600,600);
           SCircle bigDot = new SCircle(50);
           SCircle smallDot = new SCircle(20);
           SCircle smallerDot= new SCircle(10);

            drawTop(paintBrush, smallDot,smallerDot,bigDot);
           drawBottom(paintBrush, smallDot,smallerDot,bigDot);

        }

        //REQUIRED INFRASTRUCTURE

        public Dots() {
            paintTheImage();
        }

        public static void main(String [] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run () {
                    new npw.Dots();
                }
            });
        }
    }

