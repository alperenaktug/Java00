import java.sql.SQLOutput;

public class TernaryOperator {
    public static void main(String[] args) {

         // variable = (condition) ? ifTrue : ifFalse ;

        int score = 62 ;

        String passOrFail = (score >60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

        int number = 4;

        String  evenOrOdd = (number % 2 == 0) ? "Sayı çifttir" : "Sayı tekdir" ;
        System.out.println(evenOrOdd);

        int saat = 8 ;

        String zaman = (saat <12) ? "A.M." : "P.M.";
        System.out.println(zaman);

    }
}
