
import java.awt.Color;


public class BitisEkrani extends javax.swing.JFrame {
    
    /**
     * Creates new form BitisEkrani
     */
    Oyuncu oyuncu,oyuncu1;
    Kullanici kullanici;
    Bilgisayar bilgisayar,bilgisayar1;
    public static int x;
    public BitisEkrani(Bilgisayar _oyuncu,Bilgisayar _oyuncu1) {
        bilgisayar=_oyuncu;
        bilgisayar1=_oyuncu1;
        initComponents();
        getContentPane().setBackground(Color.gray);
        KullanıcıAdı.setEnabled(true);
        SKOR.setEnabled(true);
        if (bilgisayar.getSkor()<bilgisayar1.getSkor()){
            String ikinciskor = String.valueOf(bilgisayar1.getSkor());
            SKOR.setText(ikinciskor);
            KullanıcıAdı.setText("Bilgisayar 2");
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pc.jpg")));
            Oyun.logger.info("Bilgisayar oyunu kazandı. Skor: "+bilgisayar1.getSkor());
        }
        if (bilgisayar1.getSkor()< bilgisayar.getSkor()){
            String birinciskor = String.valueOf(bilgisayar.getSkor());
            SKOR.setText(birinciskor);
            KullanıcıAdı.setText("Bilgisayar 1");
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pc.jpg")));
            Oyun.logger.info("Bilgisayar1 oyunu kazandı. Skor: "+bilgisayar.getSkor());
        }
        if(bilgisayar.getSkor()==bilgisayar1.getSkor()){
            String birinciskor = String.valueOf(bilgisayar.getSkor());
            String ikinciskor = String.valueOf(bilgisayar1.getSkor());
            SKOR.setText(birinciskor+"-"+ikinciskor);
            KullanıcıAdı.setText("BERABERE");
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pc-pc2.jpg")));
            Oyun.logger.info("Oyun berabere bitti. Skor: "+bilgisayar1.getSkor()+" - "+bilgisayar.getSkor());
        } 
        SKOR.setEnabled(false);
        KullanıcıAdı.setEnabled(false);
    }
    public BitisEkrani(Kullanici _kullanici,Bilgisayar _bilgisayar){
        kullanici=_kullanici;
        bilgisayar=_bilgisayar;
        initComponents();
        getContentPane().setBackground(Color.gray);
        KullanıcıAdı.setEnabled(true);
        SKOR.setEnabled(true);
        if (bilgisayar.getSkor()<kullanici.getSkor()){
            String birinciskor = String.valueOf(kullanici.getSkor());
            SKOR.setText(birinciskor);
            KullanıcıAdı.setText(kullanici.getOyuncuAdi());
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user2.jpg")));
            Oyun.logger.info("Kullanıcı oyunu kazandı. Skor: "+kullanici.getSkor());
        }
        if (kullanici.getSkor()< bilgisayar.getSkor()){
            String ikinciskor = String.valueOf(bilgisayar.getSkor());
            SKOR.setText(ikinciskor);
            KullanıcıAdı.setText("Bilgisayar 1");
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pc.jpg")));
            Oyun.logger.info("Bilgisayar oyunu kazandı. Skor: "+bilgisayar.getSkor());
        }
        if(bilgisayar.getSkor()==kullanici.getSkor()){
            KullanıcıAdı.setText("BERABERE");
            String birinciskor = String.valueOf(kullanici.getSkor());
            String ikinciskor = String.valueOf(bilgisayar.getSkor());
            SKOR.setText(birinciskor+"-"+ikinciskor);
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user-pc2.jpg")));
            Oyun.logger.info("Oyun berabere bitti. Skor: "+bilgisayar.getSkor()+" - "+kullanici.getSkor());
        }
        SKOR.setEnabled(false);
        KullanıcıAdı.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SKOR = new javax.swing.JTextField();
        Bitir = new javax.swing.JButton();
        KullanıcıAdı = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bitiş Ekranı");
        setLocation(new java.awt.Point(565, 297));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("WİNNER!!!");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("SKOR :");

        SKOR.setBackground(new java.awt.Color(80, 80, 80));
        SKOR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SKOR.setForeground(new java.awt.Color(255, 255, 255));
        SKOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SKORActionPerformed(evt);
            }
        });

        Bitir.setBackground(new java.awt.Color(0, 102, 102));
        Bitir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Bitir.setText("BİTİR");
        Bitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BitirActionPerformed(evt);
            }
        });

        KullanıcıAdı.setBackground(new java.awt.Color(80, 80, 80));
        KullanıcıAdı.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        KullanıcıAdı.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bitir)
                .addGap(157, 157, 157))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(KullanıcıAdı)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SKOR, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(KullanıcıAdı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SKOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(Bitir)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SKORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SKORActionPerformed
    }//GEN-LAST:event_SKORActionPerformed

    private void BitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BitirActionPerformed
        setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_BitirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BitisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BitisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BitisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BitisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BitisEkrani(new Bilgisayar(),new Bilgisayar()).setVisible(true);
            }
        });
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BitisEkrani(new Kullanici(),new Bilgisayar()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bitir;
    private javax.swing.JTextField KullanıcıAdı;
    private javax.swing.JTextField SKOR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
