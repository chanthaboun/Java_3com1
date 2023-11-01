package My_Test;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Test extends javax.swing.JFrame {

    public Test() {
        initComponents();
        setTitle("Bonus calculation program");
        this.setLocationRelativeTo(this); // ເປັນການຕັ້ງຄ່າໜ້າຕາຂອງ GUI
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
        btnCancle = new javax.swing.JButton();
        btnCalculation = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDisplay = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        jLabel1.setText("ສະແດງຜົນ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, 40));

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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSaleKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaleKeyTyped(evt);
            }
        });
        jPanel1.add(txtSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 200, -1));

        txtName.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 200, -1));

        txtSalary.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        txtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSalaryKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalaryKeyTyped(evt);
            }
        });
        jPanel1.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 200, -1));

        btnCancle.setBackground(new java.awt.Color(255, 0, 0));
        btnCancle.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        btnCancle.setText("ຍົກເລີກ");
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancle, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        btnCalculation.setBackground(new java.awt.Color(0, 204, 51));
        btnCalculation.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        btnCalculation.setText("ຄຳນວນ");
        btnCalculation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculationActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalculation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        txtDisplay.setColumns(20);
        txtDisplay.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        txtDisplay.setRows(5);
        jScrollPane1.setViewportView(txtDisplay);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 260, 190));

        jLabel4.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        jLabel4.setText("ຍອດຂາຍ:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        String message = "<html><h3 style=\" font-family: Saysettha OT; font-weight: none\">ທ່ານຕ້ອງການຍົກເລີກແທ້ ຫຼື ບໍ່</h3></html>";
        double data = JOptionPane.showConfirmDialog(rootPane, message, "ຢືນຢັນ", JOptionPane.OK_CANCEL_OPTION);

        System.out.println("console: " + data);

        // still don't understand
        if (data != 0) {
            return;
        }
        txtName.setText("");
        txtSalary.setText("");
        txtSale.setText("");
        txtDisplay.setText("");
    }//GEN-LAST:event_btnCancleActionPerformed

    private void btnCalculationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculationActionPerformed

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

        // ຄິດໄລ່ຄ່າໂບນັສ ແລະ ເງິນລວມ
        double bonus = salary * percent / 100;
        double total = salary + bonus;

        DecimalFormat df = new DecimalFormat("#,###.###");

        String display = "ຊື່ພະນັກງານ: " + name + "\n"
                + "ເງີນເດືອນ: " + df.format(salary) + "ກີບ\n"
                + "ຍອດຂາຍ: " + percent + "%: " + df.format(sale) + "ກິບ\n"
                + "ໂບນັດ: " + percent + "%: " + df.format(bonus) + "ກິບ\n"
                + "ລວມເງິນ: " + df.format(total) + "ກິບ";

        txtDisplay.setText(display);
      
    }//GEN-LAST:event_btnCalculationActionPerformed

    private void txtSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaleActionPerformed


    private void txtSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyTyped

        char pree = evt.getKeyChar(); // ໃຊ້ເພື່ອດຶງອັກສອນທີ່ພິມລະຫວ່າງເຫດການສະເພາະ
        if (!(Character.isDigit(pree) || pree == KeyEvent.VK_BACK_SPACE || pree == KeyEvent.VK_ENTER)) {
            String message = "<html><h3 style=\" font-family: Saysettha OT; font-weight: none\">ກະລຸນາປ້ອນຕົວເລກເທົ່ານັ້ນ</h3></html>";
            JOptionPane.showMessageDialog(rootPane, message, "error", JOptionPane.ERROR_MESSAGE);
            getToolkit().beep();  // ເຮັດໜ້າທີ່ສົ່ງສຽງດັງ ດິງໆໆ....
            evt.consume(); // ປ້ອງກັນອັກສອນທີ່ພິມລົງໃນບ໋ອກ
        }

        // ເຮັດໜ້າທີ່ໃນການກວດສອບອັກສອນທີ່ພິມເປັນ Enter ຫຼື ບໍ່ ຖ້າແມ່ນຈະສະລັບໄປຫາ txtSale
        if (pree == KeyEvent.VK_ENTER) {
            txtSale.requestFocus();
        }

    }//GEN-LAST:event_txtSalaryKeyTyped

    private void txtSaleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaleKeyTyped
        char newpree = evt.getKeyChar();
        if (!(Character.isDigit(newpree) || newpree == KeyEvent.VK_BACK_SPACE || newpree == KeyEvent.VK_ENTER)) {
            String message = "<html><h3 style=\" font-family: Saysettha OT; font-weight: none\">ກະລຸນາປ້ອນຕົວເລກເທົ່ານັ້ນ</h3></html>";
            JOptionPane.showMessageDialog(rootPane, message, "error", JOptionPane.ERROR_MESSAGE);
            getToolkit().beep();  // ເຮັດໜ້າທີ່ສົ່ງສຽງດັງ ດິງໆໆ....
            evt.consume(); // ປ້ອງກັນອັກສອນທີ່ພິມລົງໃນບ໋ອກ
        }

        // ເຮັດໜ້າທີ່ໃນການກວດສອບອັກສອນທີ່ພິມເປັນ Enter ຫຼື ບໍ່ ຖ້າແມ່ນຈະສະລັບໄປຫາ btnCalculation
        if (newpree == KeyEvent.VK_ENTER) {
            btnCalculation.doClick();
        }
    }//GEN-LAST:event_txtSaleKeyTyped

    private void txtSalaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyReleased

        // ກວດສອບກໍລະນີບໍ່ມີຄ່າ
        if (txtSalary.getText().equals("")) {
            return;
        }

        txtSalary.setText(NumberComma.stringPaserCommafy(txtSalary.getText().replace(",", "")));
    }//GEN-LAST:event_txtSalaryKeyReleased

    private void txtSaleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaleKeyReleased
        // ພາກສວ່ນຂອງການແປງເລກໃຫ້ຈຳນວນຍອດຂາຍ
        if (txtSale.getText().equals("")) {
            return;
        }
        txtSale.setText(NumberComma.stringPaserCommafy(txtSale.getText().replace(",", "")));
    }//GEN-LAST:event_txtSaleKeyReleased

    
    // ຟັງເຊີນການEnter ແລ້ວໄປຫາ txtSalary 
    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
       char preeN = evt.getKeyChar();
         if (preeN == KeyEvent.VK_ENTER) {
            txtSalary.requestFocus();
        }

    }//GEN-LAST:event_txtNameKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculation;
    private javax.swing.JButton btnCancle;
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
