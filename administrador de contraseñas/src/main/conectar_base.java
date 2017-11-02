package main;

import java.sql.*;
import javax.swing.JOptionPane;
import org.apache.log4j.*;

public class conectar_base {

    private Statement st;
    private ResultSet rta;
    private Connection conn;
    static int ID = 1;
    private final static Logger log = Logger.getLogger(conectar_base.class);

    public conectar_base() {

        try {
            String driver = "org.apache.derby.jdbc.EmbeddedDriver";

            Class.forName(driver);

            conn = DriverManager.getConnection("jdbc:derby:" + cfg.host_base + ";create=true");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos");
            log.error("No hay conexion con la base de datos");
            System.exit(0);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos");
            log.error("No hay conexion con la base de datos 1");         
            System.exit(0);
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

        } catch (Exception e) {
            log.error("No se pudo crear la tabla CONTRASEÑAS");
        }
    }

    public ResultSet consulta_base(String tabla, String cuenta) {
        try {
            //3. Ejecutar SQL
            rta = st.executeQuery("SELECT * FROM " + tabla + " where cuenta = '" + cuenta + "'");
           
        } catch (SQLException ex) {
            log.error(ex.toString() + " Error en consulta_base");
        }
        return rta;
    }

    public ResultSet consulta_cuentas(String tabla) {
        try {
            //3. Ejecutar SQL
            rta = st.executeQuery("SELECT CUENTA FROM " + tabla);

        } catch (SQLException ex) {
            log.error("Error en consulta_cuentas");
        }
        return rta;
    }

    public void insertar_cuenta(String cuenta, String usuario, String contraseña) {
        String instruccionSQL = "INSERT INTO contraseñas "
                + "VALUES ('" + cuenta + "','" + usuario + "','" + contraseña + "')";
        try {
            st.executeUpdate(instruccionSQL);
            JOptionPane.showMessageDialog(null, "La cuenta se ha creado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo crear la cuenta, por favor intente nuevamente mas tarde");
            log.error("Error en insertar_cuenta");
        }
    }

    public void quitar_cuenta(String cuenta) {
        String instruccionSQL = "DELETE FROM contraseñas WHERE Cuenta = '" + cuenta + "'";
        try {
            st.executeUpdate(instruccionSQL);
            JOptionPane.showMessageDialog(null, "La cuenta se ha eliminado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar la cuenta, por favor intente nuevamente mas tarde");
            log.error("Error en quitar_cuenta");
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
            log.error("Error en modificar_cuenta");
        }
    }
}
