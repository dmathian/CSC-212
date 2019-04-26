package chance;

public class Roller {
    public static void main(String[] args) {
        //CREATE A STANDARD DIE AND ROLL IT 5 TIMES
        createAndRollStandardDieFiveTimes();
        //CREATE A TWENTY SIDED DIE AND ROLL IT 5 TIMES
        createAndRollTwentySidedDieFiveTimes();
        //CREATE A STANDARD DIE AND ROLL IT 20 TIMES
        createAndRollStandardDie(20);
        //CREATE A STANDARD DIE AND ROLL IT 30 TIMES
        createAndRollStandardDie(30);
        //CREATE A NINE SIDED DIE AND ROLL IT 20 TIMES
        createAndRollNineSidedDie(20);
        //CREATE A NINE SIDED DIE AND ROLL IT 30 TIMES
        createAndRollNineSidedDie(30);

        //TEN TIMES, CREATE A STANDARD DIE AND ROLL IT UNTIL YOU GET A 1
 System.out.println("Ten times, roll a standard die for a 1.");
        for (int i = 1; i <= 10; i++) {
            createAndRollStandardDieFor1();
        }
        //TEN TIMES, CREATE A TWELVE SIDED DIE AND ROLL IT UNTIL YOU GET A 1
        System.out.println("Ten times, roll a twelve sided die for a 1.");
        for (int i = 1; i <= 10; i++) {
            createAndRollTwelveSidedDieFor1();
        }
    }

private static void createAndRollStandardDieFiveTimes() {
        System.out.println("Roll a standard die 5 times...");
        Die die = new Die();
        die.roll();
        System.out.print(die.top() + " ");
        die.roll();
        System.out.print(die.top() + " ");
        die.roll();
        System.out.print(die.top() + " ");
        die.roll();
        System.out.print(die.top() + " ");
        die.roll();
        System.out.print(die.top() + " ");
        System.out.println();
    }

private static void createAndRollTwentySidedDieFiveTimes() {
        System.out.println("Roll a twenty sided die 5 times...");
        Die die = new Die();
        die.roll();
        System.out.print(die.top() + " ");
        die.roll();
        System.out.print(die.top() + " ");
        die.roll();
        System.out.print(die.top() + " ");
        die.roll();
        System.out.print(die.top() + " ");
        die.roll();
        System.out.print(die.top() + " ");
        System.out.println();
    }

private static void createAndRollStandardDie(int nrOfTimes) {
        System.out.println("Roll a standard die " + nrOfTimes + " times...");
        Die dd = new Die();
        int i = 1;
        while (i <= nrOfTimes) {
            dd.roll();
            i = i + 1;
            System.out.print(dd.top() + " ");
        }
        System.out.println();
    }

private static void createAndRollNineSidedDie(int nrOfTimes) {
        System.out.println("Roll a nine sided die " + nrOfTimes + " times...");
        Die dd = new Die();
        int i = 1;
        while (i <= nrOfTimes) {
            dd.roll();
            i = i + 1;
            System.out.print(dd.top() + " ");
        }
        System.out.println();
    }

private static void createAndRollStandardDieFor1() {
        Die dd = new Die();
        dd.roll();
        System.out.println(dd.top() + " ");
        while (dd.top() != 1) {
            dd.roll();
            System.out.print(dd.top() + " ");
        }
        System.out.println();
    }

 private static void createAndRollTwelveSidedDieFor1() {
        Die dd = new Die();
        dd.roll();
        System.out.print(dd.top() + " ");
        while (dd.top() != 1) {
            dd.roll();
            System.out.print(dd.top() + " ");
        }
        System.out.println();
    }
}


