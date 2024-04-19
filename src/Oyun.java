
import javax.swing.JFrame;
import java.util.logging.*;

public class Oyun {
    public static Logger logger = Logger.getLogger("tasKagitMakas");
    public static void main(String[] args) {
        init();
        Kullanici kullanici = new Kullanici();
        logger.info("Kullanici nesnesi oluşturuldu.");
        Bilgisayar bilgisayar = new Bilgisayar();
        logger.info("Bilgisayar nesnesi oluşturuldu.");
        Bilgisayar bilgisayar1 = new Bilgisayar();
        logger.info("Bilgisayar nesnesi oluşturuldu.");
        Giris giris=new Giris(kullanici,bilgisayar,bilgisayar1);
        giris.setVisible(true);
        giris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void init(){
        FileHandler fh;
        try{
            fh = new FileHandler("./tasKagitMakas.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            logger.info("Logger Initialized");
        }
        catch(Exception e){
            logger.log(Level.WARNING,"Exception ::",e);
        }
    }
}

