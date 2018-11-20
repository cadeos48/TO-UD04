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
public class Ejercicio01PrinBorrar {
    public static void main(String[] args){
        //El usuario introduce la dimensión del array aplicando el método
        //introdimension de la clase Ejercicio1 y le asigna el valor a la 
        //variable dimension
        int dimension;
        dimension = Ejercicio01Borrar.introDimension();
        
        //Se pasa por parámetro al método valoresArray el valor de dimensión
        //y nos devuelve el array que genera el método copiándolo en el array
        //elArray
        int[] elArray = Ejercicio01Borrar.valoresArray(dimension);
        
        //Se llama al método mediaArray, pasando por parámetro el array elArray y el método
        //devuelve la media de los números contenidos el array elArray asignando ese
        //valor a la variable media y lo muestra por pantalla
        float media = Ejercicio01Borrar.mediaArray(elArray);     
        System.out.println("La media de los números contenidos en el array es :" +media);
        
        //Se llama al método numMax, pasando por parámetro el array elArray. El 
        //método devuelve el número máximo contenido en el array. Este se asigna 
        //a la variable numMaximo y se muestra por pantalla.
        int numMaximo;
        numMaximo = Ejercicio01Borrar.numMax(elArray);
        System.out.println("El número más grande del array es: " +numMaximo);
        
        //Se llama al método numMin, pasando por parámetro el array elArray. El 
        //método devuelve el número mínimo contenido en el array. Este se asigna 
        //a la variable numMínimo y se muestra por pantalla.
        int numMinimo;
        numMinimo = Ejercicio01Borrar.numMin(elArray);
        System.out.println("El número más pequeño del array es: " +numMinimo);
        
        //Para comprobar que todo está bien, vamos a mostrar los valores del array
        System.out.print("Los valores que almacena el array son: ");
        for(int cont = 0; cont<elArray.length; cont++){            
            System.out.print(" " +elArray[cont]);
        }
    }
}
