package shapes;

public class GraySpace {


    public static void main (String [] args) {
        double DarkGraySide = 40;
        SSquare DarkGray = new SSquare(40);
        System.out.println("Area of Dark Gray = " + DarkGray.area());

        double LightGrayDiagonal = (DarkGraySide - (2*3))/2;

        SCircle LightGrayCircle = new SCircle(LightGrayDiagonal/2);

        SSquare LightGray = LightGrayCircle.inscribingSquare();
        System.out.println("Area of one Light Gray = " + LightGray.area());

        double OrangeDiagonal = DarkGraySide - 3 - 4.5 - (LightGrayDiagonal/2);
        SCircle OrangeCircle = new SCircle(OrangeDiagonal/2);
        SSquare Orange = OrangeCircle.inscribingSquare();
        System.out.println("Area of Orange = " + Orange.area());

        double left = DarkGray.area() - LightGray.area()*2 - Orange.area();
        System.out.println("Area of Left Gray Space = " + left);





    }
}

