package jabilee.openingscreen;

import font.Fonts;
import jabilee.ui.JabileeUI;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class OpeningScreen extends javax.swing.JFrame {

    ImageIcon[] images = new ImageIcon[3];
    float[] fontSizes = new float[2];
    int currentImageIndex;
    int currentFontSizeIndex;
    
    public OpeningScreen() {
        
        initComponents();
        initImages();
        setLocationRelativeTo(null);
        displayOpeningScreen();
        displayLabelAnimation();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblClick = new javax.swing.JLabel();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome To Jabilee");
        setIconImage(new ImageIcon(getClass().getResource("/resources/logo.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        panelBg.setBackground(new java.awt.Color(255, 255, 255));
        panelBg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBg.setMinimumSize(new java.awt.Dimension(1000, 600));
        panelBg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                screenClicked(evt);
            }
        });
        panelBg.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                screenClicked(evt);
            }
        });
        jPanel1.setLayout(new java.awt.BorderLayout());

        lblClick.setFont(Fonts.getJelleeFont(24f));
        lblClick.setForeground(new java.awt.Color(255, 255, 255));
        lblClick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClick.setText("CLICK ANYWHERE TO BEGIN!");
        jPanel1.add(lblClick, java.awt.BorderLayout.CENTER);

        panelBg.add(jPanel1);
        jPanel1.setBounds(0, 442, 1000, 120);
        panelBg.add(lblBg);
        lblBg.setBounds(0, 0, 1000, 442);

        getContentPane().add(panelBg);
        panelBg.setBounds(0, 0, 1090, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void initImages() {
        
        images[0] = getResizedIcon("/resources/img1.jpg", 1000,650);
        images[1] = getResizedIcon("/resources/img3.jpg", 1000,650);
        images[2] = new ImageIcon(getClass().getResource("/resources/img2.gif"));
    }
    
    private void displayOpeningScreen() {
        
        lblBg.setIcon(images[0]);
        
        new Timer(3000, (e) -> {
            
            currentImageIndex = (currentImageIndex + 1) % images.length;
            lblBg.setIcon(images[currentImageIndex]);
        }).start();
    }
    
    private void displayLabelAnimation() {
        
        fontSizes[0] = 24f;
        fontSizes[1] = 26f;
        
        lblClick.setFont(Fonts.getJelleeFont(fontSizes[0]));
        
        new Timer(500, (e) -> {
            
            currentFontSizeIndex = (currentFontSizeIndex + 1) % fontSizes.length;
            lblClick.setFont(Fonts.getJelleeFont(fontSizes[currentFontSizeIndex]));
        }).start();
    }
    
    public ImageIcon getResizedIcon(String path, int width, int height) {
        
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(path));
        Image img = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(img);
        
        return imgIcon;
    }
    
    private void screenClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_screenClicked
        
        new JabileeUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_screenClicked
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OpeningScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpeningScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpeningScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpeningScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new OpeningScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblClick;
    private javax.swing.JPanel panelBg;
    // End of variables declaration//GEN-END:variables
}
