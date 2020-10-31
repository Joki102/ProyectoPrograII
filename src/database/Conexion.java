
package database;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    Connection con;
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/zoologico?serverTimezone=UTC";
    private final String USER = "root";
    private final String PASSWORD = "47S58f101=%";
    
    public Connection cadena;
    
    public Conexion(){
        this.cadena = null;
    }
    
    public Connection conectarme(){
        try{
            Class.forName(DRIVER);
            this.cadena = DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return this.cadena;
    }
    
    public void desconectarme(){
        try{
            this.cadena.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
}
