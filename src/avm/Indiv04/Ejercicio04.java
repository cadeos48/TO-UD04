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
public class Ejercicio04 {

    public static void main(String[] args) {
        String[][] tablero = new String[3][3];
        int fila, columna, ganador, opcion, turno;        
        
        String valor = "";

        Tablero tresEnRaya = new Tablero(tablero);

        do {      
            System.out.println("Seleccione opción");
            System.out.println("0. Salir del juego");
            System.out.println("1. Jugador vs CPU");
            System.out.println("2. Jugador1 vs Jugador2");
            opcion = Tablero.leerEntero();
            switch (opcion) {
                case 0:
                    break;
                case 1: 
                   tresEnRaya.reiniciarTablero();
                   turno = 1;                                 
                    //Bucle que controla si ha finalizado la partida, que ocurrirá si ha ganado el jugador 1, ha ganado el jugador 2 o 
                    //se han jugado 9 turnos sin ganador, lo que supondría un empate                   
                    do {
                         if (turno%2 != 0){
                        //Bucle que controla que no se introduzcan dos fichas en la misma celda del array, solo permite 
                        //colocar ficha si la celda del array contiene un espacio: " "
                        
                        do {
                            //Bucle que controla que el jugador1 introduzca un número de 1 a 3 como valor de la fila
                            do {
                                System.out.println("Indique numero de fila (1 a 3): ");//Pongo de 1 a 3 y no de 0 a 2 porque es más natural para el usuario
                                fila = Tablero.leerEntero() - 1;//Como el array va de 0 a 2, resto uno al número introducido por el usuario
                                if (fila < 0 || fila > 2) {
                                    System.out.println("El número debe estar comprendido entre 1 y 3");
                                }
                            } while (fila < 0 || fila > 2);                            
                            //Bucle que controla que el jugador1 introduzca un número de 1 a 3 como valor de la columna
                            do {
                                System.out.println("Indique numero de columna (1 a 3): ");
                                columna = Tablero.leerEntero() - 1;
                                if (columna < 0 || columna > 2) {
                                    System.out.print("El número debe estar comprendido entre 1 y 3");
                                }
                            } while (fila < 0 || fila > 2);
                            //Condicional que muestra un menaje en pantalla si la celda del array no esta vacía (contiene un espacio)
                            if (!tablero[fila][columna].equals(" ")) {
                                System.out.println("Casilla ocupada, vuelva a introducir coordenadas");
                            }
                        }
                        while (!tablero[fila][columna].equals(" "));  
                        tresEnRaya.asignarValor(fila, columna, "O");
                        turno++;                       
                    }
                    else {
                            tresEnRaya.logicaCPU();
                            turno++;                            
                         }
                        tresEnRaya.pintarTablero();//Llamada al método que pinta el tablero. Al estar detro del bucle cada vez que lo pinte lo irá 
                        //actualizando con los valores que va tomando el array (X o O que se van almacenando en sus casillas)
                        ganador = tresEnRaya.comprobarGanador();//Llamada al método que comprueba si algún jugador a ganado la partida. Si ninguno ha 
                        //ha ganado, devuelve el valor -1 y el bucle se repita con un nuevo turno
                        
                    } while (ganador != 0 && ganador != 1 && turno <= 9);
                    if (ganador == 0) {
                        System.out.println("Enhorabuena jugador 1");
                    }
                    if (ganador == 1) {
                        System.out.println("Enhorabuena jugador 2");
                    }
                    if (ganador == -1) {
                        System.out.println("Empate!!!!");
                    }
                break;
                
                case 2:
                    tresEnRaya.reiniciarTablero();
                    turno = 1;
                    //Bucle que controla si ha finalizado la partida, que ocurrirá si ha ganado el jugador 1, ha ganado el jugador 2 o 
                    //se han jugado 9 turnos sin ganador, lo que supondría un empate
                    do {
                        //Bucle que controla que no se introduzcan dos fichas en la misma celda del array, solo permite 
                        //colocar ficha si la celda del array contiene un espacio: " "
                        do {
                            //Bucle que controla que el jugador1 introduzca un número de 1 a 3 como valor de la fila
                            do {
                                System.out.println("Indique numero de fila (1 a 3): ");//Pongo de 1 a 3 y no de 0 a 2 porque es más natural para el usuario
                                fila = Tablero.leerEntero() - 1;//Como el array va de 0 a 2, resto uno al número introducido por el usuario
                                if (fila < 0 || fila > 2) {
                                    System.out.println("El número debe estar comprendido entre 1 y 3");
                                }
                            } while (fila < 0 || fila > 2);                            
                            //Bucle que controla que el jugador1 introduzca un número de 1 a 3 como valor de la columna
                            do {
                                System.out.println("Indique numero de columna (1 a 3): ");
                                columna = Tablero.leerEntero() - 1;
                                if (columna < 0 || columna > 2) {
                                    System.out.print("El número debe estar comprendido entre 1 y 3");
                                }
                            } while (fila < 0 || fila > 2);
                            //Condicional que muestra un menaje en pantalla si la celda del array no esta vacía (contiene un espacio)
                            if (!tablero[fila][columna].equals(" ")) {
                                System.out.println("Casilla ocupada, vuelva a introducir coordenadas");
                            }
                        } while (!tablero[fila][columna].equals(" "));
                        //Condicional que controla los turnos, escribiendo en la celda del array X ó O en función de si es un turno par o impar
                        if (turno % 2 == 0) {
                            tresEnRaya.asignarValor(fila, columna, "X");//Llamada al método que asigna a la celda con coordenadas "fila" y "columna" pasadas
                            //por parámetro, el valor "X" (pasado por parámetro)
                        } else {
                            tresEnRaya.asignarValor(fila, columna, "O");
                        }
                        tresEnRaya.pintarTablero();//Llamada al método que pinta el tablero. Al estar detro del bucle cada vez que lo pinte lo irá 
                        //actualizando con los valores que va tomando el array (X o O que se van almacenando en sus casillas)
                        ganador = tresEnRaya.comprobarGanador();//Llamada al método que comprueba si algún jugador a ganado la partida. Si ninguno ha 
                        //ha ganado, devuelve el valor -1 y el bucle se repita con un nuevo turno
                        turno++;
                    } while (ganador != 0 && ganador != 1 && turno <= 9);
                    if (ganador == 0) {
                        System.out.println("Enhorabuena jugador 1");
                    }
                    if (ganador == 1) {
                        System.out.println("Enhorabuena jugador 2");
                    }
                    if (ganador == -1) {
                        System.out.println("Empate!!!!");
                    }
                break;                                                     
            }
        } while (opcion != 0);
    }
}
