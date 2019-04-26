package arrayplay;

public class Streets {

    public static void main(String[] args) {
        String[] streets = new String[12];

        streets[0] = "Iberville";
        streets[1] = "Decatur";
        streets[2] = "Toulouse";
        streets[3] = "Bourbon";
        streets[4] = "Dauphine";
        streets[5] = "Royal";
        streets[6] = "St Ann";
        streets[7] = "St Peter";
        streets[8] = "Conti";
        streets[9] = "Exchange";
        streets[10] = "Bienville";
        streets[11] = "Dumaine";

     System.out.println("Length of Array = " + streets.length);
     System.out.println("First Element of Array = " + streets[0]);
     System.out.println("Last Element of Array = " + streets[11]);


     System.out.println("\nThe initial array ...");

        int i = 0;
        while (i < streets.length) {

     System.out.println(streets[i]);
         i = i + 1;
     }

     String swap = streets[0];
     streets[0] = streets[streets.length - 1];
     streets[streets.length - 1] = swap;


     System.out.println("\nThe final array ...");
      for ( int x = 0; x < streets.length; x = x + 1 ) {
        System.out.println(streets[x]);

    }
   }
 }
