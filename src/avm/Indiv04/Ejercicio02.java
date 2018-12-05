/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.Indiv04;

/**
 *
 * @author Usuario
 */
public class Ejercicio02 {
     public static void main(String[] args){
        //declaración e inicialización de variables
        System.out.println("Introduce la cantidad de números que quiere almacenar en el array");
        int dimension = ArchivoDeClases.leerEntero();
        int [] arrayAleatorio = new int[dimension];
        
        //Procesamiento de datos
        //Asginación de valores aleatorios de 0 a 99 al array arrayAleatorio
        int contPares = 0;
        int contImpares = 0;
        
        for(int cont = 0; cont < arrayAleatorio.length; cont++){
            arrayAleatorio[cont] = (int) (Math.random()*100);
            if (arrayAleatorio[cont]%2 == 0){
                contPares++;
            } else {
                contImpares++;
            }
        }              
            
        //Salida de datos
        System.out.println("El total de números pares es: " +contPares);
        System.out.println("El total de números impares es: " +contImpares);
                
        //Para comprobar que todo está bien, vamos a mostrar los valores del array
        System.out.print("Los valores que almacena el array son: ");
        for(int cont = 0; cont<arrayAleatorio.length; cont++){            
            System.out.print(" " +arrayAleatorio[cont]);
        }
     }
}
