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
public class Usuario {

    /**
     * @param args the command line arguments
     */
    private String nombre, apellidos, dni;
    private int edad;
    Scanner teclado = new Scanner(System.in);
        
    Usuario(String nombre, String apellidos, String dni, int edad){
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        }
    
    public boolean comprobarDNI(Usuario[] usu, String posibDNI){
       boolean comprobacion = false;
       for(int cont = 0; cont <usu.length; cont++){
           if (usu[cont].getDni().equals(posibDNI)) comprobacion=true;
           else comprobacion = false;       
       }
       if (comprobacion) System.out.println("DNI perteneciente a otro cliente");
       return comprobacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
                       
    public String toString(){
    return ("Nombre: " +this.nombre +"  Apellidos: " +this.apellidos +"  DNI: " +this.dni +"  Edad: " +this.edad);
    }
    
     public static char leerChar(){
        char dimeChar;     
        Scanner teclado = new Scanner(System.in);
        dimeChar = teclado.next().charAt(0);
        return dimeChar;
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
                    System.out.println("Dato erróneo");
                    teclado.nextLine();
                }
        }
        while (comprobacion == false);
        return entero;
    }
    
        public static String leerCadena(){
        String dimeCadena;     
        Scanner teclado = new Scanner(System.in);
        dimeCadena = teclado.next();
        return dimeCadena;
     }
    
    //Método que comprueba si los registros del array están todos llenos o hay alguno
    //sin completar, devuelve -1 si el array está lleno, si no está lleno devuelve
    //el número del campo que está vacio
    public static int ConsultaArray(Usuario[] usu){
        int numRegArray = -1;
        for(int cont = 0; cont <usu.length; cont++){
            if (usu[cont].getNombre().equals("$")) numRegArray = cont;       
        }      
        return numRegArray;
    }
    
}
       