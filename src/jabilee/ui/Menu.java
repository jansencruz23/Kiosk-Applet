package jabilee.ui;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Menu implements Serializable {
    
    public final String FILE_NAME = "Menu.bin";
    private ArrayList<Meal> menuList = new ArrayList<>();
    
    public ArrayList<Meal> getCurrentMenu() {
        
        try {            
            Menu menu = (Menu) readMealObject(FILE_NAME).readObject();
            return menu.menuList;
        }
        catch(Exception ex) {
            return null;
        }
    }
    
    public void saveMeal(Meal meal) {
        try {
            menuList.add(meal);
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            output.writeObject(menuList);
            output.close();
            System.out.println("File saved");
        }
        catch(Exception ex) {
            System.out.println("File cannot be saved");
        }
    }
    
    public ObjectInputStream readMealObject(String fileName) throws IOException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName));
        return input;
    }
}
