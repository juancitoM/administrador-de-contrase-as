package main;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conectar_base {

    private Statement st;
    private ResultSet rta;
    private Connection conn;

    public conectar_base() {

        try {
            String driver = "org.apache.derby.jdbc.EmbeddedDriver";

            Class.forName(driver);

            conn = DriverManager.getConnection("jdbc:derby:" + cfg.host_base + ";create=true");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos");

        }
    }

    public void crear_tabla() {
        try {
            st = conn.createStatement();
            DatabaseMetaData dbmd = conn.getMetaData();
            ResultSet rs = dbmd.getTables(null, null, "CONTRASEÑAS", null);
            if (!rs.next()) {
                st.execute("CREATE TABLE contraseñas ( "
                        + "Cuenta VARCHAR(25) NOT NULL, "
                        + "Usuario VARCHAR(25) NOT NULL, "
                        + "Contraseña VARCHAR(25) NOT NULL "
                        + ")");
            }
            rs = dbmd.getTables(null, null, "USUARIOS", null);
            if (!rs.next()) {
                st.execute("CREATE TABLE Usuarios ( "                    
                        + "Usuario VARCHAR(25) NOT NULL, "
                        + "Contraseña VARCHAR(25) NOT NULL "
                        + ")");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet consulta_base(String tabla, String cuenta) {
        try {
            //3. Ejecutar SQL
            rta = st.executeQuery("SELECT * FROM " + tabla + " WHERE CUENTA = '" + cuenta + "'");
        } catch (SQLException ex) {
            //Logger.getLogger(conecta_base.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return rta;
    }
        public ResultSet consulta_usuario(String tabla, String cuenta, String contraseña) {
        try {
            //3. Ejecutar SQL
            rta = st.executeQuery("SELECT * FROM " + tabla + " WHERE CUENTA = '" + cuenta + "' AND CONTRASEÑA = " + contraseña + "'");
        } catch (SQLException ex) {
            //Logger.getLogger(conecta_base.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return rta;
    }
    
    

    public ResultSet consulta_cuentas(String tabla) {
        try {
            //3. Ejecutar SQL
            rta = st.executeQuery("SELECT Cuenta FROM " + tabla);
        } catch (SQLException ex) {
            //Logger.getLogger(conecta_base.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return rta;
    }

    public void insertar_cuenta(String cuenta, String usuario, String contraseña) {
        String instruccionSQL = "INSERT INTO contraseñas (Cuenta, Usuario, Contraseña) "
                + "VALUES ('" + cuenta + "','" + usuario + "','" + contraseña + "')";
        try {
            st.executeUpdate(instruccionSQL);
            JOptionPane.showMessageDialog(null, "La cuenta se ha creado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo crear la cuenta, por favor intente nuevamente mas tarde");
        }
    }

    public void quitar_cuenta(String cuenta) {
        String instruccionSQL = "DELETE FROM contraseñas WHERE Cuenta = '" + cuenta + "'";
        try {
            st.executeUpdate(instruccionSQL);
            JOptionPane.showMessageDialog(null, "La cuenta se ha eliminado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar la cuenta, por favor intente nuevamente mas tarde");
        }
    }

    public void modificar_cuenta(String cuenta, String usuario, String contraseña) {
        String instruccionSQL = "UPDATE contraseñas SET Usuario = '" + usuario + "', Contraseña = '" + contraseña
                + "' WHERE Cuenta = '" + cuenta + "'";
        try {
            st.executeUpdate(instruccionSQL);
            JOptionPane.showMessageDialog(null, "La cuenta se ha modificado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar la cuenta, por favor intente nuevamente mas tarde");
        }
    }
}
