/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_logica;

/**
 *
 * @author Sh
 */
public class Registro {  
    private String detalle;
    private int cantidad;
    private float precioVenta;
    private float costoProduccion;

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public float getCostoProduccion() {
        return costoProduccion;
    }

    public void setCostoProduccion(float costoProduccion) {
        this.costoProduccion = costoProduccion;
    }
    
    @Override
    public String toString(){
        return detalle + ": " + cantidad + " uni. - Venta: S/" + precioVenta + " c/u - Costo: S/" + costoProduccion + " c/u";
    }
}
