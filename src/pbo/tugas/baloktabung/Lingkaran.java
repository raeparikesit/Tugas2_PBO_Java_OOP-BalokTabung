package pbo.tugas.baloktabung;//paket file

public class Lingkaran implements MenghitungBidang {
    private double jari, hasilLuas, hasilKeliling;
    
    public Lingkaran(double r){
        jari = r;
    }
    
    // Encaptulation
    public void setJari(int r){
        jari = r;
    }
    
    public double getJari(){
        return jari;
    }
    
    public double getDiameter(){
        return 2*jari;
    }

    @Override
    public double hitungLuas() {
        hasilLuas = pi * (jari * jari);
        return hasilLuas;
    }

    @Override
    public double hitungKeliling() {
        return hasilKeliling = pi * (2*jari);
    }
}
