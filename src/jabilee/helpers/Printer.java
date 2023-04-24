package jabilee.helpers;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Printer {
    
    public void printReceipt(JTextArea txtReceipt) {
                
        try {
            /*     
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(txtReceipt.getPrintable(null, null));
            if (job.printDialog()) {
                job.print();
                JOptionPane.showMessageDialog(
                        null, 
                        "Done printing!", 
                        "Information", 
                        JOptionPane.INFORMATION_MESSAGE
                );
            }  */         
            
            boolean isComplete = txtReceipt.print();
            
            if(isComplete) {
                JOptionPane.showMessageDialog(
                        null, 
                        "Done printing!", 
                        "Information", 
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        }
        catch(PrinterException ex) {
            
            JOptionPane.showMessageDialog(null, "Printing failed");
        }
    }
    
}
