package Tugas3v1;

public class Lingkaran extends BangunDatar
{
    private double r;
    private double phi;

    public double getR() { return r; }
    public double getPhi() { return phi; }

    public void setR(double r) { this.r = r; }
    public void setPhi(double phi) { this.phi = phi; }

    public Lingkaran() { }

    @Override
    public void menggambar() {
        // TODO Auto-generated method stub
        System.out.println("--- Menggambar Lingkaran ---");
        return;
    }

    @Override
    public void karakteristik() {
        // TODO Auto-generated method stub
        System.out.println("--- Karakteristik Lingkaran ---");
        System.out.println("1. Memiliki jumlah sudut 180 derajat. Memiliki diameter yang membagi lingkaran menjadi 2 sisi seimbang.");
        System.out.println("2. Memiliki jari-jari yang menghubungkan titik pusat dengan titik busur lingkaran.");
        System.out.println("--------------------------------------------------------");
        return;
    }

    @Override
    public double hitungLuas() {
        // TODO Auto-generated method stub
        double luasLingkaran;
        luasLingkaran = phi * r * r;
        System.out.println("Luas Lingkaran: " + luasLingkaran);
        return luasLingkaran;
    }

    @Override
    public double hitungKeliling() {
        // TODO Auto-generated method stub
        double kelilingLingkaran;
        kelilingLingkaran = 2 * phi * r;
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);
        return kelilingLingkaran;
    }
    
}
