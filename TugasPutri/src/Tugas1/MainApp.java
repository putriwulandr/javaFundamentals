package Tugas1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) 
    {
        Pendidikan.setriwayatSd("SD Negeri Imogiri 3");
        Pendidikan.setriwayatSmp("SMP Negeri 1 Ngaglik");
        Pendidikan.setriwayatSma("SMA Negeri 1 Pakem");
        Pendidikan.setriwayatSarjana("Universitas Negeri Yogyakarta");
        
        String choice;

        Scanner input = new Scanner(System.in);

        do {
            Person.getDetailPerson();
            System.out.print("Tekan Y untuk Melanjutkan atau N untuk tidak : ");
            choice = input.next();
            Pendidikan.getDetailPendidikan();
        }

        while ((choice.equalsIgnoreCase("y")));
        
        input.close();
        
        // Person.getDetailPerson();
        // Pendidikan.getDetailPendidikan();

        // Person.setfirstName("Putri");
        // Person.setlastName("Wulandari");
        // Person.setdomisili("Yogyakarta");
        // Person.settahunLahir(1997);
    }
}
