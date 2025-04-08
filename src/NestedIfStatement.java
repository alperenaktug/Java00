public class NestedIfStatement {

    public static void main(String[] args) {
        boolean student = true ;
        boolean senior = false ;
        double price = 200 ;

        if (student){
            if (senior){
                System.out.println("65 yaş ve üstüne %20 indirimli");
                System.out.println("öğrenciye %10  indirimli");
                price *= 0.8 ;

            }else{
                System.out.println("Öğrencisiniz %10 indirim kazandınız...");
                price *= 0.9 ;
            }

            System.out.println("Ücret öderken % 10 indirimlisiniz..");
            price *= 0.9 ;
        }else{
            System.out.println("Maalesef herhangi bir indiriminiz yok..");
            price *= 1 ;
        }
    }
}
