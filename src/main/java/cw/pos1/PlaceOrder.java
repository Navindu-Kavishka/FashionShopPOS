/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cw.pos1;


import javax.swing.JOptionPane;

/**
 *
 * @author King
 */
public class PlaceOrder extends javax.swing.JFrame {

    /**
     * Creates new form PlaceOrder
     */
    public PlaceOrder() {
        initComponents();
        setLocationRelativeTo(this);
        
        genId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPO = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        LorderID = new javax.swing.JLabel();
        LcustID = new javax.swing.JLabel();
        Lsize = new javax.swing.JLabel();
        Lqty = new javax.swing.JLabel();
        Lamount = new javax.swing.JLabel();
        lblOrderId = new javax.swing.JLabel();
        txtCustID = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        txtQTY = new javax.swing.JTextField();
        LSizes = new javax.swing.JLabel();
        btnPlace = new javax.swing.JButton();
        lblAmount = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Place Order");

        pnlPO.setBackground(new java.awt.Color(204, 255, 255));

        btnBack.setBackground(new java.awt.Color(255, 51, 51));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        LorderID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LorderID.setText("Order ID :");

        LcustID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LcustID.setText("Customer ID :");
        LcustID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Lsize.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Lsize.setText("Size :");

        Lqty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Lqty.setText("QTY :");
        Lqty.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Lamount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Lamount.setText("Amount :");
        Lamount.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblOrderId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblOrderId.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblOrderIdAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtCustID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCustID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustIDActionPerformed(evt);
            }
        });
        txtCustID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCustIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustIDKeyReleased(evt);
            }
        });

        txtSize.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSizeActionPerformed(evt);
            }
        });

        txtQTY.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTYActionPerformed(evt);
            }
        });
        txtQTY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQTYKeyReleased(evt);
            }
        });

        LSizes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LSizes.setText("(XS/S/M/L/XL/XXL)");

        btnPlace.setBackground(new java.awt.Color(0, 204, 204));
        btnPlace.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnPlace.setForeground(new java.awt.Color(255, 255, 255));
        btnPlace.setText("Place");
        btnPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceActionPerformed(evt);
            }
        });

        lblAmount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnlPOLayout = new javax.swing.GroupLayout(pnlPO);
        pnlPO.setLayout(pnlPOLayout);
        pnlPOLayout.setHorizontalGroup(
            pnlPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPOLayout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlPOLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lsize, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlPOLayout.createSequentialGroup()
                            .addComponent(LorderID, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlPOLayout.createSequentialGroup()
                            .addComponent(LcustID, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtSize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlPOLayout.createSequentialGroup()
                            .addGroup(pnlPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Lqty, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lamount, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnlPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LSizes, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPOLayout.setVerticalGroup(
            pnlPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPOLayout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(pnlPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LorderID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(pnlPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCustID, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(LcustID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pnlPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPOLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(pnlPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSize)
                            .addComponent(Lsize, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlPOLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(LSizes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(44, 44, 44)
                .addGroup(pnlPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lqty, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQTY))
                .addGap(83, 83, 83)
                .addGroup(pnlPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lamount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPOLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPOLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPO, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static final double[] prices = {600.00, 800.00, 900.00, 1000.00, 1100.00, 1200.00};
    public static final String[] stat = {"Processing", "Delivering", "Delivered"};
    
    
    private void txtCustIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustIDActionPerformed
      txtSize.requestFocus();
        //txtSize.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustIDActionPerformed

    private void txtSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSizeActionPerformed
        txtQTY.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtSizeActionPerformed

    private void lblOrderIdAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblOrderIdAncestorAdded
          
    }//GEN-LAST:event_lblOrderIdAncestorAdded

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainMenu menu = new mainMenu();
        menu.setVisible(true);  
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtCustIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustIDKeyReleased
//        do {
//                
//        } while (txtCustID.getText().length()==10 && txtCustID.getText().startsWith("0"));
//             String err="Invalid Phone Number...";  
//             // TODO add your handling code here:
    }//GEN-LAST:event_txtCustIDKeyReleased

    private void btnPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceActionPerformed
        String orderID=lblOrderId.getText();
        String custID = txtCustID.getText();
        String inSize=txtSize.getText().toUpperCase();
        int inQty=Integer.parseInt(txtQTY.getText());
         if (custID.length()==10 && custID.startsWith("0")) {
             if (inSize.equalsIgnoreCase("XS")||inSize.equalsIgnoreCase("S")||inSize.equalsIgnoreCase("M")||inSize.equalsIgnoreCase("L")||inSize.equalsIgnoreCase("XL")||inSize.equalsIgnoreCase("XXL")) {
                 if (inQty>0) {
                     double amount=0;
                     switch (inSize) {
                    case "XS":
                        amount = prices[0] * inQty;
                        break;

                    case "S":
                        amount = prices[1] * inQty;
                        break;

                    case "M":
                        amount = prices[2] * inQty;
                        break;

                    case "L":
                        amount = prices[3] * inQty;
                        break;

                    case "XL":
                        amount = prices[4] * inQty;
                        break;

                    case "XXL":
                        amount = prices[5] * inQty;
                        break;
                     }
                            Order ord = new Order(orderID, custID, inSize, inQty, stat[0], amount);
                            mainMenu.OrderList.add(ord);
                            JOptionPane.showMessageDialog(this, "Order Placed...");
                            genId();
                            txtCustID.setText("");
                            txtSize.setText("");
                            txtQTY.setText("");
                            lblAmount.setText("");
                            
                            
                     
                 }else {
                     JOptionPane.showMessageDialog(this, "Invalid Qty...");
                 }
             }else{
                 JOptionPane.showMessageDialog(this, "Please Enter Valid Size...");
             }
         }else{
             JOptionPane.showMessageDialog(this, "Invalid Phone Number...");
         }
// TODO add your handling code here:
    }//GEN-LAST:event_btnPlaceActionPerformed

    private void txtCustIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustIDKeyPressed
                 if (txtCustID.getText().length()==10 && txtCustID.getText().startsWith("0")) {
                     
                 }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustIDKeyPressed

    private void txtQTYKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyReleased
        double tAmount=0;
        if (!txtQTY.getText().isEmpty()) {
            int qty=Integer.parseInt(txtQTY.getText());
            if (qty>0) {
                     switch (txtSize.getText().toUpperCase()) {
                    case "XS":
                        tAmount = prices[0] * qty;
                        break;

                    case "S":
                        tAmount = prices[1] * qty;
                        break;

                    case "M":
                        tAmount = prices[2] * qty;
                        break;

                    case "L":
                        tAmount = prices[3] * qty;
                        break;

                    case "XL":
                        tAmount = prices[4] * qty;
                        break;

                    case "XXL":
                        tAmount = prices[5] * qty;
                        break;
                     }
                     lblAmount.setText(String.format("%.2f", tAmount));
            }
        }else{
            lblAmount.setText("");
        }
    }//GEN-LAST:event_txtQTYKeyReleased

    private void txtQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTYActionPerformed
        btnPlace.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtQTYActionPerformed

    
    public void genId() {
        if (mainMenu.OrderList.size() > 0) {
            String id = mainMenu.OrderList.get(mainMenu.OrderList.size() - 1).getOrderId();
            int no = Integer.parseInt(id.split("[#]")[1]);
            no++;
            lblOrderId.setText( String.format("ORD#%05d", no));
        }else{
        lblOrderId.setText( "ORD#00001");
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrder().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LSizes;
    private javax.swing.JLabel Lamount;
    private javax.swing.JLabel LcustID;
    private javax.swing.JLabel LorderID;
    private javax.swing.JLabel Lqty;
    private javax.swing.JLabel Lsize;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPlace;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblOrderId;
    private javax.swing.JPanel pnlPO;
    private javax.swing.JTextField txtCustID;
    private javax.swing.JTextField txtQTY;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
}
