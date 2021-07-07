
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) 
    {
        String choice;
        Scanner input = new Scanner(System.in);

        do {
            Person.getDetailPerson();
            
            System.out.print("Tekan Y untuk Melanjutkan atau N untuk tidak : ");
            choice = input.next();
        }

        while ((choice == "y") || (choice == "Y"));
            Pendidikan.getDetailPendidikan();
        input.close();
        
        // Pendidikan.getDetailPendidikan();

        // Person.setfirstName("Putri");
        // Person.setlastName("Wulandari");
        // Person.setdomisili("Yogyakarta");
        // Person.settahunLahir(1997);
        // Pendidikan.setriwayatSd("SD Negeri Imogiri 3");
        // Pendidikan.setriwayatSmp("SMP Negeri 1 Ngaglik");
        // Pendidikan.setriwayatSma("SMA Negeri 1 Pakem");
        // Pendidikan.setriwayatSarjana("Universitas Negeri Yogyakarta");
      }
}
