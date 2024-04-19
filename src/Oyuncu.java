import java.util.ArrayList;
import javax.swing.ImageIcon;
public abstract class Oyuncu {
    ArrayList<Nesneler> nesnesecimleri = new ArrayList<>();
    private String oyuncuID;
    private String oyuncuAdi;
    private double skor=0;
    public ArrayList<Nesneler> getNesnesecimleri() {
        return nesnesecimleri;
    }

    public void setNesnesecimleri(ArrayList<Nesneler> nesnesecimleri) {
        this.nesnesecimleri = nesnesecimleri;
    }

    public Oyuncu() {
    }
    
    public Oyuncu(String oyuncuID, String oyuncuAdi, double skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public double getSkor() {
        return skor;
    }

    public void setSkor(double skor) {
        this.skor = skor;
    }
    
    public abstract double skorGoster(ArrayList<Nesneler> nesnelers);
    public abstract int nesneSec();

    void setIcon(ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
