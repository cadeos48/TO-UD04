package avm.Indiv04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yo
 */
public class Utilidades {
    public static boolean comprobarNIF(String nif){
        Pattern patronDNI = Pattern.compile("[0-9]{8}[a-zA-Z]{1}");
        Pattern patronNIF = Pattern.compile("[MXYZmxyza][0-9]{7}[a-zA-Z]{1}");
        Matcher compruebaDNI = patronDNI.matcher(nif);
        Matcher compruebaNIF = patronNIF.matcher(nif);
        if(compruebaDNI.matches() || compruebaNIF.matches()) return true;
        else return false;
    }
    
    public static boolean comprobarReferenciaProducto(String referencia){
        Pattern patronReferencia = Pattern.compile("[A-Z&&[^IO]]{3}[0-9]{2}");        
        Matcher compruebaReferencia = patronReferencia.matcher(referencia);        
        if(compruebaReferencia.matches()) return true;
        else return false;
    }
}
