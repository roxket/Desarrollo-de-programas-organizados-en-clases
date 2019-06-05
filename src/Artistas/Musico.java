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
public class Musico extends Artista{
    private String website;
    private String tituloUltimoDisco;
    private String [] top10 = new String[9];
    
    
    public Musico(String DNI, String nombre, int anyNacimiento, String sexo, String website, String tituloUltimoDisco, String [] top10){
        super(DNI,nombre,anyNacimiento,sexo);
        this.website = website;
        this.tituloUltimoDisco = tituloUltimoDisco;
        this.top10 = top10;
    }
    
    public void setWebsite(String website){
        this.website = website;
    }
    
    public String getWebsite(){
       return this.website;
    }
    
    public void setTituloUltimoDisco(String tituloUltimoDisco){
       this.tituloUltimoDisco = tituloUltimoDisco;
    }
    
    public String getTituloUltimoDisco(){
       return this.tituloUltimoDisco;
    }
    
    public void setTop10(String [] top10){
       this.top10 = top10;
    }
    
    public String [] getTop10(){
       return this.top10;
    }

    public void mostrarCanciones(){
        for(int i=0; i<top10.length;i++){
            System.out.println(top10[i]);
        }
    }
    
    public void setCancion(String cancion, int posicion){
        int setPosicion = posicion-1;
        if(setPosicion>=0 && setPosicion<=9){
        top10[setPosicion] = cancion;
        }
    }

    
}
