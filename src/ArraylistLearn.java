import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraylistLearn {

    // ArrayList = Nesneleri depolayan yeniden boyutlandırılabilir bir dizi (otomatik kutu)
    // Diziler boyut olarak sabittir, ancak Dizilimler değişebilir
    public static void main(String [] args){

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("orange"); // eleman ekleme
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("coconut");

     //   fruits.remove(1);     eleman silme
     //   fruits.remove(0);
     //   fruits.remove("coconut");

     //   fruits.set(0 , "pineapple"); indexle eleman ekleme



     //   System.out.println(fruits.get(0)); indexteki elemanı getirme

        System.out.println(fruits.size());  // listenin boyutuu getirir

        Collections.sort(fruits);  // alfabetik sıralar
        System.out.println(fruits);

        for (String fruit : fruits){
            System.out.println(fruit + " * ");
        }

    }
}
