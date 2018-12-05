/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.Indiv04;

/**
 *
 * @author yo
 */
public class Ejercicio01 {
    public static void main(String[] args){
        //declaración e inicialización de variables
        System.out.println("Introduce la cantidad de números que quiere almacenar en el array");
        int dimension = ArchivoDeClases.leerEntero();
        int [] arrayAleatorio = new int[dimension];
        
        //Procesamiento de datos
        //Asginación de valores aleatorios de 0 a 99 al array arrayAleatorio
        for(int cont = 0; cont < arrayAleatorio.length; cont++){
            arrayAleatorio[cont] = (int) (Math.random()*100);
        }
        
        //Salida de datos
        System.out.println("La media de los números conteidos en el array es: "
        +ArchivoDeClases.mediaArray(arrayAleatorio));
        System.out.println("El número más grande contenido en el array es: "
        +ArchivoDeClases.numMax(arrayAleatorio));
        System.out.println("El número más pequeño contenido en el array es: "
        +ArchivoDeClases.numMin(arrayAleatorio));
        
        //Para comprobar que todo está bien, vamos a mostrar los valores del array
        System.out.print("Los valores que almacena el array son: ");
        for(int cont = 0; cont<arrayAleatorio.length; cont++){            
            System.out.print(" " +arrayAleatorio[cont]);
        }
    }
}
