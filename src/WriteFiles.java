import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) {
        // Java kullanarak dosya nasıl yazılır (4 popüler seçenek)

        // FileWriter = Küçük veya orta ölçekli metin dosyaları için iyi
        // BufferedWriter = Büyük miktarda metin için daha iyi performans
        // PrintWriter = Raporlar veya günlükler gibi yapılandırılmış veriler için en iyisi
        // FileOutputStream = İkili dosyalar için en iyisi (ör. Resimler, ses dosyaları)




        String filePath = "src\\malibu.txt";
        String textContent = """
               Nicki minaj
               ice spice
                Kendrick lamar
                sixnine
                """;

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }
}


