import java.util.Scanner;

public class ifClause {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age ;
        String name;

        System.out.println("Enter yur name : ");
        name = scanner.nextLine();

        System.out.print("Enter is a age : ");
        age = scanner.nextInt();


        // Group 2

        if (name.isEmpty()){
            System.out.println("You didn't your name");
        }else {
            System.out.println(" Hello " + name  + " !! ");
        }



        // Group 1
        if (70 > age){
            System.out.println("You have an adult");
        }else if (age <0){
            System.out.println("You haven't been born yet! ");
        } else if (age >70 ) {
            System.out.println("You are a senior");
        } else if (age == 0){
            System.out.println("You are a baby!");

        }
        else {
            System.out.println("You have a child !");
        }
        scanner.close();
    }
}
