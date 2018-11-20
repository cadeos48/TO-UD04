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

public class Ejercicio01Borrar {
    
    //Declaración de variables
       
                
        //Introducción de datos. Asignación por parte del usuario del valor
        //de la dimensión del array.
        public static int introDimension(){
            int dimension=0;
            Scanner teclado = new Scanner(System.in);
            boolean validacion = false;
            do {
                try {
                    System.out.println("Introduzca un número mayor que cero");
                    dimension = teclado.nextInt();
                    validacion = true;
                }
                catch(Exception e){
                System.out.println("Valor introducido no válido");
                teclado.nextLine();
                }
            }
            while(validacion == false || dimension <= 0);
            return dimension;
        }
        
        //Asignación de valores al array. Almacenará números de 0 a 100
        public static int[] valoresArray(int dimension){
            int[] unArray = new int[dimension];
            for(int cont = 0; cont<dimension; cont++){
            unArray[cont] = (int) (Math.random()*100);
            }
            return unArray;
        }
                
        //Método para realizar la media de los números que almacena el array
        public static float mediaArray(int unArray[]){
            float sumatoria = 0;
            float media;
            for(int cont = 0; cont<unArray.length; cont++){
                sumatoria = sumatoria+unArray[cont];
            }
            media = sumatoria/unArray.length;
            return media;
        }
        
        //Método para saber que número almacenado en el array es el mayor
        public static int numMax(int unArray[]){
            int numMaximo = unArray[0];
            for(int cont = 0; cont<unArray.length-1; cont++) {
                if (numMaximo<unArray[cont+1]){
                    numMaximo = unArray[cont+1];              
                }
            }
            return numMaximo;
        }
        
        //Método para saber que número almacenado en el array es el menor
        public static int numMin(int unArray[]){
            int numMinimo = unArray[0];
            for(int cont = 0; cont<unArray.length-1; cont++) {
                if (numMinimo>unArray[cont+1]){
                    numMinimo = unArray[cont+1];
                }
            }
            return numMinimo;
        }        
}