package npw;

import painter.SPainter;
import shapes.SCircle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class HirstDots {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HirstDots();
            }
        });
    }
    public HirstDots() {
        paintTheImage();
    }
    private void paintTheImage(){
        // Grab the input information
        int width = getNumber("width");
        int height = getNumber("height");
        int spacing = getNumber("spacing");
        // Establish the painter
        SPainter painter = new SPainter("Hirst Dots", width, height);
        SCircle dot = new SCircle(5);
        // Move the painter to the upper left corner to get ready to paint the gradient
        painter.mfd(height / 2);
        painter.tl(90);
        painter.mfd(width / 2 - 10);
        painter.tl(90);
        // Paint it!
        paintGradient(painter, dot, height, width, spacing);
    }
    private static int getNumber(String prompt) {
        String nss = JOptionPane.showInputDialog(null,prompt+"?");
        Scanner scanner = new Scanner(nss);
        return scanner.nextInt();
    }
    private void paintGradient(SPainter painter, SCircle dot, int height, int width, int spacing){
        int cols = 0;
        // Calcuate the number of columns. We want to fill the screen, but we don't want
        // any dots only half on the canvas, so we subtract some space.
        int nrOfCols = ( width / spacing ) - 2;
        while (cols < nrOfCols){
            nextCol(painter, spacing);
            paintColumn(painter, dot, height, spacing);
            cols = cols + 1;
        }
    }
    private void paintOneDot(SPainter painter, SCircle dot){
        randomColor(painter);
        painter.paint(dot);
    }
    // Dots are spaced tighter together near the bottom of the canvas.
    private void paintColumn(SPainter painter, SCircle dot, int height, int spacing) {
        int travel = 0;
        int totalDistanceTraveled = 0;

        // Paint a row with decreasing distance between dots.
        while(totalDistanceTraveled < height - (dot.radius() * 3)) {
            travel = spacing;
            totalDistanceTraveled = totalDistanceTraveled + travel;
            painter.mfd(travel);
            paintOneDot(painter, dot);
        }
        // Make the method invariant with respect to painter position.
        painter.mbk(totalDistanceTraveled);
    }
    // Moves the painter to the next column.
    private void nextCol(SPainter painter, int spacing){
        painter.tl(90);
        painter.mfd(spacing);
        painter.tr(90);
    }
    private int randomDistance(int maxDistance){
        Random rgen = new Random();
        return rgen.nextInt(maxDistance);
    }
    private void randomColor(SPainter painter){
        Random rgen = new Random();
        int r = rgen.nextInt(255);
        int b = rgen.nextInt(255);
        int y = rgen.nextInt(255);
        painter.setColor(new Color(r,b,y));
    }
}