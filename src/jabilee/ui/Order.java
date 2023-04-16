package jabilee.ui;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Order extends javax.swing.JPanel {

    private JabileeUI window;
    private ComboMeals meal;
    private JButton btn;
    
    public Order(ComboMeals meal, JButton btn, JabileeUI window) {
        
        this.meal = meal;
        this.btn = btn;
        this.window = window;
        
        initComponents();
        initOrder();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPrice = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblQuantity = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMinimumSize(new java.awt.Dimension(240, 73));
        setPreferredSize(new java.awt.Dimension(240, 73));
        setLayout(null);

        lblPrice.setText("100");
        add(lblPrice);
        lblPrice.setBounds(80, 40, 100, 16);

        lblQuantity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuantity.setText("1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
        );

        add(jPanel1);
        jPanel1.setBounds(5, 5, 60, 63);

        lblName.setText("Combo Name");
        add(lblName);
        lblName.setBounds(80, 16, 150, 20);

        btnRemove.setText("-");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        add(btnRemove);
        btnRemove.setBounds(190, 20, 40, 30);
    }// </editor-fold>//GEN-END:initComponents
    
    private void initOrder() {
        
        setOrderName(meal.getComboName());
        setOrderPrice(meal.getComboPrice());
        setOrderQuantity(meal.getQuantity());
    }
    
    public void setOrderName(String name) {
        
        lblName.setText(name);
    }
    
    public void setOrderQuantity(int quantity) {
        
        lblQuantity.setText(quantity + "");
    }
    
    public void setOrderPrice(double price) {
        
        lblPrice.setText(price + "");
    }
    
    public String getOrderName() {
        
        return meal.getComboName();
    }
    
    public JLabel getQuantityLabel() {
        
        return lblQuantity;
    }
    
    public int getOrderQuantity() {
        
        return meal.getQuantity();
    }
    
    public double getOrderPrice() {
        
        return meal.getComboPrice();
    }
    
    public double getOrderSubTotal() {
        
        return getOrderPrice() * getOrderQuantity();
    }
       
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        window.removeFromOrders(this);
        meal.resetQuantity();
    }//GEN-LAST:event_btnRemoveActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemove;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantity;
    // End of variables declaration//GEN-END:variables
}
