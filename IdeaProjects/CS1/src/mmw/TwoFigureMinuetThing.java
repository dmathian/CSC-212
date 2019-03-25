package mmw;
 import composer.SComposer;
 import note.SNote;

public class TwoFigureMinuetThing {

    public static void main(String[] args) {

        SNote note = new SNote();

        note.text();

        //   (C,1),
        note.play();

        //   \ (A,1/2)
        note.lp(2); note.s2(); note.play();

        //   / (B,1/2)
        note.rp( ); note.play();

        //  / (C,1/2)
        note.rp(); note.play();

        // / (D,1/2)
        note.rp(); note.play();

        // \ (C,1/2)
        note.lp(); note.play();

        // \ (B,1/2)
        note.lp(); note.play();

        // \ (A,1/2)
        note.lp(); note.play();

        //  / (B,1/2)
        note.rp(); note.play();

        //  / (C,1)
        note.rp();note.x2(); note.play();



    }
}