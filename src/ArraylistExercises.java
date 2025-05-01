import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Hangi yiyecekleri istersiniz : ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1 ; i <= numOfFood ; i++ ){
            System.out.print("Yiyeceği giriniz"+  i + ": ");
            String food = scanner.nextLine();
            foods.add(food);

        }
        System.out.println(foods);

        scanner.close();

    }
}
