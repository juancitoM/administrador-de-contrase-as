package main;

import java.io.IOException;
import java.sql.*;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conectar_base {
       
    private Statement miStatement;
    private ResultSet rta;

    public conectar_base(String base, String usuario, String contraseña) {
        
        try {

            //1.Crear conexion 
            //Connection mi_conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.78:3306/" + base , usuario, contraseña);
            Connection mi_conexion = DriverManager.getConnection("jdbc:mysql://raspibjuan.redirectme.net:3306/" + base, "root", contraseña);

            //2. Crear objeto Statement
            miStatement = mi_conexion.createStatement();

            //4.Leer el resultset
            //while (rta.next()) {
            //   System.out.println("Contraseña: " + rta.getString("Contraseña") + " Usuario: " + rta.getString("Usuario"));
            //}
        } catch (SQLException e) {
            try {
                Connection mi_conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.78:3306/" + base , usuario, contraseña);
                //Connection mi_conexion = DriverManager.getConnection("jdbc:mysql://raspibjuan.redirectme.net:3306/" + base, usuario, contraseña);
                miStatement = mi_conexion.createStatement();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos");
            }
        }
    }

    public ResultSet consulta_base(String tabla, String cuenta) {
        try {
            //3. Ejecutar SQL
            rta = miStatement.executeQuery("SELECT * FROM " + tabla + " WHERE CUENTA = '" + cuenta + "'");
        } catch (SQLException ex) {
            //Logger.getLogger(conecta_base.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return rta;
    }

    public ResultSet consulta_cuentas(String tabla) {
        try {
            //3. Ejecutar SQL
            rta = miStatement.executeQuery("SELECT Cuenta FROM " + tabla);
        } catch (SQLException ex) {
            //Logger.getLogger(conecta_base.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return rta;
    }

    public void insertar_cuenta(String cuenta, String usuario, String contraseña) {
        String instruccionSQL = "INSERT INTO contraseñas (Cuenta, Usuario, Contraseña) " +
                                "VALUES ('" + cuenta + "','" + usuario + "','" + contraseña + "')";
        try {
            miStatement.executeUpdate(instruccionSQL);
            JOptionPane.showMessageDialog(null, "La cuenta se ha creado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo crear la cuenta, por favor intente nuevamente mas tarde");
        }
    }

    public void quitar_cuenta(String cuenta) {
        String instruccionSQL = "DELETE FROM contraseñas WHERE Cuenta = '" + cuenta + "'";
        try {
            miStatement.executeUpdate(instruccionSQL);
            JOptionPane.showMessageDialog(null, "La cuenta se ha eliminado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar la cuenta, por favor intente nuevamente mas tarde");
        }
    }

    public void modificar_cuenta(String cuenta, String usuario, String contraseña) {
        String instruccionSQL = "UPDATE contraseñas SET Usuario = '" + usuario + "', Contraseña = '" + contraseña +
                                "' WHERE Cuenta = '" + cuenta + "'";
        try {
            miStatement.executeUpdate(instruccionSQL);
            JOptionPane.showMessageDialog(null, "La cuenta se ha modificado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar la cuenta, por favor intente nuevamente mas tarde");
        }
    }
    
    public static void crear_usuario(String usuario, String contraseña){
        String instruccionSQL = "CREATE DATABASE IF NOT EXISTS " + usuario;
        String serverIP =  "raspibjuan.redirectme.net";
        Statement miStatement;
        try {
            Connection mi_conexion = DriverManager.getConnection("jdbc:mysql://raspibjuan.redirectme.net:3306/?user=root&password=juanchosanfer19");
            miStatement = mi_conexion.createStatement();
            miStatement.executeUpdate(instruccionSQL);
            miStatement.executeUpdate("CREATE USER " + usuario + "@" + serverIP + " IDENTIFIED BY " + contraseña );
            miStatement.executeUpdate("GRANT ALL PRIVILEGES ON " + usuario + ".* TO '" + usuario + "'@'" + serverIP + "'");
            miStatement.executeUpdate("FLUSH PRIVILEGES");
            miStatement.executeUpdate("CREATE TABLE contraseñas ("
                                                    + "Cuenta VARCHAR(30), "
                                                    + "Usuario VARCHAR(30), "
                                                    + "Contraseña VARCHAR(30))");
            
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "No se pudo crear el usuario, por favor intente nuevamente mas tarde");
            e.printStackTrace();
        }
    }
    
    
}
