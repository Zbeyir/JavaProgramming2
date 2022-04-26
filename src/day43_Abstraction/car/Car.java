package day43_Abstraction.car;

//((2)) onun cicn sinifin da abstract olmasi lazim di ve yaptik
// buradada final kullanamyiz
public abstract class Car {

    private final String brand, model;
    private String color;
    private final int year;
    private  double price;

/*
Constructor yapana kadar yiúkaridaki final ler hata veriyordu
variable lari kontrol edebilmek icin this. leri set yaptik final olmayanlari

 */
    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);

        if (year < 1886 ){
            throw new RuntimeException("Invalid Year: " + year);
        }
        this.year = year;
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // görüldügü gibi sadece 2 tane setter var (final keyWord dan dolayi)

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {

        if (price <= 0){
            throw new RuntimeException("Invalid price: " + price);
        }

        this.price = price;
    }

    public void stop(){
        System.out.println("Press the break");
    }

    public abstract void start();
    /*
    abstract method you don't give the body
    ((1))
    yukarisini abstract yazmadan hata veriyor
    yazunca da hata veriyor
    abstract method da detaylar ile ugrasmiyoruz yapip geciyoruz
    access modifier olarak private, static  kullanamayiz
    final keyWord kullanamyiz
    zaten bu ikisi override edilmiyordu hatirlayacagin üzere
     */

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
