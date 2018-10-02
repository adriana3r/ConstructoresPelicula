/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorespelicula;

/**
 *
 * @author Usuario
 */
public class ConstructoresPelicula {
    
   String pelicula;

    public ConstructoresPelicula (){
        System.out.println("PRIMERA PELÍCULA:");
    }
    
    public ConstructoresPelicula (String a){
        System.out.println("La película es del género " + a);
        }
    
    public ConstructoresPelicula (String b, String c){
        System.out.println(b + " es el director de la película " + c);
        }
         
    public static void main(String[] args) {
        
        ConstructoresPelicula obj1  = new ConstructoresPelicula ();
        ConstructoresPelicula obj2  = new ConstructoresPelicula ("suspenso psicológico.");
        ConstructoresPelicula obj3  = new ConstructoresPelicula ("Jonathan Demme","'El silencio de los inocentes'.");
    }
    
}

