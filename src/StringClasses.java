public class StringClasses {
    public static void main(String[] args) {


        String name = "Java Lesson";
        int lenght = name.length();
        char letter = name.charAt(2);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("o");

      //  name = name.toUpperCase(); // Hepsini büyük yapar..
      //    name = name.toLowerCase(); // hepsini küçük yapar..
      //      name = name.trim(); // boşlukları kaldırır..
      //      name = name.replace("J" , "H"); // Harf değişimi yapar..

   /*
        System.out.println(lenght);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);

        System.out.println(name.isEmpty());// dizi boş mu diye kontrol eder..
*/
        /*
        if (name.isEmpty()){
            System.out.println("Dizinizin içi boş..");
        }else{
            System.out.println("Dizinizin içi dolu..");
        }


         */
        /*
        if (name.contains(" ")){
            System.out.println("Adınızda boşluk içeriyor..");
        }else {
            System.out.println("Yazınız  boşluk içermiyor..");
        }

         */

        if (name.equals("password")){
            System.out.println("Adınız passworda eşittir..s");
        }else{
            System.out.println("Adınız passworda eşit değildir..");
        }
    }
}
