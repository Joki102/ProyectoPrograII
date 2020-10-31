/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import database.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.departamento;

/**
 *
 * @author Angel
 */
public class DepaCRUD {
    
    //private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean flag;

    public DepaCRUD() {
    }
    
    public boolean insertar(Object o){
        departamento d = (departamento) o;
        flag = false;
        Conexion c = new Conexion();
        String querydb = "insert into departamento (id_departamento, nombre_departamento, turno_departamento)"+"values (?,?,?)";
        
        try{
            ps = c.conectarme().prepareStatement(querydb);
            ps.setInt(1, d.getIdDepartamento());
            ps.setString(2, d.getNombreDepartamento());
            ps.setString(3, d.getTurnoDepartamento());
            
            if(ps.executeUpdate()>0){
                flag = true;
            }
            ps.close();
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            ps = null;
            c.desconectarme();
        }
        
        
        return flag;
    }
    
    public boolean eliminar(Object o){
        departamento d = (departamento) o;
        flag = false;
        Conexion c = new Conexion();
        String querydb = "delete from departamento where id_departamento =?";
        
        try{
            ps = c.conectarme().prepareStatement(querydb);
            ps.setInt(1, d.getIdDepartamento());
            
            if(ps.executeUpdate()>0){
                flag = true;
            }
            ps.close();
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            ps = null;
            c.desconectarme();
        }
        
        
        return flag;
    }
    
}
