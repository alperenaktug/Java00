import java.util.Timer;
import java.util.TimerTask;

public class TimerTasksLearn {
    // Timer = Görevleri belirli zamanlarda veya periyodik olarak zamanlayan sınıf
    // Aşağıdakiler için kullanışlıdır: bildirim gönderme, zamanlanmış güncellemeler, tekrarlayan eylemler

    // TimerTask = Zamanlayıcı tarafından yürütülecek görevi temsil eder
    // Görevinizi tanımlamak için TimerTask sınıfını genişleteceksiniz
    // Bir TimerTask alt sınıfı oluşturun ve @Override run
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {

            int count = 5 ;
            @Override
            public void run(){
                System.out.println("Are you happy ?");
                count-- ;
                if (count <=0){
                    System.out.println("Task Completed !! ");
                }
            }
        };

        timer.schedule(timerTask ,1000 , 2000);

    }
}
