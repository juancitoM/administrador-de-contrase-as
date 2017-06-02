package main;
/*

Versionado del programa = 2017.05.1r1

*/
import diu.swe.habib.JPanelSlider.JPanelSlider;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class mainWindow extends javax.swing.JFrame {
    private String version$ = "2017.05.1r1";
    private ResultSet rta;
    private conectar_base base;

    
    public mainWindow() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Key 2_80px.png")).getImage());
        Slider.remove(main_panel);


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
        Consulta = new javax.swing.JButton();
        campo_usuario = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
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
        Login_panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Login_usuario = new javax.swing.JTextField();
        Ingreso = new javax.swing.JButton();
        Login_contraseña = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

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
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 240, 10));

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

        Consulta.setText("Buscar");
        Consulta.setBorderPainted(false);
        Consulta.setFocusPainted(false);
        Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaActionPerformed(evt);
            }
        });
        jPanel2.add(Consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 240, 30));

        campo_usuario.setBackground(new java.awt.Color(5, 14, 22));
        campo_usuario.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(campo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 230, 30));

        jButton2.setText("jButton2");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 10, 50, 40));

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

        Login_panel.setBackground(new java.awt.Color(5, 14, 22));

        jLabel5.setBackground(new java.awt.Color(5, 14, 22));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lock_96px.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        Ingreso.setText("Ingresar");
        Ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario:");

        register.setText("Registrarse");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sign in or Sign up");

        javax.swing.GroupLayout Login_panelLayout = new javax.swing.GroupLayout(Login_panel);
        Login_panel.setLayout(Login_panelLayout);
        Login_panelLayout.setHorizontalGroup(
            Login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_panelLayout.createSequentialGroup()
                .addGroup(Login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Login_panelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Login_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Login_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Login_panelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Login_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(register))
                    .addGroup(Login_panelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(Login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        Login_panelLayout.setVerticalGroup(
            Login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(Login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(register)
                .addContainerGap())
        );

        Slider.add(Login_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 470));

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
        String cuenta = (String)Cuentas2.getSelectedItem();
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

        }
    }//GEN-LAST:event_QuitaActionPerformed

    private void ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaActionPerformed
        rta = base.consulta_base("contraseñas", (String) Cuentas.getSelectedItem());
        try {
            while (rta.next()) {
                campo_cuenta.setText((String) Cuentas.getSelectedItem());
                campo_usuario.setText(rta.getString("Usuario"));
                campo_contraseña.setText(rta.getString("Contraseña"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ConsultaActionPerformed

    private void CuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuentasActionPerformed

    }//GEN-LAST:event_CuentasActionPerformed

    private void IngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoActionPerformed
        String usuario = Login_usuario.getText();
        String base = usuario;
        String pass = "";
        int length = Login_contraseña.getPassword().length;
        char contraseña[] = new char[length];
        contraseña = Login_contraseña.getPassword();
        for (int i = 0; i <= length - 1; i++) pass += contraseña[i];       
        if (usuario == "" | pass == ""){
            JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña erroneos");
        }else { 
            this.base = new conectar_base(base, usuario, pass);
            rta = this.base.consulta_cuentas("contraseñas");
            try {
                while (rta.next()) {
                    Cuentas.addItem(rta.getString("Cuenta"));
                    Cuentas2.addItem(rta.getString("Cuenta"));
                }
            } catch (Exception e) {

            }
            Slider.add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 470));
            Slider.nextPanel(5, jPanel2, JPanelSlider.left);
        }
    }//GEN-LAST:event_IngresoActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        String usuario;
        String pass = "";
        usuario = Login_usuario.getText();
        int length = Login_contraseña.getPassword().length;
        char contraseña[] = new char[length];
        contraseña = Login_contraseña.getPassword();
        for (int i = 0; i <= length - 1; i++) pass += contraseña[i];       
        conectar_base.crear_usuario(usuario, pass);
    }//GEN-LAST:event_registerActionPerformed

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
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agrega;
    private javax.swing.JButton Consulta;
    private javax.swing.JComboBox<String> Cuentas;
    private javax.swing.JComboBox<String> Cuentas2;
    private javax.swing.JButton Ingreso;
    private javax.swing.JPasswordField Login_contraseña;
    private javax.swing.JPanel Login_panel;
    private javax.swing.JTextField Login_usuario;
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables
}
