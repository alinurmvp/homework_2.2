public class Main {

    public static Printable createObject(String className) {
        switch (className) {
            case "Samsung":
                return new Samsung("Samsung", "Galaxy 21", 599.00, "512 GB");
            case "Iphone":
                return new Iphone("Iphone", "14 pro", 999.00, "Black");
            case "Xiaomi":
                return new Xiaomi("Xiaomi", "Mi 9", 199.00, 2015);
            default:
                return null;


        }

    }

public static  void main (String [] args){
   Printable[] phones = new Printable[3];
   phones[0]= createObject("Samsung");
    phones[1]= createObject("Iphone");
    phones[2]= createObject("Xiaomi");
    for (Printable phones : phones ) {
        System.out.println();
        phones.print();
    }
}

}


