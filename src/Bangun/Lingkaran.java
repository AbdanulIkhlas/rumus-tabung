package Bangun;

public class Lingkaran {
    public static final double PI = 3.14159265359;
    public double kelilingLingkaran;
    public double luasLingkaran;
    public double r = 5.0d;

    public double menghitungKelilingLingkaran(double r) {
        // this.r = r;
        kelilingLingkaran = 2 * PI * r;
        return kelilingLingkaran;
    }

    // bagaimana jika method() ini tanpa parameter? Secara OOP masih benar??
    public double menghitungLuasLingkaran(double r) {
        // this.r = r;
        luasLingkaran = PI * r * r;
        return luasLingkaran;
    }
}
