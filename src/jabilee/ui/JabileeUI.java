package jabilee.ui;

import component.WrapLayout;
import font.Fonts;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Jansen Cruz
 */
public class JabileeUI extends javax.swing.JFrame {
    
    final String format = "\n%-20s \t%-10d \t%.2f";
    ArrayList<Meal> mealsBought2 = new ArrayList();
    ArrayList<Meal> meals2 = new ArrayList<>();
    ArrayList<Order> orders = new ArrayList<>();
    double total = 0;
    int addedMeals;
    int orderNumber;
    
    public JabileeUI() {
        
        initComponents();
        initOriginalMeals();
        addMealEventListener();
        generateOrderNumber();
        initReceipt();
        setLocationRelativeTo(null);
    }
    
    public JabileeUI(ArrayList<Meal> meals, int numAddedMeals) {
        
        this.addedMeals = numAddedMeals;
        this.meals2 = meals;
        
        initComponents();
        generateOrderNumber();
        updateMeals();
        addAddedMealEventListener();
        meals2.clear();
        initOriginalMeals();
        addMealEventListener();
        initReceipt();
        
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        panelItems = new javax.swing.JPanel();
        btnCreateMeal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelReceipt = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReceipt = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnDone = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelOrder = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1165, 609));
        setSize(new java.awt.Dimension(550, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(254, 241, 225));
        jPanel1.setLayout(null);

        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        scrollPane.setOpaque(false);

        panelItems.setBackground(new java.awt.Color(255, 252, 236));
        panelItems.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        panelItems.setAutoscrolls(true);
        panelItems.setFont(Fonts.getJelleeFont(12)
        );
        panelItems.setMinimumSize(new java.awt.Dimension(200, 79));
        panelItems.setName("add"); // NOI18N
        /*
        panelItems.setLayout(new java.awt.GridLayout(0, 3, 5, 5));
        */

        panelItems.setLayout(new WrapLayout(WrapLayout.LEADING));

        btnCreateMeal.setBackground(new java.awt.Color(255, 255, 255));
        btnCreateMeal.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnCreateMeal.setForeground(new java.awt.Color(255, 0, 0));
        btnCreateMeal.setText("+");
        btnCreateMeal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250), 5));
        btnCreateMeal.setFocusPainted(false);
        btnCreateMeal.setFocusable(false);
        btnCreateMeal.setName("+"); // NOI18N
        btnCreateMeal.setPreferredSize(new java.awt.Dimension(130, 150));
        btnCreateMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateMealActionPerformed(evt);
            }
        });
        panelItems.add(btnCreateMeal);

        scrollPane.setViewportView(panelItems);

        jPanel1.add(scrollPane);
        scrollPane.setBounds(20, 90, 440, 390);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(Fonts.getJelleeFont(36f));
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("Jabilee");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 10, 440, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 490, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 30, 490, 510);

        panelReceipt.setBackground(new java.awt.Color(255, 255, 255));
        panelReceipt.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(249, 243, 243));
        jPanel6.setLayout(null);

        jLabel4.setFont(Fonts.getJelleeFont(15)
        );
        jLabel4.setForeground(new java.awt.Color(48, 48, 48));
        jLabel4.setText("Order Details (Proceed to Cashier)");
        jPanel6.add(jLabel4);
        jLabel4.setBounds(20, 30, 280, 30);

        panelReceipt.add(jPanel6);
        jPanel6.setBounds(0, 0, 310, 70);

        txtReceipt.setEditable(false);
        txtReceipt.setColumns(2);
        txtReceipt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtReceipt.setRows(5);
        txtReceipt.setTabSize(4);
        txtReceipt.setText("Item                                    Qty         Price\n-----------------------------------------------------------------");
        txtReceipt.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jScrollPane1.setViewportView(txtReceipt);

        panelReceipt.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 290, 420);

        getContentPane().add(panelReceipt);
        panelReceipt.setBounds(810, 30, 310, 510);

        jPanel3.setBackground(new java.awt.Color(249, 243, 243));
        jPanel3.setLayout(null);

        btnDone.setBackground(new java.awt.Color(0, 0, 0));
        btnDone.setFont(Fonts.getJelleeFont(14)
        );
        btnDone.setForeground(new java.awt.Color(255, 255, 255));
        btnDone.setText("PLACE ORDER");
        btnDone.setBorder(null);
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });
        jPanel3.add(btnDone);
        btnDone.setBounds(20, 450, 230, 50);

        jLabel1.setFont(Fonts.getJelleeFont(20)
        );
        jLabel1.setForeground(new java.awt.Color(48, 48, 48));
        jLabel1.setText("Total: ");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(30, 410, 70, 30);

        jScrollPane2.setBackground(new java.awt.Color(153, 0, 0));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelOrder.setBackground(new java.awt.Color(255, 255, 255));
        /*
        panelOrder.setLayout(null);
        */
        panelOrder.setLayout(new WrapLayout(WrapLayout.LEADING));
        jScrollPane2.setViewportView(panelOrder);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(0, 70, 270, 330);

        jPanel4.setBackground(new java.awt.Color(249, 243, 243));
        jPanel4.setLayout(null);

        btnCancel.setBackground(new java.awt.Color(255, 51, 51));
        btnCancel.setFont(Fonts.getJelleeFont(12)
        );
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("CLEAR ALL");
        btnCancel.setBorder(null);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancel);
        btnCancel.setBounds(170, 30, 90, 30);

        jLabel3.setFont(Fonts.getJelleeFont(15)
        );
        jLabel3.setForeground(new java.awt.Color(48, 48, 48));
        jLabel3.setText("Current Order");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(20, 30, 140, 30);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 270, 70);

        lblTotal.setFont(Fonts.getJelleeFont(20)
        );
        lblTotal.setForeground(new java.awt.Color(255, 0, 0));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("P 0.0");
        jPanel3.add(lblTotal);
        lblTotal.setBounds(110, 410, 130, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(530, 30, 270, 510);

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bg4.png"))); // NOI18N
        getContentPane().add(lblBg);
        lblBg.setBounds(-10, -20, 1170, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void initOriginalMeals() {
 
        meals2.add(new Meal(1, "Chicken Joy", 143, getResizedIcon("/resources/chickenjoy.png", 120, 75)));
        meals2.add(new Meal(2, "Jolly Spaghetti", 59, getResizedIcon("/resources/jollyspag.png", 120, 75)));
        meals2.add(new Meal(3, "Burger Steak", 59, getResizedIcon("/resources/burgersteak.png", 120, 75)));               
        meals2.add(new Meal(4, "Yumburger", 40, getResizedIcon("/resources/yumburger.png", 120, 75)));
        meals2.add(new Meal(5, "Sundae", 48, getResizedIcon("/resources/sundae.png", 120, 75)));
        meals2.add(new Meal(6, "French Fries", 48, getResizedIcon("/resources/fries.png", 120, 75)));
        meals2.add(new Meal(7, "Regular Coke", 53, getResizedIcon("/resources/coke.png", 120, 75)));
        
        for(int i = 0; i < meals2.size(); i++) {
            
            panelItems.add(meals2.get(i), panelItems.getComponentCount() - 1);
        }
    }
    
    private void addMealEventListener() {
        
        for(int i = 0; i < meals2.size(); i++) {
            
            final Meal meal = meals2.get(i);
            
            meal.addMouseListener(new MouseAdapter () {
                public void mouseClicked(MouseEvent e) {
                    clicked(meal);
                }
            });
        }
    }
    
    private void addAddedMealEventListener() {
            
        final Meal meal = meals2.get(meals2.size() - 1);

        meal.addMouseListener(new MouseAdapter () {
            @Override
            public void mouseClicked(MouseEvent e) {
                clicked(meal);
            }
        });
    
    }
        
    private void updateMeals() {
        
        panelItems.add(meals2.get(meals2.size() - 1), panelItems.getComponentCount() - 1);
    }
    
    public void generateOrderNumber() {
        
        Random random = new Random();
        orderNumber = random.nextInt(1000);
    }
    
    private void initReceipt() {
        
        txtReceipt.setText("Order Number #" + orderNumber +"\n\nItem                                    Qty         Price\n" +
"-----------------------------------------------------------------");
    }
    
    private void clicked(Meal meal) {
                  
        System.out.println("CLIasdCK");
        // Gets the value from the spinner
        int quantity = getOrderQuantity(meal);
        double subTotal = quantity * meal.getMealPrice();
        
        addToTotal(subTotal);
        
        // Only add quantity if the item is already existing
        if(isMealExisting(meal)) {
            addQuantityToExistingItem(meal, quantity);
            updateOrderQuantity(meal);
        }
        else {
            meal.addQuantity(quantity);
            addToReceipt(meal.getMealName(), quantity, subTotal);
            addToMealBought(meal);
            addToOrder(meal);
        }
    }
    
    private void addToOrder(Meal meal) {
        
        Order order = new Order(meal, this);
        
        panelOrder.add(order);
        orders.add(order);
    }
    
    public void removeFromOrders(Order order) {
        
        orders.removeIf(o -> o.getOrderName().equals(order.getOrderName()));
        orders.forEach(n -> System.out.println(n.getOrderName()));
        panelOrder.remove(order);
        panelOrder.repaint();
        
        removeFromReceipt(order);
        subtractFromTotal(order.getOrderPrice() * order.getOrderQuantity());
    }
    
    private void removeFromReceipt(Order order) {
     
        mealsBought2.removeIf(m -> m.getId() == order.getId());
        //mealsBought.forEach(n -> System.out.println(n.getComboName()));
        String oldReceipt = txtReceipt.getText();
        String newReceipt = oldReceipt.replace(String.format(format, order.getOrderName(), order.getOrderQuantity(), order.getOrderSubTotal()), "");
        
        txtReceipt.setText(newReceipt);
    }
        
    private void updateOrderQuantity(Meal meal) {
     
        Order order = getExistingOrder(meal.getId());
        order.setOrderQuantity(meal.getQuantity());
    }
    
    private Order getExistingOrder(int id) {
        
        return orders.stream()
                     .filter(o -> o.getId() == id)
                     .findFirst()
                     .orElse(null);
      }
    
    public void addToTotal(double subTotal) {
        
        total += subTotal;
        lblTotal.setText("P "+ total);
    }
    
    public void addNumberOfAddedMeals() {
        
        addedMeals++;
    }
    
    public void subtractFromTotal(double subTotal) {
        
        total -= subTotal;
        lblTotal.setText("P "+ total);
    }
    
    private int getOrderQuantity(Meal meal){
        
        final int MINIMUM_ORDER_VALUE = 1;
        final int MAXIMUM_ORDER_VALUE = 30;
        final int ORDER_INCREMENT = 1;
        
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(MINIMUM_ORDER_VALUE, MINIMUM_ORDER_VALUE, MAXIMUM_ORDER_VALUE, ORDER_INCREMENT);
        JSpinner spinner = new JSpinner(spinnerModel);
        
        setSpinnerEditable(spinner);
        
        JOptionPane.showMessageDialog(
                null, 
                spinner, 
                meal.getMealName(), 
                JOptionPane.INFORMATION_MESSAGE, 
                meal.getIcon());
        
        int spinnerValue = (Integer) spinner.getValue();
        return spinnerValue;
    }
    
    private void setSpinnerEditable(JSpinner spinner) {
        
        JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor) spinner.getEditor();
        JTextField txt = editor.getTextField();
        txt.setEditable(true);
    }
    
    private void addQuantityToExistingItem(Meal meal, int quantity){
        
        // Get item details and calculate values
        String mealName = meal.getMealName();
        int mealQuantity = meal.getQuantity();
        double mealPrice = meal.getMealPrice();
        double subTotal = mealQuantity * meal.getMealPrice();
        int newMealQuantity = mealQuantity + quantity;
        
        String oldItem = String.format(format,mealName, mealQuantity, subTotal);
        String newItem = String.format(format, mealName, newMealQuantity, (newMealQuantity * mealPrice));
                
        // Replace the old receipt to the updated receipt with updated quantity and subtotal
        String copiedReceipt = txtReceipt.getText();
        String newReceipt = copiedReceipt.replace(oldItem, newItem);
        
        meal.addQuantity(quantity);
        txtReceipt.setText(newReceipt);
    }
    
    public double getTotal() {
        
        return total;
    }
    
    private void addToReceipt(String mealName, int quantity, double subTotal) {
        
        String purchase = String.format(format, mealName, quantity, subTotal);
        txtReceipt.append(purchase);
    }
    
    private void addToMealBought(Meal meal){
        
        mealsBought2.add(meal);
    }
    
    private boolean isMealExisting(Meal meal) {
        
        if(mealsBought2.contains(meal))
            return true;
        
        return false;
    }
    
    private boolean isAddMealButton(JButton btn){
        
        return btn.getName().equals("+");
    }
    
    public void clearReceipt() {
        
        txtReceipt.setText("Order Number #" + orderNumber +"\n\nItem                                    Qty         Price\n" +
"-----------------------------------------------------------------");
        
        resetItemsQuantity();
        resetItemsBought();
    }
    
    public void clearTotal() {
        
        total = 0;
        lblTotal.setText("P " + total);
    }
    
    private boolean hasOrder() {
        
        if (orders.size() <= 0) 
            return false;
        
        return true;
    }
    
    public void clearOrders() {
        
        orders.clear();
        panelOrder.removeAll();
        panelOrder.repaint();
    }
    
    private void resetItemsQuantity() {
        
        mealsBought2.forEach(i -> i.resetQuantity());
    }
    
    private void resetItemsBought() {
        
        mealsBought2.clear();
    }
    
    public void refreshWindow() {
     
        new JabileeUI().setVisible(true);
        this.dispose();
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
    
    
    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        
        if (hasOrder()) {
            txtReceipt.append("\n\n\nTotal:         P " + getTotal());
            new Payment(txtReceipt, this).setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Place an order first", "Place order failed", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        
        clearReceipt();
        clearTotal();
        clearOrders();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCreateMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateMealActionPerformed
        
        //Admin admin = new Admin();
        //if(admin.isAdmin()) {
            new CreateItem(meals2, this, addedMeals).setVisible(true);
        //}
        
    }//GEN-LAST:event_btnCreateMealActionPerformed

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
    private javax.swing.JButton btnCreateMeal;
    private javax.swing.JButton btnDone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panelItems;
    private javax.swing.JPanel panelOrder;
    private javax.swing.JPanel panelReceipt;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextArea txtReceipt;
    // End of variables declaration//GEN-END:variables
}
