package jabilee.ui;

import javax.swing.ImageIcon;

public class ComboMeals {
    
    private String comboName;
    private double comboPrice;
    private int quantity = 0;
    private ImageIcon comboIcon;
    
    public ComboMeals(String comboName, double comboPrice){
        
        this.comboName = comboName;
        this.comboPrice = comboPrice;
    }
    
    public String getComboName() {
        
        return comboName;
    }
    
    public double getComboPrice() {
        
        return comboPrice;
    }
    
    public int getQuantity() {
        
        return quantity;
    }
    
    public ImageIcon getIcon() {
        
        return comboIcon;
    }
    
    public void setIcon(ImageIcon comboIcon) {
        
        this.comboIcon = comboIcon;
    }
    
    public void addQuantity(int quantity){
        
        this.quantity += quantity;
    }
    
    public void resetQuantity() {
        quantity = 0;
    }
}
