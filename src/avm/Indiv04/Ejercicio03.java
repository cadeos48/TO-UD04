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
        Usuario[] clientes = new Usuario[10];//Array que va a contener 10 objetos de tipo Usuario
        Scanner teclado = new Scanner(System.in);
        Usuario usuario = new Usuario("", "" , "", 0);//Declaración e inicialización por constructor
        //de un objeto tipo Usuario
        boolean exit;
        char respuesta;         
        int regVacio;
        
        //Inicializa el array con valores predeterminados. Asinga como valor 
        //predeterminado al atriburo nombre el valor $
        for(int cont = 0; cont < clientes.length; cont++){
            clientes[cont] = new Usuario("$","","",0);
             }
        
        do {
            exit = false;
            System.out.println("Quiere introducir datos de un cliente S/N");        
            respuesta = Usuario.leerChar();
            if (respuesta == 'S' || respuesta == 's'){
                regVacio = Usuario.ConsultaArray(clientes);
                if (regVacio == -1) {
                    System.out.println ("Array lleno, no se puede introducir más datos");              
                    exit = true;
                }
                else {
                    boolean comprobacion;
                    System.out.println("Introduzca el nombre del usuario");
                    usuario.setNombre(Usuario.leerCadena());
                    System.out.println("Introduzca los apellidos del usuario");
                    usuario.setApellidos(Usuario.leerCadena());
                    do {
                        System.out.println("Introduzca el DNI del usuario: ");
                        String posibleDni = Usuario.leerCadena();
                        comprobacion = usuario.comprobarDNI(clientes, posibleDni);
                        usuario.setDni(posibleDni);
                    }
                    while(comprobacion == true);
                    System.out.println("Introduzca la edad del usuario");
                    usuario.setEdad(Usuario.leerEntero());
                    clientes[regVacio] = new Usuario(usuario.getNombre(),usuario.getApellidos(),usuario.getDni(),usuario.getEdad());
                }
            }
           if(respuesta =='N' || respuesta =='n') exit = true;
                   
        }
        while(exit == false);    
                       
       for(int cont = 0; cont < clientes.length; cont++){
            System.out.println("Cliente "+cont +" " +clientes[cont].toString());
       }            
    }
}