/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_datos;

import cap_logica.Registro;
import java.util.ArrayList;

/**
 *
 * @author Sh
 */
public class ListaRegistros {
    private static ArrayList<Registro> datos = new ArrayList<>();
    

    public static ArrayList<Registro> getDatos() {
        return datos;
    }

    public static void setDatos(ArrayList<Registro> datos) {
        ListaRegistros.datos = datos;
    }
    
    public static void agregar(Registro obj){
        datos.add(obj);
    }
    
    public static void eliminar(Registro obj){
        datos.remove(obj);
    }
}
