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
public class Ejercicio04Prin {
         
    public static void main(String[] args){
        String [][] tablero = new String [3][3];
        int fila = 0;
        int columna = 0;
        int ganador;
        String valor = "";        
        boolean borrar = true;
        
        Tablero tresEnRaya = new Tablero(tablero);
        
        tresEnRaya.inicializarTablero();     
        
        do {
           
            fila = Tablero.leerFila();
            columna = Tablero.leerColumna();
            tresEnRaya.asignarValor(fila, columna, "X");
            tresEnRaya.pintarTablero();
            ganador = tresEnRaya.comprobarGanador();
            System.out.println(ganador);
            /*tresEnRaya.pintarTablero();
            fila = Tablero.leerFila();
            columna = Tablero.leerColumna();
            tresEnRaya.asignarValor(fila, columna, "0");
            tresEnRaya.pintarTablero();
            System.out.println(ganador);*/
        }
        while(ganador != 1);
      
                   

        
       /* //Inicializamos el array conteniedo todas las celdas el espacio
        for (int cont = 0; cont < tablero.length; cont++){
            for(int cont2 = 0; cont2 <tablero.length; cont2++) {
               tablero[cont][cont2] = " ";
            }
        }
        
        tablero[0][1] = "X";        
        for (int cont = 0; cont < tablero.length; cont++){
            System.out.println();            
            System.out.println("-------------");  
               System.out.print(tablero[0][1]);
           
            for(int cont2 = 0; cont2 <tablero.length; cont2++) {
                System.out.print("|   ");
             
                             
            }
        System.out.print("|");
        }
        System.out.println();
        System.out.println("-------------");*/
        
    }
    
               
}
