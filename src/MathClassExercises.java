import java.util.Scanner;

public class MathClassExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double r , cevre , alan , hacim ;

        System.out.print("Lütfen yarıçap uzunluğunu girer misiniz : " );
        r = scanner.nextDouble();

        cevre = 2 * (Math.PI) * r ;
        alan = (Math.PI) * Math.pow(r ,2);
        hacim = (4.0 / 3.0) * (Math.PI) * Math.pow(r ,3);


        System.out.println("Dairenin çevresi : " + cevre);
        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin hacmi : " + hacim);


    }
}
