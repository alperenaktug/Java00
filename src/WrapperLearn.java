public class WrapperLearn {
    // Sarmalayıcı sınıfları = İlkel değerlere izin ver (int, char, double, boolean)
        // nesne olarak kullanılacak. "Onları bir nesneye sarın"
    // Genellikle, bir nesneye ihtiyacınız olmadıkça ilkelleri sarmayın.
    // Koleksiyon Çerçevesinin ve statik yardımcı yöntemlerin kullanılmasına izin verir.

    // Wrapper class lar ilkel veri tiplerinin nesne olarak ele alınmasına izin verir.

    public static void main(String[] args) {

     //    Integer a = new Integer(123); java 9 la deprecated
     //    Double b = new Double(3.12); java 9 la deprecated


        // Autoboxing : İlkel tipi referans tipe çevirme
        Integer a = 12;
        Double b = 3.12;
        Character c = '£';
        Boolean d = true ;

        // Unboxing : Referans değeri ilkel tipe çevirme
        // int x = a ;

        // Referans tipi birbirine dönüştürme
        String a1 = Integer.toString(12);
        String a2 = Double.toString(3.12);
        String a3 = Character.toString('#');
        String a4 = Boolean.toString(false);

        String x = a1 + a2 + a3 + a4;

        System.out.println(x);

        int f = Integer.parseInt("234");


    }
}
