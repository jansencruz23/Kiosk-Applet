package admin;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Admin {
    
    public static final String COMPANY_PASSWORD = "JABILEE123";
        
    public boolean isAdmin() {
        
        JPasswordField passwordField = new JPasswordField();
        Object[] message = { "Enter password: (Exit if not an admin) ", passwordField };
        int option = JOptionPane.showConfirmDialog(null, message, "Admin Login", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if(option == JOptionPane.OK_OPTION) {
            String inputPassword = new String(passwordField.getPassword());
            
            if(inputPassword.equals(COMPANY_PASSWORD))
                return true;
            
            return false;
        }
        return false;
    }
}
