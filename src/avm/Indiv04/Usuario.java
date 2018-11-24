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
    
    public void introducirCliente(Usuario[] usu){
       String posibleDni;
       boolean comprobacion;
        
       System.out.println("Introduzca el nombre del usuario");
       this.nombre = teclado.next();
       System.out.println("Introduzca los apellidos del usuario");
       this.apellidos = teclado.next();
       //Comprobación de que el DNI introducido
       do {        
           comprobacion = false;
           System.out.println("Introduzca el DNI del usuario: ");
           posibleDni = teclado.next();
           for(int cont = 0; cont <usu.length; cont++){
               if (usu[cont].getDni().equals(posibleDni)) comprobacion=true;
           }
           if (comprobacion) System.out.println("DNI no valido");
           else this.dni = posibleDni;
       }   
       while (comprobacion == true);
       System.out.println("Introduzca la edad del usuario: ");
       this.edad = teclado.nextInt();
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
    
    //Método que comprueba en el array recibido por parámetro, si hay coincidencia entre un
    // cadena de carácteres recibida por parámetro y el valor contenido en el atributo
    //Dni de cada uno de los objetos contenidos en el array. Si hay coincidencia devuelve true
    /*public static boolean ConsultaArray(Usuario[] usu, String DNI){
        boolean comprobacion = false;
        for(int cont = 0; cont <usu.length; cont++){
            if (usu[cont].getDni().equals(DNI)) comprobacion=true;           
        }
        return comprobacion;
    }*/
    
    /*public String validarDNI(String posibleDNI, boolean comprobacion){
        boolean salir = false;        
        do {
            System.out.println("Introduzca el DNI del usuario: ");
            posibleDNI = teclado.next();
            if (comprobacion)
                System.out.println("DNI inválido. Vuelva a introducirlo");
            else salir = true;
        }
        while (salir == false);
        return posibleDNI;
        
    }*/
           
}
       