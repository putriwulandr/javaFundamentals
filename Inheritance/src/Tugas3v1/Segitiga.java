package Tugas3v1;

public class Segitiga extends BangunDatar
{
    private double sisi_A;
    private double sisi_T;
    private double sisi_M;

    
    public double getSisi_A() { return sisi_A; }
    public double getSisi_T() { return sisi_T; }
    public double getSisi_M() { return sisi_M; }
    public void setSisi_A(double sisi_A) { this.sisi_A = sisi_A; }
    public void setSisi_T(double sisi_T) { this.sisi_T = sisi_T; }
    public void setSisi_M(double sisi_M) { this.sisi_M = sisi_M; }

    public Segitiga() { }

    @Override
    public void menggambar() {
        // TODO Auto-generated method stub
        System.out.println("--- Menggambar Segitiga ---");
        return;
    }

    @Override
    public void karakteristik() {
        // TODO Auto-generated method stub
        System.out.println("--- Karakteristik Segitiga ---");
        System.out.println("1. Mempunyai 3 sisi dengan jumlah panjang dua sisinya lebih panjang dari panjang sisi yang lain.");
        System.out.println("2. Mempunyai 3 sudut yang jumlah besarnya 180 derajat.");
        System.out.println("--------------------------------------------------------");
        return;
    }

    @Override
    public double hitungLuas() {
        double luasSegitiga;
        luasSegitiga = (sisi_A *sisi_T)/2;
        System.out.println("Luas Segitiga: " + luasSegitiga);
        // TODO Auto-generated method stub
        return luasSegitiga;
    }

    @Override
    public double hitungKeliling() {
        double kelilingSegitiga;
        kelilingSegitiga = sisi_A + sisi_M + sisi_T;
        System.out.println("Keliling Segitiga: " + kelilingSegitiga);
        // TODO Auto-generated method stub
        return kelilingSegitiga;
    }
    
}
