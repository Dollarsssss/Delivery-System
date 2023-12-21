package Traingle;
import java.util.Random;

public class JBigo2 extends javax.swing.JFrame {
    public JBigo2() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        About = new javax.swing.JButton();
        senditem = new javax.swing.JButton();
        transport = new javax.swing.JButton();
        contact = new javax.swing.JButton();
        tidtam = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        judpai = new javax.swing.JButton();
        turnbacktologin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SongKhong.exe");
        setResizable(false);

        About.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        About.setText("เกี่ยวกับเรา");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });

        senditem.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        senditem.setText("เรียกส่งพัสดุ");
        senditem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senditemActionPerformed(evt);
            }
        });

        transport.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        transport.setText("ค่าขนส่ง");
        transport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportActionPerformed(evt);
            }
        });

        contact.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        contact.setText("ติดต่อเรา");
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });

        tidtam.setFont(new java.awt.Font("TH Baijam", 1, 56)); // NOI18N
        tidtam.setText("ติดตามพัสดุ");

        jTextField1.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        judpai.setFont(new java.awt.Font("TH Baijam", 1, 24)); // NOI18N
        judpai.setText("จัดไป");
        judpai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judpaiActionPerformed(evt);
            }
        });

        turnbacktologin.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
        turnbacktologin.setText("กลับเข้าสู่หน้าล็อกอิน");
        turnbacktologin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnbacktologinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(About, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(transport, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(senditem, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(judpai, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(tidtam)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(turnbacktologin)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(About)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transport)
                    .addComponent(senditem))
                .addGap(78, 78, 78)
                .addComponent(tidtam, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(judpai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(turnbacktologin)
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        //link page 4
        JBigo4 JB4 = new JBigo4(); 
        dispose();
        JB4.setVisible(true);
    }//GEN-LAST:event_AboutActionPerformed

    private void senditemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senditemActionPerformed
       //link page 7
        JBigo7 JB7 = new JBigo7();
        dispose();
        JB7.setVisible(true);
    }//GEN-LAST:event_senditemActionPerformed

    private void transportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportActionPerformed
        //link page3
        JBigo3 JB3 = new JBigo3();
        dispose();
        JB3.setVisible(true);
    }//GEN-LAST:event_transportActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        //link page 5
        JBigo5 JB5 = new JBigo5();
        dispose();
        JB5.setVisible(true);        
    }//GEN-LAST:event_contactActionPerformed

    private void judpaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judpaiActionPerformed
        String a = jTextField1.getText();
        if(a.equalsIgnoreCase("TH123456789")){
        dispose();
        new JBigo6(a).setVisible(true);}
    }//GEN-LAST:event_judpaiActionPerformed

    private void turnbacktologinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnbacktologinActionPerformed
        JBigo1 JB1 = new JBigo1();
        dispose();
        JB1.setVisible(true);       
    }//GEN-LAST:event_turnbacktologinActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
                
    }//GEN-LAST:event_jTextField1ActionPerformed
     public static void main(String args[]) {
       
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JBigo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JBigo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JBigo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JBigo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JBigo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About;
    private javax.swing.JButton contact;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton judpai;
    private javax.swing.JButton senditem;
    private javax.swing.JLabel tidtam;
    private javax.swing.JButton transport;
    private javax.swing.JButton turnbacktologin;
    // End of variables declaration//GEN-END:variables
}
