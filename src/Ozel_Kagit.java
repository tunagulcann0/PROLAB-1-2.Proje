
public class Ozel_Kagit extends Kagit{
    private int kalinlik = 2;

    public Ozel_Kagit() {
        setNesneismi("Özel Kağıt");
    }

    public Ozel_Kagit(int seviyepuani, double dayaniklilik) {
        super(seviyepuani, dayaniklilik);
        setNesneismi("Özel Kağıt");
    }

    public int getKalinlik() {
        return kalinlik;
    }

    public void setKalinlik(int kalinlik) {
        this.kalinlik = kalinlik;
    }

    @Override
    public void durumGuncelle(double etki,int kazanan) {
        super.durumGuncelle(etki,kazanan); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double etkiHesapla(Nesneler nesne) {
        return super.etkiHesapla(nesne)*getKalinlik();
    }

    @Override
    public int nesnePuaniGoster() {
        super.nesnePuaniGoster(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        return getSeviyepuani();
    }

    @Override
    public int getSeviyepuani() {
        return super.getSeviyepuani(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setSeviyepuani(int seviyepuani) {
        super.setSeviyepuani(seviyepuani); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getDayaniklilik() {
        return super.getDayaniklilik(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setDayaniklilik(double dayaniklilik) {
        super.setDayaniklilik(dayaniklilik); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNufuz(int nufuz) {
        super.setNufuz(nufuz); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getNufuz() {
        return super.getNufuz(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
