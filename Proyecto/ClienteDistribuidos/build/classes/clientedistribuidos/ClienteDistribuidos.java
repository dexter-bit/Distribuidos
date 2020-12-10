/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientedistribuidos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author Dexter
 */
public class ClienteDistribuidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        String hostName = "localhost";
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            System.out.println("Estableciendo conexion");
            Socket cliente = new Socket(hostName, 30001);       
            oos = new ObjectOutputStream(cliente.getOutputStream());// asociar buffer de envio
            System.out.println("Sending request to Socket Server");
            String input = "hola";
            oos.writeObject(input); // mandar la info
            ois = new ObjectInputStream(cliente.getInputStream());// asociar buffer de entrada
            String message = (String) ois.readObject();
            System.out.println(message);
            ois.close();
            oos.close();
            cliente.close();
        } catch(IOException io) {
            System.out.println("Error creando el socket "+io);
        }    
        
    }
    
}
