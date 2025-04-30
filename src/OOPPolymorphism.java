public class OOPPolymorphism {

    // Polimorfizm = "POLİ-" = "ÇOK"
    // "-MORPH" = "ŞEKİL"
    // Nesneler diğer nesneler olarak tanımlanabilir.
    // Nesneler, ortak bir üst sınıfın nesneleri olarak ele alınabilir.
    public static void main(String[] args) {

        Otomobil otomobil = new Otomobil();
        Bike bike = new Bike();
        Boat boat = new Boat();


        Vehicle[] vehicles  = {otomobil , bike ,boat};

        for (Vehicle vehicle : vehicles){
            vehicle.go();
        }


    }
}
