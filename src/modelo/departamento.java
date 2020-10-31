/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Angel
 */
public class departamento {
    int idDepartamento;
    String nombreDepartamento;
    String turnoDepartamento;

    public departamento() {
    }

    public departamento(int idDepa, String nombreDepartamento, String turnoDepartamento) {
        this.idDepartamento = idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
        this.turnoDepartamento = turnoDepartamento;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getTurnoDepartamento() {
        return turnoDepartamento;
    }

    public void setTurnoDepartamento(String turnoDepartamento) {
        this.turnoDepartamento = turnoDepartamento;
    }
    
    
    
    
}
