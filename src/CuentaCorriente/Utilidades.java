
package CuentaCorriente;

/**
 *
 * @author oxh4
 */
public class Utilidades {


    //Atributos
    private int entero;
    private Double doble;
    
    //Contructor default
    public Utilidades() {
    }
    //Contructor ampliado
    
    //Setters y Getters
    public int pedirEntero(String entero){
        int result;
        this.entero = Integer.parseInt(entero);
        
        return this.entero;
    }
    
    public Double pedirDoble(String doble){
        this.doble = Double.parseDouble(doble);
        return this.doble;
    }
  
}
