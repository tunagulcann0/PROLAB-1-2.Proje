
public class Agir_Tas extends Tas{

    private int sicaklik = 2;
    public Agir_Tas() {
        setNesneismi("Ağır Taş");
    }

    public Agir_Tas(int seviyepuani, double dayaniklilik) {
        super(seviyepuani, dayaniklilik);
        setNesneismi("Ağır Taş");
    }

    public int getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(int sicaklik) {
        this.sicaklik = sicaklik;
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
    public void setKatilik(int katilik) {
        super.setKatilik(katilik); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getKatilik() {
        return super.getKatilik(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNesneismi() {
        return super.getNesneismi();
    }

    @Override
    public void setNesneismi(String nesneismi) {
        super.setNesneismi(nesneismi);
    }

    @Override
    public void durumGuncelle(double etki,int kazanan) {
        super.durumGuncelle(etki,kazanan); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    @Override
    public double etkiHesapla(Nesneler nesne) {
        return super.etkiHesapla(nesne)*getSicaklik();
    }

    @Override
    public int nesnePuaniGoster() {
        super.nesnePuaniGoster(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        return getSeviyepuani();
    }
    
}
