package jabilee.meals;

import java.awt.Color;
import java.awt.Image;
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

import component.CirclePanel;
import font.Fonts;
import jabilee.ui.JabileeUI;

public class CreateItem extends javax.swing.JFrame {

    final int MIN_MEALNAME_LENGTH = 8;
    final int MAX_MEALNAME_LENGTH = 16;
    final int MIN_MEALPRICE = 0;
    
    private ArrayList<Meal> meals;
    private JabileeUI window;
    private int addedMeals = 0;
    ImageIcon icon;
    
    public CreateItem(ArrayList<Meal> meals, JabileeUI window, int addedMeals) {
        
        this.meals = meals;
        this.window = window;
        this.addedMeals = addedMeals;
        
        initComponents();
        setLocationRelativeTo(window);
    }
    
    public CreateItem() {
        
        initComponents();
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
        setTitle("Jabilee Create Item");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new ImageIcon(getClass().getResource("/resources/logo.png")).getImage());
        setMinimumSize(new java.awt.Dimension(380, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(370, 305));
        jPanel2.setLayout(null);

        jPanel1.setBorder(new EmptyBorder(15,10,10,12));
        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(Fonts.getJelleeFont(12)
        );
        txtName.setForeground(new java.awt.Color(102, 102, 102));
        txtName.setText("Meal Name");
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });
        jPanel1.add(txtName);
        txtName.setBounds(152, 50, 146, 32);

        txtPrice.setFont(Fonts.getJelleeFont(12));
        txtPrice.setForeground(new java.awt.Color(102, 102, 102));
        txtPrice.setText("Meal Price eg. 50");
        txtPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPriceMouseClicked(evt);
            }
        });
        jPanel1.add(txtPrice);
        txtPrice.setBounds(210, 95, 90, 31);

        btnCancel.setFont(Fonts.getJelleeFont(14)
        );
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("CANCEL");
        btnCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCancel.setContentAreaFilled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel);
        btnCancel.setBounds(30, 165, 130, 34);

        btnDone.setBackground(new java.awt.Color(204, 0, 0));
        btnDone.setFont(Fonts.getJelleeFont(14)
        );
        btnDone.setForeground(new java.awt.Color(255, 255, 255));
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

        btnIcon.setBackground(new java.awt.Color(255, 255, 255));
        btnIcon.setFont(Fonts.getJelleeFont(36)
        );
        btnIcon.setText("+");
        btnIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIconActionPerformed(evt);
            }
        });
        jPanel1.add(btnIcon);
        btnIcon.setBounds(30, 45, 104, 101);

        jLabel1.setFont(Fonts.getJelleeFont(18)
        );
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("P");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 95, 30, 31);

        jLabel2.setFont(Fonts.getJelleeFont(18)
        );
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Create a Meal");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 15, 210, 16);

        jLabel4.setFont(Fonts.getJelleeFont(7)
        );
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("must be between 8 and 16 characters");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(156, 35, 140, 10);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(20, 21, 330, 220);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/red.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(-20, 0, 670, 270);

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

    private void createMeal(String mealName, double mealPrice) {
        
        Meal meal = new Meal(meals.size() + 1, mealName, mealPrice, getResizedIcon(icon, 125, 75));
        addToMealsList(meal);
    }
    
    private void addToMealsList(Meal meal) {
        
        //window.getMenu().saveMeal(meal);
        meals.add(meal);
    }
    
    private void closeWindowAndRefresh() {
             
        new JabileeUI(meals, ++addedMeals).setVisible(true);
        this.dispose();
        
        window.resetListeners();
        window.dispose();
    }
    
    private ImageIcon getIconFromFile() {
        
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter( new FileNameExtensionFilter("Images", "jpg", "jpeg", "png", "gif"));
        int result = chooser.showOpenDialog(null);
        
        try{
            
            if (result == JFileChooser.APPROVE_OPTION) {
            
                File file = chooser.getSelectedFile();
                BufferedImage image = ImageIO.read(file);
                icon = new ImageIcon(image);

                return getResizedIcon(icon, 120, 75);
            }
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
    
    private boolean isMealNameValid() {
        
        return txtName.getText().length() >= MIN_MEALNAME_LENGTH 
                && txtName.getText().length() <= MAX_MEALNAME_LENGTH;
    }
    
    private boolean isMealPriceValid() {
        
        return Double.parseDouble(txtPrice.getText()) > MIN_MEALPRICE;
    }
    
    private void clearText(JTextField txt) {
        
        txt.setText("");
    }
    
    private void setBlackFont(JTextField txt) {
        
        txt.setForeground(new Color(48,48,48));
    }
    
    public ImageIcon getResizedIcon(ImageIcon icon, int width, int height) {
        
        Image img = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(img);
        
        return imgIcon;
    }
    
    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        
        try {
            
            boolean isComboMealValid = isMealNameValid() && isMealPriceValid();
            
            if(isComboMealValid) {
                String mealName = txtName.getText();
                double mealPrice = Double.parseDouble(txtPrice.getText());

                createMeal(mealName, mealPrice);
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
            btnIcon.setIcon(window.getResizedIcon(Icon, 90, 70));     
            btnIcon.setText(null);
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnIconActionPerformed

    private void txtPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPriceMouseClicked
        
        setBlackFont(txtPrice);
        clearText(txtPrice);
    }//GEN-LAST:event_txtPriceMouseClicked

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
        
        setBlackFont(txtName);
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
