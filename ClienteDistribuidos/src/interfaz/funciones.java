/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import clientedistribuidos.Middleware;

import clientedistribuidos.Util;


public class funciones {
    Middleware middleware = new Middleware();
    
    public String comando (String biblio, String libro, String autor) throws ClassNotFoundException{
        
        if (biblio.equals("")){
        biblio = Util.Biblioteca;
        }
        if (biblio.equals("A")){
            if (libro.equals("") && !autor.equals("")){
            return middleware.busquedaAutorA(autor);
            } else{
            return middleware.busquedaLibroA(libro);
            }
        } else if (biblio.equals("B")){
            if (libro.equals("") && !autor.equals("")){
            return middleware.busquedaAutorB(autor);
            } else{
            return middleware.busquedaLibroB(libro);
            }
        } else if (biblio.equals("C")){
            if (libro.equals("") && !autor.equals("")){
            return middleware.busquedaAutorC(autor);
            } else{
            return middleware.busquedaLibroC(libro);
            }
        }
        return "No se encontro";
        
    } 
}
