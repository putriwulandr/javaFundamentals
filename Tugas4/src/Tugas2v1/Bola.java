package Tugas2v1;

public class Bola extends Lingkaran{
    public Bola() { }

    public double volumeBola() {
        double volumeBola;
        volumeBola = (luasLingkaran() * r) * 4 / 3;
        return volumeBola;
    }

    @Override
    public double luasLingkaran() {
        return super.luasLingkaran();
    }
}
