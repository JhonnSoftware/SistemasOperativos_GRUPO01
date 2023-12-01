
package paquete1;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PlanificacionDeDisco_GRUPO01 extends javax.swing.JFrame {

    //private Queue<Integer> listaPeticionesFIFO;
    //private PriorityQueue<Integer> listaPeticionesSSTF;
    private ArrayList<Integer> listaPeticionesFIFO;
    private ArrayList<Integer> listaPeticionesSSTF;
    private ArrayList<Integer> listaPeticionesSCAN;
    private ArrayList<Integer> listaPeticionesCSCAN;
    private ArrayList<Integer> listaPeticionesLOOK;
    private ArrayList<Integer> listaPeticionesCLOOK;
    
    
    ArrayList<Integer> peticionesDecrecientesLOOK = new ArrayList<>();
    ArrayList<Integer> peticionesCrecientesLOOK = new ArrayList<>();
    
    ArrayList<Integer> peticionesDecrecientesCLOOK = new ArrayList<>();
    ArrayList<Integer> peticionesCrecientesCLOOK = new ArrayList<>();    
    
    private boolean direccionDerecha = true;
    private int posicionInicialCabezal;
    
    private DefaultTableModel modeloTablaFIFO;
    private DefaultTableModel modeloTablaSSTF;
    private DefaultTableModel modeloTablaSCAN;
    private DefaultTableModel modeloTablaCSCAN;
    private DefaultTableModel modeloTablaLOOK;
    private DefaultTableModel modeloTablaCLOOK;
    
    int numeroPistas;
    int pistasRecorridas;
    int pistasRecorridasCSCAN;
    
    double promedioRecorridoFIFO;
    double promedioRecorridoSSTF;
    double promedioRecorridoSCAN;
    double promedioRecorridoCSCAN;
    double promedioRecorridoLOOK;
    double promedioRecorridoCLOOK;
    
    public PlanificacionDeDisco_GRUPO01() {
        initComponents();
        txtNumeroPistas.setEditable(true);
        txtPosicionCabezal.setEditable(false);
        txtPeticion.setEditable(false);
        txtAlgoritmoElegir.setEditable(false);
        btnAgregar.setEnabled(false);
        btnSimular.setEnabled(false);
        
        listaPeticionesFIFO = new ArrayList<>();
        listaPeticionesSSTF = new ArrayList<>();
        listaPeticionesSCAN = new ArrayList<>();
        listaPeticionesCSCAN = new ArrayList<>();
        listaPeticionesLOOK = new ArrayList<>();
        listaPeticionesCLOOK = new ArrayList<>();
        // Supongamos que la posición inicial del cabezal es 0
        posicionInicialCabezal = 0;
                
        modeloTablaFIFO = new DefaultTableModel();
        modeloTablaFIFO.addColumn("FIFO");
        
        modeloTablaSSTF = new DefaultTableModel();
        modeloTablaSSTF.addColumn("SSTF");
        
        modeloTablaSCAN = new DefaultTableModel();
        modeloTablaSCAN.addColumn("SCAN");
        
        modeloTablaCSCAN = new DefaultTableModel();
        modeloTablaCSCAN.addColumn("C-SCAN");
        
        modeloTablaLOOK = new DefaultTableModel();
        modeloTablaLOOK.addColumn("LOOK");
        
        modeloTablaCLOOK = new DefaultTableModel();
        modeloTablaCLOOK.addColumn("CLOOK");

        tablaPeticionesFIFO.setModel(modeloTablaFIFO);
        tablaPeticionesSSFT.setModel(modeloTablaSSTF);
        tablaPeticionesSCAN.setModel(modeloTablaSCAN);
        tablaPeticionesCSCAN.setModel(modeloTablaCSCAN);
        tablaPeticionesLOOK.setModel(modeloTablaLOOK);
        tablaPeticionesCLOOK.setModel(modeloTablaCLOOK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        txtPeticion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPosicionCabezal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaPeticiones = new javax.swing.JTextArea();
        Pane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPeticionesFIFO = new javax.swing.JTable();
        txtPistasRecorridasFIFO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPromedioRecorridoFIFO = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaPeticionesSSFT = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPistasRecorridasSSTF = new javax.swing.JTextField();
        txtPromedioRecorridoSSTF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaPeticionesSCAN = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPromedioRecorridoSCAN = new javax.swing.JTextField();
        txtPistasRecorridasSCAN = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaPeticionesCSCAN = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPistasRecorridasCSCAN = new javax.swing.JTextField();
        txtPromedioRecorridoCSCAN = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaPeticionesLOOK = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtPromedioRecorridoLOOK = new javax.swing.JTextField();
        txtPistasRecorridasLOOK = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaPeticionesCLOOK = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtPistasRecorridasCLOOK = new javax.swing.JTextField();
        txtPromedioRecorridoCLOOK = new javax.swing.JTextField();
        btnSimular = new javax.swing.JButton();
        txtNumeroPistas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAlgoritmoElegir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 110, 40));
        getContentPane().add(txtPeticion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 162, 35));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setText("Ingrese peticiones:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Ingrese posicion del cabezal:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, 20));

        txtPosicionCabezal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPosicionCabezalKeyPressed(evt);
            }
        });
        getContentPane().add(txtPosicionCabezal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 162, 33));

        txtAreaPeticiones.setColumns(20);
        txtAreaPeticiones.setRows(5);
        jScrollPane1.setViewportView(txtAreaPeticiones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 318, 170));

        Pane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Pane.setToolTipText("");
        Pane.setName(""); // NOI18N

        tablaPeticionesFIFO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Peticiones Ordenadas"
            }
        ));
        jScrollPane3.setViewportView(tablaPeticionesFIFO);

        txtPistasRecorridasFIFO.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("NUMERO DE PISTAS RECORRIDAS:");

        jLabel8.setText("PROMEDIO PISTAS RECORRIDAS: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPromedioRecorridoFIFO, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(txtPistasRecorridasFIFO))))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPistasRecorridasFIFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPromedioRecorridoFIFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Pane.addTab("FIFO", jPanel1);

        tablaPeticionesSSFT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Peticiones Ordenadas"
            }
        ));
        jScrollPane4.setViewportView(tablaPeticionesSSFT);

        jLabel9.setText("NUMERO DE PISTAS RECORRIDAS:");

        jLabel10.setText("PROMEDIO PISTAS RECORRIDAS: ");

        txtPistasRecorridasSSTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPromedioRecorridoSSTF, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(txtPistasRecorridasSSTF)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPistasRecorridasSSTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPromedioRecorridoSSTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Pane.addTab("SSTF", jPanel2);

        tablaPeticionesSCAN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Peticiones Ordenadas"
            }
        ));
        jScrollPane5.setViewportView(tablaPeticionesSCAN);

        jLabel11.setText("NUMERO DE PISTAS RECORRIDAS:");

        jLabel12.setText("PROMEDIO PISTAS RECORRIDAS: ");

        txtPistasRecorridasSCAN.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPistasRecorridasSCAN)
                            .addComponent(txtPromedioRecorridoSCAN))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtPistasRecorridasSCAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPromedioRecorridoSCAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Pane.addTab("SCAN", jPanel3);

        tablaPeticionesCSCAN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Peticiones Ordenadas"
            }
        ));
        jScrollPane6.setViewportView(tablaPeticionesCSCAN);

        jLabel13.setText("NUMERO DE PISTAS RECORRIDAS:");

        jLabel14.setText("PROMEDIO PISTAS RECORRIDAS: ");

        txtPistasRecorridasCSCAN.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPromedioRecorridoCSCAN, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(txtPistasRecorridasCSCAN))
                .addGap(40, 40, 40))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPistasRecorridasCSCAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtPromedioRecorridoCSCAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Pane.addTab("C-SCAN", jPanel4);

        tablaPeticionesLOOK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Peticiones Ordenadas"
            }
        ));
        jScrollPane7.setViewportView(tablaPeticionesLOOK);

        jLabel15.setText("NUMERO DE PISTAS RECORRIDAS:");

        jLabel16.setText("PROMEDIO PISTAS RECORRIDAS: ");

        txtPistasRecorridasLOOK.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPistasRecorridasLOOK, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(txtPromedioRecorridoLOOK)))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPistasRecorridasLOOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtPromedioRecorridoLOOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Pane.addTab("LOOK", jPanel5);

        tablaPeticionesCLOOK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Peticiones Ordenadas"
            }
        ));
        jScrollPane8.setViewportView(tablaPeticionesCLOOK);

        jLabel17.setText("NUMERO DE PISTAS RECORRIDAS:");

        jLabel18.setText("PROMEDIO PISTAS RECORRIDAS: ");

        txtPistasRecorridasCLOOK.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPistasRecorridasCLOOK)
                            .addComponent(txtPromedioRecorridoCLOOK, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtPistasRecorridasCLOOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtPromedioRecorridoCLOOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Pane.addTab("C-LOOK", jPanel6);

        getContentPane().add(Pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        btnSimular.setText("SIMULAR");
        btnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimular, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 110, 38));

        txtNumeroPistas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroPistasKeyPressed(evt);
            }
        });
        getContentPane().add(txtNumeroPistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 160, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setText("Ingrese Numero Total de pistas:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("PROMEDIO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));
        getContentPane().add(txtAlgoritmoElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 210, 40));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel6.setText("Tabla de algoritmos:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel7.setText("PROGRAMA PLANIFICACION DE DISCO - GRUPO 01");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel19.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel19.setText("Ingreso de datos:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel20.setText("ALGORITMO CON MENOR:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            int peticion = Integer.parseInt(txtPeticion.getText());
            // Validar que la pista esté en un rango válido
            if (peticion >= 0 && peticion <= 1000) {
                listaPeticionesFIFO.add(peticion);
                listaPeticionesSSTF.add(peticion);
                listaPeticionesSCAN.add(peticion);
                listaPeticionesCSCAN.add(peticion);
                listaPeticionesLOOK.add(peticion);
                listaPeticionesCLOOK.add(peticion);
                JOptionPane.showMessageDialog(this, "Peticion agregada: " + peticion + "\n");

            } else {
                JOptionPane.showMessageDialog(this, "La pista debe estar entre 0 y el numero de pistas");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido");
        }
        txtPeticion.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    private void simularCSCAN(){
        
        // Filtrar peticiones mayores al cabezal
        ArrayList<Integer> peticionesMayores = new ArrayList<>();
        for (int peticion : listaPeticionesCSCAN) {
            if (peticion > posicionInicialCabezal) {
                peticionesMayores.add(peticion);
            }
        }
        // Ordenar peticiones mayores en forma ascendente
        Collections.sort(peticionesMayores);
        
        // Filtrar peticiones menores o iguales al cabezal
        ArrayList<Integer> peticionesMenores = new ArrayList<>();
        for (int peticion : listaPeticionesCSCAN) {
            if (peticion <= posicionInicialCabezal) {
                peticionesMenores.add(peticion);
            }
        }
        // Ordenar peticiones menores en forma ascendente
        Collections.sort(peticionesMenores);

        // Combinar las dos listas ordenadas
        ArrayList<Integer> peticionesOrdenadas = new ArrayList<>(peticionesMayores);
        peticionesOrdenadas.addAll(peticionesMenores);
        
        for (int peticion : peticionesOrdenadas) {
            System.out.println("Atendiendo pista CSCAN: " + peticion);
            txtAreaPeticiones.append("Atendiendo pista CSCAN: " + peticion + "\n");
            modeloTablaCSCAN.addRow(new Object[]{peticion});
        }
        
        promedioRecorridoCSCAN = (double) pistasRecorridas / listaPeticionesCSCAN.size();
        txtPistasRecorridasCSCAN.setText(""+pistasRecorridas);
        txtPromedioRecorridoCSCAN.setText(""+promedioRecorridoCSCAN);
    }
      
    private void ordenarPeticiones() {
        int cabezaActual = posicionInicialCabezal;

        // Separar las peticiones en dos listas
        ArrayList<Integer> izquierda = new ArrayList<>();
        ArrayList<Integer> derecha = new ArrayList<>();

        for (int peticion : listaPeticionesSCAN) {
            if (peticion < cabezaActual) {
                izquierda.add(peticion);
            } else {
                derecha.add(peticion);
            }
        }

        // Ordenar cada lista por separado
        izquierda.sort(null);
        derecha.sort(null);

        // Unir las listas ordenadas
        listaPeticionesSCAN.clear();
        listaPeticionesSCAN.addAll(izquierda);
        listaPeticionesSCAN.addAll(derecha);
    }
    
    private void simularSCAN(){
        
        // Filtrar peticiones mayores al cabezal
        ArrayList<Integer> peticionesMayores = new ArrayList<>();
        for (int peticion : listaPeticionesSCAN) {
            if (peticion > posicionInicialCabezal) {
                peticionesMayores.add(peticion);
            }
        }
        // Ordenar peticiones mayores en forma ascendente
        Collections.sort(peticionesMayores);
        
        // Filtrar peticiones menores o iguales al cabezal
        ArrayList<Integer> peticionesMenores = new ArrayList<>();
        for (int peticion : listaPeticionesSCAN) {
            if (peticion <= posicionInicialCabezal) {
                peticionesMenores.add(peticion);
            }
        }
        // Ordenar peticiones menores en forma descendente
        Collections.sort(peticionesMenores, Collections.reverseOrder());

        // Combinar las dos listas ordenadas
        ArrayList<Integer> peticionesOrdenadas = new ArrayList<>(peticionesMayores);
        peticionesOrdenadas.addAll(peticionesMenores);
        
        for (int peticion : peticionesOrdenadas) {
            System.out.println("Atendiendo pista SCAN: " + peticion);
            txtAreaPeticiones.append("Atendiendo pista SCAN: " + peticion + "\n");
            modeloTablaSCAN.addRow(new Object[]{peticion});
        }
        int pistasRecorridas = calcularPistasRecorridas(posicionInicialCabezal, peticionesOrdenadas);
        
        promedioRecorridoSCAN = (double) pistasRecorridas / listaPeticionesSCAN.size();
        txtPistasRecorridasSCAN.setText(""+pistasRecorridas);
        txtPromedioRecorridoSCAN.setText(""+promedioRecorridoSCAN);
        
    }

    private void simularLOOK(){

        for (int peticion : listaPeticionesLOOK) {
            if (peticion < posicionInicialCabezal) {
                insertarOrdenadoDescendente(peticionesDecrecientesLOOK, peticion);
            } else {
                insertarOrdenadoAscendente(peticionesCrecientesLOOK, peticion);
            }
        }
        
        ArrayList<Integer> peticionesOrdenadas = new ArrayList<>(peticionesDecrecientesLOOK);
        peticionesOrdenadas.addAll(peticionesCrecientesLOOK);
        
        for (int peticion : peticionesOrdenadas) {
            System.out.println("Atendiendo pista: " + peticion);
            txtAreaPeticiones.append("Atendiendo pista LOOK: " + peticion + "\n");
            modeloTablaLOOK.addRow(new Object[]{peticion});
        }
        
        // Calcular el número de pistas recorridas
        int pistasRecorridas = calcularPistasRecorridas(posicionInicialCabezal, peticionesOrdenadas);
        
        promedioRecorridoLOOK = (double) pistasRecorridas / listaPeticionesLOOK.size();
        txtPistasRecorridasLOOK.setText(""+pistasRecorridas);
        txtPromedioRecorridoLOOK.setText(""+promedioRecorridoLOOK);
    }
    
    private static void insertarOrdenadoDescendente(ArrayList<Integer> lista, int elemento) {
        int i = 0;
        while (i < lista.size() && lista.get(i) > elemento) {
            i++;
        }
        lista.add(i, elemento);
    }
    
    private static void insertarOrdenadoAscendente(ArrayList<Integer> lista, int elemento) {
        int i = 0;
        while (i < lista.size() && lista.get(i) < elemento) {
            i++;
        }
        lista.add(i, elemento);
    }
    
    
    private static int calcularPistasRecorridas(int posicionInicial, ArrayList<Integer> peticiones) {
        int pistasRecorridas = 0;
        int cabezaActual = posicionInicial;

        for (int peticion : peticiones) {
            pistasRecorridas += Math.abs(cabezaActual - peticion);
            cabezaActual = peticion;
        }

        return pistasRecorridas;
    }
    
    private void simularCLOOK(){
        // Ordenar peticiones decrecientes si son menores que la posición inicial del cabezal
        ArrayList<Integer> peticionesDecrecientes = new ArrayList<>();
        for (int peticion : listaPeticionesCLOOK) {
            if (peticion < posicionInicialCabezal) {
                insertarOrdenadoDescendente(peticionesDecrecientes, peticion);
            }
        }
        
        // Ordenar peticiones crecientes si son mayores o iguales a la posición inicial del cabezal
        ArrayList<Integer> peticionesCrecientes = new ArrayList<>();
        for (int peticion : listaPeticionesCLOOK) {
            if (peticion >= posicionInicialCabezal) {
                insertarOrdenadoAscendente(peticionesCrecientes, peticion);
            }
        }
        
        // Combinar las dos listas ordenadas
        ArrayList<Integer> peticionesOrdenadas = new ArrayList<>(peticionesDecrecientes);
        peticionesOrdenadas.addAll(peticionesCrecientes);
        
        // Imprimir el resultado uno por uno
        for (int peticion : peticionesOrdenadas) {
            System.out.println("Atendiendo pista: " + peticion);
            txtAreaPeticiones.append("Atendiendo pista CLOOK: " + peticion + "\n");
            modeloTablaCLOOK.addRow(new Object[]{peticion});
        }
        
        int pistasRecorridas = calcularPistasRecorridas(posicionInicialCabezal, peticionesOrdenadas);
        
        promedioRecorridoCLOOK = (double) pistasRecorridas / listaPeticionesCLOOK.size();
        txtPistasRecorridasCLOOK.setText(""+pistasRecorridas);
        txtPromedioRecorridoCLOOK.setText(""+promedioRecorridoCLOOK);
    }
    
    
    private void txtPosicionCabezalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPosicionCabezalKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtPeticion.setEditable(true);
            btnAgregar.setEnabled(true);
            btnSimular.setEnabled(true);
            txtAlgoritmoElegir.setEditable(true);
            
            posicionInicialCabezal = Integer.parseInt(txtPosicionCabezal.getText());
            
            if(posicionInicialCabezal>0 && posicionInicialCabezal<=numeroPistas){
                JOptionPane.showMessageDialog(rootPane, "SE HA INGRESADO CORRECTAMENTE EL CABEZAL");
                txtPosicionCabezal.setEditable(false);
            }else{
                JOptionPane.showMessageDialog(rootPane, "EL NUMERO DE CABEZAL TIENE QUE SER MAYOR A (0) o MENOR AL NUMERO DE PISTAS INGRESADOS ");
            }
        }
    }//GEN-LAST:event_txtPosicionCabezalKeyPressed

    private void btnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularActionPerformed
            try {
                int cabezaActualFIFO = posicionInicialCabezal;
                int mtcFIFO=0;
                //Algoritmo FIFO ----------------------------------------------------------------------------------
                
                for(int i=0; i<listaPeticionesFIFO.size(); i++){
                    int peticionAtendidaFIFO = listaPeticionesFIFO.get(i);
                    //txtAreaPeticiones.append("Atendiendo pista: " + peticionAtendidaFIFO + "\n");
                    modeloTablaFIFO.addRow(new Object[]{peticionAtendidaFIFO});
                    
                    int pistasRecorridasFIFO = Math.abs(listaPeticionesFIFO.get(i) - cabezaActualFIFO);
                    mtcFIFO = mtcFIFO + pistasRecorridasFIFO;
                    cabezaActualFIFO = listaPeticionesFIFO.get(i);
                    
                }
                
                promedioRecorridoFIFO = (double) mtcFIFO / listaPeticionesFIFO.size();
                txtPistasRecorridasFIFO.setText(""+mtcFIFO);
                txtPromedioRecorridoFIFO.setText(""+promedioRecorridoFIFO);
                
                //Algoritmo SSTF ----------------------------------------------------------------------------------
                int cabezaActualSSTF = posicionInicialCabezal;
                pistasRecorridas=0;
                int contadorSSTF=0;

                while(!listaPeticionesSSTF.isEmpty()){
                    int peticionSiguiente = buscarSiguientePeticion();
                    modeloTablaSSTF.addRow(new Object[]{peticionSiguiente});
                    pistasRecorridas += Math.abs(peticionSiguiente - posicionInicialCabezal);
                    posicionInicialCabezal = peticionSiguiente;
                    contadorSSTF++;
                }
                
                promedioRecorridoSSTF = (double)pistasRecorridas / contadorSSTF;
                txtPistasRecorridasSSTF.setText(""+pistasRecorridas);
                txtPromedioRecorridoSSTF.setText(""+promedioRecorridoSSTF);
                
                
                
                //Algoritmo SCAN ----------------------------------------------------------------------------------
                simularSCAN();
                
                //Algoritmo CSCAN ----------------------------------------------------------------------------------
                simularCSCAN();
                
                //Algoritmo LOOK ----------------------------------------------------------------------------------
                Collections.sort(listaPeticionesLOOK);
                simularLOOK();

                //Algoritmo CLOOK ----------------------------------------------------------------------------------
                Collections.sort(listaPeticionesCLOOK);
                simularCLOOK();
                
                // Encontrar el valor menor
                double valorMenor = encontrarValorMenor(promedioRecorridoFIFO, promedioRecorridoSSTF,promedioRecorridoSCAN, promedioRecorridoCSCAN, promedioRecorridoLOOK, promedioRecorridoCLOOK);
                txtAlgoritmoElegir.setText(""+valorMenor);
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese una posición válida para el cabezal");
            }
    }//GEN-LAST:event_btnSimularActionPerformed
    
    private static double encontrarValorMenor(double... valores) {
        // Inicializar con el primer valor
        double valorMenor = valores[0];

        // Iterar sobre los demás valores y actualizar si se encuentra un valor menor
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] < valorMenor) {
                valorMenor = valores[i];
            }
        }

        return valorMenor;
    }
    
    private int buscarSiguientePeticion() {
        int minDistancia = Integer.MAX_VALUE;
        int peticionSiguiente = -1;

        for (int peticion : listaPeticionesSSTF) {
            int distancia = Math.abs(peticion - posicionInicialCabezal);
            if (distancia < minDistancia) {
                minDistancia = distancia;
                peticionSiguiente = peticion;
            }
        }
        
        listaPeticionesSSTF.remove(Integer.valueOf(peticionSiguiente));
        return peticionSiguiente;
    }
    
    private void txtNumeroPistasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroPistasKeyPressed
 
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtPosicionCabezal.setEditable(true);
            txtPeticion.setEditable(false);
            txtAlgoritmoElegir.setEditable(false);
            btnAgregar.setEnabled(false);
            btnSimular.setEnabled(false);
            
            numeroPistas = Integer.parseInt(txtNumeroPistas.getText());

            if(numeroPistas>0){
                JOptionPane.showMessageDialog(rootPane, "SE HA INGRESADO CORRECTAMENTE EL NUMERO DE PISTAS");
                txtNumeroPistas.setEditable(false);
            }else{
                JOptionPane.showMessageDialog(rootPane, "EL NUMERO DE CABEZAL TIENE QUE SER MAYOR A (0)");
            }
        }
    }//GEN-LAST:event_txtNumeroPistasKeyPressed
   
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlanificacionDeDisco_GRUPO01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanificacionDeDisco_GRUPO01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanificacionDeDisco_GRUPO01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanificacionDeDisco_GRUPO01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlanificacionDeDisco_GRUPO01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Pane;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSimular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable tablaPeticionesCLOOK;
    private javax.swing.JTable tablaPeticionesCSCAN;
    private javax.swing.JTable tablaPeticionesFIFO;
    private javax.swing.JTable tablaPeticionesLOOK;
    private javax.swing.JTable tablaPeticionesSCAN;
    private javax.swing.JTable tablaPeticionesSSFT;
    private javax.swing.JTextField txtAlgoritmoElegir;
    private javax.swing.JTextArea txtAreaPeticiones;
    private javax.swing.JTextField txtNumeroPistas;
    private javax.swing.JTextField txtPeticion;
    private javax.swing.JTextField txtPistasRecorridasCLOOK;
    private javax.swing.JTextField txtPistasRecorridasCSCAN;
    private javax.swing.JTextField txtPistasRecorridasFIFO;
    private javax.swing.JTextField txtPistasRecorridasLOOK;
    private javax.swing.JTextField txtPistasRecorridasSCAN;
    private javax.swing.JTextField txtPistasRecorridasSSTF;
    private javax.swing.JTextField txtPosicionCabezal;
    private javax.swing.JTextField txtPromedioRecorridoCLOOK;
    private javax.swing.JTextField txtPromedioRecorridoCSCAN;
    private javax.swing.JTextField txtPromedioRecorridoFIFO;
    private javax.swing.JTextField txtPromedioRecorridoLOOK;
    private javax.swing.JTextField txtPromedioRecorridoSCAN;
    private javax.swing.JTextField txtPromedioRecorridoSSTF;
    // End of variables declaration//GEN-END:variables
}
