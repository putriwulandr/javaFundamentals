package Tugas2v1;

public class Prisma extends Segitiga
{
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

}
