package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(10);

        System.out.println(square);

        //square.setSide(0);
        //System.out.println(square);
        // yukaridakileri kapattim cünkü sistemden cikiyor bundan sonrakileri okumuyor

        square.setSide(16);
        System.out.println(square);
        System.out.println(square.getName());

        System.out.println("-------------------------------------------");

        Rectangle rectangle = new Rectangle(6,9);

        System.out.println(rectangle);

        rectangle.setLength(10);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle);

        System.out.println(rectangle.getName());

        System.out.println("-------------------------------------------");

        Circle circle = new Circle(8.5);

        System.out.println(circle);

        circle.setRadius(12.45);
        System.out.println(circle.getRadius());
        System.out.println(circle);
        System.out.println(circle.getName());







    }
}
