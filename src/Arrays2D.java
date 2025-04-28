public class Arrays2D {
    public static void main(String[] args){

        String [] fruits = {"apple" , "orange" , "strawberry"};
        String [] vegetables = {"potato" , "onion" , "carrot"};
        String [] meats = {"chicken" , "pork" , "beef" , "fish"};

        String [][] groceries = {fruits , vegetables , meats};

       //    groceries[2][0] = "doner";
       //    groceries[1][2] = "cucumber";


        for (String[] foods : groceries){
            for (String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }

    }
}
