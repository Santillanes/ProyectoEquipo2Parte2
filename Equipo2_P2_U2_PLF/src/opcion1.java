
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santillanes
 */
public class opcion1 extends javax.swing.JFrame {

    /**
     * Creates new form opcion1
     */
    
    
    class RoundedBorder implements Border {

    private int radius;

    RoundedBorder(int radius) {
        this.radius = radius;
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
    }

    public boolean isBorderOpaque() {
        return true;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }
}
    
    public opcion1() {
        initComponents();
        setSize(1280, 720);
        this.setLocationRelativeTo(null);
        
        btnEscanear.setBorder(new RoundedBorder(30));
        btnTeclear.setBorder(new RoundedBorder(30));
        btnVolver.setBorder(new RoundedBorder(30));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEscanear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnTeclear = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        btnEscanear.setFont(new java.awt.Font("Yu Gothic UI", 1, 29)); // NOI18N
        btnEscanear.setForeground(new java.awt.Color(255, 255, 255));
        btnEscanear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/qr2.0.png"))); // NOI18N
        btnEscanear.setText("Escanear QR");
        btnEscanear.setContentAreaFilled(false);
        btnEscanear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEscanear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEscanear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscanearActionPerformed(evt);
            }
        });
        getContentPane().add(btnEscanear);
        btnEscanear.setBounds(350, 217, 240, 241);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione la opci??n de su convenencia");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(267, 79, 746, 49);

        btnTeclear.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btnTeclear.setForeground(new java.awt.Color(255, 255, 255));
        btnTeclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pin.png"))); // NOI18N
        btnTeclear.setText("Teclear c??digo");
        btnTeclear.setContentAreaFilled(false);
        btnTeclear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTeclear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTeclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnTeclear);
        btnTeclear.setBounds(691, 217, 240, 240);

        btnVolver.setFont(new java.awt.Font("Yu Gothic UI", 1, 22)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setContentAreaFilled(false);
        btnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(560, 560, 190, 28);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo 1280x720 3.0.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        menu nF = new menu();
        nF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEscanearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscanearActionPerformed
        // TODO add your handling code here:
        escanearQR nF = new escanearQR();
        nF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEscanearActionPerformed

    private void btnTeclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclearActionPerformed
        // TODO add your handling code here:
        teclear nF = new teclear();
        nF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTeclearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(opcion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(opcion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(opcion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(opcion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new opcion1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEscanear;
    private javax.swing.JButton btnTeclear;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
