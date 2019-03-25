/*
* program to illustrate some basic character string processing functionality
 */

package stringthing;


public class StringOps {

    public static void main(String [] args){

        //ESTABLISH SOME STRINGS
        String date = "Wednesday, March 18, 2019";
        String time = "8 AM";
        String lab = "String Thing";

        //COMPUTE THE LENGTH OF THE STRINGS
        int dateLength = date.length();
        int timeLength = time.length();
        int labLength = lab.length();

        System.out.println("\ndateLength = " + dateLength);
        System.out.println("timeLength = " + timeLength);
        System.out.println("labLength = " + labLength);

        //COMPUTE SOME POSITIONS
        int p1 = date.indexOf(",");
        int p2 = time.indexOf(" ");
        int p3 = lab.indexOf(" ing ");
        System.out.println("\np1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);

        //COMPUTE SOME 2 ARGUMENTS SUBSTRING VALUES
        System.out.println("\ndate.substring (0,9) = " + date.substring(0,9));
        System.out.println("time.substring (2,4) = " + time.substring(2,4));
        System.out.println("lab.substring (7,8) = " + lab.substring(7,8));

        // COMPUTE SOME 1 ARGUMENT SUBSTRING VALUE
        System.out.println("\ndate.substring (11) = " + date.substring(11));
        System.out.println("time.substring (2) = " + time.substring(2));
        System.out.println("lab.substring (7) = " + lab.substring(7));

        //CREATE A STRING
        String line = date + " | " + time + " | " + lab;
        System.out.println("\nline = " + line);


    }
}

/*
* A. What does the length function do? Simply write a brief descriptions of the index function.
* Answer:   It does the followings:
*
*           dateLength = 25
*           timeLength = 4
*           labLength = 12
*
*  B. What does the Index function do?
*           It does the followings:
*
*             P1 = 9
*             P2 = 1
*             P3 = -1
*
*  C. What does the substring function which takes two parameters?
*            It does the followings
*
*               date.substring (0,9) = Wednesday
                time.substring (2,4) = AM
                lab.substring (7,8) = T
*  D.  What does the substring function which takes two parameters?
*
*               date.substring (11) = March 18, 2019
                time.substring (2) = AM
                lab.substring (7) = Thing

   E.       What does the the "plus operator" dp?

        Answer: line = Wednesday, March 18, 2019 | 8 AM | String Thing
*
 */