/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artistas;

/**
 *
 * @author oxh4
 */
public class Dibujante extends Artista {
    private String ultimaExpo;
    private String tituloDibMasCaro;
    private Double precioDibMasCaro;
    
    
    public Dibujante(String DNI, String nombre, int anyNacimiento, String sexo, String ultimaExpo, String tituloDibMasCaro, Double precioDibMasCaro){
        super(DNI,nombre,anyNacimiento,sexo);
        this.ultimaExpo = ultimaExpo;
        this.tituloDibMasCaro = tituloDibMasCaro;
        this.precioDibMasCaro = precioDibMasCaro;
    }
    
    public void setUltimaExpo(String ultimaExpo){
    this.ultimaExpo = ultimaExpo;
    }
    
    public String getUltimaExpo(){
        return this.ultimaExpo;
    }
 
    public void setTituloDibMasCaro(String tituloDibMasCaro){
    this.tituloDibMasCaro = tituloDibMasCaro;
    }
    
    public String getTituloDibMasCaro(){
        return this.tituloDibMasCaro;
    }
    
    public void setPrecioDibMasCaro(Double precioDibMasCaro){
    this.precioDibMasCaro = precioDibMasCaro;
    }
    
    public Double getPrecioDibMasCaroo(){
        return this.precioDibMasCaro;
    }   
    
}
