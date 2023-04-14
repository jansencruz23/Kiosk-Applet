package jabilee.ui;

public class ComboMeals {
    
    private String comboName;
    private double comboPrice;
    private int quantity = 0;
    
    public ComboMeals(String comboName, double comboPrice){
        
        this.comboName = comboName;
        this.comboPrice = comboPrice;
    }
    
    public String getComboName(){
        
        return comboName;
    }
    
    public double getComboPrice(){
        
        return comboPrice;
    }
    
    public int getQuantity(){
        
        return quantity;
    }
    
    public void addQuantity(int quantity){
        
        this.quantity += quantity;
    }
    
    public void resetQuantity(){
        quantity = 0;
    }
    
}
