package shapes;

import java.util.Scanner;

public class ShippingContainer {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a height = ");
        double height = scanner. nextDouble();
        System.out.println("Enter a width = ");
        double width = scanner. nextDouble();
        System.out.println("Enter a length = ");
        double length = scanner.nextDouble();

        SRectangle face = new SRectangle(height,length);
        System.out.println("Face = " + face.toString());
        double diagonal1 = face.diagonal();
        System.out.println("Face's diagonal = " + diagonal1);
        SRectangle key = new SRectangle(diagonal1,width);
        System.out.println("Key = " + key.toString());
        double distance = key.diagonal();
        System.out.println("Distance = " + distance);

    }
}





