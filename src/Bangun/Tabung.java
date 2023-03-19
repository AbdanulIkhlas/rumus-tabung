package Bangun;

public class Tabung extends Lingkaran {
    // public float r = 0;
    public double tinggi = 10;
    public double luastabung1, luastabung2, luastabung3;
    public double volTabung1, volTabung2, volTabung3;

    public void hitungLuasTabung() {
        Lingkaran jj = new Lingkaran();
        // ada tiga acara menghitung luas Tabung
        luastabung1 = 2 * Lingkaran.PI * jj.r * (jj.r + tinggi); // cara1 // tidak perlu extends
        luastabung2 = super.menghitungKelilingLingkaran(9.0) * (jj.r + tinggi); // cara2
        luastabung3 = super.kelilingLingkaran * (jj.r + tinggi); // cara3

        System.out.println("Luas 1 : " + luastabung1);
        System.out.println("Luas 2 : " + luastabung2);
        System.out.println("Luas 3 : " + luastabung3);
    }

    public void hitungVolumeTabung() {
        Lingkaran jj = new Lingkaran();
        // ada tiga acara menghitung volume Tabung
        volTabung1 = Lingkaran.PI * jj.r * jj.r * tinggi; // cara1 // tidak perlu extends
        volTabung2 = super.menghitungLuasLingkaran(15) * tinggi; // cara2
        volTabung3 = super.luasLingkaran * tinggi; // cara3

        System.out.println("V 1 : " + volTabung1);
        System.out.println("V 2 : " + volTabung2);
        System.out.println("V 3 : " + volTabung3);
    }

}