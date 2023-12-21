package Traingle;

public class JBigo5 extends javax.swing.JFrame {

   
    public JBigo5() {
        initComponents();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contect1 = new javax.swing.JLabel();
        facebook = new javax.swing.JLabel();
        call = new javax.swing.JLabel();
        location = new javax.swing.JLabel();
        turnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SongKhong.exe");
        setResizable(false);

        contect1.setFont(new java.awt.Font("TH Baijam", 1, 36)); // NOI18N
        contect1.setText("ติดต่อเรา...");

        facebook.setFont(new java.awt.Font("TH Baijam", 1, 24)); // NOI18N
        facebook.setText("Facebook: SongkhongTH");

        call.setFont(new java.awt.Font("TH Baijam", 1, 24)); // NOI18N
        call.setText("เบอร์ติดต่อ: 011-111-1111");

        location.setFont(new java.awt.Font("TH Baijam", 1, 24)); // NOI18N
        location.setText("ที่อยู่: มหาวิทยาลัยรังสิต");

        turnback.setFont(new java.awt.Font("TH Baijam", 1, 18)); // NOI18N
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
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(call)
                            .addComponent(facebook)
                            .addComponent(location)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(contect1)))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(turnback, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(contect1)
                .addGap(18, 18, 18)
                .addComponent(facebook)
                .addGap(26, 26, 26)
                .addComponent(call)
                .addGap(18, 18, 18)
                .addComponent(location)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(turnback)
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
            java.util.logging.Logger.getLogger(JBigo5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JBigo5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JBigo5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JBigo5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JBigo5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel call;
    private javax.swing.JLabel contect1;
    private javax.swing.JLabel facebook;
    private javax.swing.JLabel location;
    private javax.swing.JButton turnback;
    // End of variables declaration//GEN-END:variables
}
