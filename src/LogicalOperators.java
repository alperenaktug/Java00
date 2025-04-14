

public class LogicalOperators {
    public static void main(String[] args) {

        // || Or
        //  && And
        // ! Not

        double temp = 50;

        boolean isSunny = false ;

        if (temp <= 30 && temp > 0 && isSunny){
            System.out.println("The weather is good");
            System.out.println("it is Sunny outside");

        } else if (temp <= 30 && temp > 0 && !isSunny)  {
            System.out.println("The weather is good");
            System.out.println("it is Cloudly outside");
        } else if (temp > 30 || temp < 0 ) {
            System.out.println("The weather is bad");
        }


    }
}
