package Tugas2v2;

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
            int pilihMenuHitung, 
                pilihLuasBangunDatar, 
                pilihKelilingBangunDatar, 
                pilihVolumeBangun;

            System.out.println("Pilihan Menu: \n 1. Menghitung Luas \n 2. Menghitung Keliling \n 3. Menghitung Volume Bangun\n");
            System.out.println("Masukkan Pilihan :");
            pilihMenuHitung = input.nextInt();
            System.out.println("================");
            
            switch (pilihMenuHitung) {
                case 1:
                    System.out.println("Pilih Bangun Datar yang akan dihitung Luas: ");
                    System.out.println("1. Segitiga \n2. Persegi \n3. Lingkaran\n");
                    System.out.println("Masukkan Pilihan :");
                    pilihLuasBangunDatar = input.nextInt();
                    System.out.println("================");
                    switch (pilihLuasBangunDatar) {
                        case 1:
                            System.out.println("Masukkan Sisi Alas : ");
                            sgtg.setSisi_A(input.nextFloat());
                            System.out.println("Masukkan Sisi Tinggi : ");
                            sgtg.setSisi_T(input.nextFloat());
                            System.out.println("Luas Segitiga : " + sgtg.luasSegitiga());
                        break;
                        case 2:
                            System.out.println("Masukkan Sisi : ");
                            prsg.setSisi(input.nextFloat());
                            System.out.println("Luas Persegi : " + prsg.luasPersegi());
                        break;
                        case 3:
                            System.out.println("Masukkan Nilai Phi : ");
                            lgkrn.setPhi(input.nextDouble());
                            System.out.println("Masukkan Jari-jari : ");
                            lgkrn.setR(input.nextFloat());
                            System.out.println("Luas Lingkaran : " + lgkrn.luasLingkaran());
                        break;
                        default:
                        break;
                    }
                break;
                case 2:
                    System.out.println("Pilih Bangun Datar yang akan dihitung Keliling : ");
                    System.out.println("1. Segitiga\n2. Persegi\n3. Lingkaran\n");
                    System.out.println("Masukkan Pilihan :");
                    pilihKelilingBangunDatar = input.nextInt();
                    System.out.println("================");
                    switch (pilihKelilingBangunDatar) {
                        case 1:
                            System.out.println("Masukkan Sisi Alas : ");
                            sgtg.setSisi_A(input.nextFloat());
                            System.out.println("Masukkan Sisi Tinggi : ");
                            sgtg.setSisi_T(input.nextFloat());
                            System.out.println("Masukkan Sisi Miring : ");
                            sgtg.setSisi_M(input.nextFloat());
                            System.out.println("Keliling Segitiga : " + sgtg.kelilingSegitiga());
                        break;
                        case 2:
                            System.out.println("Masukkan Sisi : ");
                            prsg.setSisi(input.nextFloat());
                            System.out.println("Keliling Persegi : " + prsg.kelilingPersegi());
                        break;
                        case 3:
                            System.out.println("Masukkan Nilai Phi : ");
                            lgkrn.setPhi(input.nextDouble());
                            System.out.println("Masukkan Jari-jari : ");
                            lgkrn.setR(input.nextFloat());
                            System.out.println("Keliling Lingkaran : " + lgkrn.kelilingLingkaran());
                        break;
                        default:
                        break;
                    }
                break;
                case 3:
                    System.out.println("Pilih Bangun yang akan dihitung Volume : ");
                    System.out.println("1. Prisma \n2. Kubus \n3. Bola\n");
                    System.out.println("Masukkan Pilihan :");
                    pilihVolumeBangun = input.nextInt();
                    System.out.println("================");
                    switch (pilihVolumeBangun) {
                        case 1:
                            System.out.println("Masukkan Sisi Alas : ");
                            prsm.setSisi_A(input.nextFloat());
                            System.out.println("Masukkan Sisi Tinggi Alas : ");
                            prsm.setSisi_T(input.nextFloat());
                            System.out.println("Masukkan Tinggi Prisma : ");
                            prsm.setTinggi(input.nextFloat());
                            System.out.println("Volume Prisma : " + prsm.volumePrisma());
                        break;
                        case 2:
                            System.out.println("Masukkan Sisi : ");
                            kbs.setSisi(input.nextFloat());
                            System.out.println("Volume Kubus : " + kbs.volumeKubus());
                        break;
                        case 3:
                            System.out.println("Masukkan Nilai Phi : ");
                            bolaa.setPhi(input.nextDouble());
                            System.out.println("Masukkan Jari-jari : ");
                            bolaa.setR(input.nextFloat());
                            System.out.println("Volume Bola : " + bolaa.volumeBola());
                        break;
                        default:
                        break;
                    }
                break;
            
                default:
                    break;
            }
            System.out.println("Tekan Y untuk Melanjutkan Perhitungan atau N untuk tidak : ");
            choice = input.next();
        }

        while ((choice.equalsIgnoreCase("y")));
        input.close();
    }
}
