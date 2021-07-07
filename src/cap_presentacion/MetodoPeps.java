/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_presentacion;

import cap_datos.ListaEntradas;
import cap_datos.ListaPeps;
import cap_datos.ListaSalidas;
import cap_logica.Entrada;
import cap_logica.Peps;
import cap_logica.Salida;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sh
 */
public class MetodoPeps extends javax.swing.JPanel {

    private final DefaultTableModel modeloTabla = new DefaultTableModel();
    
    /**
     * Creates new form PanelMetodoPeps
     */
    public MetodoPeps() {
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

            //LLENADO DE ENTRADAS
            for (int i = 0; i < ListaEntradas.getDatos().size(); i++) {
                Entrada e = ListaEntradas.getDatos().get(i);

                String cantidadE = Integer.toString(e.getCantidad());
                String precioE = Double.toString(e.getPrecio());
                String totalE = Double.toString(Math.floor(e.getCantidad()*e.getPrecio()*100)/100);

                String fila[] = {cantidadE,precioE,totalE,"","","",cantidadE,precioE,totalE};
                modeloTabla.addRow(fila);
                
                Peps f = new Peps();
                
                f.setFila(fila);
                
                ListaPeps.agregar(f);
            }

            int cantidadActualSaldo = 0;
            int iteradorJ = 0;

            //LLENADO DE SALIDAS Y STOCK
            for (int i = 0; i < ListaSalidas.getDatos().size(); i++) {
                Salida s = ListaSalidas.getDatos().get(i);

                String cantidadS = Integer.toString(s.getCantidad());
                String precioS = Double.toString(s.getPrecio());
                String totalS = Double.toString(Math.floor(s.getCantidad()*s.getPrecio()*100)/100);
                String cantidadAux = "";
                String precioAux = "";
                String totalAux = "";
                int cantidadActualSalida = s.getCantidad();
                int opcion;
                boolean primeraVez2 = true,primeraVez3 = true,primeraVez4 = true;


                for (int j = iteradorJ; j < ListaEntradas.getDatos().size(); j++) {
                    Entrada eSaldo = ListaEntradas.getDatos().get(j);
                 
                    //Cada vez que llegue el saldo a cero cogera el sgte
                    if(cantidadActualSaldo == 0){
                        cantidadActualSaldo = eSaldo.getCantidad();
                    }

                    
                    // evaluacion de la salida y el saldo
                    if(cantidadActualSalida == 0){
                        opcion = 1;
                        
                    }else if(cantidadActualSaldo > cantidadActualSalida){
                        opcion = 2;
                        
                    }else if(cantidadActualSaldo < cantidadActualSalida){
                        opcion = 3;
                        
                    }else{//cantidadActualSaldo == cantidadActualSalida
                        opcion = 4;
                        
                    }
                    
                    // si ya entro mas de una vez no hay necesidad de repetir la salida
                    if(opcion == 1 || primeraVez2 == false || primeraVez3 == false || primeraVez4 == false){
                        cantidadS = "";
                        precioS = "";
                        totalS = "";
                    }

                    //precesos segun la evaluacion
                    switch(opcion){
                        case 1:
                            
                            cantidadAux = Integer.toString(eSaldo.getCantidad());
                            precioAux = Double.toString(eSaldo.getPrecio());
                            totalAux = Double.toString(Math.floor(eSaldo.getCantidad()*eSaldo.getPrecio()*100)/100);
                            break;
                        
                        case 2:
                            cantidadActualSaldo -= cantidadActualSalida;
                            cantidadActualSalida = 0;

                            cantidadAux = Integer.toString(cantidadActualSaldo);
                            precioAux = Double.toString(eSaldo.getPrecio());
                            totalAux = Double.toString(Math.floor(cantidadActualSaldo*eSaldo.getPrecio()*100)/100);
                            
                            primeraVez2 = false;
                            break;
                        case 3:
                            cantidadActualSalida -= cantidadActualSaldo; 
                            cantidadActualSaldo = 0;
                            iteradorJ++;

                            cantidadAux = "-";
                            precioAux = "-";
                            totalAux = "-";
                            
                            primeraVez3 = false;
                            break;
                        case 4:
                            cantidadActualSalida = 0;
                            cantidadActualSaldo = 0;
                            iteradorJ++;

                            cantidadAux = "-";
                            precioAux = "-";
                            totalAux = "-";
                            
                            primeraVez4 = false;
                            break;
                    }
                    
                    String fila2[] = {"","","",cantidadS,precioS,totalS,cantidadAux,precioAux,totalAux};
                    modeloTabla.addRow(fila2);
                    
                    Peps f = new Peps();
                
                    f.setFila(fila2);
                
                    ListaPeps.agregar(f);
                }
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
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
