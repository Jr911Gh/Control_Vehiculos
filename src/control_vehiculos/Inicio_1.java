/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_vehiculos;

import formularios.conectar1;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Inicio_1 extends javax.swing.JFrame {
        
    /**
     * Creates new form NewJFrame
     */
    public Inicio_1() {
        initComponents();
        cerrar();
    }

     public void cerrar(){
        try{
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            
            addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e){
                    confirmarSalida();
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
        }
    }
    
 public void confirmarSalida(){
     int valor= JOptionPane.showConfirmDialog(this, "¿Desea cerrar esta ventana?","Advertencia",JOptionPane.YES_NO_OPTION);
     if(valor == JOptionPane.YES_OPTION){
         this.dispose();
         
     }
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_usuario1 = new javax.swing.JTextField();
        btn_ingreso = new javax.swing.JButton();
        txt_contrasena1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Sistema de Control de Vehículos ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Nombre de Usuario:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Contraseña:");

        txt_usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuario1ActionPerformed(evt);
            }
        });
        txt_usuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usuario1KeyTyped(evt);
            }
        });

        btn_ingreso.setBackground(new java.awt.Color(204, 255, 255));
        btn_ingreso.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_ingreso.setForeground(new java.awt.Color(0, 0, 255));
        btn_ingreso.setText("Iniciar Sesión");
        btn_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresoActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/control_vehiculos/Imagenes/Logo apm png.png"))); // NOI18N
        jLabel4.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(69, 69, 69))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(31, 31, 31)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_usuario1)
                                    .addComponent(txt_contrasena1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))))
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_contrasena1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(64, 64, 64)
                .addComponent(btn_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuario1ActionPerformed
        
    int Contador = 3;
    private void btn_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresoActionPerformed

        
        String Usuario = this.txt_usuario1.getText();
        String Contrasena = this.txt_contrasena1.getText();
        
        conectar1 cc = new conectar1();
        Connection cn = cc.conexion();
        try {
            String sql = "SELECT * FROM usuariosInt";
            PreparedStatement pstm =cn.prepareCall(sql);
            ResultSet rst = pstm.executeQuery();
            while (rst.next()) {
                if ("".equals(Usuario)){ 
                JOptionPane.showMessageDialog(null, "Ingrese su nombre de usuario", "Usuario",
                JOptionPane.INFORMATION_MESSAGE);
            }else{
                if ("".equals(Contrasena)){ 
                    JOptionPane.showMessageDialog(null, "Ingrese la contraseña", "Contraseña",
                    JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    if (!rst.getString("Nombre_usuario").equals(Usuario)){
                        JOptionPane.showMessageDialog(null, "El nombre de usuario es incorrecto, por favor ingrese uno válido", "Advertencia",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    else{
                        if (rst.getString("Clave_usuario").equals(Contrasena)){
                            Menu_principal_1 obj = new Menu_principal_1();
                            obj.setVisible(true);
                            dispose();
                        }else{
                        JOptionPane.showMessageDialog(null, "La contraseña ingresada es incorrecta, intente nuevamente por favor", "Advertencia",
                        JOptionPane.WARNING_MESSAGE);
                        --Contador;
                        }
                        System.out.println(Contador);
                            if (Contador == 0){
                                JOptionPane.showMessageDialog(null, "Ha superado el número de intentos (3), la aplicación se cerrará ahora", "Advertencia",
                                JOptionPane.INFORMATION_MESSAGE);
                               dispose();
                            }else{
                                
                            }
                        }    
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
                        
        //A continuación se realizarán las validaciones 
        
    }//GEN-LAST:event_btn_ingresoActionPerformed
      
    private void txt_usuario1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuario1KeyTyped
        char ID = evt.getKeyChar();
        if ((ID<'a' || ID>'z')&&(ID<'A' || ID>'Z')&& (ID!=evt.VK_SPACE)
           && (ID!=(char)KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
           JOptionPane.showMessageDialog(null, "Solo se admiten caracteres alfabéticos", "Advertencia",
           JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_usuario1KeyTyped

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
            java.util.logging.Logger.getLogger(Inicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txt_contrasena1;
    private javax.swing.JTextField txt_usuario1;
    // End of variables declaration//GEN-END:variables
}
