public class Xiaomi extends  Phones implements Printable{

    private  int yearOfRelease;

    public Xiaomi(String brand, String model, double price,int yearOfRelease) {
        super(brand, model, price);
        this.yearOfRelease = yearOfRelease;
    }


    @Override
    public void print() {
        System.out.println("Year Of Release: " + yearOfRelease);


    }
}
