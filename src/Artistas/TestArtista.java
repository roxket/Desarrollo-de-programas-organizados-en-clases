/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artistas;

import java.util.Arrays;

/**
 *
 * @author oxh4
 */
public class TestArtista {
    public static void main (String[] args){
    
        Artista artista1 = new Artista();
      
        artista1.setDNI("12345678Z");
        artista1.setNombre("Jon");
        artista1.setAnyNacimiento(1991);
        artista1.setSexo("F");
        
        System.out.println("--- Artista 1 ---");
        System.out.println(artista1.getDNI());
        System.out.println(artista1.getNombre());
        System.out.println(artista1.getAnyNacimiento());
        System.out.println(artista1.getSexo());
        
        Dibujante dibujante1 = new Dibujante("87654321A","Doe", 1980, "M", "Paris1991", "WhiteOverBlack", 1200.0);
        
        System.out.println("--- Dibujante 1 ---");
        System.out.println(dibujante1.getDNI());
        System.out.println(dibujante1.getNombre());
        System.out.println(dibujante1.getAnyNacimiento());
        System.out.println(dibujante1.getSexo());
        System.out.println(dibujante1.getUltimaExpo());
        System.out.println(dibujante1.getTituloDibMasCaro());
        System.out.println(dibujante1.getPrecioDibMasCaroo());
        
        String []temas = new String[10];
        Musico musico1 = new Musico("23456789B","Jack",2000,"M","www.jack.com","The raconteurs",temas);
        
        System.out.println("--- Musico 1 ---");
        System.out.println(musico1.getDNI());
        System.out.println(musico1.getNombre());
        System.out.println(musico1.getAnyNacimiento());
        System.out.println(musico1.getSexo());
        System.out.println(musico1.getWebsite());
        System.out.println(musico1.getTituloUltimoDisco());
        System.out.println(Arrays.toString(musico1.getTop10()));
        
        musico1.setCancion("Consoler Of The Lonely", 1);
        musico1.setCancion("Salute Your Solution", 2);
        musico1.setCancion("You Don't Understand Me", 3);
        
        musico1.mostrarCanciones();
    }
}
