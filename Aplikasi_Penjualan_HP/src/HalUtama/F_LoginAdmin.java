/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HalUtama;

import Admin.F_UtamaInput;

/**
 *
 * @author ASUS
 */
public class F_LoginAdmin extends javax.swing.JFrame {

    /**
     * Creates new form F_LoginAdmin
     */
    public F_LoginAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_uname = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btn_signin = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));
        getContentPane().add(txt_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 200, 30));
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 200, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        btn_signin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_signin.setText("Sign In");
        btn_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signinActionPerformed(evt);
            }
        });
        getContentPane().add(btn_signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 90, -1));

        btn_cancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Gambar\\IMG_20220209_135350.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -1000, 720, 1500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signinActionPerformed
        // TODO add your handling code here:
        String Username = txt_uname.getText();
        String Password = txt_pass.getText();
        
        String [] login_array = new String[2];
        login_array[0] = "biru";
        login_array[1] = "zxcv";
        if (Username.equals(login_array[0]) && Password.equals(login_array[1])){
        this.setVisible(false);
        new F_Halaman().setVisible(true);
                
        } else {
            javax.swing.JOptionPane.showInputDialog(null, "Username dan Password Tidak Berhasil");
        txt_uname.setText("");
        txt_pass.setText("");
        }
        
 
    }//GEN-LAST:event_btn_signinActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        F_Halaman utama = new F_Halaman();
        utama.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(F_LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_LoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_signin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_uname;
    // End of variables declaration//GEN-END:variables
}
