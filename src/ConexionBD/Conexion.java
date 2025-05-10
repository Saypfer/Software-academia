/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Rony Tabique
 */
public class Conexion {
       Connection conexion = null;
    String usuario = "sa";
    String contraseña = "1234";
    String db = "ATEMEC";
    String ip = "localhost";
    String puerto = "1433";
    
    String cadena = "jdbc:sqlserver://"+ip+":"+puerto+";databaseName="+db+";"+"encrypt=false;";
    
    public Connection establecerConexion(){
        try{
            conexion = DriverManager.getConnection(cadena, usuario, contraseña);
            System.out.println("Conexion establecida");
        }catch(Exception e){
            System.out.println("Error al conectar con la base de datos" + e.toString());
        }
        return conexion;
    }
    
}
