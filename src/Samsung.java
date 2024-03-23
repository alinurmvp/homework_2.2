public class Samsung extends  Phones implements Printable{
    private String capacity;

    public Samsung(String brand, String model, double price,String capacity) {
        super(brand, model, price);
        this.capacity = capacity;
    }


    @Override
    public void print() {
        System.out.println("Capacity: " + capacity);
    }
}

