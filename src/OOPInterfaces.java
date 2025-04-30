public class OOPInterfaces {

    /*  // İnterface = Bir dizi soyut yöntem belirten bir sınıfın planı
        // uygulayan sınıfların tanımlaması gerekir.
        // Çoklu kalıtım benzeri davranışı destekler.
    * */
    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        Whale whale = new Whale();
        Eagle eagle = new Eagle();

        rabbit.flee();
        eagle.hunt();

        whale.flee();
        whale.hunt();

    }

}
