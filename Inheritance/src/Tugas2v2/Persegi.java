package Tugas2v2;

public class Persegi {
    public float sisi;

    public float getSisi() { return sisi; }

    public void setSisi(float sisi) { this.sisi = sisi; }

    public Persegi() { }

    public Persegi(float sisi) { this.sisi = sisi; }

    public float kelilingPersegi() {
        float kelilingPersegi = 4 * sisi;
        return kelilingPersegi;
    }

    public float luasPersegi() {
        float luasPersegi = sisi * sisi;
        return luasPersegi;
    }
}
