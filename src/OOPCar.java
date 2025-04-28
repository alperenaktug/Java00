
public class OOPCar {

    String make = "Wolswogen";
    String model = "Passat";
    int year = 2023;
    double price = 200.000 ;
    boolean isRunning = false ;


    void start(){
        isRunning = true ;
        System.out.println("You start the engine");
    }

    void stop(){
        isRunning = false ;
        System.out.println("You stop the engine");
    }

    void drive(){
        System.out.println("You drive the " + model);
    }

    void brake(){
        System.out.println("You brake the " + model);
    }


}
