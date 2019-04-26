package npw;

import painter.SPainter;
import shapes.SCircle;
import utilities.Random;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.SwingUtilities.invokeLater;

public class SimpleDots {

        private String colorChose = getString( "What Color " );
        private int spacingFactor = getNumber("Dot Spacing");
        private int width = getNumber("Canvas Width in Pixels");
        private int height = getNumber("Canvas Height in Pixels ");

               private SimpleDots() {
                   paintTheImage();
               }

               public static void main(String[] args) {
                   invokeLater( SimpleDots::new );
               }

               private void paintTheImage(){
                   // Establish the painter
                   SPainter painter = new SPainter("SimpleDots", width, height);
                   SCircle dot = new SCircle(5);

                   // Move the painter to the upper left corner to get ready to paint the gradient
                   painter.mfd(height/2);
                       painter.tl(90);
                   painter.mfd(width/2 - 10);
                   painter.tl(90);

                   // Paint it!
                   paintGradient(painter, dot, height, width, spacingFactor);
               }

               private static int getNumber(String prompt) {
                   String nss = JOptionPane.showInputDialog(null,prompt+"?");
                   Scanner scanner = new Scanner(nss);
                   return scanner.nextInt();
               }

               private static String getString(String prompt) {
                   String nss = JOptionPane.showInputDialog(null,prompt+"?");
                   Scanner scanner = new Scanner(nss);
                   return scanner.next();
               }

               // Supports floating point numbers as spacingFactor values
               private void paintGradient(SPainter painter, SCircle dot, int height, int width, int verticalSpacing){
                   // Calculate the number of columns. We want to fill the screen, but we don't want
                   // any dots only half on the canvas, so we subtract some space.
                   int nrOfCols = ( width / verticalSpacing ) - 2;
                   int columnCount = 0;
                   while (columnCount < nrOfCols){
                           nextCol(painter, verticalSpacing);
                           columnCount = columnCount + 1;
                           paintColumn(painter, dot, height);

                       }
               }
       private void paintOneDot(SPainter painter, SCircle dot){
                   dynamicColor(painter);
                   painter.paint(dot);
               }

               private void paintColumn(SPainter painter, SCircle dot, int height) {
                   int horizontalSpacing = spacingFactor;
                   int displacement = 0;

                   while(displacement < height) {
                           displacement = displacement + horizontalSpacing;
                           painter.mfd(horizontalSpacing);
                           paintOneDot(painter, dot);
                       }
                       // Make the method invariant with respect to painter position.
                       painter.mbk(displacement);
                   }

               // Moves the painter to the next column.
               private void nextCol(SPainter painter, double colWidth){
                   painter.tl(90);
                   painter.mfd(colWidth);
                   painter.tr(90);
               }
       private void dynamicColor(SPainter painter) {
                   Random rgen = new Random();
                   if (colorChose.equalsIgnoreCase( "red" )) {
                           painter.setColor( Color.RED );
                       } else if (colorChose.equalsIgnoreCase( "green" )) {
                          painter.setColor( Color.GREEN );
                      } else if (colorChose.equalsIgnoreCase( "blue" )) {
                          painter.setColor( Color.BLUE );
                      } else if (colorChose.equalsIgnoreCase( "random" )) {

                    } else {
                          painter.setColor( Color.BLACK );
                      }
              }
  }

