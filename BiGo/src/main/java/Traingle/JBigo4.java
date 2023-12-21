package Traingle;


public class JBigo4 extends javax.swing.JFrame {

       public JBigo4() {
        initComponents();
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        About = new javax.swing.JLabel();
        history1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        history2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        history3 = new javax.swing.JLabel();
        turnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SongKhong.exe");
        setResizable(false);

        About.setFont(new java.awt.Font("TH Baijam", 1, 48)); // NOI18N
        About.setText("เกี่ยวกับเรา");

        history1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        history1.setText("Songkhong ก่อตั้งเมือวันที่ 22 พฤศจิกายน พ.ศ.2558 เราคือบริการออนไลน์ที่เชื่อมโยงขนส่งมาไว้ในระบบเดียว เรามุ่งหวังที่จะเชื่อมต่อขนส่งที่ดีที่สุดทั่วโลก");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("ง่ายต่อการเชื่อมต่อและเลือกใช้บริการที่หลากหลาย");

        history2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        history2.setText("ช่วยให้ผู้ประกอบการ และ พ่อค้าแม่ค้าออนไลน์หรือใครก็ตามที่ต้องการส่งของ สามารถทำได้ง่ายยิ่งขึ้น สะดวก รวดเร็ว ใช้ได้ทุกทีทุกเวลา");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("ไม่ว่าจะส่งในประเทศ หรือ ส่งออกต่างประเทศ ");

        history3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        history3.setText("และช่วยลดต้นทุนในการส่งของคุณ รวมถึงไว้วางใจได้ด้วยระบบติดตามสินค้าที่สามารถตรวจสอบได้ทุกขั้นตอนของการส่ง");

        turnback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        turnback.setText("กลับ");
        turnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(About))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(history2)))
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(history1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(history3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(turnback, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(About)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(history1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(history2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(history3))
                .addGap(26, 26, 26)
                .addComponent(turnback, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void turnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnbackActionPerformed
        JBigo2 JB2 = new JBigo2();
        dispose();
        JB2.setVisible(true);
    }//GEN-LAST:event_turnbackActionPerformed
    public static void main(String args[]) {
       
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JBigo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JBigo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JBigo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JBigo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JBigo4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel About;
    private javax.swing.JLabel history1;
    private javax.swing.JLabel history2;
    private javax.swing.JLabel history3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton turnback;
    // End of variables declaration//GEN-END:variables
}
