package shapes;

public class WhiteArea {

    public static void main (String [] args){

        double edgelength = 0.75;
        double radius = edgelength/16;

        SSquare face = new SSquare(edgelength);
        SCircle dot = new SCircle(radius);
        double dotarea = dot.area();
        System.out.println("Dot Area = "+ dotarea);


        double Face1 = face.area()- dot.area();
        System.out.println("Face 1 Area = "+ Face1);
        double Face2 = face.area() - (dot.area())*2;
        System.out.println("Face 2 Area = "+ Face2);
        double Face3 = face.area()- dot.area()*3;
        System.out.println("Face 3 Area = "+ Face3);
        double Face4 = face.area()- dot.area()*4;
        System.out.println("Face 4 Area = "+ Face4);
        double Face5 = face.area()- dot.area()*5;
        System.out.println("Face 5 Area = "+ Face5);
        double Face6 = face.area()- dot.area()*6;
        System.out.println("Face 6 Area = "+ Face6);
        double White = Face1 + Face2 + Face3 + Face4 + Face5 + Face6;
        System.out.println("White Area = "+ White);

    }
}


