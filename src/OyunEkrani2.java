
import java.awt.Color;
import java.util.Random;

public class OyunEkrani2 extends javax.swing.JFrame {
    Bilgisayar bilgisayar;
    Bilgisayar bilgisayar1;
    int kontrol=0,boyut,secim1,secim2,kazanan=0,kazanan1=0,hs;
    double skor1=0,skor2=0;
    public static int x=2;
    String hamlesayisi;
    double etki1,etki2;
    Random random = new Random();
    
    public OyunEkrani2(Bilgisayar _bilgisayar,Bilgisayar _bilgisayar1) {
        bilgisayar=_bilgisayar;
        bilgisayar1=_bilgisayar1;
        bilgisayarrastgele();
        bilgisayarrastgele2();
        initComponents();
        getContentPane().setBackground(Color.gray);
        OynaButton.setEnabled(false);   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        Oyuncu1Resim = new javax.swing.JLabel();
        Oyuncu2Resim = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SecimOyuncu1 = new javax.swing.JLabel();
        SecimOyuncu2 = new javax.swing.JLabel();
        OynaButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        HamleSayısı = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Skor1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        KalanNesne1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Skor2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oyun Ekranı");
        setLocation(new java.awt.Point(431, 236));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("SAVAŞ ARENASI");

        Oyuncu1Resim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pc.jpg"))); // NOI18N

        Oyuncu2Resim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pc.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Bilgisayar 1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Bilgisayar 2");

        OynaButton.setBackground(new java.awt.Color(102, 102, 255));
        OynaButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        OynaButton.setText("X");
        OynaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OynaButtonActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("HAMLE SAYISI:");

        HamleSayısı.setBackground(new java.awt.Color(80, 80, 80));
        HamleSayısı.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HamleSayısı.setForeground(new java.awt.Color(255, 255, 255));
        HamleSayısı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HamleSayısıActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("SKOR");

        Skor1.setBackground(new java.awt.Color(80, 80, 80));
        Skor1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Skor1.setForeground(new java.awt.Color(255, 255, 255));
        Skor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Skor1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("KALAN NESNE");

        KalanNesne1.setBackground(new java.awt.Color(80, 80, 80));
        KalanNesne1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        KalanNesne1.setForeground(new java.awt.Color(255, 255, 255));
        KalanNesne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KalanNesne1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("SKOR");

        Skor2.setBackground(new java.awt.Color(80, 80, 80));
        Skor2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Skor2.setForeground(new java.awt.Color(255, 255, 255));
        Skor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Skor2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("KALAN NESNE");

        jTextField1.setBackground(new java.awt.Color(80, 80, 80));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Skor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(KalanNesne1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(Oyuncu1Resim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HamleSayısı, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(SecimOyuncu1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(OynaButton)
                        .addGap(50, 50, 50)
                        .addComponent(SecimOyuncu2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Skor2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Oyuncu2Resim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(61, 61, 61))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(35, 35, 35)))))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Oyuncu2Resim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(HamleSayısı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Oyuncu1Resim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(OynaButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SecimOyuncu2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SecimOyuncu1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Skor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addGap(168, 168, 168)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Skor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KalanNesne1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HamleSayısıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HamleSayısıActionPerformed
        OynaButton.setEnabled(true);
        hamlesayisi = HamleSayısı.getText();
        hs = Integer.parseInt(hamlesayisi);
    }//GEN-LAST:event_HamleSayısıActionPerformed
    public void bilgisayarrastgele(){
        for (int i = 0; i < 5; i++) {
            int rast = random.nextInt(1, 4);
            if(rast==1){
                bilgisayar.nesnesecimleri.add(new Tas());
                Oyun.logger.info("Bilgisayar --> Taş nesnesini Seçti.");
            }
            if (rast==2) {
                bilgisayar.nesnesecimleri.add(new Kagit());
                Oyun.logger.info("Bilgisayar --> Kağıt nesnesini Seçti.");
            }
            if (rast==3) {
                bilgisayar.nesnesecimleri.add(new Makas());
                Oyun.logger.info("Bilgisayar --> Makas nesnesini Seçti.");
            }
        }
    }
    public void bilgisayarrastgele2(){
        for (int i = 0; i < 5; i++) {
            int rast = random.nextInt(1, 4);
            if(rast==1){
                bilgisayar1.nesnesecimleri.add(new Tas());
                Oyun.logger.info("Bilgisayar1 --> Taş nesnesini Seçti.");
            }
            if (rast==2) {
                bilgisayar1.nesnesecimleri.add(new Kagit());
                Oyun.logger.info("Bilgisayar1 --> Kağıt nesnesini Seçti.");
            }
            if (rast==3) {
                bilgisayar1.nesnesecimleri.add(new Makas());
                Oyun.logger.info("Bilgisayar1 --> Makas nesnesini Seçti.");
            }
        }
    }
    private void OynaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OynaButtonActionPerformed
        kazanan=0;
        kazanan1=0;
        kontrol++;
        secim1=bilgisayar.nesneSec();
        secim2=bilgisayar1.nesneSec();
        Oyun.logger.info("Bilgisayar "+ bilgisayar.nesnesecimleri.get(secim1).getNesneismi()+" nesnesini seçti");
        Oyun.logger.info("Bilgisayar1 "+ bilgisayar1.nesnesecimleri.get(secim2).getNesneismi()+" nesnesini seçti");
        etki1=bilgisayar.nesnesecimleri.get(secim1).etkiHesapla(bilgisayar1.nesnesecimleri.get(secim2));
        etki2=bilgisayar1.nesnesecimleri.get(secim2).etkiHesapla(bilgisayar.nesnesecimleri.get(secim1));
        Oyun.logger.info(bilgisayar.nesnesecimleri.get(secim1)+" nesnesinin verdiği etki : "+etki1);
        Oyun.logger.info(bilgisayar1.nesnesecimleri.get(secim2)+" nesnesinin verdiği etki : "+etki2);
        if (etki1<etki2){
            kazanan1=1;
        }
        if (etki2<etki1){
            kazanan=1;
        }
        bilgisayar.nesnesecimleri.get(secim1).durumGuncelle(etki2,kazanan1);
        bilgisayar1.nesnesecimleri.get(secim2).durumGuncelle(etki1,kazanan);
        Oyun.logger.info(bilgisayar.nesnesecimleri.get(secim1).getNesneismi()+" nesnesi puanları güncellendi.");
        Oyun.logger.info(bilgisayar1.nesnesecimleri.get(secim2).getNesneismi()+" nesnesi puanları güncellendi.");
        if (bilgisayar.nesnesecimleri.get(secim1).getSeviyepuani()>=30){
            if (bilgisayar.nesnesecimleri.get(secim1).getClass().getSimpleName().equals("Tas")){
                bilgisayar.nesnesecimleri.set(secim1,new Agir_Tas());
                Oyun.logger.info("Bilgisayar'ın Taş nesnesi Ağır Taş nesnesine terfi edildi.");
            }
            if (bilgisayar.nesnesecimleri.get(secim1).getClass().getSimpleName().equals("Kagit")){
                bilgisayar.nesnesecimleri.set(secim1,new Ozel_Kagit());
                Oyun.logger.info("Bilgisayar'ın Kağıt nesnesi Özel Kağıt nesnesine terfi edildi.");
            }
            if (bilgisayar.nesnesecimleri.get(secim1).getClass().getSimpleName().equals("Makas")){
                bilgisayar.nesnesecimleri.set(secim1,new Usta_Makas());
                Oyun.logger.info("Bilgisayar'ın Makas nesnesi Usta Makas nesnesine terfi edildi.");
            }
        }
        if (bilgisayar1.nesnesecimleri.get(secim2).getSeviyepuani()>=30){
            if (bilgisayar1.nesnesecimleri.get(secim2).getClass().getSimpleName().equals("Tas")){
                bilgisayar1.nesnesecimleri.set(secim2,new Agir_Tas());
                Oyun.logger.info("Bilgisayar1'in Taş nesnesi Ağır Taş nesnesine terfi edildi.");
            }
            if (bilgisayar1.nesnesecimleri.get(secim2).getClass().getSimpleName().equals("Kagit")){
                bilgisayar1.nesnesecimleri.set(secim2,new Ozel_Kagit());
                Oyun.logger.info("Bilgisayar1'in Kağıt nesnesi Özel Kağıt nesnesine terfi edildi.");
            }
            if (bilgisayar1.nesnesecimleri.get(secim2).getClass().getSimpleName().equals("Makas")){
                bilgisayar1.nesnesecimleri.set(secim2,new Usta_Makas());
                Oyun.logger.info("Bilgisayar1'in Makas nesnesi Usta Makas nesnesine terfi edildi.");
            }
        }
        if(bilgisayar.nesnesecimleri.get(secim1) instanceof Tas)
            SecimOyuncu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tas.png")));
        else if(bilgisayar.nesnesecimleri.get(secim1) instanceof Kagit)
            SecimOyuncu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kagıt.png")));
        else if(bilgisayar.nesnesecimleri.get(secim1) instanceof Makas)
            SecimOyuncu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/makas.png")));
        if(bilgisayar1.nesnesecimleri.get(secim2) instanceof Tas)
            SecimOyuncu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tas.png")));
        else if(bilgisayar1.nesnesecimleri.get(secim2) instanceof Kagit)
            SecimOyuncu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kagıt.png")));
        else if(bilgisayar1.nesnesecimleri.get(secim2) instanceof Makas)
            SecimOyuncu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/makas.png")));
        if (bilgisayar.nesnesecimleri.get(secim1).getDayaniklilik()<=0){
            Oyun.logger.info("Bilgisayar'ın "+bilgisayar.nesnesecimleri.get(secim1).getNesneismi()+" nesnesi silindi.");
            bilgisayar.nesnesecimleri.get(secim1).setDayaniklilik(0);
            bilgisayar.nesnesecimleri.remove(secim1);
        }
        if (bilgisayar1.nesnesecimleri.get(secim2).getDayaniklilik()<=0){
            Oyun.logger.info("Bilgisayar1'in "+bilgisayar1.nesnesecimleri.get(secim2).getNesneismi()+" nesnesi silindi.");
            bilgisayar1.nesnesecimleri.get(secim2).setDayaniklilik(0);
            bilgisayar1.nesnesecimleri.remove(secim2);
        }
        if (bilgisayar.nesnesecimleri.size()==0) {
            BitisEkrani bitis = new BitisEkrani(bilgisayar, bilgisayar1);
            bitis.setVisible(true);
            setVisible(false);
        }
        if (bilgisayar1.nesnesecimleri.size()==0) {
            BitisEkrani bitis = new BitisEkrani(bilgisayar, bilgisayar1);
            bitis.setVisible(true);
            setVisible(false);
        }
        if (hs==kontrol) {
            BitisEkrani bitis = new BitisEkrani(bilgisayar, bilgisayar1);
            bitis.setVisible(true);
            setVisible(false);
        }
        skor2=bilgisayar.skorGoster(bilgisayar.nesnesecimleri);
        skor1=bilgisayar1.skorGoster(bilgisayar1.nesnesecimleri);
        Skor1.setText(String.valueOf(skor2));
        Skor2.setText(String.valueOf(skor1));
        KalanNesne1.setText(String.valueOf(bilgisayar.nesnesecimleri.size()));
        jTextField1.setText(String.valueOf(bilgisayar1.nesnesecimleri.size()));
    }//GEN-LAST:event_OynaButtonActionPerformed

    private void Skor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Skor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Skor2ActionPerformed

    private void Skor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Skor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Skor1ActionPerformed

    private void KalanNesne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KalanNesne1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KalanNesne1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(OyunEkrani2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OyunEkrani2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OyunEkrani2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OyunEkrani2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OyunEkrani2(new Bilgisayar(),new Bilgisayar()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HamleSayısı;
    private javax.swing.JTextField KalanNesne1;
    private javax.swing.JButton OynaButton;
    private javax.swing.JLabel Oyuncu1Resim;
    private javax.swing.JLabel Oyuncu2Resim;
    private javax.swing.JLabel SecimOyuncu1;
    private javax.swing.JLabel SecimOyuncu2;
    private javax.swing.JTextField Skor1;
    private javax.swing.JTextField Skor2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}