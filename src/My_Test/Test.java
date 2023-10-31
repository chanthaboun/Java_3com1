package My_Test;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Test extends javax.swing.JFrame {

    public Test() {
        initComponents();
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSale = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnCalculation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        jLabel1.setText("ຍອດຂາຍ:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 40));

        jLabel2.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        jLabel2.setText("ຊື່ພະນັກງານ:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        jLabel3.setText("ເງີນເດືອນ:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 40));

        txtSale.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        txtSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaleActionPerformed(evt);
            }
        });
        txtSale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaleKeyTyped(evt);
            }
        });
        jPanel1.add(txtSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 200, -1));

        txtName.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 200, -1));

        txtSalary.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        txtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalaryKeyTyped(evt);
            }
        });
        jPanel1.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 200, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        jButton1.setText("ຍົກເລີກ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        btnCalculation.setBackground(new java.awt.Color(0, 204, 51));
        btnCalculation.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        btnCalculation.setText("ຄຳນວນ");
        btnCalculation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculationActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalculation, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCalculationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalculationActionPerformed

    private void txtSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaleActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    
    private void txtSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyTyped

        char pree = evt.getKeyChar(); // ໃຊ້ເພື່ອດຶງອັກສອນທີ່ພິມລະຫວ່າງເຫດການສະເພາະ
    if(!(Character.isDigit(pree) || pree == KeyEvent.VK_BACK_SPACE || pree == KeyEvent.VK_ENTER)){
        String message = "<html><h3 style=\" font-family: Saysettha OT; font-weight: none\">ກະລຸນາປ້ອນຕົວເລກເທົ່ານັ້ນ</h3></html>";
        JOptionPane.showMessageDialog(rootPane, message,"error",JOptionPane.ERROR_MESSAGE);
        getToolkit().beep();  // ເຮັດໜ້າທີ່ສົ່ງສຽງດັງ ດິງໆໆ....
        evt.consume(); // ປ້ອງກັນອັກສອນທີ່ພິມລົງໃນບ໋ອກ
    }
    
    // ເຮັດໜ້າທີ່ໃນການກວດສອບອັກສອນທີ່ພິມເປັນ Enter ຫຼື ບໍ່ ຖ້າແມ່ນຈະສະລັບໄປຫາ txtSale
    if(pree == KeyEvent.VK_ENTER) {
        txtSale.requestFocus();
    }
    
    }//GEN-LAST:event_txtSalaryKeyTyped

    private void txtSaleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaleKeyTyped
           char newpree = evt.getKeyChar();
    if(!(Character.isDigit(newpree) || newpree == KeyEvent.VK_BACK_SPACE || newpree == KeyEvent.VK_ENTER)){
        String message = "<html><h3 style=\" font-family: Saysettha OT; font-weight: none\">ກະລຸນາປ້ອນຕົວເລກເທົ່ານັ້ນ</h3></html>";
        JOptionPane.showMessageDialog(rootPane, message,"error",JOptionPane.ERROR_MESSAGE);
        getToolkit().beep();  // ເຮັດໜ້າທີ່ສົ່ງສຽງດັງ ດິງໆໆ....
        evt.consume(); // ປ້ອງກັນອັກສອນທີ່ພິມລົງໃນບ໋ອກ
    }
    
    // ເຮັດໜ້າທີ່ໃນການກວດສອບອັກສອນທີ່ພິມເປັນ Enter ຫຼື ບໍ່ ຖ້າແມ່ນຈະສະລັບໄປຫາ btnCalculation
    if(newpree == KeyEvent.VK_ENTER) {
        btnCalculation.doClick();
    }
    }//GEN-LAST:event_txtSaleKeyTyped

    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculation;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSale;
    // End of variables declaration//GEN-END:variables
}
