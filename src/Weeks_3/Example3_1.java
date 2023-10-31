package Weeks_3;

import java.awt.event.KeyEvent; // ຈັດການເຫດການຂອງແປ້ນພີມ
import java.text.DecimalFormat; // 
import javax.swing.JOptionPane; // ເຮັດໜ້າທີ່ໃນກ່ອງໂຕ້ຕອບ

public class Example3_1 extends javax.swing.JFrame {

    // ພາກສວ່ນຂອງການແປງຫົວຂໍ້ເວັບ ແລະ ຈັດຂໍ້ຄວາມໃຫ້ຢູ່ໃນເຄິ່ງກາງ
    public Example3_1() { 
        initComponents();
        setTitle("ໂປຮແກຮມຄິດໄລ່ໂບນັສ");
        this.setLocationRelativeTo(this);// display modirator ເປັນການແປງຊື່ເວັບຂອງເຮົາ
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        txtSale = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnDisplay = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDisplay = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel1.setText("ໍຊື່ພະນັກງານ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 46, -1, -1));

        jLabel2.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel2.setText("ສະແດງຜົນ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 317, -1, -1));

        jLabel3.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel3.setText("ເງິນເດືອນພື້ນຖານ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 104, 76, 39));

        jLabel4.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel4.setText("ຍອດຂາຍ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 179, 59, -1));

        txtSalary.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });
        txtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSalaryKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalaryKeyTyped(evt);
            }
        });
        jPanel1.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 110, 189, -1));

        txtSale.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtSale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSaleKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaleKeyTyped(evt);
            }
        });
        jPanel1.add(txtSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 178, 189, -1));

        txtName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 45, 189, -1));

        btnDisplay.setBackground(new java.awt.Color(0, 255, 153));
        btnDisplay.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnDisplay.setForeground(new java.awt.Color(51, 51, 0));
        btnDisplay.setText("ຄຳນວນ");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });
        jPanel1.add(btnDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 266, 78, -1));

        btnCancel.setBackground(new java.awt.Color(255, 51, 51));
        btnCancel.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(51, 51, 0));
        btnCancel.setText("ຍົກເລີກ");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 266, -1, -1));

        txtDisplay.setColumns(20);
        txtDisplay.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        txtDisplay.setRows(5);
        jScrollPane1.setViewportView(txtDisplay);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 348, 295, 177));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ພາກສ່ວນຂອງການຈັດການເຫດການໃນແປ້ນພີມ
    // 
    private void txtSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_ENTER)) {
            String msg = "<html><h3 style=\" font-family: Saysettha OT; font-weight: none\">ກະລຸນາປ້ອນຕົວເລກເທົ່ານັ້ນ</h3></html>";
            JOptionPane.showMessageDialog(rootPane, msg, "error", JOptionPane.ERROR_MESSAGE);
            getToolkit().beep();
            evt.consume();
        }

        //if pree Enter let cursor goto Sale 
        if (c == KeyEvent.VK_ENTER) {
            txtSale.requestFocus();
        }


    }//GEN-LAST:event_txtSalaryKeyTyped


    private void txtSaleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaleKeyTyped
        char b = evt.getKeyChar();
        if (!(Character.isDigit(b) || b == KeyEvent.VK_BACK_SPACE || b == KeyEvent.VK_ENTER)) {
            String msg = "<html><h3 style=\" font-family: Saysettha OT; font-weight: none\">ກະລຸນາປ້ອນຕົວເລກເທົ່ານັ້ນ</h3></html>";
            JOptionPane.showMessageDialog(rootPane, msg, "error", JOptionPane.ERROR_MESSAGE);
            getToolkit().beep();
            evt.consume();
        }

        //if pree Enter let cursor goto Sale
        if (b == KeyEvent.VK_ENTER) {
            btnDisplay.doClick();
        }
    }//GEN-LAST:event_txtSaleKeyTyped

    
    
//    ພາກສວ່ນຂອງການແປງເລກໃຫ້ຈຳນວນເງິນເດືອນພື້ນຖານ
    private void txtSalaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyReleased
        // TODO add your handling code here: ກວດສອບກໍລະນີບໍ່ມີຄ່າ
        if (txtSalary.getText().equals("")) {
            return;
        }
        txtSalary.setText(NumberComma.stringPaserCommafy(txtSalary.getText().replace(",", "")));
    }//GEN-LAST:event_txtSalaryKeyReleased

    // ພາກສວ່ນຂອງການແປງເລກໃຫ້ຈຳນວນຍອດຂາຍ
    private void txtSaleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaleKeyReleased
        if (txtSale.getText().equals("")) {
            return;
        }
        txtSale.setText(NumberComma.stringPaserCommafy(txtSale.getText().replace(",", "")));
    }//GEN-LAST:event_txtSaleKeyReleased

    
    
    
//    ພາກສວ່ນຂອງການຈັດການເຮັດໃຫ້ເຮົາປ້ອນຄ່າທີ່ box 
    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        // ກວດສອບຟອມວ່າປ້ອນຂໍ້ມູນຄົບຫຼືບໍ່
        if (txtName.getText().equals("") || txtSalary.getText().equals("") || txtSale.getText().equals("")) {
            String msg = "<html><h3 style=\" font-family: Saysettha OT; font-weight: none\">ກະລຸນາປ້ອນຂໍ້ມູນໃຫ້ຄົບຖ້ວນ</h3></html>";
            JOptionPane.showMessageDialog(rootPane, msg, "error", JOptionPane.ERROR_MESSAGE);
            return; // stop process
        }

        // ຮັບຄ່າຈາກສິ່ງທີ່ເຮົາປ້ອນ
        String name = txtName.getText();
        double salary = Double.parseDouble(txtSalary.getText().replace(",", ""));
        double sale = Double.parseDouble(txtSale.getText().replace(",", ""));
        int percent;

        if (sale <= 100000) {
            percent = 1;
        } else if (sale <= 200000) {
            percent = 2;
        } else if (sale <= 300000) {
            percent = 3;
        } else {
            percent = 4;
        }

        double bonus = salary * percent / 100;
        double total = salary + bonus;

        DecimalFormat df = new DecimalFormat("#,###.##");

        String display = "ຊື່ພະນັກງານ: " + name + "\n"
                + "ເງີນເດືອນ: " + df.format(salary) + "ກີບ\n"
                + "ຍອດຂາຍ: " + percent + "%: " + df.format(sale) + "ກິບ\n"
                + "ໂບນັດ: " + percent + "%: " + df.format(bonus) + "ກິບ\n"
                + "ລວມເງິນ: " + df.format(total) + "ກິບ";

        txtDisplay.setText(display);
    }//GEN-LAST:event_btnDisplayActionPerformed

    
    // ເປັນການຍົກເລີກ
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        String msg = "<html><h3 style=\" font-family: Saysettha OT; font-weight: none\">ທ່ານຕ້ອງການຍົກເລີກແທ້ ຫຼື ບໍ່</h3></html>";
          int data = JOptionPane.showConfirmDialog(rootPane, msg, "ຢືນຢັນ", JOptionPane.OK_CANCEL_OPTION);
          
          if(data != 0) {
              return;
          }
          txtName.setText("");
          txtSalary.setText("");
          txtSale.setText("");
          txtDisplay.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Example3_1().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDisplay;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSale;
    // End of variables declaration//GEN-END:variables
}
