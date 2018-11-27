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
public class Tablero {
    String [][] tablero = new String[3][3];

          
    Tablero(String[][]tablero){
        this.tablero= tablero;                     
    }
      
          
    public void inicializarTablero(){        
         for (int fila = 0; fila < tablero.length; fila++){
            System.out.println();
            System.out.println("-------");            
            for(int columna = 0; columna <tablero.length; columna++) {
                System.out.print("|");
                tablero[fila][columna] = " ";
                System.out.print(tablero[fila][columna]);
            }
        System.out.print("|");
        }
        System.out.println();
        System.out.println("-------");
    }
    
    public void pintarTablero(){
       for (int fila = 0; fila < tablero.length; fila++){
            System.out.println();
            System.out.println("-------");
            
            for(int columna = 0; columna <tablero.length; columna++) {                
                System.out.print("|" + tablero[fila][columna]);                               
            }
        System.out.print("|");
        }
        System.out.println();
        System.out.println("-------");        
    }
    
    
     public void asignarValor(int coordFila, int coordColumn, String valor){        
        tablero[coordFila][coordColumn] = valor;
     }
     
     public int comprobarGanador(){
         int resultado = -1;
         for (int fila = 0; fila < tablero.length; fila++){
             if (tablero[fila][0] =="X" & tablero[fila][1]=="X" & tablero[fila][2]=="X") resultado = 1;             
         }
        for (int columna = 0; columna < tablero.length; columna++){
            if (tablero[0][columna] =="X" & tablero[1][columna]=="X" & tablero[2][columna]=="X") resultado = 1;
        }
        
        if (tablero[0][0] =="X" & tablero[1][1] =="X" & tablero[2][2] =="X" || tablero[0][2] =="X" & tablero[1][1] =="X" & tablero[2][0] =="X") resultado = 1;
        
        return resultado;
     }

    public static int leerFila(){
        int fila = 0;
        Scanner teclado = new Scanner(System.in);    
        do {            
            try {
                 System.out.println("Indique numero de fila (0 a 2): ");
                 fila = teclado.nextInt();                 
            }
            catch(Exception e){
                System.out.println("Dato erróneo");
                teclado.nextLine();                
            }
        }        
        while(fila < 0 || fila > 2);
        return fila;
    }
    
        public static int leerColumna(){
        int columna = 0;
        Scanner teclado = new Scanner(System.in);    
        do {            
            try {
                 System.out.println("Indique numero de columna (0 a 2): ");
                 columna = teclado.nextInt();                 
            }
            catch(Exception e){
                System.out.println("Dato erróneo");
                teclado.nextLine();                
            }
        }        
        while(columna < 0 || columna > 2);
        return columna;
    }
               
        
}