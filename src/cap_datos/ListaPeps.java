/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_datos;

import cap_logica.Peps;
import java.util.ArrayList;

/**
 *
 * @author Sh
 */
public class ListaPeps {
    private static ArrayList<Peps> datos = new ArrayList<>();
    

    public static ArrayList<Peps> getDatos() {
        return datos;
    }

    public static void setDatos(ArrayList<Peps> datos) {
        ListaPeps.datos = datos;
    }
    
    public static void agregar(Peps obj){
        datos.add(obj);
    }
    
    public static void eliminar(Peps obj){
        datos.remove(obj);
    }
}
