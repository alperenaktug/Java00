public class OOPEncapsulation {
    // Nesne verilerinin korunmasına yardımcı olurlar ve bunlara erişmek veya bunları
    // değiştirmek için kurallar eklerler.
    // GETTERS = Bir alanı OKUNABİLİR hale getiren yöntemler.
    // SETTERS = Bir alanı yazılabilir kılan yöntemler.
    public static void main(String[] args) {


        Trucker trucker = new Trucker("octavia" ,"pink" , 20000);

        trucker.setModel("passat");
        trucker.setColor("purple");
        trucker.setPrice(12000);

        System.out.println(trucker.getModel() + " " + trucker.getColor() + " " + trucker.getPrice());




    }
}
