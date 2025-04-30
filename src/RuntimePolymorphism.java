import java.util.Scanner;

public class RuntimePolymorphism {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Animalss animalss ;

        System.out.print("Would you like snake or cow ?(choice == 1 snake " +
                                " choice == 2 cow)");
        int choice = scanner.nextInt();


        if (choice == 1){
            animalss = new Snake();
            animalss.speak();

        }else if (choice == 2) {
            animalss = new Cow();
            animalss.speak();
        }else{
            System.out.println("Lütfen geçerli rakam giriniz !!");
        }




    }
}
