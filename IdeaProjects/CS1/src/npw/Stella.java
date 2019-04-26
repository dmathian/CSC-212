package npw;

import painter.SPainter;
import shapes.SSquare;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

import static javax.swing.SwingUtilities.invokeLater;

public class Stella {

    private Stella() {
                   paintCanvas();
               }

               public static void main(String[] args) {
                   invokeLater( Stella::new );
               }

               private void paintCanvas() {
                   int squareCount = getNumber( "How many Squares to Draw" );
                   int canvasSize = 800;
                   int squareSide = canvasSize - 100; // Square Size Constraint
                   int shrinkFactor = squareSide / squareCount;

                   SPainter painter = new SPainter( "Stella", canvasSize, canvasSize );
                   SSquare square = new SSquare( squareSide );

                   drawSquare( painter, squareCount, shrinkFactor, square );
               }

               private void drawSquare(SPainter painter, int nrOfSquares, int shrinkFactor, SSquare square) {
                   boolean colorSwitchFlag = true;
                   Color randomColor1 = randomColor();
                   Color randomColor2 = randomColor();

                   for (int i = 0; i < nrOfSquares; i++) {
                           if (colorSwitchFlag == true) {
                                   painter.setColor( randomColor1 );
                                   painter.paint( square );
                                   square.shrink( shrinkFactor );
                                   colorSwitchFlag = false;
                               } else {
                                   painter.setColor( randomColor2 );
                                   painter.paint( square );
                                   square.shrink( shrinkFactor );
                                   colorSwitchFlag = true;
                               }
                       }
               }
       private Color randomColor() {
                   Random rgen = new Random();
                   int r = rgen.nextInt( 255 );
                   int g = rgen.nextInt( 255 );
                   int b = rgen.nextInt( 255 );
                   return new Color( r, g, b );
               }
       private static int getNumber(String prompt) {
                   String nss = JOptionPane.showInputDialog( null, prompt + "?" );
                   Scanner scanner = new Scanner( nss );
                   return scanner.nextInt();
               }
   }
