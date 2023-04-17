package font;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class Fonts {
    private static Font jellee;
    private static Font receipt;
    
    public static Font getJelleeFont(float fontSize) {
        
        try{
            
            jellee = Font.createFont(Font.TRUETYPE_FONT, new File("Jellee-Roman.ttf")).deriveFont(fontSize);
            GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            graphicsEnvironment.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Jellee-Roman.ttf")));
        }
         catch(IOException | FontFormatException ex){
            System.out.println(ex.getMessage());
        }
        
        return jellee;
    }
    
    public static Font getReceiptFont(float fontSize) {
        
        try{
            
            receipt = Font.createFont(Font.TRUETYPE_FONT, new File("receipt.ttf")).deriveFont(fontSize);
            GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            graphicsEnvironment.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("receipt.ttf")));
        }
         catch(IOException | FontFormatException ex){
            System.out.println(ex.getMessage());
        }
        
        return receipt;
    }
}
