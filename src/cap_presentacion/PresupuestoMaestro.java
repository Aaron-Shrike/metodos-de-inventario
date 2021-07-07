/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_presentacion;

import cap_datos.ListaMaestro;
import cap_datos.ListaRegistros;
import cap_logica.Maestro;
import cap_logica.Registro;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shrike
 */
public class PresupuestoMaestro extends javax.swing.JPanel {
    
    private final DefaultTableModel modeloTabla = new DefaultTableModel();

    /**
     * Creates new form PresupuestoMaestro
     */
    public PresupuestoMaestro() {
        initComponents();
        agregarModeloTabla();
        
   
        for (int i = 0; i < ListaRegistros.getDatos().size()*2+5; i++) {//numero de filas
                                 
            String filaAux[] = new String[IngresoPresupuesto.cantidadAños+1];
            
            for (int j = 0; j < IngresoPresupuesto.cantidadAños+1; j++) {//numero de columnas
         
                filaAux[j] = (String) modeloTabla.getValueAt(i, j);  
            }
            
            Maestro aux = new Maestro();
                
            aux.setFila(filaAux);
                
            ListaMaestro.agregar(aux);
            
        }
    }
    
    public void agregarModeloTabla(){
        try{ 
            modeloTabla.addColumn("Detalle");
            
            int año = IngresoPresupuesto.añoInicio;
            for (int i = 0; i < IngresoPresupuesto.cantidadAños; i++) {
                modeloTabla.addColumn("Año " + año);
                año++;
            }

            //LLENADO DE REGISTRO - INGRESOS
            String filaIng[] = new String[IngresoPresupuesto.cantidadAños+1];
            
            filaIng[0] = "INGRESOS";
            modeloTabla.addRow(filaIng);
            
        
            for (int i = 0; i < ListaRegistros.getDatos().size(); i++) {
                Registro r = ListaRegistros.getDatos().get(i);

                String detalle = r.getDetalle();
                double ingreso = r.getCantidad()*r.getPrecioVenta();

                filaIng[0] = detalle;
                
                for (int j = 1; j < IngresoPresupuesto.cantidadAños+1; j++) {                  
                    
                    filaIng[j] = Double.toString(Math.floor(ingreso*100)/100);
                    
                    ingreso += ingreso*(IngresoPresupuesto.crecimientoAnual/100);
                }
                
                modeloTabla.addRow(filaIng);
                
            }
            
            filaIng[0] = "Total ingresos";
            
            for (int j = 1; j < IngresoPresupuesto.cantidadAños+1; j++) {
                    
                double suma = 0;
                
                for (int i = 1; i < ListaRegistros.getDatos().size()+1; i++) {
                                 
                    suma += Double.parseDouble((String) modeloTabla.getValueAt(i, j));
                }
                
               filaIng[j] = Double.toString(Math.floor(suma*100)/100);
            }
            
            modeloTabla.addRow(filaIng);

            
            //LLENADO DE REGISTRO - EGRESOS
            String filaEgr[] = new String[IngresoPresupuesto.cantidadAños+1];
            filaEgr[0] = "EGRESOS";
            modeloTabla.addRow(filaEgr);
            
        
            for (int i = 0; i < ListaRegistros.getDatos().size(); i++) {
                Registro r = ListaRegistros.getDatos().get(i);

                String detalle = r.getDetalle();
                double egreso = r.getCantidad()*r.getCostoProduccion();

                filaEgr[0] = detalle;
                
                for (int j = 1; j < IngresoPresupuesto.cantidadAños+1; j++) {
                    
                    filaEgr[j] = Double.toString(Math.floor(egreso*100)/100);
                    
                    egreso += egreso*(IngresoPresupuesto.crecimientoAnual/100);
                }
                
                modeloTabla.addRow(filaEgr);
                
            }
            
            filaEgr[0] = "Total egresos";
            int pos = ListaRegistros.getDatos().size() + 3;
            
            for (int j = 1; j < IngresoPresupuesto.cantidadAños+1; j++) {
                    
                double suma = 0;
                
                for (int i = pos; i < ListaRegistros.getDatos().size()+pos; i++) {
                                 
                    suma += Double.parseDouble((String) modeloTabla.getValueAt(i, j));
                }
                
               filaEgr[j] = Double.toString(Math.floor(suma*100)/100);
            } 
            
            modeloTabla.addRow(filaEgr);
            

            //ULTIMA FILA
            String filaTotal[] = new String[IngresoPresupuesto.cantidadAños+1];
            
            filaTotal[0] = "TOTAL SALDO DE CAJA";
            
            int pos1 = ListaRegistros.getDatos().size() + 1;
            int pos2 = ListaRegistros.getDatos().size()*2 + 3;
            
            for (int j = 1; j < IngresoPresupuesto.cantidadAños+1; j++) {
     
                double totalIngresos = Double.parseDouble((String) modeloTabla.getValueAt(pos1, j));                    
                double totalEgresos = Double.parseDouble((String) modeloTabla.getValueAt(pos2, j));
                
                double cajaTotal = totalIngresos - totalEgresos;
                
               filaTotal[j] = Double.toString(Math.floor(cajaTotal*100)/100);
            }
            
            modeloTabla.addRow(filaTotal);
               
        }catch(Exception  error){
            JOptionPane.showMessageDialog(this, error.getMessage(),
                "ERROR DEL SISTEMA", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPanel = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 204, 255));

        tabla.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabla.setModel(modeloTabla);
        scrollPanel.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
