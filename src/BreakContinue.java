public class BreakContinue {
    public static void main(String[] args) {

        // Break bir döngüden çıkmak için kullanılır
        // Continue bir döngüde geçerli yinelemesini atlamak için kullanılır.

        for (int i = 0 ; i < 10 ; i++){
            if (i == 6){
             //   break;
                continue;
            }


            System.out.print(i + " ");
        }
    }
}
