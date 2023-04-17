package jabilee.ui;

import font.Fonts; 
import java.awt.Image;
import javax.swing.ImageIcon;

public class Meal extends javax.swing.JPanel {

    private int id;
    private String mealName;
    private double mealPrice;
    private int quantity = 0;
    private ImageIcon mealIcon;
    
    public Meal(int id, String mealName, double mealPrice, ImageIcon mealIcon){
        
        this.id = id;
        this.mealName = mealName;
        this.mealPrice = mealPrice;
        this.mealIcon = mealIcon;
       
        initComponents();
        initMeal();
    }
    
    public Meal() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDetails = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(130, 150));
        setPreferredSize(new java.awt.Dimension(130, 150));
        setLayout(null);

        panelDetails.setBackground(new java.awt.Color(228, 22, 61));
        panelDetails.setLayout(null);

        jLabel2.setFont(Fonts.getJelleeFont(10)
        );
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("P");
        panelDetails.add(jLabel2);
        jLabel2.setBounds(15, 22, 50, 25);

        lblPrice.setFont(Fonts.getJelleeFont(10));
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setText("100");
        panelDetails.add(lblPrice);
        lblPrice.setBounds(25, 22, 100, 25);

        lblName.setFont(Fonts.getJelleeFont(13));
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("name");
        panelDetails.add(lblName);
        lblName.setBounds(15, 5, 110, 25);

        add(panelDetails);
        panelDetails.setBounds(0, 100, 150, 60);
        add(lblIcon);
        lblIcon.setBounds(0, 0, 145, 100);
    }// </editor-fold>//GEN-END:initComponents

    public void initMeal() {
        
        lblName.setText(mealName);
        lblPrice.setText(mealPrice + "");
        lblIcon.setIcon(mealIcon);
    }
    
    public int getId() {
        
        return id;
    }
    
    public String getMealName() {
        
        return mealName;
    }
    
    public double getMealPrice() {
        
        return mealPrice;
    }
    
    public int getQuantity() {
        
        return quantity;
    }
    
    public ImageIcon getIcon() {
        
        return mealIcon;
    }
    
    public void setIcon(ImageIcon mealIcon) {
        
        this.mealIcon = mealIcon;
    }
    
    public void addQuantity(int quantity){
        
        this.quantity += quantity;
    }
    
    public void resetQuantity() {
        quantity = 0;
    }
    
    public ImageIcon getResizedIcon(String path, int width, int height) {
        
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(path));
        Image img = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(img);
        
        return imgIcon;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JPanel panelDetails;
    // End of variables declaration//GEN-END:variables
}
