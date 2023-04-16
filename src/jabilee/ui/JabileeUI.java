package jabilee.ui;

import component.WrapLayout;
import java.awt.Color;
import java.awt.Font;
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
import javax.swing.border.LineBorder;

/**
 *
 * @author Jansen Cruz
 */
public class JabileeUI extends javax.swing.JFrame {
    
    final String format = "\n%-20s \t%-10d \t%.2f";
    ArrayList<ComboMeals> meals = new ArrayList<>();
    ArrayList<ComboMeals> mealsBought = new ArrayList<>();
    ArrayList<Order> orders = new ArrayList<>();
    double total = 0;
    int btnIndex = 0;
    int addedMeals;
    
    public JabileeUI() {
        
        initComponents();
        initMeals();
        setLocationRelativeTo(null);
    }
    
    public JabileeUI(ArrayList<ComboMeals> meals, int numAddedMeals) {
        
        this.addedMeals = numAddedMeals;
        this.meals = meals;
        
        initComponents();
        updateMeals();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtReceipt = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        panelItems = new javax.swing.JPanel();
        btnItem1 = new javax.swing.JButton();
        btnItem2 = new javax.swing.JButton();
        btnItem3 = new javax.swing.JButton();
        btnItem4 = new javax.swing.JButton();
        btnItem5 = new javax.swing.JButton();
        btnItem6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnDone = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelOrder = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 700));
        setSize(new java.awt.Dimension(550, 600));
        getContentPane().setLayout(null);

        txtReceipt.setEditable(false);
        txtReceipt.setColumns(2);
        txtReceipt.setRows(5);
        txtReceipt.setTabSize(4);
        txtReceipt.setText("Item                                    Qty         Price\n-------------------------------------------------------------------");
        jScrollPane1.setViewportView(txtReceipt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 490, 290, 290);

        jPanel1.setBackground(new java.awt.Color(254, 241, 225));
        jPanel1.setLayout(null);

        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        scrollPane.setOpaque(false);

        panelItems.setBackground(new java.awt.Color(102, 0, 0));
        panelItems.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        panelItems.setAutoscrolls(true);
        panelItems.setMinimumSize(new java.awt.Dimension(200, 79));
        panelItems.setName("add"); // NOI18N
        panelItems.setLayout(new java.awt.GridLayout(0, 3, 5, 5));

        btnItem1.setIcon(getResizedIcon("/resources/chickenjoy.png", 70,50));
        btnItem1.setBackground(new java.awt.Color(255, 204, 51));
        btnItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnItem1.setText("125.0");
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
        btnItem2.setText("70.0");
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
        btnItem3.setText("40.0");
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
        btnItem4.setText("40.0");
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
        btnItem5.setText("35.0");
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
        btnItem6.setText("15.0");
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

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("+");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton1.setName("+"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelItems.add(jButton1);

        scrollPane.setViewportView(panelItems);

        jPanel1.add(scrollPane);
        scrollPane.setBounds(20, 90, 440, 390);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("Jabilee");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 10, 280, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 490, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 30, 490, 510);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

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
        jPanel3.add(btnDone);
        btnDone.setBounds(30, 440, 210, 50);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Total: ");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(80, 410, 37, 16);

        jScrollPane2.setBackground(new java.awt.Color(153, 0, 0));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelOrder.setBackground(new java.awt.Color(204, 204, 204));
        /*
        panelOrder.setLayout(null);
        */
        panelOrder.setLayout(new WrapLayout(WrapLayout.LEADING));
        jScrollPane2.setViewportView(panelOrder);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(0, 70, 270, 330);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

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
        jPanel4.add(btnCancel);
        btnCancel.setBounds(180, 20, 70, 30);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 270, 70);

        lblTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("P 0.0");
        jPanel3.add(lblTotal);
        lblTotal.setBounds(190, 410, 25, 16);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(530, 30, 270, 510);

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bg3.jpg"))); // NOI18N
        getContentPane().add(lblBg);
        lblBg.setBounds(-10, -20, 830, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initMeals() {
        
        for(int i = 0; i < panelItems.getComponentCount(); i++) {
                
            // Initialize index coordinates for the item buttons
            JButton btn = (JButton) panelItems.getComponent(btnIndex++);
            
            if(isAddMealButton(btn)) continue;
            
            meals.add(new ComboMeals(btn.getName(), Double.parseDouble(btn.getText())));
        }
    }
    
    private void updateMeals() {
        
        for(int i = meals.size() - 1; i >= meals.size() - addedMeals; i--) {
            
            // Use final int for lambda expressions (not final will result to error)
            final int index = i;
            
            ImageIcon icon = getResizedIcon(meals.get(index).getIcon(), 70, 50);
            JButton btn = new JButton(meals.get(i).getComboPrice() + "");
            
            btn.setIcon(icon);
            formatButtonText(btn);
            
            btn.addActionListener(e -> clicked(index, btn));
            panelItems.add(btn, panelItems.getComponentCount() - 1);
        }
    }
    
    private void clicked(int index, JButton btn) {
        
        ComboMeals meal = meals.get(index);
        String mealName = meal.getComboName();
        double mealPrice = meal.getComboPrice();
                
        // Gets the value from the spinner
        int quantity = getOrderQuantity(mealName, btn);
        double subTotal = quantity * mealPrice;
        
        updateTotal(subTotal);
        
        // Only add quantity if the item is already existing
        if(isMealExisting(meal)) {
            addQuantityToExistingItem(meal, quantity);
            updateOrderQuantity(mealName);
        }
        else {
            meal.addQuantity(quantity);
            addToReceipt(mealName, quantity, subTotal);
            addToMealBought(meal);
            addToOrder(meal, btn);
        }
    }
    
    private void addToOrder(ComboMeals meal, JButton btn) {
        
        Order order = new Order(meal, btn);
        
        panelOrder.add(order);
        orders.add(order);
    }
    
    private void updateOrderQuantity(String name) {
     
      //  Order order = getExistingOrder(name);
        
    }
    
    private void getExistingOrder(String name) {
        
        
    }
    
    public void updateTotal(double subTotal) {
        
        total += subTotal;
        System.out.println(total); 
        lblTotal.setText("P "+ total);
    }
    
    public void addNumberOfAddedMeals() {
        
        addedMeals++;
    }
    
    private int getOrderQuantity(String mealName, JButton btn){
        
        final int MINIMUM_ORDER_VALUE = 1;
        final int MAXIMUM_ORDER_VALUE = 30;
        final int ORDER_INCREMENT = 1;
        
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(MINIMUM_ORDER_VALUE, MINIMUM_ORDER_VALUE, MAXIMUM_ORDER_VALUE, ORDER_INCREMENT);
        JSpinner spinner = new JSpinner(spinnerModel);
        
        setSpinnerEditable(spinner);
        
        JOptionPane.showMessageDialog(
                null, 
                spinner, 
                mealName, 
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
    
    private void addQuantityToExistingItem(ComboMeals meal, int quantity){
        
        // Get item details and calculate values
        String mealName = meal.getComboName();
        int mealQuantity = meal.getQuantity();
        double mealPrice = meal.getComboPrice();
        double subTotal = mealQuantity * meal.getComboPrice();
        int newMealQuantity = mealQuantity + quantity;
        
        String oldItem = String.format(format,mealName, mealQuantity, subTotal);
        String newItem = String.format(format, mealName, newMealQuantity, (newMealQuantity * mealPrice));
                
        // Replace the old receipt to the updated receipt with updated quantity and subtotal
        String copiedReceipt = txtReceipt.getText();
        String newReceipt = copiedReceipt.replace(oldItem, newItem);
        
        meal.addQuantity(quantity);
        txtReceipt.setText(newReceipt);
    }
    
    private void addToReceipt(String mealName, int quantity, double subTotal) {
        
        String purchase = String.format(format, mealName, quantity, subTotal);
        txtReceipt.append(purchase);
    }
    
    private void addToMealBought(ComboMeals meal){
        
        mealsBought.add(meal);
    }
    
    private boolean isMealExisting(ComboMeals meal) {
        
        if(mealsBought.contains(meal))
            return true;
        
        return false;
    }
    
    private boolean isAddMealButton(JButton btn){
        
        return btn.getName().equals("+");
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
        
        mealsBought.forEach(i -> i.resetQuantity());
    }
    
    private void resetItemsBought() {
        
        mealsBought.clear();
    }
    
    public void refreshWindow() {
     
        new JabileeUI().setVisible(true);
        this.dispose();
    }
    
    private void formatButtonText(JButton btn) {
        
        btn.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn.setHorizontalTextPosition(SwingConstants.CENTER);
        
        btn.setBackground(new Color(255,204,51));
        btn.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
        btn.setFont(new Font("Segoe UI", 1, 14));
    }
        
    public ImageIcon getResizedIcon(String path, int width, int height) {
        
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(path));
        Image img = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(img);
        
        return imgIcon;
    }
    
    public ImageIcon getResizedIcon(ImageIcon icon, int width, int height) {
        
        Image img = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(img);
        
        return imgIcon;
    }
    
    private void btnItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItem1ActionPerformed
        clicked(0, btnItem1);
    }//GEN-LAST:event_btnItem1ActionPerformed

    private void btnItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItem2ActionPerformed
        clicked(1, btnItem2);
    }//GEN-LAST:event_btnItem2ActionPerformed

    private void btnItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItem3ActionPerformed
        clicked(2, btnItem3);
    }//GEN-LAST:event_btnItem3ActionPerformed

    private void btnItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItem4ActionPerformed
        clicked(3, btnItem4);
    }//GEN-LAST:event_btnItem4ActionPerformed

    private void btnItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItem5ActionPerformed
        clicked(4, btnItem5);
    }//GEN-LAST:event_btnItem5ActionPerformed

    private void btnItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItem6ActionPerformed
       clicked(5, btnItem6);
    }//GEN-LAST:event_btnItem6ActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
       printReceipt();
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clearReceipt();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new CreateItem(meals, this, addedMeals).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panelItems;
    private javax.swing.JPanel panelOrder;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextArea txtReceipt;
    // End of variables declaration//GEN-END:variables
}
