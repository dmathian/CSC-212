package interpreters;


/*
 *This interpreter is inteded to paint differnt colored dots in a window.
 *
 * The commands that the interpreter can recongnize and respond to are:
 * -Blue: paint a blue dot
 * -Red: paont a red dot
 * -Help: show a list of the commands in a lialog message box.
 * -Exit: terminate the program
 */

import painter.SPainter;
import shapes.SCircle;
import javax.swing.*;
import java.awt.*;


public class Interpreter1 {

    private void interpreter() {

        // CREATE OBJECTS TO THINK WITH
        SPainter miro = new SPainter("Dot Thing", 400, 400);
        miro.setScreenLocation(0, 0);
        SCircle dot = new SCircle(180);

        // REPEATEDLY TAKE A COMMAND FROM AN IN PUT DIALOG BOX AND INTERPRET IT
        while (true) {

            String command = JOptionPane.showInputDialog(null, "command?");
            if (command == null) {
                command = "exit";
            } // user clicked on cancel
            if (command.equalsIgnoreCase("yellow")) {
                miro.setColor(Color.YELLOW);
                miro.paint(dot);

            } if (command.equalsIgnoreCase("blue")) {
                miro.setColor(Color.BLUE);
                miro.paint(dot);

            } if (command.equalsIgnoreCase("red")) {
                miro.setColor(Color.RED);
                miro.paint(dot);

            } else if (command.equalsIgnoreCase("help")) {

                JOptionPane.showMessageDialog(null, "Valid commands are: "

                        + "RED | BLUE | HELP | EXIT ");
            } else if (command.equalsIgnoreCase("exit")) {

                miro.end();
                System.out.println("Thank you for viewing the dots...");


            } else {

                JOptionPane.showMessageDialog(null, "Unrecognizable command:"
                        + command.toUpperCase());
            }

        }
    }
       //INFRASTRUCTURE FOR SOME SIMPLE PAINTING

    public Interpreter1() {
        interpreter();
    }
    public  static void main(String [] args ){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interpreter1();
            }
        });

       }

    }





