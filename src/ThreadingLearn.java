import java.util.Scanner;

public class ThreadingLearn {
    // Threading = Bir programın aynı anda birden çok görevi çalıştırmasına izin verir
    // Zaman alan işlemlerle performansı artırmaya yardımcı olur
    // (Dosya G / Ç, ağ iletişimi veya herhangi bir arka plan görevi)
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();


        System.out.println("Lütfen adınızı 10 saniye içinde giriniz : ");
        System.out.println("Lütfen adınızı giriniz : ");
        String name = scanner.nextLine();
        System.out.println("Hello" + name);

        scanner.close();
    }
}
