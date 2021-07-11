package Tugas2v1;

public class Lingkaran {
    public float r;
    public double phi;

    public float getR() { return r; }
    public double getPhi() { return phi; }

    public void setR(float r) { this.r = r; }
    public void setPhi(double phi) { this.phi = phi; }

    public Lingkaran() { }

    public Lingkaran(float r, float phi) {
        this.r = r;
        this.phi = phi;
    }

    public double kelilingLingkaran() {
        double kelilingLingkaran = 2 * phi * r;
        return kelilingLingkaran;
    }

    public double luasLingkaran() {
        double luasLingkaran = phi * r * r;
        return luasLingkaran;
    }
}
