public class Overloadedmethods {
    public static void main(String[] args) {

        // overloading : (Aşırı yüklenme) metot isimleri tıpa tıp
        // benzer fakat parametreleri farlı yöntemlere denir .

        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,3,4));



    }

    static double add(double a , double b){
        return a + b ;
    }
    static double add(double a , double b , double c){
        return a + b + c ;
    }
    static double add(double a , double b , double c , double d){
        return a + b + c + d ;
    }



}
