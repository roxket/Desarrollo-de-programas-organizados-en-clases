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
public class Artista {
    private String DNI;
    private String nombre;
    private int anyNacimiento;
    private String sexo;
    
    public Artista(){
    }
    
    public Artista(String DNI, String nombre, int anyNacimiento,String sexo){
        this.DNI = DNI;
        this.nombre = nombre;
        this.anyNacimiento = anyNacimiento;
        this.sexo = sexo;
    }
    
    public String getDNI(){
        return this.DNI;
    }
    
    public void setDNI(String dni){
        this.DNI = dni;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getAnyNacimiento(){
        return this.anyNacimiento;
    }
    
    public void setAnyNacimiento(int anyNacimiento){
        this.anyNacimiento = anyNacimiento;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
}
