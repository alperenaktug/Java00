import java.util.HashMap;

public class HashMapLearn {
    // HashMap= Anahtar-değer çiftlerini depolayan bir veri yapısı
    // Anahtarlar benzersizdir, ancak Değerler çoğaltılabilir
    // Herhangi bir düzeni korumaz, ancak bellek verimlidir
    public static void main(String[] args) {

        HashMap<String , Double> map = new HashMap<>();

        map.put("Banana" , 1.2);
        map.put("apple" , 1.9);
        map.put("strawberry" , 2.1);
        map.put("onion" , 1.7);
        map.put("carrot" , 1.4);


       // System.out.println(map.get("onion"));

     //     System.out.println(map.remove("apple"));
     //   System.out.println(map);
     //   System.out.println(map.size());
     //   System.out.println(map.containsKey("pineapple"));
     //   System.out.println(map.containsValue(1.2));

        for (String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

    }
}
