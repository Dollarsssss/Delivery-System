package Traingle;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JLabel;

public class JBigo3 extends javax.swing.JFrame {

        public JBigo3() {
        initComponents();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        ((DefaultTableCellRenderer) tarang.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        
        for (int i = 0; i < 2; i++) {
            tarang.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
            centerRenderer.setHorizontalAlignment( JLabel.CENTER );
            tarang.setDefaultRenderer(String.class, centerRenderer);
        }
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        senditem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tarang = new javax.swing.JTable();
        turnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SongKhong.exe");
        setResizable(false);

        senditem.setFont(new java.awt.Font("TH Baijam", 0, 36)); // NOI18N
        senditem.setText("ค่าขนส่ง");

        tarang.setBorder(new javax.swing.border.MatteBorder(null));
        tarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Double(0.1),  new Double(37.0)},
                { new Double(0.25),  new Double(42.0)},
                { new Double(0.5),  new Double(52.0)},
                { new Double(1.0),  new Double(65.0)},
                { new Double(2.0),  new Double(75.0)},
                { new Double(5.0),  new Double(92.0)},
                { new Double(10.0),  new Double(117.0)},
                { new Double(15.0),  new Double(193.0)},
                { new Double(20.0),  new Double(236.0)}
            },
            new String [] {
                "Weight(kg.)", "Songkhong(Bath)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tarang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tarang.setRowHeight(35);
        jScrollPane1.setViewportView(tarang);
        if (tarang.getColumnModel().getColumnCount() > 0) {
            tarang.getColumnModel().getColumn(0).setResizable(false);
            tarang.getColumnModel().getColumn(1).setResizable(false);
        }

        turnback.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(senditem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(turnback, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(senditem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(turnback)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(JBigo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JBigo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JBigo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JBigo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JBigo3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel senditem;
    private javax.swing.JTable tarang;
    private javax.swing.JButton turnback;
    // End of variables declaration//GEN-END:variables
}
