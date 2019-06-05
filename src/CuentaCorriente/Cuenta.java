/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaCorriente;

/**
 *
 * @author oxh4
 */
public class Cuenta {
    
    //Atributos
    private String numCuenta;
    private double saldo;
    private String titular;
    
    //Constructor default
    private Cuenta(){};
    
    //Constructor ampliado
    public Cuenta(String numCuenta, double saldo, String titular){
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.titular = titular;
    };
    
    //Setters y Getters
    
//    public void setNumeroCuenta(String numCuenta){
//        this.numCuenta = numCuenta;
//    }
    
    public String getNumeroCuenta(){
        return numCuenta;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    };
    
    public void setTitular(String titular){
        this.titular = titular;
    };
}
