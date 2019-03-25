/*
*This program will do a bit of character string processing.
 */

package stringthing;

public class StringThing {

    public static void main(String [] args){
        String singer = "Holiday, Billie";
        String sculptor = "Claudei, Camille";
        String painter = "Picasso, Pablo";
        String dancer = "Zotto, Osvaldo";
        String self = "Dominic, Dut";

        int singerLength = singer.length();
        int sculptorLength = sculptor.length();
        int painterLength = painter.length();
        int dancerLength = dancer.length();
        int selfLength = self.length();


        System.out.println("\nFirst names, First name");
        System.out.println("Holiday = " + (singer));
        System.out.println("Claudei = " + (sculptor));
        System.out.println("Picasso = " + (painter));
        System.out.println("Zotto = " + (dancer));
        System.out.println("Dominic = " + self);

        System.out.println("\nlast names, Last Name");
        System.out.println("Billie = " + (singer));
        System.out.println("Camillie = " + (sculptor));
        System.out.println("Pablo = " + (painter));
        System.out.println("Osvaldo = " + (dancer));
        System.out.println("Dut = " + (self));

        System.out.println("\nFull names, Full Name");
        System.out.println("Holiday Billie = " + (singer));
        System.out.println("Claudei Camillie = " + (sculptor));
        System.out.println("Picasso Pablo = " + (painter));
        System.out.println("Zotto Osvaldo = " + (dancer));
        System.out.println("Dominic Dut = " + (self));


    }

}
