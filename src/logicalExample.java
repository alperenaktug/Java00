import java.util.Scanner;

public class logicalExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username ;

        System.out.print("Lütfen kullanıcı adınızı giriniz : ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12){
            System.out.println("Kullanıcı adı 4 - 12 karakter olabilir! ");

        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Kullanıcı adı ( Boşluk ve alt çizgi ) karakterleri içeremez!! ");
        }else
            System.out.println("Hoşgeldiniz " + username);
    }
}
