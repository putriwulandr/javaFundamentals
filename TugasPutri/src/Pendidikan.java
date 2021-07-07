
public class Pendidikan {
    private static String riwayatSd;
    private static String riwayatSmp;
    private static String riwayatSma;
    private static String riwayatSarjana;

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
        System.out.println("SD : " + riwayatSd);
        System.out.println("SMP : " + riwayatSmp);
        System.out.println("SMA : " + riwayatSma);
        System.out.println("Sarjana : " + riwayatSarjana);
    }
}
