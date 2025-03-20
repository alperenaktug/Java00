public class ArithmeticOperators {
    public static void main(String[] args) {
        int y = 7;
        int x = 12;
        int z ,a , b, c ,d  ;
        double m  = 20;
        double n = 7;

        z = x + y ;
        a = x - y ;
        b = x * y ;
        c = x / y ;
        d = x % y ;

        m += n ;
      //  m -= n ;
      //  m *= n ;
      //  m /= n ;



        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(m);


        System.out.println("---------------");

        // increment and decrement operators

        int s = 2 ;

        s++ ;
        s += 4 ;

        s-- ;
        s -=4;

        System.out.println(s);


        // operatörlerde işlem önceliği ( parantez çarpama bölme toplama çıkarma )

    }
}
