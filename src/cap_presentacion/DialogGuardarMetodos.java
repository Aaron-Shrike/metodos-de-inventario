/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_presentacion;

import cap_datos.ListaEntradas;
import cap_datos.ListaPeps;
import cap_datos.ListaPromedio;
import cap_datos.ListaSalidas;
import cap_logica.Entrada;
import cap_logica.Peps;
import cap_logica.Promedio;
import cap_logica.Salida;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Sh
 */
public class DialogGuardarMetodos extends javax.swing.JDialog {

    /**
     * Creates new form DialogGuardar
     */
    public DialogGuardarMetodos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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

        directorio = new javax.swing.JFileChooser();
        panel = new javax.swing.JPanel();
        nombreLocalizacion = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        nombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        localizacion = new javax.swing.JLabel();
        cajaLocalizacion = new javax.swing.JTextField();
        botonLocalizacion = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        directorio.setDialogTitle("Directorio");
        directorio.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Guardar Archivo");

        panel.setBackground(new java.awt.Color(204, 255, 204));
        panel.setPreferredSize(new java.awt.Dimension(600, 250));
        panel.setLayout(new java.awt.GridBagLayout());

        nombreLocalizacion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nombreLocalizacion.setText("Nombre y Localizacion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        panel.add(nombreLocalizacion, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 369;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(4, 20, 0, 20);
        panel.add(separador, gridBagConstraints);

        nombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        nombre.setText("Nombre del archivo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 20, 0, 0);
        panel.add(nombre, gridBagConstraints);

        cajaNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(27, 15, 0, 0);
        panel.add(cajaNombre, gridBagConstraints);

        localizacion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        localizacion.setText("Localizacion del archivo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 20, 0, 0);
        panel.add(localizacion, gridBagConstraints);

        cajaLocalizacion.setEditable(false);
        cajaLocalizacion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(26, 15, 0, 0);
        panel.add(cajaLocalizacion, gridBagConstraints);

        botonLocalizacion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        botonLocalizacion.setText("Buscar...");
        botonLocalizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLocalizacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 30, 0, 20);
        panel.add(botonLocalizacion, gridBagConstraints);

        botonGuardar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        panel.add(botonGuardar, gridBagConstraints);

        botonCancelar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        panel.add(botonCancelar, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonLocalizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLocalizacionActionPerformed

        int opcion = directorio.showSaveDialog(this);
        
        if(opcion == JFileChooser.APPROVE_OPTION){
            File carpeta = directorio.getSelectedFile();
            
            cajaLocalizacion.setText(carpeta.getAbsolutePath());
        }
    }//GEN-LAST:event_botonLocalizacionActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        try {

            File archivo = new File(cajaLocalizacion.getText() + "/" + cajaNombre.getText() + ".txt");

            //crear el archivo
            if(archivo.exists()){
                JOptionPane.showMessageDialog(null, "Archivo existente", "GUARDAR ARCHIVO", JOptionPane.WARNING_MESSAGE);
            }else{
                archivo.createNewFile();
            }

            FileWriter escribir = new FileWriter(archivo);

            //escribimos en el archivo
            for (int i = 0; i < ListaEntradas.getDatos().size(); i++) {
                Entrada e = ListaEntradas.getDatos().get(i);
                
                escribir.write(e.toString());
                escribir.write("\n");
            }
            
            for (int i = 0; i < ListaSalidas.getDatos().size(); i++) {
                Salida s = ListaSalidas.getDatos().get(i);
                
                escribir.write(s.toString());
                escribir.write("\n");
            }
            escribir.write("\n\n - METODO PEPS -");
            escribir.write("\n=======================================================================================");
            escribir.write("\n\tENTRADA\t\t\t\tSALIDA\t\t\t\tSTOCK");
            escribir.write("\n---------------------------------------------------------------------------------------");
            escribir.write("\nCant.\tCosto\tTotal\t\tCant.\tCosto\tTotal\t\tCant.\tCosto\tTotal");
            escribir.write("\n---------------------------------------------------------------------------------------");
            for (int i = 0; i < ListaPeps.getDatos().size(); i++) {
                Peps p = ListaPeps.getDatos().get(i);

                escribir.write("\n");
                for (int j = 0; j < p.getFila().length; j++) {
                    
                    
                    escribir.write(p.getFila()[j] + "\t");
                    
                    if(j == 2 || j == 5){
                        escribir.write("\t");
                    }
                    
                }
            }
            escribir.write("\n=======================================================================================");
            escribir.write("\n\n");
            
            escribir.write("");
            escribir.write("\n\n - METODO PROMEDIO -");
            escribir.write("\n=======================================================================================");
            escribir.write("\n\tENTRADA\t\t\t\tSALIDA\t\t\t\tSTOCK");
            escribir.write("\n---------------------------------------------------------------------------------------");
            escribir.write("\nCant.\tCosto\tTotal\t\tCant.\tCosto\tTotal\t\tCant.\tCosto\tTotal");
            escribir.write("\n---------------------------------------------------------------------------------------");
            for (int i = 0; i < ListaPromedio.getDatos().size(); i++) {
                Promedio p = ListaPromedio.getDatos().get(i);

                escribir.write("\n");
                for (int j = 0; j < p.getFila().length; j++) {
                    
                    
                    escribir.write(p.getFila()[j] + "\t");
                    
                    if(j == 2 || j == 5){
                        escribir.write("\t");
                    }
                    
                }
            }
            escribir.write("\n=======================================================================================");
            
            escribir.write("\n\n\t\t\t<Sh>");
            escribir.close();
           
            dispose();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR DEL SISTEMA", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogGuardarMetodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogGuardarMetodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogGuardarMetodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogGuardarMetodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogGuardarMetodos dialog = new DialogGuardarMetodos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonLocalizacion;
    private javax.swing.JTextField cajaLocalizacion;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JFileChooser directorio;
    private javax.swing.JLabel localizacion;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombreLocalizacion;
    private javax.swing.JPanel panel;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables
}
