package Tugas3v1;

public class Persegi extends BangunDatar
{
    private double sisi;

    public double getSisi() { return sisi; }

    public void setSisi(double sisi) { this.sisi = sisi; }

    public Persegi() {
    }

    @Override
    public void menggambar() {
        // TODO Auto-generated method stub
        System.out.println("--- Menggambar Persegi ---");
        return;
    }

    @Override
    public void karakteristik() {
        // TODO Auto-generated method stub
        System.out.println("--- Karakteristik Persegi ---");
        System.out.println("1. Mempunyai empat sisi yang sama panjang.");
        System.out.println("2. Memiliki empat buah titik sudut dengan besar masing-masing sudut adalah 90^{o}.");
        System.out.println("3. Terdapat dua pasang sisi yang posisinya sejajar dan sama panjang.");
        System.out.println("4. Banyaknya simetri lipat adalah empat buah.");
        System.out.println("5. Simetri putar pada tingkat empat.");
        System.out.println("--------------------------------------------------------");
        return;
    }

    @Override
    public double hitungLuas() {
        // TODO Auto-generated method stub
        double luasPersegi;
        luasPersegi = sisi * sisi;
        System.out.println("Luas Persegi: " + luasPersegi);
        return luasPersegi;
    }

    @Override
    public double hitungKeliling() {
        // TODO Auto-generated method stub
        double kelilingPersegi;
        kelilingPersegi = 4 * sisi;
        System.out.println("Keliling Persegi: " + kelilingPersegi);
        return kelilingPersegi;
    }
    
}
