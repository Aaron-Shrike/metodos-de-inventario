/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_datos;

import cap_logica.Promedio;
import java.util.ArrayList;

/**
 *
 * @author Sh
 */
public class ListaPromedio {
    private static ArrayList<Promedio> datos = new ArrayList<>();
    

    public static ArrayList<Promedio> getDatos() {
        return datos;
    }

    public static void setDatos(ArrayList<Promedio> datos) {
        ListaPromedio.datos = datos;
    }
    
    public static void agregar(Promedio obj){
        datos.add(obj);
    }
    
    public static void eliminar(Promedio obj){
        datos.remove(obj);
    }
}
