package day39_Recap.shapeTask;

public class Circle extends Shape{ // extends i en son yaziyoruz isimiz kolaylasiyor cünkü Construvtur da isimiz kolay

    private double radius;
    static double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            System.err.println("Invalid radius: "+ radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    // yani extends simdi yazdik ve Constructor u da verdigimiz yeni datalari kullanambiliyoruz

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }

}

/*
Circle extends Shape:
		variables:
			radius
			pi (static)
		Encapsulate the field
		Add a constructor to set the filed
		area(): radius * radius * pi
		perimeter(): 2 * radius * pi
		toString(): r, pi, area, perimeter
 */