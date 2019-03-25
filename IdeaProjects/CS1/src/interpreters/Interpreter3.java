package interpreters;

import painter.SPainter;
import shapes.SCircle;
import javax.swing.*;
import java.awt.*;

public class Interpreter3 {
    private void interpreter() {
        // CREATE OBJECTS HERE
        SPainter miro = new SPainter("Dot Thing", 400, 400);
        miro.setScreenLocation(0, 0);
        SCircle dot = new SCircle(180);

        // REPEAT A COMMAND FROM AN INPUT DIALOG BOX TO INTERPRET IT
        while (true) {
            String command = JOptionPane.showInputDialog(null, "Command?");
            if (command == null) {
                command = "exit";
            } //user clicked
            if (command.equalsIgnoreCase("blue")) {
                miro.setColor(Color.BLUE);
                miro.paint(dot);
            } else if (command.equalsIgnoreCase("red")) {
                miro.setColor(Color.RED);
                miro.paint(dot);
            } else if (command.equalsIgnoreCase("green")) {
                miro.setColor(Color.GREEN);
                miro.paint(dot);
            } else if (command.equalsIgnoreCase("yellow")) {
                miro.setColor(Color.YELLOW);
                miro.paint(dot);
            } else if (command.equalsIgnoreCase("random")) {
                miro.setColor(randomColor());
                miro.paint(dot);
            } else if (command.equalsIgnoreCase("help")) {
                JOptionPane.showMessageDialog(null, "valid commans are: "
                        + "RED | BLUE | GREEN | YELLOW | RANDOM | HELP | EXIT ");
            } else if (command.equalsIgnoreCase("exit")) {
                miro.end();
                System.out.println("Thank you for viewing dots ...");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Unrecongnizable command: "
                        + command.toUpperCase());
            }
        }
    }

    public Interpreter3() {
        interpreter();
    }
    public static void main(String [] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Interpreter2();
            }
        });
    }
    private static Color randomColor() {
        int rv = (int) (Math.random()*256);
        int gv = (int) (Math.random()*256);
        int bv = (int) (Math.random()*256);
        return new Color(rv,gv,bv);
    }
}
