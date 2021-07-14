package Tugas5v1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String choice; 
        Integer jumlahPesananPaket, 
            jumlahPesananMakan, 
            jumlahPesananMinum,
            pilihMenu,
            pilihMenuMakanan,
            pilihMenuMinuman,
            jumlahBayar,
            uangKembali;
        
        Menu menu = new Menu();

        do {
            System.out.println("-------- DAFTAR MENU  ----------");
            System.out.println("Masukkan Nama : ");
            menu.setNama(input.next());
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
                    System.out.println("================ DAFTAR MENU PAKET ===============");
                    menu.menuPaket();
                    System.out.println();
                    System.out.println("Pilih Menu : ");
                    pilihMenu = input.nextInt();
                    System.out.println();

                    if (pilihMenu == 1) {
                        System.out.println(menu.daftarMakananPaket.get(0));
                        System.out.println();
                        System.out.println("Masukkan Jumlah : ");
                        jumlahPesananPaket = input.nextInt();

                        System.out.println();
                        System.out.println("======================= Rincian Pesanan =======================");
                        System.out.println("Nama Pemesan : " + menu.nama);
                        System.out.println("Pesanan : " + menu.daftarMakananPaket.get(0));
                        System.out.println("Banyaknya Pesanan : " + jumlahPesananPaket);
                        System.out.println("Total Harga : Rp " + (jumlahPesananPaket * menu.hargaMakananPaket.get(0)));
                    }
                    else if (pilihMenu == 2) {
                        System.out.println(menu.daftarMakananPaket.get(1));
                        System.out.println();
                        System.out.println("Masukkan Jumlah : ");
                        jumlahPesananPaket = input.nextInt();

                        System.out.println();
                        System.out.println("======================= Rincian Pesanan =======================");
                        System.out.println("Nama Pemesan : " + menu.nama);
                        System.out.println("Pesanan : " + menu.daftarMakananPaket.get(1));
                        System.out.println("Banyaknya Pesanan : " + jumlahPesananPaket);
                        System.out.println("Total Harga : Rp " + (jumlahPesananPaket * menu.hargaMakananPaket.get(1)));
                    }
                    else {
                        System.out.println(menu.daftarMakananPaket.get(2));
                        System.out.println();
                        System.out.println("Masukkan Jumlah : ");
                        jumlahPesananPaket = input.nextInt();

                        System.out.println();
                        System.out.println("======================= Rincian Pesanan =======================");
                        System.out.println("Nama Pemesan : " + menu.nama);
                        System.out.println("Pesanan : " + menu.daftarMakananPaket.get(2));
                        System.out.println("Banyaknya Pesanan : " + jumlahPesananPaket);
                        System.out.println("Total Harga : Rp " + (jumlahPesananPaket * menu.hargaMakananPaket.get(2)));
                    }
                    
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println(" ");
                break;
                case 2:
                    System.out.println("==================== DAFTAR MENU MAKANAN ===================");
                    menu.menuMakanan();
                    System.out.println();
                    System.out.println("Pilih Menu Makanan : ");
                    pilihMenuMakanan = input.nextInt();
                    String menuMakanan = menu.daftarMakanan.get(pilihMenuMakanan);
                    Integer hargaMakan = menu.hargaMakanan.get(pilihMenuMakanan);
                    System.out.println(menuMakanan);
                    System.out.println();
                    System.out.println("Masukkan Jumlah : ");
                    jumlahPesananMakan = input.nextInt();
                    Integer totalHargaMakanan = hargaMakan * jumlahPesananMakan;

                    System.out.println("==================== DAFTAR MENU MINUMAN ===================");
                    menu.menuMinuman();
                    System.out.println();
                    System.out.println("Pilih Menu Minuman : ");
                    pilihMenuMinuman = input.nextInt();
                    String menuMinuman = menu.daftarMinuman.get(pilihMenuMinuman);
                    Integer hargaMinum = menu.hargaMinuman.get(pilihMenuMinuman);
                    System.out.println(menuMinuman);
                    System.out.println();
                    System.out.println("Masukkan Jumlah : ");
                    jumlahPesananMinum = input.nextInt();
                    Integer totalHargaMinuman = hargaMinum * jumlahPesananMinum;
                    Integer totalKeseluruhan = (totalHargaMakanan + totalHargaMinuman);
                    Integer Pajak = (totalKeseluruhan * 10) / 100;
                    Integer jumlahTotalHarga = (totalKeseluruhan + Pajak);
                    System.out.println("Total Harga : Rp " + jumlahTotalHarga);
                    boolean ulangInputBayarKembali;
                    do {
                        ulangInputBayarKembali=false;
                        System.out.println("Input Pembayaran : ");
                        jumlahBayar = input.nextInt();
                        if (jumlahBayar >= jumlahTotalHarga) {
                            uangKembali = jumlahBayar - jumlahTotalHarga;
                            System.out.println();
                            System.out.println("============ Rincian Pesanan ===========");
                            System.out.println("Nama Pemesan         : " + menu.nama);
                            System.out.println("Pesanan Makanan      : " + menuMakanan + " -> " + jumlahPesananMakan);
                            System.out.println("Pesanan Minuman      : " + menuMinuman + " -> " + jumlahPesananMinum);
                            System.out.println("Harga Makanan Satuan : Rp " + hargaMakan);
                            System.out.println("Harga Minuman Satuan : Rp " + hargaMinum);
                            System.out.println("Pajak 10%            : Rp " + Pajak);
                            System.out.println("Total Harga          : Rp " + jumlahTotalHarga);
                            System.out.println("Pembayaran           : Rp " + jumlahBayar);
                            System.out.println("Uang Kembalian       : Rp " + uangKembali);
                        }

                        else if (jumlahBayar < jumlahTotalHarga) {
                            System.out.println();
                            System.out.println("Uang Pembayaran Tidak cukup");
                            System.out.println();
                            ulangInputBayarKembali=true;
                        }
                    }
                    while (ulangInputBayarKembali)  ;
                        

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
        System.out.println(">>>>>>>>> Terimakasih <<<<<<<<<");
        input.close();
    
    }
}
