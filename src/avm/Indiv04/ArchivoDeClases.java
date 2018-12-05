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
public class ArchivoDeClases {
    /**
     * @return devuelve un número entero leido por teclado
     */
        
    public static int leerEntero(){
        int numEnt = 0;
        Scanner teclado = new Scanner(System.in);
        boolean validacion = false;
        
        do{
           try {              
               numEnt = teclado.nextInt();
               validacion = true;
           }
           catch(Exception e){
               System.out.println("Valor no válido, introduzca un número");
               teclado.nextLine();
           }
        }
        while(validacion == false);
        return numEnt;
    }
    
    //Método para realizar la media de los números que almacena un array
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
