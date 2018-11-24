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


public class Ejercicio03Borrar {
    public static void main(String[] args){
        Usuario[] clientes = new Usuario[2];
        Scanner teclado = new Scanner(System.in);
        Usuario usuario = new Usuario("", "" , "", 0);        
        int opcion = 0;
        int cont = 0;
        char respuesta;
        boolean exit;
        
        
        do {
            exit = false;
            System.out.println("Quiere introducir datos de un cliente S/N");        
            respuesta = teclado.next().charAt(0);
            if ( respuesta == 'S' || respuesta =='s'){
                do{
                    try {
                        System.out.println("Selecciona opción");
                        System.out.println("1.Intoducir nombre usuario");
                        System.out.println("2.Intoducir ape1lidos usuario");
                        System.out.println("3.Intoducir DNI usuario");
                        System.out.println("4.Intoducir edad usuario");                        
                        System.out.println("5.Salir");
                        opcion = teclado.nextInt();
                        switch(opcion){
                            case 1:
                                System.out.println("Introduzca el nombre del usuario");
                                usuario.setNombre(teclado.next());
                                break;
                            case 2:
                                System.out.println("Introduzca los apellidos del usuario");
                                usuario.setApellidos(teclado.next());
                                break;
                            case 3:
                                System.out.println("Introduzca el DNI del usuario: ");
                                usuario.setDni(teclado.next());
                                break;
                            case 4:
                                System.out.println("Introduzca la edad del usuario: ");
                                usuario.setEdad(teclado.nextInt());
                                break;                                
                            case 5:
                                exit = true;
                                break;
                        }
                    }
                    catch (Exception e) {
                        System.out.println("Dato erroneo");
                        teclado.nextLine();
                    }
                }
                while (opcion <1 && opcion > 4 || exit == false);                
            }
            else {
                exit = true;
            }
            
            clientes[cont] = new Usuario(usuario.getNombre(),usuario.getApellidos(),usuario.getDni(),usuario.getEdad());
            System.out.println(clientes[cont]);
            cont++;
        }
        while(respuesta =='S' || respuesta =='s' || respuesta =='N' && respuesta =='n' && exit == false);
        
        
    }
}
 
        
      /*  for(int cont = 0; cont <clientes.length; cont++){
            
            String respuesta = teclado.next();
            if 
            System.out.println("Introduzca nombre de usuario");            
            String nombre = teclado.next();
            System.out.println("Introduzca apellidos de usuario");            
            String apellidos = teclado.next();
            System.out.println("Introduzca DNI de usuario");            
            String dni = teclado.next();
            System.out.println("Introduzca edad de usuario");            
            int edad = teclado.nextInt();
            clientes[cont] = new Usuario(nombre,apellidos,dni,edad);
        }
        System.out.println(clientes[0].toString());
        System.out.println(clientes[1].toString());             
    }
}*/
