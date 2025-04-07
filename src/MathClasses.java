import java.util.Scanner;

public class MathClasses {
    public static void main(String[] args) {

/*
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result , result2 , result3 , result4
               , result5 , result6 , result7 , result8;

        result = Math.pow(4 ,2);
        result2 = Math.abs(-7);
        result3 = Math.sqrt(25);
        result4 = Math.round(3.12);
        result5 = Math.floor(3.99);
        result6 = Math.ceil(3.12);
        result7 = Math.max(30 , 49);
        result8 = Math.min(23 , 12);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
 */


        // Exercise 1 Hipotenüs Hesaplama :

        Scanner scanner = new Scanner(System.in);

        double a , b , c ;

        System.out.print("Lütfen a kenarının uzunluğunu  girer misiniz : ");
        a = scanner.nextDouble();

        System.out.print("Lütfen b kenarının uzunluğunu girer misiniz : ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a , 2) + Math.pow(b , 2));

        System.out.println(" c kenarı yani hipotenüsün uzunluğu : " + c);

        scanner.close();

    }
}
