import java.nio.channels.ScatteringByteChannel;
import java.sql.SQLOutput;
import java.util.Scanner;

public class EnumsLearn {
    // Numaralandırmalar = (Numaralandırmalar) Özel bir sınıf türü
// sabit bir sabitler kümesini temsil eder.
// Kod okunabilirliğini ve güvenilirliğini artırırlar.
// Anahtarlarla Dizelerden daha verimli.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of week : ");
        String response = scanner.nextLine().toUpperCase();


          try {
              DAYS days = DAYS.valueOf(response);

              switch (days){
                  case MONDAY,
                       TUESDAY,
                       WEDNESDAY,
                       THURSDAY,
                       FRIDAY -> System.out.println("it is a weekday");
                  case SATURDAY,
                       SUNDAY -> System.out.println("it is a weekend");

              }

          }
          catch (IllegalArgumentException e){
              System.out.println("Please a valid enter day");

          }
          scanner.close();


    }
}
