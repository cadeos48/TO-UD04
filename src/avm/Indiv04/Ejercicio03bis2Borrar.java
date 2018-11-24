/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.Indiv04;

import java.util.Scanner;

/**
 *
 * @author yo
 */


public class Ejercicio03bis2Borrar {
    public static void main(String[] args){
        Usuario[] clientes = new Usuario[2];
        Scanner teclado = new Scanner(System.in);
        Usuario usuario = new Usuario("", "" , "", 0);       
        int opcion = 0;    
        boolean exit = false;
        
        for(int cont = 0; cont < clientes.length; cont++){
             System.out.println("Introduzca el nombre del usuario");
             usuario.setNombre(teclado.next());
             System.out.println("Introduzca los apellidos del usuario");
             usuario.setApellidos(teclado.next());
             System.out.println("Introduzca el DNI del usuario: ");
             usuario.setDni(teclado.next());
             System.out.println("Introduzca la edad del usuario: ");
             usuario.setEdad(teclado.nextInt());
             clientes[cont] = new Usuario(usuario.getNombre(),usuario.getApellidos(),usuario.getDni(),usuario.getEdad());
             }
        
       for(int cont = 0; cont < clientes.length; cont++){
            System.out.println(clientes[cont].toString());
       }
      
       System.out.println("Introduzca el nombre del usuario");
       usuario.setNombre(teclado.next());
       System.out.println("Introduzca los apellidos del usuario");
       usuario.setApellidos(teclado.next());
       boolean salir = false;
       do {           
           System.out.println("Introduzca el DNI del usuario: ");
           String validarDNI = teclado.next();
           if (Usuario.ConsultaArray(clientes, validarDNI))
               System.out.println("DNI inválido. Vuelva a introducirlo");
           else {
               usuario.setDni(validarDNI);
               salir = true;
           }
       }       
       while (salir == false);           
       System.out.println("Introduzca la edad del usuario: ");
       usuario.setEdad(teclado.nextInt());
       clientes[1] = new Usuario(usuario.getNombre(),usuario.getApellidos(),usuario.getDni(),usuario.getEdad());
       
       for(int cont = 0; cont < clientes.length; cont++){
            System.out.println(clientes[cont].toString());
       }

    
        
    }
}