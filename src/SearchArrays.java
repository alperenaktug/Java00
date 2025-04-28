public class SearchArrays {
    public static void main(String[] args) {


        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        String [] fruits = {"apple" , "strawberry" , "orange"};
        String target = "orange" ;
        boolean isFound = false ;

        for (int i = 0; i < fruits.length; i++) {
           if (fruits[i].equals(target) ){
               System.out.println("Aranan index bulundu : " + i);
               isFound = true;
               break;
           }
        }

        if (!isFound){
            System.out.println("Aranan sayı indexte bulunamadı!!");
        }
    }
}
