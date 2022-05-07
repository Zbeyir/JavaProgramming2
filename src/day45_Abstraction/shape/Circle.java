package day45_Abstraction.shape;
/*
interface xx{

}
interface yy{

}
abstract class aa{

}
abstract class bb{

}
*/


/*
herhangi bir sinifa istedigim kadar abstract class yada interface acabilirim (as many as you/I wan)
****ama public bir tane olur ve sinif in adi (yani package adi olan )
ama normalde bir class bir sinif ve bir interface de bir interface
 */
// benim package adim Circle anladin sen oniii ;)))
public class Circle extends Shape {  // yani bunu class Circle extends Shape böyle yazip yukaridakilerden birini public yapsam hata verir benim

    private double radius;

    public final static double pi = 3.14;

    public Circle( double radius) {
        super("Circle");
       setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0){
            throw new RuntimeException("Invalid Radius: " + radius);
        }
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2* radius * pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+
                ", radius=" + radius +
                '}';
    }
    /*
    dikkat yukari da toString de degisik birsey yaptik
     */
}
