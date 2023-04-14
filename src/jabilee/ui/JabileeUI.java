package jabilee.ui;

import java.awt.Image;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

/**
 *
 * @author Jansen Cruz
 */
public class JabileeUI extends javax.swing.JFrame {
    
    final String format = "\n%-20s \t%-10d \t%.2f";
    ComboMeals [][] meals = new ComboMeals[3][2];
    ArrayList<ComboMeals> itemsBought = new ArrayList<>();
    double total = 0;
    
    public JabileeUI() {
        
        initComponents();
        initMeals();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelItems = new javax.swing.JPanel();
        btnItem1 = new javax.swing.JButton();
        btnItem2 = new javax.swing.JButton();
        btnItem3 = new javax.swing.JButton();
        btnItem4 = new javax.swing.JButton();
        btnItem5 = new javax.swing.JButton();
        btnItem6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReceipt = new javax.swing.JTextArea();
        panelActions = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));
        setSize(new java.awt.Dimension(550, 600));
        getContentPane().setLayout(null);

        panelItems.setMinimumSize(new java.awt.Dimension(200, 79));
        panelItems.setOpaque(false);
        panelItems.setLayout(new java.awt.GridLayout(3, 2, 5, 5));

        btnItem1.setIcon(getResizedIcon("/resources/chickenjoy.png", 70,50));
        btnItem1.setBackground(new java.awt.Color(255, 204, 51));
        btnItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnItem1.setText("125");
        btnItem1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnItem1.setName("Chicken Joy"); // NOI18N
        btnItem1.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnItem1.setHorizontalTextPosition(SwingConstants.CENTER);
        btnItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItem1ActionPerformed(evt);
            }
        });
        panelItems.add(btnItem1);

        btnItem2.setIcon(getResizedIcon("/resources/spaghetti.png", 70, 50));
        btnItem2.setBackground(new java.awt.Color(255, 204, 51));
        btnItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnItem2.setText("70");
        btnItem2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnItem2.setName("Jolly Spaghetti"); // NOI18N
        btnItem2.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnItem2.setHorizontalTextPosition(SwingConstants.CENTER);
        btnItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItem2ActionPerformed(evt);
            }
        });
        panelItems.add(btnItem2);

        btnItem3.setIcon(getResizedIcon("/resources/yumburger.png", 70,50));
        btnItem3.setBackground(new java.awt.Color(255, 204, 51));
        btnItem3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnItem3.setText("40");
        btnItem3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnItem3.setName("Yumburger"); // NOI18N
        btnItem3.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnItem3.setHorizontalTextPosition(SwingConstants.CENTER);
        btnItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItem3ActionPerformed(evt);
            }
        });
        panelItems.add(btnItem3);

        btnItem4.setIcon(getResizedIcon("/resources/fries.png", 70, 50));
        btnItem4.setBackground(new java.awt.Color(255, 204, 51));
        btnItem4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnItem4.setText("40");
        btnItem4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnItem4.setName("French Fries"); // NOI18N
        btnItem4.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnItem4.setHorizontalTextPosition(SwingConstants.CENTER);
        btnItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItem4ActionPerformed(evt);
            }
        });
        panelItems.add(btnItem4);

        btnItem5.setIcon(getResizedIcon("/resources/sundae.png", 55, 50));
        btnItem5.setBackground(new java.awt.Color(255, 204, 51));
        btnItem5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnItem5.setText("35");
        btnItem5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnItem5.setName("Sundae    "); // NOI18N
        btnItem5.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnItem5.setHorizontalTextPosition(SwingConstants.CENTER);
        btnItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItem5ActionPerformed(evt);
            }
        });
        panelItems.add(btnItem5);

        btnItem6.setIcon(getResizedIcon("/resources/coke.png", 70, 50));
        btnItem6.setBackground(new java.awt.Color(255, 204, 51));
        btnItem6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnItem6.setText("15");
        btnItem6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnItem6.setName("Coca Cola"); // NOI18N
        btnItem6.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnItem6.setHorizontalTextPosition(SwingConstants.CENTER);
        btnItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItem6ActionPerformed(evt);
            }
        });
        panelItems.add(btnItem6);

        getContentPane().add(panelItems);
        panelItems.setBounds(30, 50, 210, 340);

        txtReceipt.setColumns(2);
        txtReceipt.setRows(5);
        txtReceipt.setTabSize(4);
        txtReceipt.setText("Item                                    Qty         Price\n-------------------------------------------------------------------");
        jScrollPane1.setViewportView(txtReceipt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 50, 290, 240);

        panelActions.setOpaque(false);
        panelActions.setLayout(new java.awt.GridLayout(1, 2, 5, 5));

        btnCancel.setBackground(new java.awt.Color(255, 51, 51));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("CANCEL ORDER");
        btnCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        panelActions.add(btnCancel);

        btnDone.setBackground(new java.awt.Color(255, 153, 0));
        btnDone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDone.setForeground(new java.awt.Color(255, 255, 255));
        btnDone.setText("DONE");
        btnDone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });
        panelActions.add(btnDone);

        getContentPane().add(panelActions);
        panelActions.setBounds(260, 340, 290, 50);

        jLabel1.setText("Total: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 300, 37, 16);

        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("P 0.0");
        getContentPane().add(lblTotal);
        lblTotal.setBounds(440, 300, 110, 16);

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bg.jpg"))); // NOI18N
        getContentPane().add(lblBg);
        lblBg.setBounds(-10, -20, 600, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initMeals() {
        
        int btnIndex = 0;
        
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 2; j++) {
                
                // Initialize index coordinates for the item buttons
                JButton btn = (JButton) panelItems.getComponent(btnIndex++);
                meals[i][j] = new ComboMeals(btn.getName(), Double.parseDouble(btn.getText()));
            }
    }
    
    private void clicked(int x, int y, JButton btn) {
        
        ComboMeals item = meals[x][y];
        String itemName = item.getComboName();
        double itemPrice = item.getComboPrice();
                
        // Gets the value from the spinner
        int quantity = getOrderQuantity(itemName, btn);
        double subTotal = quantity * itemPrice;
        
        updateTotal(subTotal);
        
        // Only add quantity if the item is already existing
        if(isItemExisting(item)) {
            addQuantityToExistingItem(item, quantity);
        }
        else {
            item.addQuantity(quantity);
            addToReceipt(itemName, quantity, subTotal);
            addToItemsBought(item);
        }
    }
    
    public void updateTotal(double subTotal){
        
        total += subTotal;
        System.out.println(total); 
       lblTotal.setText("P "+ total);
    }
    
    private int getOrderQuantity(String itemName, JButton btn){
        
        final int MINIMUM_ORDER_VALUE = 1;
        final int MAXIMUM_ORDER_VALUE = 30;
        final int ORDER_INCREMENT = 1;
        
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(MINIMUM_ORDER_VALUE, MINIMUM_ORDER_VALUE, MAXIMUM_ORDER_VALUE, ORDER_INCREMENT);
        JSpinner spinner = new JSpinner(spinnerModel);
        
        setSpinnerEditable(spinner);
        
        JOptionPane.showMessageDialog(
                null, 
                spinner, 
                itemName, 
                JOptionPane.INFORMATION_MESSAGE, 
                btn.getIcon());
        
        int spinnerValue = (Integer) spinner.getValue();
        return spinnerValue;
    }
    
    private void setSpinnerEditable(JSpinner spinner) {
        
        JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor) spinner.getEditor();
        JTextField txt = editor.getTextField();
        txt.setEditable(true);
    }
    
    private void addQuantityToExistingItem(ComboMeals item, int quantity){
        
        // Get item details and calculate values
        String itemName = item.getComboName();
        int itemQuantity = item.getQuantity();
        double itemPrice = item.getComboPrice();
        double subTotal = itemQuantity * item.getComboPrice();
        int newItemQuantity = itemQuantity + quantity;
        
        String oldItem = String.format(format,itemName, itemQuantity, subTotal);
        String newItem = String.format(format, itemName, newItemQuantity, (newItemQuantity * itemPrice));
                
        // Replace the old receipt to the updated receipt with updated quantity and subtotal
        String copiedReceipt = txtReceipt.getText();
        String newReceipt = copiedReceipt.replace(oldItem, newItem);
        
        item.addQuantity(quantity);
        txtReceipt.setText(newReceipt);
    }
    
    private void addToReceipt(String itemName, int quantity, double subTotal) {
        
        String purchase = String.format(format, itemName, quantity, subTotal);
        txtReceipt.append(purchase);
    }
    
    private void addToItemsBought(ComboMeals item){
        
        itemsBought.add(item);
    }
    
    private boolean isItemExisting(ComboMeals item) {
        
        if(itemsBought.contains(item))
            return true;
        
        return false;
    }
    
    private void printReceipt() {
        
        txtReceipt.append("\n\nTotal: " + total);
        
        try {
            
            MessageFormat header = new MessageFormat("Jabilee");
            MessageFormat footer = new MessageFormat("");
            
            boolean isComplete = txtReceipt.print(header,footer);
            
            if(isComplete) {
                JOptionPane.showMessageDialog(
                        null, 
                        "Done printing!", 
                        "Information", 
                        JOptionPane.INFORMATION_MESSAGE
                );
                
                clearReceipt();
                clearTotal();
            }
            else
                JOptionPane.showMessageDialog(
                        null, 
                        "Printing", 
                        "Printer", 
                        JOptionPane.INFORMATION_MESSAGE
                );
        }
        catch(PrinterException ex) {
            
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void clearReceipt() {
                
        String receiptTemplate = "Item                                    Qty         Price\n-------------------------------------------------------------------";
        txtReceipt.setText(receiptTemplate);
        
        resetItemsQuantity();
        resetItemsBought();
    }
    
    private void clearTotal() {
        
        total = 0;
        lblTotal.setText("P " + total);
    }
    
    private void resetItemsQuantity() {
        
        itemsBought.forEach(i -> i.resetQuantity());
    }
    
    private void resetItemsBought() {
        
        itemsBought.clear();
    }
    
    public ImageIcon getResizedIcon(String path, int width, int height) {
        
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(path));
        Image img = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(img);
        
        return imgIcon;
    }
    
    private void btnItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItem1ActionPerformed
        clicked(0,0, btnItem1);
    }//GEN-LAST:event_btnItem1ActionPerformed

    private void btnItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItem2ActionPerformed
        clicked(0,1, btnItem2);
    }//GEN-LAST:event_btnItem2ActionPerformed

    private void btnItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItem3ActionPerformed
        clicked(1,0, btnItem3);
    }//GEN-LAST:event_btnItem3ActionPerformed

    private void btnItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItem4ActionPerformed
        clicked(1,1, btnItem4);
    }//GEN-LAST:event_btnItem4ActionPerformed

    private void btnItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItem5ActionPerformed
        clicked(2,0, btnItem5);
    }//GEN-LAST:event_btnItem5ActionPerformed

    private void btnItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItem6ActionPerformed
       clicked(2,1, btnItem6);
    }//GEN-LAST:event_btnItem6ActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
       printReceipt();
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clearReceipt();
    }//GEN-LAST:event_btnCancelActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(JabileeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JabileeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JabileeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JabileeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JabileeUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnItem1;
    private javax.swing.JButton btnItem2;
    private javax.swing.JButton btnItem3;
    private javax.swing.JButton btnItem4;
    private javax.swing.JButton btnItem5;
    private javax.swing.JButton btnItem6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panelActions;
    private javax.swing.JPanel panelItems;
    private javax.swing.JTextArea txtReceipt;
    // End of variables declaration//GEN-END:variables
}
