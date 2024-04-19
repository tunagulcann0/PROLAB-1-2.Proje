
public abstract class Nesneler {

    private String nesneismi;

    public String getNesneismi() {
        return nesneismi;
    }

    public void setNesneismi(String nesneismi) {
        this.nesneismi = nesneismi;
    }

    private int seviyepuani=0;
    private double dayaniklilik=20;
    public Nesneler() {}

    public Nesneler(int seviyepuani, double dayaniklilik) {
        this.seviyepuani = seviyepuani;
        this.dayaniklilik = dayaniklilik;
    }

    public int getSeviyepuani() {
        return seviyepuani;
    }

    public void setSeviyepuani(int seviyepuani) {
        this.seviyepuani = seviyepuani;
    }

    public double getDayaniklilik() {
        return dayaniklilik;
    }

    public void setDayaniklilik(double dayaniklilik) {
        this.dayaniklilik = dayaniklilik;
    }
    
    public abstract int nesnePuaniGoster();
    public abstract double etkiHesapla(Nesneler nesne);
    public abstract void durumGuncelle(double etki,int kazanan);
    
}
