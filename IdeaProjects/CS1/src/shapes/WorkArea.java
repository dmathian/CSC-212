package shapes;

public class WorkArea {

    public static void main(String[] args){
        SRectangle desk = new SRectangle(24,36);
        double deskarea = desk.area();
        System.out.println("Desk Area = " + deskarea);

        SCircle glass = new SCircle(1.15);

        SRectangle book = new SRectangle(8.5, 11);
        double area2 = book.area()*2;
        System.out.println("Book Area = " + area2);
        SCircle plate = new SCircle(6);
        double area3 = plate.area()*3;
        System.out.println("Plate Area = " + area3);
        SSquare coaster = glass.circumscribingSquare();
        double area4 = coaster.area()*3;
        System.out.println("Coaster Area = " + area4);
        double occupied = book.area()*2 + plate.area()*3 + coaster.area()*3;
        System.out.println("Occupied Area = " + occupied);
        double Free = deskarea - occupied;
        System.out.println("Free Working Space = " + Free);


    }

}
