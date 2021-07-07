/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_datos;

import cap_logica.Maestro;
import java.util.ArrayList;

/**
 *
 * @author Sh
 */
public class ListaMaestro {
    private static ArrayList<Maestro> datos = new ArrayList<>();
    

    public static ArrayList<Maestro> getDatos() {
        return datos;
    }

    public static void setDatos(ArrayList<Maestro> datos) {
        ListaMaestro.datos = datos;
    }
    
    public static void agregar(Maestro obj){
        datos.add(obj);
    }
    
    public static void eliminar(Maestro obj){
        datos.remove(obj);
    }
}
