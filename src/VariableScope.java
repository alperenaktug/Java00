public class VariableScope {

    int x = 3 ;  // class scope
    public static void main(String[] args) {

        // local scope : Kullanılan değişken dizilerin içinde geçerli yani metodun yada tanımlandığı
        //               yerde kullanılabilen kapsamdır.

        // class scope : Sınıfın değişkenidir herkes tarafından tanınır bilinir.

        int x = 1 ;  // local scope
        System.out.println(x);
        doSomething();

    }

    static void doSomething(){
        int x = 2 ;  // local scope
        System.out.println(x);
    }
}
