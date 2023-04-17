package jabilee.ui;

import java.awt.print.PrinterException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Printer {
    
    public void printReceipt(JTextArea txtReceipt) {
                
        try {
                        
            boolean isComplete = txtReceipt.print();
            
            if(isComplete) {
                JOptionPane.showMessageDialog(
                        null, 
                        "Done printing!", 
                        "Information", 
                        JOptionPane.INFORMATION_MESSAGE
                );
                
            }
            else
                JOptionPane.showMessageDialog(
                        null, 
                        "Printing", 
                        "Printer", 
                        JOptionPane.INFORMATION_MESSAGE
                );
        }
        catch(PrinterException ex) {
            
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
