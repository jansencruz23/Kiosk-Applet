package jabilee.ui;

import component.CirclePanel;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CreateItem extends javax.swing.JFrame {

    final int MIN_COMBONAME_LENGTH = 8;
    final int MIN_COMBOPRICE = 0;
    
    private ArrayList<ComboMeals> _meals;
    private JabileeUI _window;
    private int addedMeals = 0;
    ImageIcon icon;
    
    public CreateItem(ArrayList<ComboMeals> meals, JabileeUI window, int addedMeals) {
        
        _meals = meals;
        _window = window;
        this.addedMeals = addedMeals;
        
        initComponents();
        setLocationRelativeTo(window);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new CirclePanel(25, new Color(48,48,48, 200));
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        btnIcon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(380, 300));
        setSize(new java.awt.Dimension(400, 300));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(370, 305));
        jPanel2.setLayout(null);

        jPanel1.setBorder(new EmptyBorder(15,10,10,12));
        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        txtName.setForeground(new java.awt.Color(102, 102, 102));
        txtName.setText("Name");
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });
        jPanel1.add(txtName);
        txtName.setBounds(152, 50, 146, 32);

        txtPrice.setForeground(new java.awt.Color(102, 102, 102));
        txtPrice.setText("Price");
        txtPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPriceMouseClicked(evt);
            }
        });
        jPanel1.add(txtPrice);
        txtPrice.setBounds(210, 95, 90, 31);

        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 153, 0));
        btnCancel.setText("CANCEL");
        btnCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        btnCancel.setContentAreaFilled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel);
        btnCancel.setBounds(30, 165, 130, 34);

        btnDone.setBackground(new java.awt.Color(255, 153, 0));
        btnDone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDone.setForeground(new java.awt.Color(48, 48, 48));
        btnDone.setText("DONE");
        btnDone.setBorder(null);
        btnDone.setBorderPainted(false);
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });
        jPanel1.add(btnDone);
        btnDone.setBounds(170, 162, 130, 40);

        btnIcon.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnIcon.setText("+");
        btnIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIconActionPerformed(evt);
            }
        });
        jPanel1.add(btnIcon);
        btnIcon.setBounds(30, 45, 104, 101);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("P");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 95, 11, 31);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Create a Meal");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 10, 117, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("must be between 8 and 16 characters");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(156, 35, 140, 10);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(20, 21, 330, 220);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/food.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(-3, 0, 430, 270);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createComboMeal(String mealName, double mealPrice) {
        
        ComboMeals meal = new ComboMeals(mealName, mealPrice);
        meal.setIcon(icon);
        addToMealsList(meal);
    }
    
    private void addToMealsList(ComboMeals meal) {
        
        _meals.add(meal);
        System.out.println("done");
    }
    
    private void closeWindowAndRefresh() {
     
        this.dispose();
        _window.dispose();
        
        new JabileeUI(_meals, ++addedMeals).setVisible(true);
    }
    
    private ImageIcon getIconFromFile() {
        
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter( new FileNameExtensionFilter("Images", "jpg", "jpeg", "png", "gif"));
        int result = chooser.showOpenDialog(null);
        
        try{
            
            if(result == JFileChooser.APPROVE_OPTION) {
            
                File file = chooser.getSelectedFile();
                BufferedImage image = ImageIO.read(file);
                icon = new ImageIcon(image);

                return icon;
            }
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
    
    private boolean isComboNameValid() {
        
        return txtName.getText().length() >= MIN_COMBONAME_LENGTH;
    }
    
    private boolean isComboPriceValid() {
        
        return Double.parseDouble(txtPrice.getText()) > MIN_COMBOPRICE;
    }
    
    private void clearText(JTextField txt) {
        
        txt.setText("");
    }
    
    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        
        try {
            
            boolean isComboMealValid = isComboNameValid() && isComboPriceValid();
            
            if(isComboMealValid) {
                String mealName = txtName.getText();
                double mealPrice = Double.parseDouble(txtPrice.getText());

                createComboMeal(mealName, mealPrice);
                closeWindowAndRefresh();
            }
            else {
                JOptionPane.showMessageDialog(null, "Name must be between 8 and 16 characters. Price must not be below zero!");
            }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Invalid meal");
        }
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIconActionPerformed
        
        try {
            ImageIcon Icon = getIconFromFile();
            btnIcon.setIcon(_window.getResizedIcon(Icon, 70, 50));     
            btnIcon.setText(null);
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnIconActionPerformed

    private void txtPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPriceMouseClicked
        clearText(txtPrice);
    }//GEN-LAST:event_txtPriceMouseClicked

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
        clearText(txtName);
    }//GEN-LAST:event_txtNameMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
