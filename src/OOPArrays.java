public class OOPArrays {

    public static void main(String[] args) {

     //   OOPArraysCar car1 = new OOPArraysCar("Ford" , "black");
     //   OOPArraysCar car2 = new OOPArraysCar("Wolswogen" , "blue");
     //   OOPArraysCar car3 = new OOPArraysCar("Nissan" , "red");

            OOPArraysCar[] cars = {new OOPArraysCar("Ford" , "black"),
                                   new OOPArraysCar("Wolswogen" , "blue"),
                                   new OOPArraysCar("Nissan" , "red") };

        for (OOPArraysCar car : cars){
            car.color = "pink";
        }


            for (OOPArraysCar car : cars){
                car.drive();
            }
    }
}
