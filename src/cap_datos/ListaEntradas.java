/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_datos;

import cap_logica.Entrada;
import java.util.ArrayList;

/**
 *
 * @author Sh
 */
public class ListaEntradas {
    private static ArrayList<Entrada> datos = new ArrayList<>();
    

    public static ArrayList<Entrada> getDatos() {
        return datos;
    }

    public static void setDatos(ArrayList<Entrada> datos) {
        ListaEntradas.datos = datos;
    }
    
    public static void agregar(Entrada obj){
        datos.add(obj);
    }
    
    public static void eliminar(Entrada obj){
        datos.remove(obj);
    }
}
