package jabilee.ui;

import font.Fonts;
import javax.swing.JLabel;

public class Order extends javax.swing.JPanel {

    private JabileeUI window;
    private Meal meal;
    
    public Order(Meal meal, JabileeUI window) {
        
        this.meal = meal;
        this.window = window;
        
        initComponents();
        initOrder();
    }
    
    public Order() {
        
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

        lblPrice.setBackground(new java.awt.Color(153, 153, 153));
        lblPrice.setFont(Fonts.getJelleeFont(12)
        );
        lblPrice.setForeground(new java.awt.Color(102, 102, 102));
        lblPrice.setText("100");
        add(lblPrice);
        lblPrice.setBounds(80, 35, 100, 16);

        lblQuantity.setBackground(new java.awt.Color(204, 0, 0));
        lblQuantity.setFont(Fonts.getJelleeFont(25)
        );
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuantity.setText("1");
        lblQuantity.setOpaque(true);

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

        lblName.setBackground(new java.awt.Color(48, 48, 48));
        lblName.setFont(Fonts.getJelleeFont(12)
        );
        lblName.setText("Combo Name");
        add(lblName);
        lblName.setBounds(80, 16, 140, 20);

        btnRemove.setBackground(new java.awt.Color(204, 0, 0));
        btnRemove.setFont(Fonts.getJelleeFont(20)
        );
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("-");
        btnRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        add(btnRemove);
        btnRemove.setBounds(190, 25, 40, 25);
    }// </editor-fold>//GEN-END:initComponents
    
    private void initOrder() {
        
        setOrderName(meal.getMealName());
        setOrderPrice(meal.getMealPrice());
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
    
    public int getId() {
        
        return meal.getId();
    }
    
    public String getOrderName() {
        
        return meal.getMealName();
    }
    
    public JLabel getQuantityLabel() {
        
        return lblQuantity;
    }
    
    public int getOrderQuantity() {
        
        return meal.getQuantity();
    }
    
    public double getOrderPrice() {
        
        return meal.getMealPrice();
    }
    
    public double getOrderSubTotal() {
        
        return getOrderPrice() * getOrderQuantity();
    }
       
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        window.removeFromOrders(this);
        window.removeFromReceipt(this);
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
