public abstract class Phones implements  Printable {
    private    String brand;
    private    String model;
    private  double price;

    public Phones(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    @Override
    public void print(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: "+ price);
    }
}



