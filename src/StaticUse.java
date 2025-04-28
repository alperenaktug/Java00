public class StaticUse {
    public static void main(String[] args) {
        //   static = Bir değişkeni veya yöntemi belirli bir nesne yerine sınıfa ait olucak
        //            şeklide değiştirir
        //            Genellikle yardımcı yöntemler veya paylaşılan kaynaklar için kullanılır.
          /*
            Temel olarak, static anahtar kelimesi, bir sınıfın üyelerini (değişkenler ve metotlar) nesneye değil, doğrudan sınıfa ait yapar.
             Bu da birkaç önemli sonucu beraberinde getirir:
             Sınıfa Aitlik: static olarak tanımlanan bir değişken veya metot, o sınıfın tüm nesneleri tarafından paylaşılır. Tek bir kopyası bulunur ve tüm
              nesneler bu ortak kopyayı kullanır. Nesnelerden bağımsız olarak sınıf yüklendiğinde bellekte yerini alır.
             Nesne Oluşturmaya Gerek Yok: static metotlara ve değişkenlere, sınıfın herhangi bir nesnesini oluşturmadan doğrudan sınıf adı üzerinden erişilebilir.
              Örneğin, ClassName.staticVariable veya ClassName.staticMethod().
              Sınıf Yüklenirken İnitialize Olma: static değişkenler, sınıf belleğe yüklendiği anda otomatik olarak ilk değerlerini alırlar.
             this Anahtar Kelimesi Kullanılamaz: static metotlar, belirli bir nesneye ait olmadıkları için this anahtar kelimesini kullanamazlar. Çünkü this,
               o anki nesneyi referans eder.
              static Olmayan Üyelere Doğrudan Erişilemez: static metotlar içinden doğrudan static olmayan (instance) değişkenlere ve metotlara erişilemez. Çünkü static
               metotlar sınıf düzeyindedir ve belirli bir nesnenin varlığını gerektiren instance üyelere erişimleri kısıtlanmıştır.
               static olmayan üyelere erişmek için öncelikle sınıfın bir nesnesini oluşturmak gerekir.
          *
          * */

            Math.round(3.99);

          Friend friend1 = new Friend("Billy");
          Friend friend2 = new Friend("Jimmy");
          Friend friend3 = new Friend("Frank");
          Friend friend4 = new Friend("Popy");

          Friend.showFriend();

        System.out.println(friend1.numOfFriend);
        System.out.println(friend2.numOfFriend);
        System.out.println(friend3.numOfFriend);
        System.out.println(friend4.numOfFriend);



    }
}
