/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_datos;

import cap_logica.Salida;
import java.util.ArrayList;

/**
 *
 * @author Sh
 */
public class ListaSalidas {
    private static ArrayList<Salida> datos = new ArrayList<Salida>();
    

    public static ArrayList<Salida> getDatos() {
        return datos;
    }

    public static void setDatos(ArrayList<Salida> datos) {
        ListaSalidas.datos = datos;
    }
    
    public static void agregar(Salida obj){
        datos.add(obj);
    }
    
    public static void eliminar(Salida obj){
        datos.remove(obj);
    }
}
