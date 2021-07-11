package Tugas3v1;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Segitiga segitiga = new Segitiga();
        Persegi persegi = new Persegi();
        Lingkaran lingkaran = new Lingkaran();

        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.println("-------- Menampilkan Gambar, Karakteristik, Luas dan Keliling Bangun Datar  ----------");
            int pilihMenuHitung;

            System.out.println("Pilihan Menu: \n 1. Segitiga \n 2. Lingkaran \n 3. Persegi\n");
            System.out.println("Masukkan Pilihan :");
            pilihMenuHitung = input.nextInt();
            System.out.println(" ");
            
            switch (pilihMenuHitung) {
                case 1:
                    System.out.println("//////////// INPUT MASUKAN UNTUK MENGHITUNG LUAS /////////////");
                    System.out.println("Masukkan Sisi Alas Segitiga : ");
                    segitiga.setSisi_A(input.nextDouble());
                    System.out.println("Masukkan Sisi Tinggi Segitiga : ");
                    segitiga.setSisi_T(input.nextDouble());       
                    System.out.println("Masukkan Sisi Miring Segitiga : ");
                    segitiga.setSisi_M(input.nextDouble());                    
                    
                    System.out.println(" ");
                    segitiga.menggambar();
                    segitiga.karakteristik();
                    segitiga.hitungKeliling();
                    segitiga.hitungLuas();
                    
                    System.out.println("//////////////////////////////////////////");
                    System.out.println(" ");
                break;
                case 2:  
                    System.out.println("//////////// INPUT MASUKAN UNTUK MENGHITUNG LUAS /////////////");
                    System.out.println("Masukkan Nilai Phi Lingkaran : ");
                    lingkaran.setPhi(input.nextDouble());
                    System.out.println("Masukkan jari-jari Lingkaran : ");
                    lingkaran.setR(input.nextDouble());                   
                    
                    System.out.println(" ");
                    lingkaran.menggambar();
                    lingkaran.karakteristik();
                    lingkaran.hitungKeliling();
                    lingkaran.hitungLuas();
                    
                    System.out.println("//////////////////////////////////////////");
                    System.out.println(" ");
                break;
                case 3:
                    System.out.println("//////////// INPUT MASUKAN UNTUK MENGHITUNG LUAS /////////////");
                    System.out.println("Masukkan Panjang Sisi Persegi : ");
                    persegi.setSisi(input.nextDouble());                    
                    
                    System.out.println(" ");
                    persegi.menggambar();
                    persegi.karakteristik();
                    persegi.hitungKeliling();
                    persegi.hitungLuas();
                    
                    System.out.println("//////////////////////////////////////////");
                    System.out.println(" ");
                break;
                
                default:
                    break;
            }
            System.out.println("Tekan Y untuk Melanjutkan Perhitungan atau N untuk tidak : ");
            choice = input.next();
        }

        while ((choice.equalsIgnoreCase("y")));
        System.out.println(" ");
        System.out.println(">>>>>>>>> Perhitungan Selesai <<<<<<<<<");
        input.close();
    }
}
