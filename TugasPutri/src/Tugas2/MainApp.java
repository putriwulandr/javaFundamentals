package Tugas2;

import java.util.Scanner;

public class MainApp 
{
    public static void main(String[] args) 
    {
        Segitiga sgtg = new Segitiga();
        Persegi prsg = new Persegi();
        Lingkaran lgkrn = new Lingkaran();
        Prisma prsm = new Prisma();
        Kubus kbs = new Kubus();
        Bola bolaa = new Bola();

        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.println("-------- Menghitung Luas, Keliling dan Volume Bangun ----------");
            int pilihMenuHitung;

            System.out.println("Pilihan Menu: \n 1. Menghitung Luas \n 2. Menghitung Keliling \n 3. Menghitung Volume Bangun\n");
            System.out.println("Masukkan Pilihan :");
            pilihMenuHitung = input.nextInt();
            System.out.println(" ");
            
            switch (pilihMenuHitung) {
                case 1:
                    System.out.println("//////////// MENGHITUNG LUAS /////////////");
                    System.out.println("Masukkan Sisi Alas Segitiga : ");
                    sgtg.setSisi_A(input.nextFloat());
                    System.out.println("Masukkan Sisi Tinggi Segitiga : ");
                    sgtg.setSisi_T(input.nextFloat());                    
                    System.out.println("Masukkan Sisi Persegi : ");
                    prsg.setSisi(input.nextFloat());                    
                    System.out.println("Masukkan Nilai Phi Lingkaran: ");
                    lgkrn.setPhi(input.nextDouble());
                    System.out.println("Masukkan Jari-jari Lingkaran: ");
                    lgkrn.setR(input.nextFloat());
                    System.out.println(" ");
                    System.out.println("Luas Segitiga : " + sgtg.luasSegitiga());
                    System.out.println("Luas Persegi : " + prsg.luasPersegi());
                    System.out.println("Luas Lingkaran : " + lgkrn.luasLingkaran());
                    System.out.println("//////////////////////////////////////////");
                    System.out.println(" ");
                break;
                case 2:  
                    System.out.println("//////////// MENGHITUNG KELILING /////////////");                  
                    System.out.println("Masukkan Sisi Alas Segitiga : ");
                    sgtg.setSisi_A(input.nextFloat());
                    System.out.println("Masukkan Sisi Tinggi Segitiga : ");
                    sgtg.setSisi_T(input.nextFloat());
                    System.out.println("Masukkan Sisi Miring Segitiga : ");
                    sgtg.setSisi_M(input.nextFloat());                
                    System.out.println("Masukkan Sisi Persegi : ");
                    prsg.setSisi(input.nextFloat());                
                    System.out.println("Masukkan Nilai Phi Lingkaran : ");
                    lgkrn.setPhi(input.nextDouble());
                    System.out.println("Masukkan Jari-jari Lingkaran : ");
                    lgkrn.setR(input.nextFloat());
                    System.out.println(" ");
                    System.out.println("Keliling Segitiga : " + sgtg.kelilingSegitiga());
                    System.out.println("Keliling Persegi : " + prsg.kelilingPersegi());
                    System.out.println("Keliling Lingkaran : " + lgkrn.kelilingLingkaran());
                    System.out.println("//////////////////////////////////////////");
                    System.out.println(" ");
                break;
                case 3:
                    System.out.println("/////////// MENGHITUNG VOLUME ///////////");
                    System.out.println("Masukkan Sisi Alas Prisma: ");
                    prsm.setSisi_A(input.nextFloat());
                    System.out.println("Masukkan Sisi Tinggi Alas Prisma: ");
                    prsm.setSisi_T(input.nextFloat());
                    System.out.println("Masukkan Tinggi Prisma : ");
                    prsm.setTinggi(input.nextFloat());
                    System.out.println("Masukkan Sisi Kubus: ");
                    kbs.setSisi(input.nextFloat());
                    System.out.println("Masukkan Nilai Phi Bola: ");
                    bolaa.setPhi(input.nextDouble());
                    System.out.println("Masukkan Jari-jari Bola: ");
                    bolaa.setR(input.nextFloat());
                    System.out.println(" ");
                    System.out.println("Volume Prisma : " + prsm.volumePrisma());
                    System.out.println("Volume Kubus : " + kbs.volumeKubus());
                    System.out.println("Volume Bola : " + bolaa.volumeBola());
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