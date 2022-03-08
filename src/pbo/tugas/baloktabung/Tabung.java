package pbo.tugas.baloktabung;//paket file

public class Tabung extends Lingkaran implements MenghitungRuang {
    
    private double tinggi, hasilVolume, hasilLuasPermukaan;

    public Tabung(double s, double t) {
        super(s);
        tinggi = t;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double hitungVolume() {
        return pi * (super.getJari() * super.getJari()) * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * (pi * super.getJari()) * (super.getJari() + tinggi);
    }
    
}