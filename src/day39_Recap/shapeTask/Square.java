package day39_Recap.shapeTask;

public class Square extends Shape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0){
            System.err.println("Invalid side: " + side);
            System.exit(1);
        }
        this.side = side;
    }


    // constructor u burada kendimiz secerek yaptik yukarida ki compiler err gidermek icin
    public Square(double side) {
        super("Square");  // diger yerlerde yaptigimz gibi yukaridan parentez icinden String i sildik buraya direk adini yazdik
       setSide(side);  // buraya da setSide kendimiz yazdik (sistem kendisi otomatik 'this.side = side' ekliyor)
    }


    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }


}

/*
Square extends Shape:
	variables:
		side;
	Encapsulate the field
	Add a constructor to set the filed
	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */