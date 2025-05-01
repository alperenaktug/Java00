public class AggregationLesson {
    // Toplama = Nesneler arasındaki "has-a" ilişkisini temsil eder.
    // Bir nesne, yapısının bir parçası olarak başka bir nesne içerir,
    // ancak içerdiği nesne / ler bağımsız olarak var olabilir.
    public static void main(String[] args) {

        Book book1 = new Book("Yüzüklerin efendisi" , 234);
        Book book2 = new Book("Grinin elli tonu" ,567);
        Book book3 = new Book("Küçük prens" , 400);

      //  book1.displayInfo();

        Book[] books = {book1 , book2 , book3};

        Library library = new Library("Denizli Halk Kütüphanesi " , 2004 , books);

        library.displayInfo();




    }
}
