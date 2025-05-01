import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingLearn {
    // Exception =Bir programın normal akışını kesen olay
    // (Sıfıra bölme, dosya bulunamadı, uyumsuzluk giriş türü)
    // Herhangi bir tehlikeli kodu bir try{} bloğu ile çevreleyin
    // try {}, cath {}, finally {}
    public static void main(String[] args) {


        try ( Scanner scanner = new Scanner(System.in)){
            System.out.print("Lütfen bir sayı giriniz : ");
            int number = scanner.nextInt();
            System.out.println(number);

        }catch (InputMismatchException e){
            System.out.println("Harf giremezsin !! ");
        }
        catch (Exception e){
            System.out.println("Something wet wrong !! ");

        }
        finally {
            System.out.println("Program bitti !! ");
        }

    }
}
