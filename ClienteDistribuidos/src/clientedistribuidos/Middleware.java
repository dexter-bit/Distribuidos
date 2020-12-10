package clientedistribuidos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import clientedistribuidos.Util;
public class Middleware {

    
    public int prueba () throws ClassNotFoundException  {
        //String hostName = "localhost";
        //String hostName = "10.2.126.79"; //ip gabriela
        //String hostName = "10.2.126.86"; //ip dexter windows
        String hostName = "10.2.127.251"; //ip dexter ubuntu
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
        return 1;
    }
    
    public String busquedaLibroA (String libro) throws ClassNotFoundException  {
        
        String hostName =Util.LibreriaA; 
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            System.out.println("Estableciendo conexion");
            Socket cliente = new Socket(hostName, 30001);       
            oos = new ObjectOutputStream(cliente.getOutputStream());// asociar buffer de envio
            System.out.println("Sending request to Socket Server");
            String input = "pedir Libro"+ ";JDVA;" + libro;
            oos.writeObject(input); // mandar la info
            ois = new ObjectInputStream(cliente.getInputStream());// asociar buffer de entrada
            String message = (String) ois.readObject();
            System.out.println(message);
            ois.close();
            oos.close();
            cliente.close();
            if (message.equals("true")){
            return "Se encontro el libro";
            } else return "No se encontro";
        } catch(IOException io) {
            System.out.println("Error creando el socket "+io);
        }    
        return "No se encontro";
    }
    
    public String busquedaAutorA (String Autor) throws ClassNotFoundException  {
        
        String hostName =Util.LibreriaA; 
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            System.out.println("Estableciendo conexion");
            Socket cliente = new Socket(hostName, 30001);       
            oos = new ObjectOutputStream(cliente.getOutputStream());// asociar buffer de envio
            System.out.println("Sending request to Socket Server");
            String input = "pedir autor"+ ";JDVA;" + Autor;
            oos.writeObject(input); // mandar la info
            ois = new ObjectInputStream(cliente.getInputStream());// asociar buffer de entrada
            String message = (String) ois.readObject();
            System.out.println(message);
            ois.close();
            oos.close();
            cliente.close();
            return message.substring(0, message.length() -3) + ".";
        } catch(IOException io) {
            System.out.println("Error creando el socket "+io);
        }    
        return "No se encontro";
    }
    
    public String busquedaLibroB (String Libro) throws ClassNotFoundException  {
        
        String hostName =Util.LibreriaB; 
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            System.out.println("Estableciendo conexion");
            Socket cliente = new Socket(hostName, 30001);       
            oos = new ObjectOutputStream(cliente.getOutputStream());// asociar buffer de envio
            System.out.println("Sending request to Socket Server");
            String input = "buscar titulo" + ";JDVA;" + Libro;
            oos.writeObject(input); // mandar la info
            ois = new ObjectInputStream(cliente.getInputStream());// asociar buffer de entrada
            String message = (String) ois.readObject();
            System.out.println(message);
            ois.close();
            oos.close();
            cliente.close();
            if (message.equals("true")){
            return "Se encontro el libro";
            } else return "No se encontro";
        } catch(IOException io) {
            System.out.println("Error creando el socket "+io);
        }    
        return "No se encontro";
    }
    
    public String busquedaAutorB (String Autor) throws ClassNotFoundException  {
        
        String hostName =Util.LibreriaB; 
        //String hostName ="10.2.126.86"; 
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            System.out.println("Estableciendo conexion");
            Socket cliente = new Socket(hostName, 30001);       
            oos = new ObjectOutputStream(cliente.getOutputStream());// asociar buffer de envio
            System.out.println("Sending request to Socket Server");
            String input = "buscar autor"+ ";JDVA;" + Autor;
            oos.writeObject(input); // mandar la info
            ois = new ObjectInputStream(cliente.getInputStream());// asociar buffer de entrada
            String message = (String) ois.readObject();
            System.out.println(message);
            ois.close();
            oos.close();
            cliente.close();
            return message.substring(0, message.length() -3) + ".";
        } catch(IOException io) {
            System.out.println("Error creando el socket "+io);
        }    
        return "No se encontro";
    }
    
    public String busquedaLibroC (String Libro) throws ClassNotFoundException  {
        
        String hostName =Util.LibreriaC; 
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            System.out.println("Estableciendo conexion");
            Socket cliente = new Socket(hostName, 30001);       
            oos = new ObjectOutputStream(cliente.getOutputStream());// asociar buffer de envio
            System.out.println("Sending request to Socket Server");
            String input = "encontrar vol" + ";JDVA;" + Libro;
            oos.writeObject(input);                               // mandar la info
            ois = new ObjectInputStream(cliente.getInputStream());// asociar buffer de entrada
            String message = (String) ois.readObject();
            System.out.println(message);
            ois.close();
            oos.close();
            cliente.close();
            if (message.equals("true")){
            return "Se encontro el libro";
            } else return "No se encontro";
            
        } catch(IOException io) {
            System.out.println("Error creando el socket "+io);
        }    
        return "No se encontro";
    }
    
    public String busquedaAutorC (String Autor) throws ClassNotFoundException  {
        
        String hostName =Util.LibreriaC; 
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            System.out.println("Estableciendo conexion");
            Socket cliente = new Socket(hostName, 30001);       
            oos = new ObjectOutputStream(cliente.getOutputStream());// asociar buffer de envio
            System.out.println("Sending request to Socket Server");
            String input = "encontrar autor"+ ";JDVA;" + Autor;
            oos.writeObject(input); // mandar la info
            ois = new ObjectInputStream(cliente.getInputStream());// asociar buffer de entrada
            String message = (String) ois.readObject();
            System.out.println(message);
            ois.close();
            oos.close();
            cliente.close();
            return message.substring(0, message.length() -3) + ".";
        } catch(IOException io) {
            System.out.println("Error creando el socket "+io);
        }    
        return "No se encontro";
    }
    
    
    
    
    
}
