import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int age = 0;

    /*
        String geriDonus = "";


        while (!geriDonus.equals("Q")){
            System.out.println("Hala oyundasın !!");
            System.out.print("Q ya bas !! : ");
            geriDonus = scanner.next().toUpperCase();
        }

        System.out.println("Tebrikler oyunun dışındasın");
        */

        System.out.print("Lütfen yaşınızı giriniz : ");
        age = scanner.nextInt();

        while (age < 0){
            System.out.println("Yaşınız negatif bir sayı olamaz!!");
            System.out.print("Lütfen yaşınızı giriniz : ");
            age = scanner.nextInt();

        }


        System.out.println("Yaşınız = " + age);


           scanner.close();

    }


}
