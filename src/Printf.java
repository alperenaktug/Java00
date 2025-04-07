public class Printf {
    public static void main(String[] args) {

        String name = "Kendrick" ;
        int age = 12;
        double gpa = 3.12;
        char word = 'k';
        boolean isEmployed = true ;

        System.out.printf("Hello %s\n " , name );
        System.out.printf("Senin adının ilk harfi %c\n ", word );
        System.out.printf("Senin yaşın %d\n " ,age);
        System.out.printf("Employed : %b\n " , isEmployed);
        System.out.printf( "Senin ortalaman %f\n " , gpa);
    }
}
