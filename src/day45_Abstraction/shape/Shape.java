package day45_Abstraction.shape;

public abstract class Shape {

    private final String name; // burada private ve final i ayni anda atadigimiz da hata veriyor cünkü constructor yapmamizi istiyor


    public Shape(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public abstract double area();


    public abstract double perimeter();


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }

}
