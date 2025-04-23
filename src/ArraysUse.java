import java.util.Arrays;

public class ArraysUse {
    public static void main(String[] args) {

        // array : Aynı veri türündeki değerlerin bir koleksiyonudur .



        String [] fruits = {"apple" , "banana" , "strawberry" ,"pineapple" };

        //int numOfFruits = fruits.length;
        //fruits[0] = "orange";
        //System.out.println(fruits[0]);
        Arrays.sort(fruits); // Alfabetik sıralar.
        Arrays.fill(fruits , "coconut"); // dizi içindeki değeri eklenen değer yapar.

        for (int i = 0 ; i < fruits.length ; i++){
            System.out.print(fruits[i] + " ");
        }
        System.out.println();
        for (String fruit : fruits){  // foreach kullanımı dizilerde
            System.out.println(fruit);
        }

    }
}
