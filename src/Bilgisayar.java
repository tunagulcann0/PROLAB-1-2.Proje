
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
public class Bilgisayar extends Oyuncu {
    Random random = new Random();
    ArrayList<Integer> sec = new ArrayList<>();
    public Bilgisayar() {
    }

    public Bilgisayar(String oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }


    @Override
    public void setNesnesecimleri(ArrayList<Nesneler> nesnesecimleri) {
        super.setNesnesecimleri(nesnesecimleri); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public ArrayList<Nesneler> getNesnesecimleri() {
        return super.getNesnesecimleri(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setSkor(double skor) {
        super.setSkor(skor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getSkor() {
        return super.getSkor();
    }

    @Override
    public double skorGoster(ArrayList<Nesneler> nesnelers) {
        setSkor(0);
            for(int i=0;i<nesnelers.size();i++){
                setSkor(getSkor()+nesnelers.get(i).getDayaniklilik());
            }
        return getSkor();
    }

    @Override
    public void setOyuncuAdi(String oyuncuAdi) {
        super.setOyuncuAdi(oyuncuAdi); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getOyuncuAdi() {
        return super.getOyuncuAdi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setOyuncuID(String oyuncuID) {
        super.setOyuncuID(oyuncuID); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getOyuncuID() {
        return super.getOyuncuID(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    @Override
    public int nesneSec() {
        int i =0;
        int a=0;
        if (sec.size()>=nesnesecimleri.size()){
            sec.clear();
        }
        while (true) {
            boolean kontrol = false;
            a = random.nextInt(nesnesecimleri.size());
        for (int deger : sec) {
            if (deger==a){
                kontrol=true;
                break;
            }
            else {
            }
        }
        if (!kontrol){
            sec.add(i,a);
            i++;
            break;
        }
        }
        return a;
    }
    
}
