package day45_Abstraction.shape;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        super("Square");
       setSide(side);
    }  // burada da ve diger constructurlar da da ekelem cikarma yaptik

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0){
            throw new RuntimeException("Invalid side: " + side);
        }
        this.side = side;
    }


    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }


    @Override
    public String toString() {
        return "Square{" +
                super.toString()+
                ", side=" + side +
                '}';
    }

    // yukarida toString de de degisik birsey yaptik tek tek yazmamak icin super keyWord kullandik
}
