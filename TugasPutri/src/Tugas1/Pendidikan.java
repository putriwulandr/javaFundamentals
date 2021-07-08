package Tugas1;

// import java.util.Scanner;

public class Pendidikan {
    private static String riwayatSd;
    private static String riwayatSmp;
    private static String riwayatSma;
    private static String riwayatSarjana;
    // private static Scanner input;

    public static String getriwayatSd() {
        return riwayatSd;
    }

    public static void setriwayatSd(String riwayatSd) {
        Pendidikan.riwayatSd = riwayatSd;
    }

    public static String getriwayatSmp() {
        return riwayatSmp;
    }

    public static void setriwayatSmp(String riwayatSmp) {
        Pendidikan.riwayatSmp = riwayatSmp;
    }

    public static String getriwayatSma() {
        return riwayatSma;
    }

    public static void setriwayatSma(String riwayatSma) {
        Pendidikan.riwayatSma = riwayatSma;
    }

    public static String getriwayatSarjana() {
        return riwayatSarjana;
    }

    public static void setriwayatSarjana(String riwayatSarjana) {
        Pendidikan.riwayatSarjana = riwayatSarjana;
    }

    public static void getDetailPendidikan() {

        // input = new Scanner(System.in);

        // System.out.println("Masukkan Nama SD : ");
        // riwayatSd = input.next();
        // System.out.println("Masukkan Nama SMP : ");
        // riwayatSmp = input.next();
        
        // System.out.println("Masukkan Nama SMA : ");
        // riwayatSma = input.next();
        
        // System.out.println("Masukkan Nama Universitas : ");
        // riwayatSarjana = input.next();

        System.out.println(" ");
        System.out.println("----- RIWAYAT PENDIDIKAN -----");
        System.out.println("SD : " + riwayatSd);
        System.out.println("SMP : " + riwayatSmp);
        System.out.println("SMA : " + riwayatSma);
        System.out.println("Sarjana : " + riwayatSarjana);
        System.out.println("------------------------------");
        System.out.println(" ");
    }
}
