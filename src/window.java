/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dense
 */
public class window extends javax.swing.JFrame {

    /**
     * Creates new form window
     */
    public window() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        value1 = new javax.swing.JTextField();
        value2 = new javax.swing.JTextField();
        value3 = new javax.swing.JTextField();
        SIEnhed1 = new javax.swing.JLabel();
        SIEnhed2 = new javax.swing.JLabel();
        SIEnhed3 = new javax.swing.JLabel();
        unitLabel1 = new javax.swing.JLabel();
        unitLabel2 = new javax.swing.JLabel();
        unitLabel3 = new javax.swing.JLabel();
        unitSelect1 = new javax.swing.JComboBox<>();
        unitSelect2 = new javax.swing.JComboBox<>();
        unitSelect3 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formelsamling");
        setBackground(new java.awt.Color(255, 204, 51));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setBackground(new java.awt.Color(110, 136, 153));
        jList1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jList1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setAlignmentX(10.0F);
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 460));

        jPanel2.setBackground(new java.awt.Color(110, 136, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        value1.setBackground(new java.awt.Color(110, 136, 153));
        value1.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        value1.setText("1000");
        value1.setBorder(null);
        value1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value1ActionPerformed(evt);
            }
        });

        value2.setBackground(new java.awt.Color(110, 136, 153));
        value2.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        value2.setText("1000");
        value2.setBorder(null);
        value2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value2ActionPerformed(evt);
            }
        });

        value3.setBackground(new java.awt.Color(110, 136, 153));
        value3.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        value3.setText("1000");
        value3.setBorder(null);
        value3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value3ActionPerformed(evt);
            }
        });

        SIEnhed1.setBackground(new java.awt.Color(187, 187, 187));
        SIEnhed1.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        SIEnhed1.setText("Energi [J]");

        SIEnhed2.setBackground(new java.awt.Color(187, 187, 187));
        SIEnhed2.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        SIEnhed2.setText("Masse [J]");

        SIEnhed3.setBackground(new java.awt.Color(187, 187, 187));
        SIEnhed3.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        SIEnhed3.setText("Lysets hastighed [J]");

        unitLabel1.setBackground(new java.awt.Color(187, 187, 187));
        unitLabel1.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        unitLabel1.setText("e =");

        unitLabel2.setBackground(new java.awt.Color(187, 187, 187));
        unitLabel2.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        unitLabel2.setText("m =");

        unitLabel3.setBackground(new java.awt.Color(187, 187, 187));
        unitLabel3.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        unitLabel3.setText("c =");

        unitSelect1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        unitSelect2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        unitSelect3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(30, 30, 30)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(SIEnhed3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(unitLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(value3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(unitSelect3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(SIEnhed2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(unitLabel2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(value2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(SIEnhed1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(unitLabel1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(value1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(unitSelect1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(unitSelect2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(63, 63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(50, 50, 50)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(value1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(SIEnhed1)
                    .add(unitLabel1)
                    .add(unitSelect1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(30, 30, 30)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(SIEnhed2)
                    .add(unitLabel2)
                    .add(value2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(unitSelect2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(30, 30, 30)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(value3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(SIEnhed3)
                    .add(unitLabel3)
                    .add(unitSelect3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 470, 250));

        jPanel3.setBackground(new java.awt.Color(110, 136, 153));

        jPanel1.setBackground(new java.awt.Color(110, 136, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jEditorPane1.setBackground(new java.awt.Color(110, 136, 153));
        jEditorPane1.setBorder(null);
        jEditorPane1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(jEditorPane1);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(187, 187, 187));
        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel1.setText("Beregn");

        jLabel2.setBackground(new java.awt.Color(187, 187, 187));
        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel2.setText("Formel");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(jLabel1)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(13, 13, 13)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel1)
                .addContainerGap(301, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void value1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_value1ActionPerformed

    private void value2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_value2ActionPerformed

    private void value3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_value3ActionPerformed

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
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SIEnhed1;
    private javax.swing.JLabel SIEnhed2;
    private javax.swing.JLabel SIEnhed3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel unitLabel1;
    private javax.swing.JLabel unitLabel2;
    private javax.swing.JLabel unitLabel3;
    private javax.swing.JComboBox<String> unitSelect1;
    private javax.swing.JComboBox<String> unitSelect2;
    private javax.swing.JComboBox<String> unitSelect3;
    private javax.swing.JTextField value1;
    private javax.swing.JTextField value2;
    private javax.swing.JTextField value3;
    // End of variables declaration//GEN-END:variables
}
