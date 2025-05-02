public class MultiThreadLearn {

    // Multithreading = Bir programın aynı anda birden çok iş parçacığı çalıştırmasını sağlar
    // (Thread = Bağımsız olarak çalışan bir dizi talimat)
    // Arka plan görevleri veya zaman alan işlemler için kullanışlıdır

    public static void main(String[] args) throws InterruptedException {



            Thread thread1 = new Thread(new MyRunnable2("Ping"));
            Thread thread2 = new Thread(new MyRunnable2("Pong"));

        System.out.println("Game start!");

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();

        System.out.println("Game over!");

    }
}
