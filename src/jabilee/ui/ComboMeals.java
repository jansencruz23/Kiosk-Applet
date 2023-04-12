package jabilee.ui;

public class ComboMeals {
    private String comboName;
    private double comboPrice;
    
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
}
