import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
//      for (int i = 20; i >= 0 ; i-=2 ){
//         System.out.println(i);
//     }

/*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop : ");
        int max = scanner.nextInt();

        for (int i = 1 ; i <= max ; i++){
            System.out.println(i);

        }
        scanner.close();
*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many second to countdown from ? ");
        int start = scanner.nextInt();

        for (int i = start ; i > 0 ; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy new year");



    }
}
