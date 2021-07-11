package Tugas2v2;

public class Segitiga {
    public float sisi_A;
    public float sisi_T;
    public float sisi_M;

    public float getSisi_A() { return sisi_A; }
    public float getSisi_T() { return sisi_T; }
    public float getSisi_M() { return sisi_M; }

    public void setSisi_A(float sisi_A) { this.sisi_A = sisi_A; }
    public void setSisi_T(float sisi_T) { this.sisi_T = sisi_T; }    
    public void setSisi_M(float sisi_M) { this.sisi_M = sisi_M; }

    public Segitiga() { }

    public Segitiga (float sisi_A, float sisi_T, float sisi_M) {
        this.sisi_A = sisi_A;
        this.sisi_T = sisi_T;
        this.sisi_M = sisi_M;
    }

    public float kelilingSegitiga() {
        float kelilingSegitiga = sisi_A + sisi_T + sisi_M;
        return kelilingSegitiga;
    }

    public float luasSegitiga() {
        float luasSegitiga = ( sisi_A * sisi_T )/2;
        return luasSegitiga;
    }
}
