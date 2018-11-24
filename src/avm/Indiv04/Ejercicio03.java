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


public class Ejercicio03 {
    public static void main(String[] args){
        Usuario[] clientes = new Usuario[10];
        Scanner teclado = new Scanner(System.in);
        Usuario usuario = new Usuario("", "" , "", 0);    
        boolean exit;
        char respuesta;         
        int regVacio;
        
        //Inicializa el array con valores predeterminados. Asinga como valor 
        //predeterminado al atriburo nombre el valor $
        for(int cont = 0; cont < clientes.length; cont++){
            clientes[cont] = new Usuario("$","$","$",0);
             }
        
        do {
            exit = false;
            System.out.println("Quiere introducir datos de un cliente S/N");        
            respuesta = teclado.next().charAt(0);
            if ( respuesta == 'S' || respuesta =='s'){
                regVacio = Usuario.ConsultaArray(clientes);
                if (regVacio == -1) {
                    System.out.println ("Array lleno, no se puede introducir más datos");
                    respuesta = 'n';
                    exit = true;
                }
                else {
                    usuario.introducirCliente(clientes);
                    clientes[regVacio] = new Usuario(usuario.getNombre(),usuario.getApellidos(),usuario.getDni(),usuario.getEdad());
                }
            }
            else exit = true;
        }
        while(respuesta =='S' || respuesta =='s' || respuesta =='N' && respuesta =='n' && exit == false);    
            
                 
       for(int cont = 0; cont < clientes.length; cont++){
            System.out.println(clientes[cont].toString());
       }            
    }
}