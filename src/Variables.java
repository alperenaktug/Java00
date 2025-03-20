import com.sun.security.jgss.GSSUtil;

public class Variables {
    public static void main(String[] args) {


      //   Primitive = simple value stored directly in memory
      //   References = memory adress (stack) that points to the (heap)

        //     primitive = int , double ,  char , boolean
        //     references = string , arrays , object

        // ilkel veri tipleri doğrudan stack de depolanan veri tipleri
        // referans veri tipleri ise stack de adresleri tutulan veri tipleri


        // steps to creating a variable

        //1. declaration (bildirim)
        //2. assigment (atama)

        int age = 24 ;
        int year = 2025 ;
        int height = 184 ;
        System.out.println(year);
        System.out.println("My height is " + height);


        double tempreture = 37.6 ;
        double price = 45.33 ;
        double gpa = 2.9 ;

        System.out.println(tempreture);
        System.out.println(price);


        char grade = 'A';
        char symbol = '?';
        char currency = '£';

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);


        boolean isStudent = true ;
        boolean isOnline = false;
        boolean forSale = true ;


        System.out.println(isOnline);
        System.out.println(isStudent);
        System.out.println(forSale);

        // mini example
        if (isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are a not student");
        }

        String name = "Alp";
        String food = "banana";
        String email = "real456@gmail.com";
        String car = "ferrari";
        String color = "blue";

        System.out.println("My name is : " + name);
        System.out.println("My favourite food : " + food);
        System.out.println("My favourite color is : " + color);
        System.out.println("This is my " + car);




    }
}
