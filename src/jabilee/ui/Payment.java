package jabilee.ui;

import font.Fonts;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Payment extends javax.swing.JFrame {

    private JTextArea _txtReceipt;
    private JabileeUI window;
    private double amount;
    
    public Payment(JTextArea txtReceipt, JabileeUI window) {
        
        this._txtReceipt = txtReceipt;
        this.window = window;
        
        initComponents();
        initNumbers();
        initReceipt();
        setLocationRelativeTo(null);
        txtNum.requestFocus();
    }
    
    public Payment() { }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    	ImageIcon image = new ImageIcon(getClass().getResource("/resources/logo.png"));
        setIconImage(image.getImage());
    	
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReceipt = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        btnRemove = new javax.swing.JButton();
        panelNum = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnPeriod = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn00 = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        panelBg = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jabilee Cashier");
        setMinimumSize(new java.awt.Dimension(700, 570));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(null);

        txtReceipt.setEditable(false);
        txtReceipt.setBackground(new java.awt.Color(255, 255, 255));
        txtReceipt.setColumns(20);
        txtReceipt.setFont(Fonts.getReceiptFont(10));
        txtReceipt.setRows(5);
        txtReceipt.setTabSize(4);
        txtReceipt.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jScrollPane1.setViewportView(txtReceipt);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(14, 63, 292, 408);

        jPanel2.setBackground(new java.awt.Color(249, 243, 243));

        jLabel3.setBackground(new java.awt.Color(55, 55, 55));
        jLabel3.setFont(Fonts.getJelleeFont(18)
        );
        jLabel3.setText("Receipt");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(15, 20, 290, 45);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 320, 490);

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(249, 243, 243));

        jLabel4.setBackground(new java.awt.Color(55, 55, 55));
        jLabel4.setFont(Fonts.getJelleeFont(18)
        );
        jLabel4.setText("Payment");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 280, 45);

        jLabel1.setFont(Fonts.getJelleeFont(18)
        );
        jLabel1.setText("Total");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(30, 90, 70, 30);

        jLabel2.setFont(Fonts.getJelleeFont(20)
        );
        jLabel2.setText("P");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(120, 90, 30, 30);

        lblTotal.setFont(Fonts.getJelleeFont(20)
        );
        lblTotal.setForeground(new java.awt.Color(255, 0, 0));
        lblTotal.setText("000");
        jPanel3.add(lblTotal);
        lblTotal.setBounds(170, 90, 70, 30);

        txtNum.setEditable(false);
        txtNum.setFont(Fonts.getJelleeFont(14)
        );
        txtNum.setForeground(new java.awt.Color(48, 48, 48));
        txtNum.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumKeyReleased(evt);
            }
        });
        jPanel3.add(txtNum);
        txtNum.setBounds(30, 140, 145, 40);

        btnRemove.setBackground(new java.awt.Color(255, 255, 255));
        btnRemove.setFont(Fonts.getJelleeFont(16)
        );
        btnRemove.setForeground(new java.awt.Color(48, 48, 48));
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backspace.png"))); // NOI18N
        btnRemove.setBorder(null);
        btnRemove.setBorderPainted(false);
        btnRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel3.add(btnRemove);
        btnRemove.setBounds(177, 140, 72, 40);

        panelNum.setOpaque(false);
        panelNum.setLayout(new java.awt.GridLayout(4, 3, 1, 1));

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(Fonts.getJelleeFont(16)
        );
        btn7.setForeground(new java.awt.Color(48, 48, 48));
        btn7.setText("7");
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelNum.add(btn7);

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(Fonts.getJelleeFont(16)
        );
        btn8.setForeground(new java.awt.Color(48, 48, 48));
        btn8.setText("8");
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelNum.add(btn8);

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(Fonts.getJelleeFont(16)
        );
        btn9.setForeground(new java.awt.Color(48, 48, 48));
        btn9.setText("9");
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelNum.add(btn9);

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(Fonts.getJelleeFont(16)
        );
        btn4.setForeground(new java.awt.Color(48, 48, 48));
        btn4.setText("4");
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelNum.add(btn4);

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(Fonts.getJelleeFont(16)
        );
        btn5.setForeground(new java.awt.Color(48, 48, 48));
        btn5.setText("5");
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelNum.add(btn5);

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(Fonts.getJelleeFont(16)
        );
        btn6.setForeground(new java.awt.Color(48, 48, 48));
        btn6.setText("6");
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelNum.add(btn6);

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(Fonts.getJelleeFont(16)
        );
        btn1.setForeground(new java.awt.Color(48, 48, 48));
        btn1.setText("1");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelNum.add(btn1);

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(Fonts.getJelleeFont(16)
        );
        btn2.setForeground(new java.awt.Color(48, 48, 48));
        btn2.setText("2");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelNum.add(btn2);

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(Fonts.getJelleeFont(16)
        );
        btn3.setForeground(new java.awt.Color(48, 48, 48));
        btn3.setText("3");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelNum.add(btn3);

        btnPeriod.setBackground(new java.awt.Color(255, 255, 255));
        btnPeriod.setFont(Fonts.getJelleeFont(16)
        );
        btnPeriod.setForeground(new java.awt.Color(48, 48, 48));
        btnPeriod.setText(".");
        btnPeriod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelNum.add(btnPeriod);

        btn0.setBackground(new java.awt.Color(255, 255, 255));
        btn0.setFont(Fonts.getJelleeFont(16)
        );
        btn0.setForeground(new java.awt.Color(48, 48, 48));
        btn0.setText("0");
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelNum.add(btn0);

        btn00.setBackground(new java.awt.Color(255, 255, 255));
        btn00.setFont(Fonts.getJelleeFont(16)
        );
        btn00.setForeground(new java.awt.Color(48, 48, 48));
        btn00.setText("00");
        btn00.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelNum.add(btn00);

        jPanel3.add(panelNum);
        panelNum.setBounds(30, 190, 220, 210);

        btnPay.setBackground(new java.awt.Color(0, 0, 0));
        btnPay.setFont(Fonts.getJelleeFont(14)
        );
        btnPay.setForeground(new java.awt.Color(255, 255, 255));
        btnPay.setText("PAY");
        btnPay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPay.setFocusPainted(false);
        btnPay.setFocusable(false);
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        jPanel3.add(btnPay);
        btnPay.setBounds(30, 403, 220, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(380, 40, 280, 470);

        panelBg.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelBgLayout = new javax.swing.GroupLayout(panelBg);
        panelBg.setLayout(panelBgLayout);
        panelBgLayout.setHorizontalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        panelBgLayout.setVerticalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        getContentPane().add(panelBg);
        panelBg.setBounds(0, 0, 730, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initNumbers() {
        
        // Add event listener to every buttons in the panelNum 
        Arrays.stream(panelNum.getComponents())
              .filter(c -> c instanceof JButton)
              .map(c -> (JButton) c)
              .forEach(btn -> btn.addActionListener(e -> numberClick(btn.getText())));
    }
    
    private void initReceipt() {
        
        txtReceipt.setText(_txtReceipt.getText());
        lblTotal.setText(window.getTotal() + "");
    }
    
    private void validatePay() {
        
        if (!isPaySufficient()) {
            JOptionPane.showMessageDialog(null, "Insufficient amount!", "Transaction unsuccessful", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        insertPaymentDetails();
        Printer printer = new Printer();
        printer.printReceipt(txtReceipt);

        window.generateOrderNumber();
        window.clearReceipt();
        window.clearTotal();
        window.clearOrders();

        this.dispose();
    }
    
    private boolean isPaySufficient() {
      
        try {
            
            amount = Double.parseDouble(txtNum.getText());
            double total = Double.parseDouble(lblTotal.getText());
            
            return amount >= total;
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return false;
    }
    
    private double getChange() {
        
        return amount - (Double.parseDouble(lblTotal.getText()));
    }
    
    private void removeLastCharacter() {
        
        txtNum.setText(txtNum.getText().substring(0, txtNum.getText().length() - 1));
    }
    
    private void insertPaymentDetails() {
        
        String oldReceipt = txtReceipt.getText();
        String newReceipt = oldReceipt.replace("                   Total: P " + lblTotal.getText() + 
                                               "\n\n\n\n\n\n\n   Please proceed to cashier to pay", 
                                                 "                Total : P " + lblTotal.getText() + 
                                               "\n                Amount: P " + amount + 
                                               "\n                Change: P " + getChange()) +
                                               "\n\n\n\n\n\n\n Thank you for your purchase!" +
                                               "\n Come again :)";
        txtReceipt.setText(newReceipt);
    }
        
    private void numberClick(String num) {
        
        boolean hasPeriod = (txtNum.getText().contains(".") && num.equals("."));
        boolean hasNumbers = txtNum.getText().isBlank() && (num.equals("0") || num.equals("00"));
        
        if (!hasPeriod && !hasNumbers)
            txtNum.setText(txtNum.getText() + num);
    }
    
    private void numberKeyPress(char key) {
        
        boolean hasPeriod = (txtNum.getText().contains(".") && key == '.');
        boolean hasNumbers = txtNum.getText().isBlank() && key == '0';
        
        if (!hasPeriod && !hasNumbers)
            if(key >= '0' && key <= '9' || key == '.') 
                txtNum.setText(txtNum.getText() + key);
        
        if(key == '\b')
            removeLastCharacter();
    }
    
    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        
        validatePay();
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        
        removeLastCharacter();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumKeyReleased
        
        numberKeyPress(evt.getKeyChar());
    }//GEN-LAST:event_txtNumKeyReleased
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnPeriod;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panelBg;
    private javax.swing.JPanel panelNum;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextArea txtReceipt;
    // End of variables declaration//GEN-END:variables
}
