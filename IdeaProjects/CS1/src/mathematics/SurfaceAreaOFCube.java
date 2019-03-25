/*
Program that features two functions to complete the surface area of a cube.
*-The edge lenth will be ready from the standard input stream.
* -THe surface area will be printed to the standard output stream.
*- A Face of the cube will be modeled as a simple square.
 */


package mathematics;

import java.util.Scanner;
import  shapes.SSquare;


public class SurfaceAreaOFCube {

    public static void main(String [] args){
       double edgeLength = edgeLength();
       double surfaceArea = surfaceArea(edgeLength);
       System.out.println("surface area = " + surfaceArea);

    }

private static double edgeLength() {
    System.out.println("7.5 units");
    Scanner scanner = new Scanner(System.in);
    double edgeLength = scanner.nextDouble();
    return edgeLength;

}

private static double surfaceArea (double edgeLength){
   SSquare face = new SSquare(edgeLength);
   int nrOfFaces = 6;
   double surfaceArea = face.area() * nrOfFaces;
   return surfaceArea;

}

}
