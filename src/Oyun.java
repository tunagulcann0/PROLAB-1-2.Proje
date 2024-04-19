
import javax.swing.JFrame;


public class Oyun {
    public static void main(String[] args) {
        Giris giris=new Giris();
        giris.setVisible(true);
        NesneSecimi nesneSecimi = new NesneSecimi();
        System.out.println(nesneSecimi.nesneler);
        giris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
