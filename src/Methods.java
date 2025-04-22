public class Methods {
    public static void main(String[] args) {

        // methods : Çağırdığımızda yürütülen ve tekrar tekrar kullanılan yöntemlerdir.
        //    Neden önemlidir bir kod yazılabilir ve istediğimiz zaman yeniden kullanılabilir.
        //    Sadece onu çağırmamız gerekir .
        //    bir metodu static bir metod içinde çağırdığımızda o metodunda static olması lazım .
        //    statatic void geriye herhangi birşey döndürmediğimiz durumlarda kullanılır.

      //  String name = "Kendrick Lamar";
      //  int age = 23;
      //  happyBirthday(name ,age);

     double result =  square(3);
        System.out.println(result);
        System.out.println(cube(5));
        String fullName = getFullName("Tekashi" , "Sixnine");
        System.out.println(fullName);
        boolean checkAge = ageCheck(29);
        System.out.println(checkAge);
    }

    static void happyBirthday(String name , int age){
        System.out.println(" Doğum günün kutlu olsun ");
        System.out.printf(" Doğum günün kutlu olsun sevgili %s\n " , name);
        System.out.printf("%d. yaşın kutlu olsun\n " , age);
    }
    static double square(double number){
        return number * number ;
    }
    static double cube(double number){
        return number * number * number ;
    }
    static String getFullName(String first , String last){
        return first + " " + last ;
    }

    static boolean ageCheck (int age){
        if (age > 18){
            return true;
        }else{
            return false;
        }
    }
}
