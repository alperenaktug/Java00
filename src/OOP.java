public class OOP {
    public static void main(String[] args) {

        // object = an entity that holds data
        //           and can perform action
        //          it is a references data type


        OOPCar car = new OOPCar();
        OOPCar car1 = new OOPCar();
        OOPCar car2 = new OOPCar();


    //    car.model = "tiguan";
    //    car.year = 2025;
    /*
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
    */

        car.drive();
        car.brake();

        System.out.println(car1.make + " " + car1.model);
        System.out.println(car2.make + " " + car2.model);
    }
}
