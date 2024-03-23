public class Iphone extends  Phones implements Printable{
    private String color;


    public Iphone(String brand, String model, double price, String color) {
        super(brand, model, price);
        this.color = color;
    }


@Override
public void print() {
    System.out.println("Color: " + color);

}
}

