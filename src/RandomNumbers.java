import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

     // Random sınıfını kullanarak rastgele sayı üretmemizi sağlıyor..
        Random random = new Random();


        int numbera ;
        int numberb ;
        int numberc ;

        double carry ;

        boolean free;

        numbera = random.nextInt(1,7);
        numberb = random.nextInt(1,7);
        numberc = random.nextInt(1,7);

        carry = random.nextDouble();

        free = random.nextBoolean();


        System.out.println(numbera);
        System.out.println(numberb);
        System.out.println(numberc);

        System.out.println(carry);

        System.out.println(free);
    }
}
