/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.Indiv04;

/**
 *
 * @author AVM
 */
public class Producto {

    private String nombre, referencia;
    private int unidades;
    
    Producto(String nombre, String referencia, int unidades){
        this.nombre = nombre;
        this.referencia = referencia;
        this.unidades = unidades;        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String toString(){
    return ("nombre: " +this.nombre +"  Referencia: " +this.referencia +"  Unidades: " +this.unidades);
    }
}

