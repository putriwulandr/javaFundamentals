package Tugas5v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        String[] dMakananPaket = { "1. Paket 1 (Nasi Ayam + Esteh)", "2. Paket 2 (Nasi Sayur + Es Teh)", "3. Paket 3 (Nasi Goreng + Esteh)" };
        String[] dMakanan = { "0. Nasi Ayam Goreng", "1. Nasi Goreng", "2. Mie Ayam", "3. Bakso", "4. Mie Ayam Bakso", "5. Nasi Sayur" };
        String[] dMinuman = { "0. Es Teh", "1. Es Jeruk", "2. Jus Jambu", "3. Milk Shake", "4. Cheese Tea", "5. Thai Tea" };
        List<String> daftarMakananPaket = new ArrayList<>(Arrays.asList(dMakananPaket));
        List<String> daftarMakanan = new ArrayList<>(Arrays.asList(dMakanan));
        List<String> daftarMinuman = new ArrayList<>(Arrays.asList(dMinuman));

        Integer[] hMakananPaket = { 17000, 10000, 15000 };
        Integer[] hMakanan = { 14000, 12000, 9000, 11000, 14000, 10000 };
        Integer[] hMinuman = { 3000, 5000, 8000, 10000, 15000, 12000 };
        List<Integer> hargaMakananPaket = new ArrayList<>(Arrays.asList(hMakananPaket));
        List<Integer> hargaMakanan = new ArrayList<>(Arrays.asList(hMakanan));
        List<Integer> hargaMinuman = new ArrayList<>(Arrays.asList(hMinuman));

        Scanner input = new Scanner(System.in);
        String choice; String nama; int jumlahPesananPaket, jumlahPesananMakan, jumlahPesananMinum;

        do {
            System.out.println("-------- DAFTAR MENU  ----------");
            int pilihMenu;
            int pilihMenuMakanan;
            int pilihMenuMinuman;
            System.out.println("Masukkan Nama : ");
            nama = input.next();
            System.out.println();
            System.out.println("Pilihan Menu: ");
            System.out.println("1. Menu Paket");
            System.out.println("2. Makanan dan Minuman");
            System.out.println("3. Exit");
            System.out.println();
            System.out.println("Pilih Menu : ");
            pilihMenu = input.nextInt();
            System.out.println();
            
            switch (pilihMenu) {
                case 1:
                    System.out.println("==================== DAFTAR MENU PAKET ===================");
                    for (String daftarMenuPaket : daftarMakananPaket) { System.out.println(daftarMenuPaket); }
                    System.out.println();
                    System.out.println("Pilih Menu : ");
                    pilihMenu = input.nextInt();
                    System.out.println();

                    if (pilihMenu == 1) {
                        System.out.println(daftarMakananPaket.get(0));
                        System.out.println();
                        System.out.println("Masukkan Jumlah : ");
                        jumlahPesananPaket = input.nextInt();

                        System.out.println();
                        System.out.println("============ Rincian Pesanan ===========");
                        System.out.println("Nama Pemesan : " + nama);
                        System.out.println("Pesanan : " + daftarMakananPaket.get(0));
                        System.out.println("Banyaknya Pesanan : " + jumlahPesananPaket);
                        System.out.println("Harga Satuan : Rp " + hargaMakananPaket.get(0));
                        System.out.println("Total Harga : Rp " + (jumlahPesananPaket * hargaMakananPaket.get(0)));
                    }
                    else if (pilihMenu == 2) {
                        System.out.println(daftarMakananPaket.get(1));
                        System.out.println();
                        System.out.println("Masukkan Jumlah : ");
                        jumlahPesananPaket = input.nextInt();

                        System.out.println();
                        System.out.println("============ Rincian Pesanan ===========");
                        System.out.println("Nama Pemesan : " + nama);
                        System.out.println("Pesanan : " + daftarMakananPaket.get(1));
                        System.out.println("Banyaknya Pesanan : " + jumlahPesananPaket);
                        System.out.println("Harga Satuan : Rp " + hargaMakananPaket.get(1));
                        System.out.println("Total Harga : Rp " + (jumlahPesananPaket * hargaMakananPaket.get(1)));
                    }
                    else {
                        System.out.println(daftarMakananPaket.get(2));
                        System.out.println();
                        System.out.println("Masukkan Jumlah : ");
                        jumlahPesananPaket = input.nextInt();

                        System.out.println();
                        System.out.println("============ Rincian Pesanan ===========");
                        System.out.println("Nama Pemesan : " + nama);
                        System.out.println("Pesanan : " + daftarMakananPaket.get(2));
                        System.out.println("Banyaknya Pesanan : " + jumlahPesananPaket);
                        System.out.println("Harga Satuan : Rp " + hargaMakananPaket.get(2));
                        System.out.println("Total Harga : Rp " + (jumlahPesananPaket * hargaMakananPaket.get(2)));
                    }
                    
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println(" ");
                break;
                case 2:
                    System.out.println("==================== DAFTAR MENU MAKANAN ===================");
                    for (String daftarMenuMakanan : daftarMakanan) { System.out.println(daftarMenuMakanan); }
                    System.out.println();
                    System.out.println("Pilih Menu Makanan : ");
                    pilihMenuMakanan = input.nextInt();
                    String menuMakanan = daftarMakanan.get(pilihMenuMakanan);
                    Integer hargaMakan = hargaMakanan.get(pilihMenuMakanan);
                    System.out.println(menuMakanan);
                    System.out.println("Masukkan Jumlah : ");
                    jumlahPesananMakan = input.nextInt();
                    Integer totalHargaMakanan = hargaMakan * jumlahPesananMakan;

                    System.out.println("==================== DAFTAR MENU MINUMAN ===================");
                    for (String daftarMenuMinuman : daftarMinuman) { System.out.println(daftarMenuMinuman); }
                    System.out.println();
                    System.out.println("Pilih Menu Minuman : ");
                    pilihMenuMinuman = input.nextInt();
                    String menuMinuman = daftarMinuman.get(pilihMenuMinuman);
                    Integer hargaMinum = hargaMinuman.get(pilihMenuMinuman);
                    System.out.println(menuMinuman);
                    System.out.println("Masukkan Jumlah : ");
                    jumlahPesananMinum = input.nextInt();
                    Integer totalHargaMinuman = hargaMinum * jumlahPesananMinum;

                    System.out.println();
                    System.out.println("============ Rincian Pesanan ===========");
                    System.out.println("Nama Pemesan : " + nama);
                    System.out.println("Pesanan : " + menuMakanan + " -> " + jumlahPesananMakan);
                    System.out.println("Pesanan : " + menuMinuman + " -> " + jumlahPesananMinum);
                    System.out.println("Harga Makanan Satuan : Rp " + hargaMakan);
                    System.out.println("Harga Minuman Satuan : Rp " + hargaMinum);
                    System.out.println("Total Harga : Rp " + (totalHargaMakanan + totalHargaMinuman));
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println(" ");
                break;
                case 3:
                    System.exit(0);
                break;
                
                default:
                    break;
            }
            System.out.println("Tekan Y untuk kembali ke menu atau N untuk keluar : ");
            choice = input.next();
        }

        while ((choice.equalsIgnoreCase("y")));
        System.out.println(" ");
        System.out.println(">>>>>>>>> Program Selesai <<<<<<<<<");
        input.close();
    }
}
