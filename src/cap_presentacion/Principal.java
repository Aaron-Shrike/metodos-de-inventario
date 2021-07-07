/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_presentacion;

import cap_datos.ListaEntradas;
import cap_datos.ListaRegistros;
import cap_datos.ListaSalidas;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Sh
 */
public class Principal extends javax.swing.JFrame {
    
    /**
     * Creates new form MetodoPeps
     */
    public Principal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/cap_imagenes/icono.png")).getImage());
    }
    
    public static int mensajeConfirmacion(String mensaje, String titulo){
        int r = JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.YES_NO_CANCEL_OPTION  );
        
        if (r == -1){
            r = 1;
        }
        
        return r;
    }
    
    public void abrirPanelMetodos(){
        if(tabbedPanel.indexOfTab("Metodos: Ingreso de Datos") == -1){
            IngresoMetodos m = new IngresoMetodos();
            
            tabbedPanel.addTab("Metodos: Ingreso de Datos", m);
            tabbedPanel.setSelectedComponent(m);
        }else{
            tabbedPanel.setSelectedIndex(tabbedPanel.indexOfTab("Metodos: Ingreso de Datos"));
        } 
    }
    
    public void abrirPanelMetodoPeps(){

        if(ListaEntradas.getDatos().size() > 0 || ListaSalidas.getDatos().size() > 0){
            
            if(tabbedPanel.indexOfTab("Metodo: Peps") == -1){
                MetodoPeps mPeps = new MetodoPeps();

                tabbedPanel.addTab("Metodo: Peps", mPeps);
                tabbedPanel.setSelectedComponent(mPeps);
            }else{
                tabbedPanel.setSelectedIndex(tabbedPanel.indexOfTab("Metodo: Peps"));
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay datos registrados en Metodos",
                "ERROR DEL SISTEMA", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void abrirPanelMetodoPromedio(){

        if(ListaEntradas.getDatos().size() > 0 || ListaSalidas.getDatos().size() > 0){
            
            if(tabbedPanel.indexOfTab("Metodo: Promedio") == -1){
                MetodoPromedio mProm = new MetodoPromedio();

                tabbedPanel.addTab("Metodo: Promedio", mProm);
                tabbedPanel.setSelectedComponent(mProm);
            }else{
                tabbedPanel.setSelectedIndex(tabbedPanel.indexOfTab("Metodo: Promedio"));
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay datos registrados en Metodos",
                "ERROR DEL SISTEMA", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void abrirPanelPresupuesto(){
        if(tabbedPanel.indexOfTab("Presupuestos: Ingreso de Datos") == -1){
            IngresoPresupuesto p = new IngresoPresupuesto();
        
            tabbedPanel.addTab("Presupuestos: Ingreso de Datos", p);
            tabbedPanel.setSelectedComponent(p);
        }else{
            tabbedPanel.setSelectedIndex(tabbedPanel.indexOfTab("Presupuestos: Ingreso de Datos"));
        }
    }
    
    public void abrirPanelPresupuestoMaestro(){

        if(ListaRegistros.getDatos().size() > 0){
            
            if(tabbedPanel.indexOfTab("Presupuesto: Maestro") == -1){
                PresupuestoMaestro pMaestro = new PresupuestoMaestro();

                tabbedPanel.addTab("Presupuesto: Maestro", pMaestro);
                tabbedPanel.setSelectedComponent(pMaestro);
            }else{
                tabbedPanel.setSelectedIndex(tabbedPanel.indexOfTab("Presupuesto: Maestro"));
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay datos registrados en Presupuestos",
                "ERROR DEL SISTEMA", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void abrirPanelPresupuestoFlexible(){

        if(ListaRegistros.getDatos().size() > 0){
            
            if(tabbedPanel.indexOfTab("Presupuestos: Flexible") == -1){
                PresupuestoMaestro pFlexible = new PresupuestoMaestro();

                tabbedPanel.addTab("Presupuestos: Flexible", pFlexible);
                tabbedPanel.setSelectedComponent(pFlexible);
            }else{
                tabbedPanel.setSelectedIndex(tabbedPanel.indexOfTab("Presupuestos: Flexible"));
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay datos registrados en Presupuestos",
                "ERROR DEL SISTEMA", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void guardarArchivoMetodos(){
        DialogGuardarMetodos guardarMetodos = new DialogGuardarMetodos(this, true);
                
        guardarMetodos.setVisible(true);
    }
    
    public void guardarArchivoPresupuestos(){
        DialogGuardarPresupuestos guardarPresupuestos = new DialogGuardarPresupuestos(this, true);
                
        guardarPresupuestos.setVisible(true);
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

        barraHerramientas = new javax.swing.JToolBar();
        botonSave = new javax.swing.JButton();
        botonClose = new javax.swing.JButton();
        botonRefresh = new javax.swing.JButton();
        hSeparador3 = new javax.swing.JToolBar.Separator();
        botonPeps = new javax.swing.JButton();
        botonPromedio = new javax.swing.JButton();
        hSeparador2 = new javax.swing.JToolBar.Separator();
        botonMaestro = new javax.swing.JButton();
        tabbedPanel = new javax.swing.JTabbedPane();
        panelHome = new javax.swing.JPanel();
        imgCostosGrafica = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        Copyright = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        meMetodos = new javax.swing.JMenu();
        menuMeIngreso = new javax.swing.JMenuItem();
        menuMetSeparador = new javax.swing.JPopupMenu.Separator();
        menuMePeps = new javax.swing.JMenuItem();
        menuMePromedio = new javax.swing.JMenuItem();
        mePresupuesto = new javax.swing.JMenu();
        menuPrIngreso = new javax.swing.JMenuItem();
        menuPrSeparador = new javax.swing.JPopupMenu.Separator();
        menuPrMaestro = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();
        menuMetodos1 = new javax.swing.JMenu();
        menuPresupuesto = new javax.swing.JMenu();
        menuAyuda = new javax.swing.JMenu();
        meContenido = new javax.swing.JMenuItem();
        meSoporte = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        meAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".: PROYECTO - Costos y Presupuestos :.");
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(720, 600));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        barraHerramientas.setFloatable(false);

        botonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cap_imagenes/save x32.png"))); // NOI18N
        botonSave.setText(" Guardar  ");
        botonSave.setFocusable(false);
        botonSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSaveActionPerformed(evt);
            }
        });
        barraHerramientas.add(botonSave);

        botonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cap_imagenes/close x32.png"))); // NOI18N
        botonClose.setText("  Cerrar  ");
        botonClose.setFocusable(false);
        botonClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonClose.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCloseActionPerformed(evt);
            }
        });
        barraHerramientas.add(botonClose);

        botonRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cap_imagenes/refresh x32.png"))); // NOI18N
        botonRefresh.setText(" Refresh  ");
        botonRefresh.setFocusable(false);
        botonRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRefresh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRefreshActionPerformed(evt);
            }
        });
        barraHerramientas.add(botonRefresh);

        hSeparador3.setBackground(new java.awt.Color(160, 160, 160));
        hSeparador3.setMinimumSize(new java.awt.Dimension(1, 55));
        hSeparador3.setOpaque(true);
        hSeparador3.setSeparatorSize(new java.awt.Dimension(1, 55));
        barraHerramientas.add(hSeparador3);

        botonPeps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cap_imagenes/peps x32.png"))); // NOI18N
        botonPeps.setText("   Peps   ");
        botonPeps.setFocusable(false);
        botonPeps.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPeps.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonPeps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPepsActionPerformed(evt);
            }
        });
        barraHerramientas.add(botonPeps);

        botonPromedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cap_imagenes/promedio x32.png"))); // NOI18N
        botonPromedio.setText(" Promedio ");
        botonPromedio.setFocusable(false);
        botonPromedio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPromedio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPromedioActionPerformed(evt);
            }
        });
        barraHerramientas.add(botonPromedio);

        hSeparador2.setBackground(new java.awt.Color(160, 160, 160));
        hSeparador2.setOpaque(true);
        hSeparador2.setSeparatorSize(new java.awt.Dimension(1, 55));
        barraHerramientas.add(hSeparador2);

        botonMaestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cap_imagenes/maestro x32.png"))); // NOI18N
        botonMaestro.setText("  Maestro ");
        botonMaestro.setFocusable(false);
        botonMaestro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMaestro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMaestroActionPerformed(evt);
            }
        });
        barraHerramientas.add(botonMaestro);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        getContentPane().add(barraHerramientas, gridBagConstraints);

        tabbedPanel.setFocusable(false);

        panelHome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        panelHome.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        panelHome.add(imgCostosGrafica, gridBagConstraints);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cap_imagenes/fondoNeblina.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelHome.add(fondo, gridBagConstraints);

        tabbedPanel.addTab("Home", new javax.swing.ImageIcon(getClass().getResource("/cap_imagenes/home x16.png")), panelHome, "pestaña por defecto"); // NOI18N
        panelHome.getAccessibleContext().setAccessibleName("");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(60, 0, 0, 0);
        getContentPane().add(tabbedPanel, gridBagConstraints);

        panel1.setBackground(new java.awt.Color(30, 30, 30));
        panel1.setLayout(new java.awt.GridBagLayout());

        Copyright.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Copyright.setForeground(new java.awt.Color(255, 255, 255));
        Copyright.setText("© Sh, 2019");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        panel1.add(Copyright, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        getContentPane().add(panel1, gridBagConstraints);

        barraMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barraMenu.setMaximumSize(new java.awt.Dimension(69, 32769));
        barraMenu.setPreferredSize(new java.awt.Dimension(4, 25));

        menu.setText("Menu");
        menu.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        menu.setPreferredSize(new java.awt.Dimension(45, 56));

        meMetodos.setText("Metodos");
        meMetodos.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        menuMeIngreso.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        menuMeIngreso.setText("Ingreso de Datos");
        menuMeIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMeIngresoActionPerformed(evt);
            }
        });
        meMetodos.add(menuMeIngreso);
        meMetodos.add(menuMetSeparador);

        menuMePeps.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuMePeps.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        menuMePeps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cap_imagenes/peps x24.png"))); // NOI18N
        menuMePeps.setText("Metodo Peps");
        menuMePeps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMePepsActionPerformed(evt);
            }
        });
        meMetodos.add(menuMePeps);

        menuMePromedio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuMePromedio.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        menuMePromedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cap_imagenes/promedio x24.png"))); // NOI18N
        menuMePromedio.setText("Metodo Promedio");
        menuMePromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMePromedioActionPerformed(evt);
            }
        });
        meMetodos.add(menuMePromedio);

        menu.add(meMetodos);

        mePresupuesto.setText("Presupuestos");
        mePresupuesto.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        menuPrIngreso.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        menuPrIngreso.setText("Ingreso de Datos");
        menuPrIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrIngresoActionPerformed(evt);
            }
        });
        mePresupuesto.add(menuPrIngreso);
        mePresupuesto.add(menuPrSeparador);

        menuPrMaestro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuPrMaestro.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        menuPrMaestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cap_imagenes/maestro x24.png"))); // NOI18N
        menuPrMaestro.setText("Presupuesto Maestro");
        menuPrMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrMaestroActionPerformed(evt);
            }
        });
        mePresupuesto.add(menuPrMaestro);

        menu.add(mePresupuesto);
        menu.add(jSeparator1);

        menuSalir.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cap_imagenes/cerrar x32.png"))); // NOI18N
        menuSalir.setText("Cerrar");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menu.add(menuSalir);

        barraMenu.add(menu);

        menuMetodos1.setText("Metodos");
        menuMetodos1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        menuMetodos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuMetodos1MousePressed(evt);
            }
        });
        barraMenu.add(menuMetodos1);

        menuPresupuesto.setText("Presupuestos");
        menuPresupuesto.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        menuPresupuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuPresupuestoMousePressed(evt);
            }
        });
        barraMenu.add(menuPresupuesto);

        menuAyuda.setText("Ayuda");

        meContenido.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        meContenido.setText("Contenido e Indice");
        meContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meContenidoActionPerformed(evt);
            }
        });
        menuAyuda.add(meContenido);

        meSoporte.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        meSoporte.setText("Contactar al Soporte Tecnico");
        menuAyuda.add(meSoporte);
        menuAyuda.add(jSeparator2);

        meAcerca.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        meAcerca.setText("Acerca de Inventario");
        menuAyuda.add(meAcerca);

        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuMePromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMePromedioActionPerformed
        abrirPanelMetodoPromedio();
    }//GEN-LAST:event_menuMePromedioActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuMePepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMePepsActionPerformed
        abrirPanelMetodoPeps();
        //tabbedPanel.setIconAt(0, new ImageIcon(getClass().getResource("/cap_imagenes/añadir.png")));
    }//GEN-LAST:event_menuMePepsActionPerformed

    private void menuMeIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMeIngresoActionPerformed
        abrirPanelMetodos();     
    }//GEN-LAST:event_menuMeIngresoActionPerformed

    private void menuPrIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrIngresoActionPerformed
        abrirPanelPresupuesto();
    }//GEN-LAST:event_menuPrIngresoActionPerformed

    private void botonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCloseActionPerformed
        if(tabbedPanel.getSelectedIndex() == 0){
            
            JOptionPane.showMessageDialog(this, "No puede cerrar la pestaña de inicio",
                "Cerrar pestaña", JOptionPane.INFORMATION_MESSAGE);
        }else{
            
            if(tabbedPanel.getSelectedIndex() == tabbedPanel.indexOfTab("Metodos: Ingreso de Datos")){
                if(ListaEntradas.getDatos().size() > 0 || ListaSalidas.getDatos().size() > 0){
                    int r = mensajeConfirmacion("¿Desea guardar los datos?","GUARDAR ARCHIVO");

                    if(r < 2){
                        if(r == 0){//SI
                            guardarArchivoMetodos();
                        }

                        ListaEntradas.getDatos().clear();
                        ListaSalidas.getDatos().clear();
                        tabbedPanel.remove(tabbedPanel.getSelectedComponent());
                    }
                }else{
                    tabbedPanel.remove(tabbedPanel.getSelectedComponent());
                }  
            }else if(tabbedPanel.getSelectedIndex() == tabbedPanel.indexOfTab("Presupuestos: Ingreso de Datos")){
                if(ListaRegistros.getDatos().size() > 0){
                    int r = mensajeConfirmacion("¿Desea guardar los datos?","GUARDAR ARCHIVO");

                    if(r < 2){
                        if(r == 0){//SI
                            guardarArchivoPresupuestos();
                        }

                        ListaRegistros.getDatos().clear();
                        tabbedPanel.remove(tabbedPanel.getSelectedComponent());
                    }
                }else{
                    tabbedPanel.remove(tabbedPanel.getSelectedComponent());
                }  
            }else{
                tabbedPanel.remove(tabbedPanel.getSelectedComponent());
            }
        }
    }//GEN-LAST:event_botonCloseActionPerformed

    private void botonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRefreshActionPerformed
        //METODOS
        
        if(tabbedPanel.getSelectedIndex() == tabbedPanel.indexOfTab("Metodo: Peps")){
            MetodoPeps aux = new MetodoPeps();
           
            tabbedPanel.setComponentAt(tabbedPanel.getSelectedIndex(), aux);
        }
        
        if(tabbedPanel.getSelectedIndex() == tabbedPanel.indexOfTab("Metodo: Promedio")){
            MetodoPromedio aux1 = new MetodoPromedio();
            
            tabbedPanel.setComponentAt(tabbedPanel.getSelectedIndex(), aux1);
        }
        
        if(tabbedPanel.getSelectedIndex() == tabbedPanel.indexOfTab("Metodos: Ingreso de Datos")){
            
            if(ListaEntradas.getDatos().size() > 0 || ListaSalidas.getDatos().size() > 0){
            
                ListaEntradas.getDatos().clear();
                ListaSalidas.getDatos().clear();
            }
            
            IngresoMetodos aux2 = new IngresoMetodos();
            
            tabbedPanel.setComponentAt(tabbedPanel.getSelectedIndex(), aux2); 
        }
        
        //PRESUPUESTROS
        
        if(tabbedPanel.getSelectedIndex() == tabbedPanel.indexOfTab("Presupuesto: Maestro")){
            PresupuestoMaestro aux3 = new PresupuestoMaestro();
           
            tabbedPanel.setComponentAt(tabbedPanel.getSelectedIndex(), aux3);
        }
        
        if(tabbedPanel.getSelectedIndex() == tabbedPanel.indexOfTab("Presupuesto: Flexible")){
            PresupuestoFlexible aux4 = new PresupuestoFlexible();
            
            tabbedPanel.setComponentAt(tabbedPanel.getSelectedIndex(), aux4);
        }
        
        if(tabbedPanel.getSelectedIndex() == tabbedPanel.indexOfTab("Presupuestos: Ingreso de Datos")){
            
            if(ListaRegistros.getDatos().size() > 0){
            
                ListaRegistros.getDatos().clear();
            }
            
            IngresoPresupuesto aux5 = new IngresoPresupuesto();
            
            tabbedPanel.setComponentAt(tabbedPanel.getSelectedIndex(), aux5); 
        }
    }//GEN-LAST:event_botonRefreshActionPerformed

    private void menuMetodos1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMetodos1MousePressed
        abrirPanelMetodos();
    }//GEN-LAST:event_menuMetodos1MousePressed

    private void botonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSaveActionPerformed
        
        if(tabbedPanel.getSelectedIndex() == tabbedPanel.indexOfTab("Metodos: Ingreso de Datos") || tabbedPanel.getSelectedIndex() == tabbedPanel.indexOfTab("Metodo: Peps") || tabbedPanel.getSelectedIndex() == tabbedPanel.indexOfTab("Metodo: Promedio")){
            if(ListaEntradas.getDatos().size() > 0 || ListaSalidas.getDatos().size() > 0){    
                //ventana para guardar
                guardarArchivoMetodos();
            }else{
                JOptionPane.showMessageDialog(null, "No hay datos registrados en Metodos", "GUARDAR ARCHIVO", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(tabbedPanel.getSelectedIndex() == tabbedPanel.indexOfTab("Presupuestos: Ingreso de Datos") || tabbedPanel.getSelectedIndex() == tabbedPanel.indexOfTab("Presupuesto: Maestro")){
            if(ListaRegistros.getDatos().size() > 0){    
                //ventana para guardar
                guardarArchivoPresupuestos();
            }else{
                JOptionPane.showMessageDialog(null, "No hay datos registrados en Presupuestos", "GUARDAR ARCHIVO", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_botonSaveActionPerformed

    private void botonPepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPepsActionPerformed
        abrirPanelMetodoPeps();
    }//GEN-LAST:event_botonPepsActionPerformed

    private void botonPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPromedioActionPerformed
        abrirPanelMetodoPromedio();
    }//GEN-LAST:event_botonPromedioActionPerformed

    private void meContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meContenidoActionPerformed
        String texto = " -METODOS-" +
                        "\npara usar los metodos(Peps y Promedio) primero debes ingresar" +
                        "\nlos datos; puedes aceder al ingreso de datos desde el acceso rapido" +
                        "\nen la barra de menu(Metodos) o desde el propio menu.\n" +
                        "\n > Metodo Peps: para usar el metodo peps puedes optar por el acceso" +
                        "\nrapido en la barra de herramientas o en el menu principal(Ctrl + P)." +
                        "\n > Metodo Promedio: para usar el metodo promedio puedes optar por" +
                        "\nel acceso rapido en la barra de herramientas o en el menu" +
                        "\nprincipal(Ctrl + L)." +
                        "\n - PRESUPUESTOS -" +
                        "\npara usar el presupuesto(Maestro) primero debes ingresar los" +
                        "\ndatos; puedes acceder al ingreso de datos desde la barra de" +
                        "\n menu(Presupuestos) o desde el propio menu.\n" +
                        "\n > Presupuesto Maestro: para usar el presupuesto maestro puedes" +
                        "\noptar por el acceso rapido en la barra de herramientas o en el" +
                        "\nmenu principal(Ctrl + M).";
        
        JOptionPane.showMessageDialog(this, texto,
                "Contenido e Indice", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_meContenidoActionPerformed

    private void menuPresupuestoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPresupuestoMousePressed
        // TODO add your handling code here:
        abrirPanelPresupuesto();
    }//GEN-LAST:event_menuPresupuestoMousePressed

    private void menuPrMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrMaestroActionPerformed
        // TODO add your handling code here:
        abrirPanelPresupuestoMaestro();
    }//GEN-LAST:event_menuPrMaestroActionPerformed

    private void botonMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMaestroActionPerformed
        // TODO add your handling code here:
        abrirPanelPresupuestoMaestro();
    }//GEN-LAST:event_botonMaestroActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel"); //elegante
            //UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); // igual q el basico
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Copyright;
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botonClose;
    private javax.swing.JButton botonMaestro;
    private javax.swing.JButton botonPeps;
    private javax.swing.JButton botonPromedio;
    private javax.swing.JButton botonRefresh;
    private javax.swing.JButton botonSave;
    private javax.swing.JLabel fondo;
    private javax.swing.JToolBar.Separator hSeparador2;
    private javax.swing.JToolBar.Separator hSeparador3;
    private javax.swing.JLabel imgCostosGrafica;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem meAcerca;
    private javax.swing.JMenuItem meContenido;
    private javax.swing.JMenu meMetodos;
    private javax.swing.JMenu mePresupuesto;
    private javax.swing.JMenuItem meSoporte;
    private javax.swing.JMenu menu;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuItem menuMeIngreso;
    private javax.swing.JMenuItem menuMePeps;
    private javax.swing.JMenuItem menuMePromedio;
    private javax.swing.JPopupMenu.Separator menuMetSeparador;
    private javax.swing.JMenu menuMetodos1;
    private javax.swing.JMenuItem menuPrIngreso;
    private javax.swing.JMenuItem menuPrMaestro;
    private javax.swing.JPopupMenu.Separator menuPrSeparador;
    private javax.swing.JMenu menuPresupuesto;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panelHome;
    private javax.swing.JTabbedPane tabbedPanel;
    // End of variables declaration//GEN-END:variables
}
