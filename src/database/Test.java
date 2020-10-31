/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;


import CRUD.DepaCRUD;
import java.sql.Connection;
import modelo.departamento;


/**
 *
 * @author Angel
 */
public class Test {
    
    public static void main (String args[]){
        
        Conexion c = new Conexion();
        c.conectarme();
        
        if(c.cadena!=null){
            System.out.println("EXITO");
        }
        else{
            System.out.println("NO HAY CONEXION");
        }
        
        departamento depa = new departamento();
        depa.setIdDepartamento(3);
        depa.setNombreDepartamento("Limpieza");
        depa.setTurnoDepartamento("nocturno");
        


        //departamento depa1 = new departamento();
        //depa.setIdDepartamento();
        //persistir datos;
        
        DepaCRUD depacrud1 = new DepaCRUD();
        depacrud1.eliminar(depa);
        
        
    }
}
