import java.util.Scanner;

public class UserInputArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("Kaç çeşit yemek istersiniz ?  ");
        size = scanner.nextInt();
         scanner.nextLine();
        foods = new String[size];




        for (int i = 0; i < foods.length; i++) {
            System.out.println("Lütfen yiyecek giriniz : ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods){
            System.out.println(food);
        }
        scanner.close();


    }
}
