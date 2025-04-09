import java.util.Scanner;

public class substring {
    public static void main(String[] args) {

        String email;
        String username;
        String domain;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mail : " );

        email = scanner.nextLine();

        if (email.contains("@")){
            //   email = "alper2345@gmail.com";
            //   String username = email.substring(0 , 9);
            username = email.substring(0 , email.indexOf("@"));

            //    String domain = email.substring(10 ,19);
            domain = email.substring(email.indexOf("@"));
            System.out.println(username);
            System.out.println(domain);

        }else{
            System.out.println("Lütfen geçerli bir email giriniz..");

        }
         scanner.close();
    }

}
