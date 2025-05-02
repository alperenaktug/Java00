public class AnonymousLearn {
    // Anonim sınıf = Adı olmayan bir sınıf. Tekrar kullanılamaz.
    // Yeni bir sınıf oluşturmak zorunda kalmadan özel davranış ekleyin.
    // Genellikle bir kerelik kullanımlar için kullanılır
    // (TimerTask, Çalıştırılabilir, geri aramalar)
    public static void main(String[] args) {

        Parrot parrot1 = new Parrot();

        Parrot parrot2 = new Parrot(){ // anonymous class
          @Override
          void speak(){
              System.out.println("Scobye Do goes says english");
          }
        };


        parrot1.speak();
        parrot2.speak();

    }
}
