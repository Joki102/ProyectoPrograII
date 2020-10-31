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
public class Cliente {
    String nomCli;
    String apeCli;
    int edad;
    String genero;
    String dpi;

    public Cliente() {
    }

    public Cliente(String nomCli, String apeCli, int edad, String genero, String dpi) {
        this.nomCli = nomCli;
        this.apeCli = apeCli;
        this.edad = edad;
        this.genero = genero;
        this.dpi = dpi;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getApeCli() {
        return apeCli;
    }

    public void setApeCli(String apeCli) {
        this.apeCli = apeCli;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
    
    
}
