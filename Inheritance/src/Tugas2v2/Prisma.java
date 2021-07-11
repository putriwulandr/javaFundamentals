package Tugas2v2;

public class Prisma extends Segitiga{
    public float tinggi;

    public float getTinggi() { return tinggi; }
    
    public void setTinggi(float tinggi) { this.tinggi = tinggi; }

    public Prisma() { }

    public Prisma(float tinggi) { this.tinggi = tinggi; }

    public float volumePrisma() {
        float volumePrisma;
        volumePrisma = luasSegitiga() * tinggi;
        return volumePrisma;
    }

    @Override
    public float luasSegitiga() {
        // float volumePrisma = super.luasSegitiga() * tinggi;
        // System.out.print("Volume Prisma: ");
        return super.luasSegitiga();
    }
}
