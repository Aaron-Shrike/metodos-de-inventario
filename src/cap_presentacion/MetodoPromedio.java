/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_presentacion;

import cap_datos.ListaEntradas;
import cap_datos.ListaPromedio;
import cap_datos.ListaSalidas;
import cap_logica.Entrada;
import cap_logica.Promedio;
import cap_logica.Salida;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario13
 */
public class MetodoPromedio extends javax.swing.JPanel {
    
    private final DefaultTableModel modeloTabla = new DefaultTableModel();

    /**
     * Creates new form PanelMerodoPromedio
     */
    public MetodoPromedio() {
        initComponents();
        verificarTabla();
    }
    
    public void verificarTabla(){
        if(comprobarEntradasSalidas()){
            agregarModeloTabla();
        }else{
            JOptionPane.showMessageDialog(this, "Datos incorrectos: TotalEntradas < TotalSalidas",
                "ERROR DEL SISTEMA", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean comprobarEntradasSalidas(){
        int numSalidas = 0;
        int numEntradas = 0;
        
        for (int i = 0; i < ListaEntradas.getDatos().size(); i++) {
            Entrada e = ListaEntradas.getDatos().get(i);

            numEntradas += e.getCantidad();
        }
        
        for (int i = 0; i < ListaSalidas.getDatos().size(); i++) {
            Salida s = ListaSalidas.getDatos().get(i);

            numSalidas = s.getCantidad();
        }
        
        return numEntradas - numSalidas >= 0;
    }
    
    public void agregarModeloTabla(){
        try{    
            modeloTabla.addColumn("Cantidad");
            modeloTabla.addColumn("Precio");
            modeloTabla.addColumn("Total");
            modeloTabla.addColumn("Cantidad");
            modeloTabla.addColumn("Precio");
            modeloTabla.addColumn("Total");
            modeloTabla.addColumn("Cantidad");
            modeloTabla.addColumn("Precio");
            modeloTabla.addColumn("Total");


            
            // -- ENTRADAS --
            
            double precioTotalE = 0;
            int cantidadTotalE = 0;
            double precioGeneralE;
            int contEntradas = 0;

            //Buscamos el precio general para las entradas
            for (int i = 0; i < ListaEntradas.getDatos().size(); i++) {
                Entrada e = ListaEntradas.getDatos().get(i);

                boolean bandera = false;
                
                if(i == 0){
                    precioTotalE += e.getPrecio();
                    contEntradas++;
                    
                }else{
                    for (int j = 0; j < i; j++) {
                        Entrada eJ = ListaEntradas.getDatos().get(j);

                        if(e.getPrecio() == eJ.getPrecio()){
                            bandera = true;
                        }
                    }
                    if(bandera == false){
                        precioTotalE += e.getPrecio();
                        contEntradas++;
                    }
                    
                }
                
                cantidadTotalE += e.getCantidad();
                
            }
            precioGeneralE = Math.floor((precioTotalE/contEntradas)*100)/100;
            
            //LLENADO DE ENTRADAS
            for (int i = 0; i < ListaEntradas.getDatos().size(); i++) {
                Entrada e = ListaEntradas.getDatos().get(i);

                String cantidadE = Integer.toString(e.getCantidad());
                String precioE = Double.toString(precioGeneralE);
                String totalE = Double.toString(Math.floor(e.getCantidad()*precioGeneralE*100)/100);
                String cantidadAux = "";
                String precioAux = "";
                String totalAux = "";
                
                if(i == ListaEntradas.getDatos().size()-1){
                    cantidadAux = Integer.toString(cantidadTotalE);
                    precioAux = precioE;
                    totalAux = Double.toString(Math.floor(cantidadTotalE*precioGeneralE*100)/100);
                }

                String fila[] = {cantidadE,precioE,totalE,"","","",cantidadAux,precioAux,totalAux};
                modeloTabla.addRow(fila);
                
                Promedio f = new Promedio();
                
                f.setFila(fila);
                
                ListaPromedio.agregar(f);

            }
            
            // -- SALIDAS --
            
            double precioTotalS = 0;
            int cantidadTotalS = 0;
            double precioGeneralS;
            int contSalidas = 0;

            //Buscamos el precio general
            
            for (int i = 0; i < ListaSalidas.getDatos().size(); i++) {
                Salida s = ListaSalidas.getDatos().get(i);
                
                boolean bandera = false;
                
                if(i == 0){
                    precioTotalS += s.getPrecio();
                    contSalidas++;
                    
                }else{
                    for (int j = 0; j < i; j++) {
                        Salida sJ = ListaSalidas.getDatos().get(j);

                        if(s.getPrecio() == sJ.getPrecio()){
                            bandera = true;
                        }
                    }
                    if(bandera == false){
                        precioTotalS += s.getPrecio();
                        contSalidas++;
                    }
                    
                }
                
                cantidadTotalS += s.getCantidad();
                
            }
            precioGeneralS = Math.floor((precioTotalS/contSalidas)*100)/100;

            //LLENADO DE SALIDAS Y STOCK
            for (int i = 0; i < ListaSalidas.getDatos().size(); i++) {
                Salida s = ListaSalidas.getDatos().get(i);

                String cantidadS = Integer.toString(s.getCantidad());
                String precioS = Double.toString(precioGeneralS);
                String totalS = Double.toString(Math.floor(s.getCantidad()*precioGeneralS*100)/100);
                String cantidadAux = "";
                String precioAux = "";
                String totalAux = "";
                
                
                if(i == ListaSalidas.getDatos().size()-1){
                    cantidadAux = Integer.toString(cantidadTotalS);
                    precioAux = precioS;
                    totalAux = Double.toString(Math.floor(cantidadTotalS*precioGeneralS*100)/100);
                }

                String fila2[] = {"","","",cantidadS,precioS,totalS,cantidadAux,precioAux,totalAux};
                modeloTabla.addRow(fila2);
                
                Promedio f = new Promedio();
                
                f.setFila(fila2);
                
                ListaPromedio.agregar(f);
            }
            
            if(!ListaEntradas.getDatos().isEmpty() && !ListaSalidas.getDatos().isEmpty()){
                String cantidadAux = Integer.toString(cantidadTotalE-cantidadTotalS);
                String precioAux = Double.toString(precioGeneralE);
                String totalAux = Double.toString(Math.floor((cantidadTotalE-cantidadTotalS)*precioGeneralE*100)/100);

                String fila3[] = {"","","","","","",cantidadAux,precioAux,totalAux};
                modeloTabla.addRow(fila3);  
                
                Promedio f = new Promedio();
                
                f.setFila(fila3);
                
                ListaPromedio.agregar(f);
            }
            
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
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 204, 255));
        setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        tabla.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tabla.setModel(modeloTabla);
        tabla.setRowHeight(25);
        jScrollPane1.setViewportView(tabla);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(50, 20, 30, 20);
        add(jScrollPane1, gridBagConstraints);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ENTRADAS", "SALIDAS", "STOCK"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(30, 20, 30, 20);
        add(jScrollPane2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
