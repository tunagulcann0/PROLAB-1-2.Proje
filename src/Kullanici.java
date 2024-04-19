
import java.util.ArrayList;


public class Kullanici extends Oyuncu {

    public Kullanici() {
    }

    @Override
    public void setNesnesecimleri(ArrayList<Nesneler> nesnesecimleri) {
        super.setNesnesecimleri(nesnesecimleri); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public ArrayList<Nesneler> getNesnesecimleri() {
        return super.getNesnesecimleri(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public Kullanici(String oyuncuID, String oyuncuAdi, double skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }

    @Override
    public double skorGoster(ArrayList<Nesneler> nesnelers) {
        setSkor(0);
            for (int i=0;i<nesnelers.size();i++){
                setSkor(getSkor()+nesnelers.get(i).getDayaniklilik());
            }
        return getSkor();
    }

    @Override
    public int nesneSec() {
    return 0;
    }

    @Override
    public void setSkor(double skor) {
        super.setSkor(skor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getSkor() {
        return super.getSkor(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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

}
