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

    private String[][] tablero = new String[3][3];

    Tablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public void reiniciarTablero() {
        System.out.print("   1 2 3");
        for (int fila = 0; fila < tablero.length; fila++) {
            System.out.println();
            System.out.println("  -------");
            System.out.print(fila + 1 + " ");
            for (int columna = 0; columna < tablero.length; columna++) {
                System.out.print("|");
                tablero[fila][columna] = " ";
                System.out.print(tablero[fila][columna]);
            }
            System.out.print("|");
        }
        System.out.println();
        System.out.println("  -------");
    }

    public void pintarTablero() {
        System.out.print("   1 2 3");
        for (int fila = 0; fila < tablero.length; fila++) {
            System.out.println();
            System.out.println("  -------");
            System.out.print(fila + 1 + " ");
            for (int columna = 0; columna < tablero.length; columna++) {
                System.out.print("|" + tablero[fila][columna]);
            }
            System.out.print("|");
        }
        System.out.println();
        System.out.println("  -------");
    }

    public void asignarValor(int coordFila, int coordColumn, String valor) {
        tablero[coordFila][coordColumn] = valor;
    }

    public int comprobarGanador() {
        //Recorremos las filas, fijando el valor de las columnas, y recorriendo las
        // filas mediante le contador del for. Si en cualquiera de las filas coinciden tres
        // "O" o tres "X" devolverá el valor 0 en el caso primero y 1 en el caso segundo. Unimos las opciones
        //del if con doble && ya que no tiene que comprobar las tres casillas de la matris, con que alguna de ellas
        //no tenga una "O" o un "X" para el segundo if, la condicón se daría como falsa y seguirían ejecutándose
        //el resto de instrucciones
        for (int fila = 0; fila < tablero.length; fila++) {
            if (tablero[fila][0] == "O" && tablero[fila][1] == "O" && tablero[fila][2] == "O") {
                return 0;
            }
            if (tablero[fila][0] == "X" && tablero[fila][1] == "X" && tablero[fila][2] == "X") {
                return 1;
            }
        }
        //Hacemos lo mismo que hicimos con las filas, pero esta vez con las columnas (fijando el valor de las filas) y
        //recorriendo el valor de las columnas mdiante el contador del for.
        for (int columna = 0; columna < tablero.length; columna++) {
            if (tablero[0][columna] == "O" && tablero[1][columna] == "O" && tablero[2][columna] == "O") {
                return 0;
            }
            if (tablero[0][columna] == "X" && tablero[1][columna] == "X" && tablero[2][columna] == "X") {
                return 1;
            }
        }
        //Por último definimos las diagonales, para ambos jugadores.
        if (tablero[0][0] == "O" && tablero[1][1] == "O" && tablero[2][2] == "O" || tablero[0][2] == "O" && tablero[1][1] == "O" && tablero[2][0] == "O") {
            return 0;
        }
        if (tablero[0][0] == "X" && tablero[1][1] == "X" && tablero[2][2] == "X" || tablero[0][2] == "X" && tablero[1][1] == "X" && tablero[2][0] == "X") {
            return 1;
        }
        //Si no se produce ninguna de las situaciones definidas para que gane el jugador 1 o el jugador 2
        //el método devolverá -1 como resultado, valor que utilizaremos luego para definir el resultado de empate
        //si se han jugado 9 turnos (máximo de turnos que se puede jugar sin que gane un jugador y otro)
        return -1;
    }

      public static int leerEntero() {
        int entero = 0;
        boolean comprobacion = false;
        Scanner teclado = new Scanner(System.in);
        do {
            try {
                entero = teclado.nextInt();
                comprobacion = true;
                } catch (Exception e) {
                    System.out.println("Dato erróneo. Introduzca opción correcta");
                    teclado.nextLine();
                }
        }
        while (comprobacion == false);
        return entero;
    }

    public void logicaCPU() {
        int fila = 0;
        int columna = 0;
        if (tablero[0][0] == "O" && tablero[0][1] == "O" && tablero[0][2] == " "
                || tablero[1][2] == "O" && tablero[2][2] == "O" && tablero[0][2] == " ") {
            fila = 0;
            columna = 2;
        } else if (tablero[1][0] == "O" && tablero[1][1] == "O" && tablero[1][2] == " ") {
            fila = 1;
            columna = 2;
        } else if (tablero[2][0] == "O" && tablero[2][1] == "O" && tablero[2][2] == " "
                || (tablero[0][2] == "O" && tablero[1][2] == "O" && tablero[2][2] == " ")) {
            fila = 2;
            columna = 2;
        } else if (tablero[0][1] == "O" && tablero[0][2] == "O" && tablero[0][0] == " "
                || (tablero[1][0] == "O" && tablero[2][0] == "O" && tablero[0][0] == " ")) {
            fila = 0;
            columna = 0;
        } else if (tablero[1][1] == "O" && tablero[1][2] == "O" && tablero[1][0] == " ") {
            fila = 1;
            columna = 0;
        } else if (tablero[2][1] == "O" && tablero[2][2] == "O" && tablero[2][0] == " " 
                || (tablero[0][0] == "O" && tablero[1][0] == "O" && tablero[2][0] == " ")) {
            fila = 2;
            columna = 0;        
        } else if (tablero[0][1] == "O" && tablero[1][1] == "O" && tablero[2][1] == " ") {
            fila = 2;
            columna = 1;
        }       
        else if (tablero[1][1] == "O" && tablero[2][1] == "O" && tablero[0][1] == " ") {
            fila = 0;
            columna = 1;
        }        
        else {
            do {
                fila = (int) (Math.random()*3);
                columna = (int) (Math.random()*3);
                }
                while (!tablero[fila][columna].equals(" "));
        }
        tablero [fila][columna] = "X";                   
    }

    /*public void logicaCPU(){
        int fila, columna;        
        do {
            fila = (int) (Math.random()*3);
            columna = (int) (Math.random()*3);
        }         
        while (!tablero[fila][columna].equals(" "));
        tablero [fila][columna] = "X";
    } */
}
