package npw;

import painter.SPainter;
import shapes.SCircle;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

import static javax.swing.SwingUtilities.*;

public class AbstractGradient {

    public static void main(String[] args) {
       invokeLater( AbstractGradient::new );
               }

        private AbstractGradient() {
                   paintTheImage();
               }

     private void paintTheImage(){
                   // Grab the input information
               int width = getNumber("width");
               int height = getNumber("height");
               int colWidth = getNumber("column width");
                   // Establish the painter
                   SPainter painter = new SPainter("Abstract Gradient", width, height);
                   SCircle dot = new SCircle(5);

                   // Move the painter to the upper left corner to get ready to paint the gradient
                   painter.mfd(height/2);
                   painter.tl(90);
                   painter.mfd(width/2 - 10);
                   painter.tl(90);

                   // Paint it!
                   paintGradient(painter, dot, height, width, colWidth);
               }

        private static int getNumber(String prompt) {
                   String nss = JOptionPane.showInputDialog(null,prompt+"?");
                   Scanner scanner = new Scanner(nss);
                   return scanner.nextInt();
               }

        private void paintGradient(SPainter painter, SCircle dot, int height, int width, int colWidth){
                int cols = 0;

                   // Calculate the number of columns.
                   // any dots only half on the canvas, so we subtract some space.
              int nrOfCols = ( width / colWidth ) - 2;
               while (cols < nrOfCols){
                           nextCol(painter, colWidth);
                           paintColumn(painter, dot, height);
                           cols = cols + 1;
                 }
               }

        private void paintOneDot(SPainter painter, SCircle dot){
                painter.paint(dot);
               }

                // Dots are spaced tighter.
        private void paintColumn(SPainter painter, SCircle dot, int height) {
                   int travel = 0;
                   int totalDistanceTraveled = 0;

                   // Paint a row with decreasing distance between dots.
                   while(totalDistanceTraveled < height - (dot.radius() * 3)) {
                           travel = randomDistance((height - totalDistanceTraveled) / 4);
                           totalDistanceTraveled = totalDistanceTraveled + travel;
                           painter.mfd(travel);
                           paintOneDot(painter, dot);
               }

                   // Make the method invariant with respect to painter position.
                   painter.mbk(totalDistanceTraveled);
               }
                    // Moves the painter to the next column.
       private void nextCol(SPainter painter, int colWidth){
                   painter.tl(90);
                   painter.mfd(colWidth);
                   painter.tr(90);
               }
       private int randomDistance(int maxDistance){
                   Random rgen = new Random();
                   return rgen.nextInt(maxDistance);
               }
  }

