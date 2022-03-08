//Muhammad Raehan Parikesit (123200149)
//Program Hitung Balok dan Tabung

package pbo.tugas.baloktabung;//paket file

import java.util.Scanner;//mengimport agar dapat melakukan input 

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean kondisi=true;
        do {
            System.out.println("==============");
            System.out.println("  Menu Utama  ");
            System.out.println("==============");
            System.out.println("1.Hitung Balok");
            System.out.println("2.Hitung Tabung");
            System.out.println("0.Exit");

            System.out.print("Pilih:");
            int menu = input.nextInt();

            if(menu==1){
                    double p, l, t;
                    System.out.print("Input Panjang:");
                    p = input.nextInt();
                    System.out.print("Input Lebar:");
                    l = input.nextInt();
                    System.out.print("Input Tinggi:");
                    t = input.nextInt();

                    Balok balok = new Balok(p, l, t);

                    System.out.format("Luas Persegi Panjang       : %.1f \n", balok.hitungLuas());
                    System.out.format("Keliling Persegi Panjang   : %.1f \n", balok.hitungKeliling());
                    System.out.format("Volume Balok               : %.1f \n",  balok.hitungVolume());
                    System.out.format("Luas Permukaan Balok       : %.1f \n",balok.hitungLuasPermukaan());
                } else if(menu==2){
                
                    double r,t;
                    System.out.print("Input Tinggi:");
                    t = input.nextInt();
                    System.out.print("Input Jari-jari:");
                    r = input.nextInt();

                    Tabung tabung = new Tabung(r, t);

                    System.out.format("Luas Lingkaran             : %.1f \n", tabung.hitungLuas());
                    System.out.format("Keliling Lingkaran         : %.1f \n", tabung.hitungKeliling());
                    System.out.format("Volume Tabung              : %.1f \n", tabung.hitungVolume());
                    System.out.format("uas Permukaan Tabung       : %.1f \n",tabung.hitungLuasPermukaan());
            }else if(menu==0){
                kondisi=false;
                System.out.println("Program selesai");
            }else{
                System.out.println("Input yang dimasukkan salah");
            }
            
        }while(kondisi);
}
}