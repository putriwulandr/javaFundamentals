package Tugas5v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu implements receiptPembayaran
{
    public String nama;
    
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public Menu() { }

    public Menu(String nama) { this.nama = nama; }

    String[] dMakananPaket = { "1. Paket 1 (Nasi Ayam + Esteh)       Rp 17.000,00", "2. Paket 2 (Nasi Sayur + Es Teh)     Rp 10.000,00", "3. Paket 3 (Nasi Goreng + Esteh)     Rp 15.000,00" };
    String[] dMakanan = { "0. Nasi Ayam Goreng", "1. Nasi Goreng", "2. Mie Ayam", "3. Bakso", "4. Mie Ayam Bakso", "5. Nasi Sayur" };
    String[] dMinuman = { "0. Es Teh", "1. Es Jeruk", "2. Jus Jambu", "3. Milk Shake", "4. Cheese Tea", "5. Thai Tea" };
    List<String> daftarMakananPaket = new ArrayList<>(Arrays.asList(dMakananPaket));
    List<String> daftarMakanan = new ArrayList<>(Arrays.asList(dMakanan));
    List<String> daftarMinuman = new ArrayList<>(Arrays.asList(dMinuman));


    // ------------------------ menu -----------------------------
    @Override
    public List<String> menuPaket() {
        for (String daftarMenuPaket : daftarMakananPaket) { System.out.println(daftarMenuPaket); }
        return daftarMakananPaket;
    } 

    @Override
    public List<String> menuMakanan() {
        for (String daftarMakan : daftarMakanan) { System.out.println(daftarMakan); }
        return daftarMakanan;
    }

    @Override
    public List<String> menuMinuman() {
        for (String daftarMinum : daftarMinuman) { System.out.println(daftarMinum); }
        return daftarMinuman;
    }


    Integer[] hMakananPaket = { 17000, 10000, 15000 };
    Integer[] hMakanan = { 14000, 12000, 9000, 11000, 14000, 10000 };
    Integer[] hMinuman = { 3000, 5000, 8000, 10000, 15000, 12000 };
    List<Integer> hargaMinuman = new ArrayList<>(Arrays.asList(hMinuman));
    List<Integer> hargaMakanan = new ArrayList<>(Arrays.asList(hMakanan));
    List<Integer> hargaMakananPaket = new ArrayList<>(Arrays.asList(hMakananPaket));

    // ----------------------------- harga -------------------------------------
    @Override
    public List<Integer> hargaPaket() {
        // receiptPembayaran.super.menuPaket();
        return hargaPaket();
    }  

    @Override
    public List<Integer> hargaMakanan() {
        for (int hargaMakan : hargaMakanan) { System.out.println(hargaMakan); }
        return hargaMakanan;
    }

    @Override
    public List<Integer> hargaMinuman() {
        for (int hargaMinum : hargaMinuman) { System.out.println(hargaMinum); }
        return hargaMinuman;
    }  
}
