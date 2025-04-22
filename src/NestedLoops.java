import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
      // nested loop : A loop inside another loop
      //              used often with matrices or DS&A

        /*
        for (int i = 1 ; i <= 3 ; i++ ){
            for (int j = 1 ; j <= 9 ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
          */

        // Example

        Scanner scanner = new Scanner(System.in);

        int rows ;
        int columns ;
        char symbol ;

        System.out.print("Lütfen kaç satır olacağını girer misiniz : ");
        rows = scanner.nextInt();

        System.out.print("Lütfen kaç sütun olacağını girer misiniz : ");
        columns = scanner.nextInt();

        System.out.println("Hangi sembolü kullanmka istersiniz girer misiniz : ");
        symbol = scanner.next().charAt(0);


        for (int i = 0 ; i < rows ; i ++){
            for (int j = 0 ; j < columns ; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }











    }
}
