package npw;

import java.util.Scanner;

public class TextRectangles {
 private static void drawOneRow(int nrOfColumns) {
      for (int i = 0; i < nrOfColumns;  i++) {
          System.out.print("*");
      }
 }
 private static void drawRectangle(int nrOfRows, int nrOfColumns) {
     int i = 1;
     while (i <= nrOfRows) {
         drawOneRow(nrOfColumns);
         System.out.println();
         i = i + 1;
     }
 }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Run:");
     System.out.print("Number of Rows: ");
     int rows = sc.nextInt();
     System.out.print("Number of Columns: ");
     int columns = sc.nextInt();
     drawRectangle(rows,columns);


        }
   }


