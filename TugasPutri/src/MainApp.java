import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // public static void main(String [] args) 
        // { 
        //     Scanner input = new Scanner(System.in); 
        //     int angka; 
        //     do { 
        //         System.out.print("Masukkan angka antara 1-10: "); 
        //         angka = input.nextInt(); 
        //     } 
        //     while (!(angka < 1 || angka > 10)); 
        //     System.out.println( angka + " adalah angka di luar range"); 
        // } 
        
        Scanner inputFirstName = new Scanner(System.in);
        Scanner inputLastName = new Scanner(System.in);
        Scanner inputDomisili = new Scanner(System.in);
        Scanner inputTahunLahir = new Scanner(System.in);
        Scanner inputSd = new Scanner(System.in);
        Scanner inputSmp = new Scanner(System.in);
        Scanner inputSma = new Scanner(System.in);
        Scanner inputSarjana = new Scanner(System.in);

        String domisili, tahunLahir, Sd, Smp, Sma, Sarjana, fullName;

        // Person.setfirstName("Putri");
        // Person.setlastName("Wulandari");
        // Person.setdomisili("Yogyakarta");
        // Person.settahunLahir(1997);
        // Pendidikan.setriwayatSd("SD Negeri Imogiri 3");
        // Pendidikan.setriwayatSmp("SMP Negeri 1 Ngaglik");
        // Pendidikan.setriwayatSma("SMA Negeri 1 Pakem");
        // Pendidikan.setriwayatSarjana("Universitas Negeri Yogyakarta");

    
        Person.getDetailPerson();
        Pendidikan.getDetailPendidikan();
      }
}
