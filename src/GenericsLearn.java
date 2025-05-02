public class GenericsLearn {
     // Generics = Bir sınıf, arayüz veya yöntem yazabileceğiniz bir kavram
     // bu, farklı veri türleriyle uyumludur.
     // type parametresi (gerçek bir türle değiştirilen yer tutucu)
     // type bağımsız değişkeni (türü belirtir)

    public static void main(String[] args) {

        Product<String , Double> product1 = new Product<>("Milk" , 3.12);
        Product<String  , Integer> product2 = new Product<>("Pasta" , 12);

     //   product1.setItem("Candy");
     //   product2.setPrice(12);
        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());
        System.out.println("---------------");

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());



    }
}
