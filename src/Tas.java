
public class Tas extends Nesneler{
    private int katilik=2;
    
    public Tas() {
        setNesneismi("Taş");
    }

    @Override
    public String getNesneismi() {
        return super.getNesneismi();
    }

    @Override
    public void setNesneismi(String nesneismi) {
        super.setNesneismi(nesneismi);
    }

    public Tas(int seviyepuani, double dayaniklilik) {
        super(seviyepuani, dayaniklilik);
        setNesneismi("Taş");
    }

    public int getKatilik() {
        return katilik;
    }

    public void setKatilik(int katilik) {
        this.katilik = katilik;
    }

    @Override
    public void setDayaniklilik(double dayaniklilik) {
        super.setDayaniklilik(dayaniklilik); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getDayaniklilik() {
        return super.getDayaniklilik(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setSeviyepuani(int seviyepuani) {
        super.setSeviyepuani(seviyepuani); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getSeviyepuani() {
        return super.getSeviyepuani(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    @Override
    public int nesnePuaniGoster() {
        return getSeviyepuani();
    }
    @Override
    public double etkiHesapla(Nesneler nesne) {
        double etki =0;
        if(nesne.getClass().getSimpleName().equals("Tas")){
            Tas _tas = (Tas) nesne;
            etki=2;
        }
        if (nesne.getClass().getSimpleName().equals("Kagit")){
            Kagit _kagit = (Kagit ) nesne;
            etki = ( getKatilik() ) / ((1-(0.2))*_kagit.getNufuz());
        }
        if (nesne.getClass().getSimpleName().equals("Makas")){
            Makas _makas = (Makas ) nesne;
            etki = ( getKatilik() ) / ((0.2)*_makas.getKeskinlik());
        }
        if (nesne.getClass().getSimpleName().equals("Agir_Tas")){
            Agir_Tas _agirtas = (Agir_Tas) nesne;
            etki = 2;
        }
        if (nesne.getClass().getSimpleName().equals("Ozel_Kagit")){
            Ozel_Kagit _ozelkagit = (Ozel_Kagit) nesne;
            etki = ( getKatilik() ) / ((1-(0.2))*_ozelkagit.getNufuz()*_ozelkagit.getKalinlik());
        }
        if (nesne.getClass().getSimpleName().equals("Usta_Makas")){
            Usta_Makas _ustamakas = (Usta_Makas) nesne;
            etki = ( getKatilik() ) / ((0.2)*_ustamakas.getKeskinlik()*_ustamakas.getHiz());
        }
        return etki;
    }

    @Override
    public void durumGuncelle(double etki,int kazanan) {
        setDayaniklilik(getDayaniklilik()-etki);
        if(kazanan==1)
            setSeviyepuani(getSeviyepuani()+20);
    }
}
