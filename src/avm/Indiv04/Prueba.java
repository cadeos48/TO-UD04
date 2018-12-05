/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.Indiv04;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba {
    public static void main(String[] args){
       Usuario usuario1 = new Usuario("", "" , "", 0);
       Producto producto1 = new Producto("", "", 0);
       Scanner teclado = new Scanner(System.in);
       int opcion = 0;
       String exit = "false";
              
       do{
           try {
               System.out.println("Selecciona opción");
               System.out.println("1.Intoducir nombre usuario");
               System.out.println("2.Intoducir ape1lidos usuario");
               System.out.println("3.Intoducir DNI-NIF usuario");
               System.out.println("4.Intoducir edad usuario");
               System.out.println("5.Intoducir nombre producto");
               System.out.println("6.Intoducir referencia producto");
               System.out.println("7.Intoducir unidades del producto");
               System.out.println("8.Mostrar datos del usuario");
               System.out.println("9.Mostrar datos producto");
               System.out.println("10.Salir");
               opcion = teclado.nextInt();
           }
               catch (Exception e) {
               System.out.println("Dato erroneo");
               teclado.nextLine();
           }
               if (opcion < 0 || opcion >10) System.out.println("Introduzca opción de 1 a 10");
               switch(opcion){
                   case 1:
                       System.out.println("Introduzca el nombre del usuario");
                       usuario1.setNombre(teclado.next());
                       break;
                    case 2:
                        System.out.println("Introduzca los apellidos del usuario");
                        usuario1.setApellidos(teclado.next());
                        break;
                    case 3:
                        System.out.println("Introduzca el DNI o NIF del usuario: ");
                        usuario1.setDni(teclado.next());
                        while (Utilidades.comprobarNIF(usuario1.getDni()) == false) {
                            System.out.println("Formato de DNI-NIF inválido, introduzca formato correcto");
                            usuario1.setDni(teclado.next());
                        }                        
                        break;
                    case 4:
                        System.out.println("Introduzca la edad del usuario: ");
                        usuario1.setEdad(teclado.nextInt());
                        break;
                    case 5:
                        System.out.println("Introduzca el nombre del producto: ");
                        producto1.setNombre(teclado.next());
                        break;
                    case 6:
                        System.out.println("Introduzca la referencia del producto: ");
                        producto1.setReferencia(teclado.next());
                        while (Utilidades.comprobarReferenciaProducto(producto1.getReferencia()) == false) {
                            System.out.println("Formato de referencia incorrecto, introduzca formato correcto");
                            producto1.setReferencia(teclado.next());
                      }  
                        break;
                    case 7:
                        System.out.println("Introduzca las unidades del producto: ");
                        producto1.setUnidades(teclado.nextInt());
                        break;
                    case 8:
                        System.out.println(usuario1.toString());
                        System.out.println();
                        break;
                    case 9:
                        System.out.println(producto1.toString());
                        System.out.println();
                        break;
                    case 10:
                        exit = "true";
                        break;
                    }
       }        
       while (exit.equals("false"));
    }
}