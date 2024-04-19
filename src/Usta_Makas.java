
public class Usta_Makas extends Makas{
    private int hiz = 2;

    public Usta_Makas() {
        setNesneismi("Usta Makas");
    }

    public Usta_Makas(int seviyepuani, double dayaniklilik) {
        super(seviyepuani, dayaniklilik);
        setNesneismi("Usta Makas");
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
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
    public void durumGuncelle(double etki,int kazanan) {
        super.durumGuncelle(etki,kazanan); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double etkiHesapla(Nesneler nesne) {
        return super.etkiHesapla(nesne)*getHiz();
    }

    @Override
    public int nesnePuaniGoster() {
        super.nesnePuaniGoster(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        return getSeviyepuani();
    }

    @Override
    public void setKeskinlik(int keskinlik) {
        super.setKeskinlik(keskinlik); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getKeskinlik() {
        return super.getKeskinlik(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
