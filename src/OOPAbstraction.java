
public class OOPAbstraction {
    public static void main(String[] args) {
        
            /*// abstract = Soyut sınıfları ve yöntemleri tanımlamak için kullanılır.
              // Soyutlama, uygulama ayrıntılarını gizleme sürecidir
              // ve sadece temel özellikleri gösterir.
              // Soyut sınıflar doğrudan örneklenemez.
              // 'Soyut' yöntemler içerebilir (uygulanması gereken)
              // 'Somut' yöntemler içerebilir (bunlar devralınır)
                Soyutlama uygulama ayrıntılarını gizleme yöntemidir .
                Abstract class dan nesne üretilemez .
                Abstract metodların gövdesi olmaz.(soyut metod)
              */

        Circle circle = new Circle(3.4);
        Triangle triangle = new Triangle(4 , 6);
        Rectangle rectangle = new Rectangle(12 , 4);

        circle.display();
        rectangle.display();
        triangle.display();

        System.out.println(circle.area());
        System.out.println( rectangle.area());
        System.out.println(triangle.area());




    }
}
