public class CarToString {
    public static void main(String[] args) {
       /*
       toString() = Nesne sınıfından devralınan yöntem.
        // Bir nesnenin dize gösterimini döndürmek için kullanılır.
        // Varsayılan olarak, benzersiz bir tanımlayıcı olarak bir karma kodu döndürür.
        // Anlamlı ayrıntılar sağlamak için geçersiz kılınabilir.
       * */

        Bus bus1 = new Bus("Wolswogen" , "Passat" , 2023 , "yellow");
        Bus bus2 = new Bus("Nissan" , "Sandero" , 2025 , "blue");


        System.out.println(bus1);
        System.out.println(bus2);

    }



}
