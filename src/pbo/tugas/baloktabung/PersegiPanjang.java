package pbo.tugas.baloktabung;//paket file

public class PersegiPanjang implements MenghitungBidang{
    private double panjang, lebar;
    public PersegiPanjang(double p, double l){
        panjang = p;
        lebar = l;
    }
    
    // Encaptulation
    public void setPanjang(int p){//setter tidak memiliki nilai kembalian void kosong karena tugasnya mengisi data ke dalam atribut
        panjang = p;
    }

    public void setLebar(int l){
        lebar = l;
    }

    public double getPanjang(){//getter memiliki nilai kembalian sesuai dengan tipe data yang akan diambil
        return panjang;
    }
    
    public double getLebar(){
        return lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 *(panjang + lebar);
    }
}
