package font;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class Fonts {
    private static Font Jellee;
    
    private static Font getJelleFont(float fontSize) {
        
        try{
            
            Jellee = Font.createFont(Font.TRUETYPE_FONT, new File("Jellee-Roman.ttf")).deriveFont(fontSize);
            GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            graphicsEnvironment.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Jellee-Roman.ttf")));
        }
         catch(IOException | FontFormatException ex){
            System.out.println(ex.getMessage());
        }
        
        return Jellee;
    }
}
