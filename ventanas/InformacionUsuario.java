
package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
        
public class InformacionUsuario extends javax.swing.JFrame {

    String user = "", user_update = "";
    int ID;
   
    public InformacionUsuario() {
        initComponents();
        user = Login.user;
        user_update = GestionarUsuarios.user_update;
        
        setSize(630,450);
        setResizable(false);
        setTitle("Informacion del usuario " + user_update + " - Sesion de " + user);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        jLabel_Titulo.setText("Informacion del usuario " + user_update);
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
            "select * from usuarios where username = '" + user_update + "'");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                ID = rs.getInt("id_usuario");
                
                txt_Nombre.setText(rs.getString("nombre_usuario"));
                txt_Mail.setText(rs.getString("email"));
                txt_Telefono.setText(rs.getString("telefono"));
                txt_Username.setText(rs.getString("username"));
                txt_RegistradoPor.setText(rs.getString("registrado_por"));
                
                cmb_Niveles.setSelectedItem(rs.getString("tipo_nivel"));
                cmb_Estatus.setSelectedItem(rs.getString("estatus"));
                
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar usuario. " +e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Mail = new javax.swing.JLabel();
        jLabel_Telefono = new javax.swing.JLabel();
        jLabel_Username = new javax.swing.JLabel();
        jLabel_PermisosDe = new javax.swing.JLabel();
        jLabel_Estatus = new javax.swing.JLabel();
        jLabel_RegistradoPor = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Mail = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        txt_Username = new javax.swing.JTextField();
        txt_RegistradoPor = new javax.swing.JTextField();
        cmb_Estatus = new javax.swing.JComboBox();
        cmb_Niveles = new javax.swing.JComboBox();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_RestaurarPassword = new javax.swing.JButton();
        jLabel_Footer = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setText("Informacion de Usuario");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel_Nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre.setText("Nombre:");
        getContentPane().add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel_Mail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Mail.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Mail.setText("Email:");
        getContentPane().add(jLabel_Mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel_Telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Telefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Telefono.setText("Telefono:");
        getContentPane().add(jLabel_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel_Username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Username.setText("Username:");
        getContentPane().add(jLabel_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel_PermisosDe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_PermisosDe.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PermisosDe.setText("Permisos de:");
        getContentPane().add(jLabel_PermisosDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel_Estatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Estatus.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Estatus.setText("Estatus:");
        getContentPane().add(jLabel_Estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel_RegistradoPor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_RegistradoPor.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_RegistradoPor.setText("Registrado por:");
        getContentPane().add(jLabel_RegistradoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        txt_Nombre.setBackground(new java.awt.Color(153, 153, 255));
        txt_Nombre.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        txt_Mail.setBackground(new java.awt.Color(153, 153, 255));
        txt_Mail.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_Mail.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_Mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        txt_Telefono.setBackground(new java.awt.Color(153, 153, 255));
        txt_Telefono.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_Telefono.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        txt_Username.setBackground(new java.awt.Color(153, 153, 255));
        txt_Username.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_Username.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 210, -1));

        txt_RegistradoPor.setBackground(new java.awt.Color(153, 153, 255));
        txt_RegistradoPor.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_RegistradoPor.setForeground(new java.awt.Color(255, 255, 255));
        txt_RegistradoPor.setEnabled(false);
        getContentPane().add(txt_RegistradoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 210, -1));

        cmb_Estatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));
        getContentPane().add(cmb_Estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        cmb_Niveles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Capturista", "Tecnico", " " }));
        getContentPane().add(cmb_Niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jButton_Actualizar.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Actualizar.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jButton_Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Actualizar.setText("Actualizar Usuario");
        jButton_Actualizar.setBorder(null);
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 210, 35));

        jButton_RestaurarPassword.setBackground(new java.awt.Color(153, 153, 255));
        jButton_RestaurarPassword.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jButton_RestaurarPassword.setForeground(new java.awt.Color(255, 255, 255));
        jButton_RestaurarPassword.setText("Restaurar Password");
        jButton_RestaurarPassword.setBorder(null);
        jButton_RestaurarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RestaurarPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RestaurarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 210, 35));

        jLabel_Footer.setText("Creado por Marcus Skelly");
        getContentPane().add(jLabel_Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, 20));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed
      
        int permisos_cmb , estatus_cmb, validacion = 0;
        String nombre, mail, telefono, username, pass, permisos_string = "", estatus_string = "";
        
        mail = txt_Mail.getText().trim();
        username = txt_Username.getText().trim();
        nombre = txt_Nombre.getText().trim();
        telefono = txt_Telefono.getText().trim();
        permisos_cmb = cmb_Niveles.getSelectedIndex()+1;
        estatus_cmb = cmb_Estatus.getSelectedIndex()+1;
        
        if(mail.equals("")){
            txt_Mail.setBackground(Color.red);
            validacion++;
        }
        if(username.equals("")){
            txt_Username.setBackground(Color.red);
            validacion++;
        }
        
        if(nombre.equals("")){
            txt_Nombre.setBackground(Color.red);
            validacion++;
        }
        if(telefono.equals("")){
            txt_Telefono.setBackground(Color.red);
            validacion++;
        }
        
        if(validacion == 0){
            
            if(permisos_cmb == 1){
                permisos_string = "Administrador";
            }else if(permisos_cmb == 2){
                permisos_string = "Capturista";
            }else if(permisos_cmb == 3){
                permisos_string = "Tecnico";
            }
            
            if(estatus_cmb == 1){
                estatus_string = "Activo";
            }else if(estatus_cmb == 2){
                estatus_string = "Inactivo";
            }
            
            try {
                
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                "select username from usuarios where username = '" + username + "' and not id_usuario = '" + ID + "'");
                
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    
                    txt_Username.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible");
                    cn.close();
                }else{
                    
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pst2 = cn2.prepareStatement(
                    "update usuarios set nombre_usuario=?, email=?, telefono=?, username=?,tipo_nivel=?, estatus=? "
                            + "where id_usuario = '" +ID + "'");
                    
                    pst2.setString(1, nombre);
                    pst2.setString(2, mail);
                    pst2.setString(3, telefono);
                    pst2.setString(4, username);
                    pst2.setString(5, permisos_string);
                    pst2.setString(6, estatus_string);
                    
                    pst2.executeUpdate();
                    cn2.close();
                    
                    JOptionPane.showMessageDialog(null, "Modificacion correcta");
                }
            } catch (SQLException e) {
                System.err.println("Error al Actualizar." + e);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        }
    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    private void jButton_RestaurarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RestaurarPasswordActionPerformed
        
        RestaurarPassword restaurarPassword = new RestaurarPassword();
        restaurarPassword.setVisible(true);
    }//GEN-LAST:event_jButton_RestaurarPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmb_Estatus;
    private javax.swing.JComboBox cmb_Niveles;
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_RestaurarPassword;
    private javax.swing.JLabel jLabel_Estatus;
    private javax.swing.JLabel jLabel_Footer;
    private javax.swing.JLabel jLabel_Mail;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_PermisosDe;
    private javax.swing.JLabel jLabel_RegistradoPor;
    private javax.swing.JLabel jLabel_Telefono;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_Mail;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_RegistradoPor;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}
