import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String day ;

        System.out.print("Lütfen bir gün giriniz : ");
        day = scanner.nextLine();


        switch (day){
            case "Monday" -> System.out.println("Hafta içi");
            case "Tuesday" -> System.out.println("Hafta içi");
            case "Wednesday" -> System.out.println("Hafta içi");
            case "Thursday" -> System.out.println("Hafta içi");
            case "Friday" -> System.out.println("Hafta içi");
            case "Saturday" -> System.out.println("Hafta Sonu");
            case "Sunday" -> System.out.println("Hafta Sonu");
             
            default -> System.out.println("Lütfen geçerli bir gün girin!!");



        }
    }
}
