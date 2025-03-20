import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {

        // Calculate area rectangle
        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double area = 0 ;


        System.out.print("Enter the width : ");
        width = scanner.nextDouble();

        System.out.print("Enter the height : ");
        height = scanner.nextDouble();

        area = height * width ;

        System.out.print("The area is : " + area);
    }
}
