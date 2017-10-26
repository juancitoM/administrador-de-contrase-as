package main;

/*

Versionado del programa = 2017.05.1r1

 */
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import org.apache.log4j.*;

public class mainWindow extends javax.swing.JFrame {

    private String version$ = "2017.05.1r1";
    private ResultSet rta;
    private conectar_base base;
    private static final Logger log = Logger.getLogger(mainWindow.class);
    
    public mainWindow() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Key 2_80px.png")).getImage());
        new cfg();
        PropertyConfigurator.configure("log4j.properties");
        base = new conectar_base();
        base.crear_tabla();
        rta = base.consulta_cuentas("contraseñas");
        try {
            while (rta.next()) {
                Cuentas.addItem(rta.getString("cuenta"));
                Cuentas2.addItem(rta.getString("cuenta"));
            }
        } catch (SQLException ex) {
            log.error("No se pueden agregar las cuentas");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Slider = new diu.swe.habib.JPanelSlider.JPanelSlider();
        main_panel = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Cuentas = new javax.swing.JComboBox<>();
        campo_contraseña = new javax.swing.JLabel();
        campo_cuenta = new javax.swing.JLabel();
        campo_usuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        Quita = new javax.swing.JButton();
        Agrega = new javax.swing.JButton();
        campo_contraseña2 = new javax.swing.JTextField();
        campo_cuenta2 = new javax.swing.JTextField();
        campo_usuario2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        campo_contraseña3 = new javax.swing.JTextField();
        campo_cuenta3 = new javax.swing.JTextField();
        campo_usuario3 = new javax.swing.JTextField();
        Cuentas2 = new javax.swing.JComboBox<>();
        Modifica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 100, 0, 0));
        setResizable(false);

        Slider.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_panel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                main_panelStateChanged(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(5, 14, 22));
        jPanel2.setEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 186, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 230, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 230, 10));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cuenta:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 296, -1, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 230, 10));

        Cuentas.setBorder(null);
        Cuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuentasActionPerformed(evt);
            }
        });
        jPanel2.add(Cuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 160, -1));

        campo_contraseña.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        campo_contraseña.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(campo_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 230, 30));

        campo_cuenta.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        campo_cuenta.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(campo_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 94, 230, 30));

        campo_usuario.setBackground(new java.awt.Color(5, 14, 22));
        campo_usuario.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(campo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 230, 30));

        jPanel1.setBackground(new java.awt.Color(25, 162, 95));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        jLabel13.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel13)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 376, 170, 30));

        main_panel.addTab("Consulta", jPanel2);

        jPanel4.setBackground(new java.awt.Color(5, 14, 22));
        jPanel4.setEnabled(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Usuario:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 186, -1, -1));
        jPanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 230, 10));
        jPanel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 230, 10));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cuenta:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contraseña:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 296, -1, -1));
        jPanel4.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 240, 10));

        Quita.setText("Quitar");
        Quita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitaActionPerformed(evt);
            }
        });
        jPanel4.add(Quita, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 100, 40));

        Agrega.setText("Agregar");
        Agrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregaActionPerformed(evt);
            }
        });
        jPanel4.add(Agrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 100, 40));

        campo_contraseña2.setBackground(new java.awt.Color(5, 14, 22));
        campo_contraseña2.setForeground(new java.awt.Color(255, 255, 255));
        campo_contraseña2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(campo_contraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 230, 30));

        campo_cuenta2.setBackground(new java.awt.Color(5, 14, 22));
        campo_cuenta2.setForeground(new java.awt.Color(255, 255, 255));
        campo_cuenta2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        campo_cuenta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_cuenta2ActionPerformed(evt);
            }
        });
        jPanel4.add(campo_cuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 230, 30));

        campo_usuario2.setBackground(new java.awt.Color(5, 14, 22));
        campo_usuario2.setForeground(new java.awt.Color(255, 255, 255));
        campo_usuario2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(campo_usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 230, 30));

        main_panel.addTab("Agregar o Borrar", jPanel4);

        jPanel5.setBackground(new java.awt.Color(5, 14, 22));
        jPanel5.setEnabled(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Usuario:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
        jPanel5.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 240, 10));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contraseña:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));
        jPanel5.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 240, 10));

        campo_contraseña3.setBackground(new java.awt.Color(5, 14, 22));
        campo_contraseña3.setForeground(new java.awt.Color(255, 255, 255));
        campo_contraseña3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(campo_contraseña3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 240, 40));

        campo_cuenta3.setBackground(new java.awt.Color(5, 14, 22));
        campo_cuenta3.setForeground(new java.awt.Color(255, 255, 255));
        campo_cuenta3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        campo_cuenta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_cuenta3ActionPerformed(evt);
            }
        });
        jPanel5.add(campo_cuenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 230, 30));

        campo_usuario3.setBackground(new java.awt.Color(5, 14, 22));
        campo_usuario3.setForeground(new java.awt.Color(255, 255, 255));
        campo_usuario3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(campo_usuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 240, 40));

        Cuentas2.setBorder(null);
        Cuentas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cuentas2ActionPerformed(evt);
            }
        });
        jPanel5.add(Cuentas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 160, -1));

        Modifica.setText("Modificar");
        Modifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaActionPerformed(evt);
            }
        });
        jPanel5.add(Modifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 130, 40));

        main_panel.addTab("Modificar", jPanel5);

        Slider.add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void main_panelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_main_panelStateChanged
        campo_cuenta.setText("");
        campo_usuario.setText("");
        campo_contraseña.setText("");
        campo_cuenta2.setText("");
        campo_usuario2.setText("");
        campo_contraseña2.setText("");
    }//GEN-LAST:event_main_panelStateChanged

    private void ModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificaActionPerformed
        String cuenta = (String) Cuentas2.getSelectedItem();
        String usuario = campo_usuario3.getText();
        String contraseña = campo_contraseña3.getText();

        base.modificar_cuenta(cuenta, usuario, contraseña);

        campo_usuario3.setText("");
        campo_contraseña3.setText("");

    }//GEN-LAST:event_ModificaActionPerformed

    private void Cuentas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cuentas2ActionPerformed
        /*    rta = base.consulta_base("contraseñas", (String) Cuentas2.getSelectedItem());
        try {
            while (rta.next()) {
                campo_usuario3.setText(rta.getString("Usuario"));
                campo_contraseña3.setText(rta.getString("Contraseña"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
         */
    }//GEN-LAST:event_Cuentas2ActionPerformed

    private void campo_cuenta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_cuenta3ActionPerformed

    }//GEN-LAST:event_campo_cuenta3ActionPerformed

    private void campo_cuenta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_cuenta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_cuenta2ActionPerformed

    private void AgregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregaActionPerformed
        String cuenta = campo_cuenta2.getText();
        String usuario = campo_usuario2.getText();
        String contraseña = campo_contraseña2.getText();
        int id;

        base.insertar_cuenta(cuenta, usuario, contraseña);
        campo_cuenta2.setText("");
        campo_usuario2.setText("");
        campo_contraseña2.setText("");
        Cuentas.removeAllItems();
        Cuentas2.removeAllItems();
        rta = base.consulta_cuentas("contraseñas");
        try {
            while (rta.next()) {
                Cuentas.addItem(rta.getString("Cuenta"));
                Cuentas2.addItem(rta.getString("Cuenta"));
            }
        } catch (Exception e) {
            //e.printStackTrace();
            log.error("Error en Agrega cuentas");
        }
    }//GEN-LAST:event_AgregaActionPerformed

    private void QuitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitaActionPerformed
        String cuenta = campo_cuenta2.getText();

        base.quitar_cuenta(cuenta);

        campo_cuenta2.setText("");
        campo_usuario2.setText("");
        campo_contraseña2.setText("");
        Cuentas.removeAllItems();
        Cuentas2.removeAllItems();
        rta = base.consulta_cuentas("contraseñas");
        try {
            while (rta.next()) {
                Cuentas.addItem(rta.getString("Cuenta"));
                Cuentas2.addItem(rta.getString("Cuenta"));
            }
        } catch (Exception e) {
            log.error("Error en Quita cuentas");
        }
    }//GEN-LAST:event_QuitaActionPerformed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        Color color = new Color(25, 162, 95);
        jPanel1.setBackground(color);
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        Color color = new Color(16, 108, 63);
        jPanel1.setBackground(color);
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

        //rta = base.consulta_base("contraseñas", (String) Cuentas.getSelectedItem(), usuario_log);
        rta = base.consulta_base("contraseñas");
        try {
            while (rta.next()) {
                campo_cuenta.setText((String) Cuentas.getSelectedItem());
                campo_usuario.setText(rta.getString("usuario"));
                campo_contraseña.setText(rta.getString("contraseña"));
            }
        } catch (SQLException e) {
            //e.printStackTrace();
            log.error("Error consultando cuentas");
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void CuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuentasActionPerformed

    }//GEN-LAST:event_CuentasActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
 /* //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        new mainWindow().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agrega;
    private javax.swing.JComboBox<String> Cuentas;
    private javax.swing.JComboBox<String> Cuentas2;
    private javax.swing.JButton Modifica;
    private javax.swing.JButton Quita;
    private diu.swe.habib.JPanelSlider.JPanelSlider Slider;
    private javax.swing.JLabel campo_contraseña;
    private javax.swing.JTextField campo_contraseña2;
    private javax.swing.JTextField campo_contraseña3;
    private javax.swing.JLabel campo_cuenta;
    private javax.swing.JTextField campo_cuenta2;
    private javax.swing.JTextField campo_cuenta3;
    private javax.swing.JLabel campo_usuario;
    private javax.swing.JTextField campo_usuario2;
    private javax.swing.JTextField campo_usuario3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane main_panel;
    // End of variables declaration//GEN-END:variables
}
