package co.gov.minambiente.vista.formulario;

import co.gov.minambiente.controlador.ControladorSolicitud;
import co.gov.minambiente.modelo.DepartmentModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalia García
 */
public class Seccion4_1 extends javax.swing.JFrame {

    private ControladorSolicitud controlador;

    public Seccion4_1(ControladorSolicitud controlador) throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.controlador = controlador;
        LinkedList<String> departamentos = this.controlador.cargarDepartamentos();
        cmbDepartamento.addItem("Seleccione");
        for (String departamento : departamentos) {
            cmbDepartamento.addItem(departamento);
        }
        cmbMunicipio.addItem("Seleccione");
        cmbMunicipio.setEnabled(false);
        txtVereda.setEnabled(false);
        txtMatriculaInmobiliaria.setEnabled(false);
        txtCedulaCatastral.setEnabled(false);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                mostrarMenuPrincipal();
            }
        });
    }

    private void mostrarSiguienteVentana() {
        this.setVisible(false);
        controlador.mostrarSeccion4_2();
    }
    
    public void mostrarMenuPrincipal(){
        int opcion = JOptionPane.showConfirmDialog(null, "Toda la información escrita previamente se eliminará", "¿Está seguro?", JOptionPane.YES_NO_OPTION);
        if(opcion == 0){
            this.setVisible(false);
            controlador.mostrarPrincipal();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCedulaCatastral = new javax.swing.JTextField();
        txtSuperficie = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMatriculaInmobiliaria = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        rbSi = new javax.swing.JRadioButton();
        rbNo = new javax.swing.JRadioButton();
        cmbDepartamento = new javax.swing.JComboBox<>();
        cmbMunicipio = new javax.swing.JComboBox<>();
        txtVereda = new javax.swing.JTextField();
        btnPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("4. Información general del predio");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Superficie (ha):");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Municipio:");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Dirección del predio:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Vereda:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Cédula catastral (solo si no dispone de matrícula inmobiliaria):");

        txtCedulaCatastral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaCatastralActionPerformed(evt);
            }
        });
        txtCedulaCatastral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaCatastralKeyTyped(evt);
            }
        });

        txtSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuperficieActionPerformed(evt);
            }
        });
        txtSuperficie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSuperficieKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Departamento:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Número(s) de matrícula inmobiliaria:");

        txtMatriculaInmobiliaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaInmobiliariaActionPerformed(evt);
            }
        });
        txtMatriculaInmobiliaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMatriculaInmobiliariaKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setText("4.1. Información del (los) predio(s) a intervenir: ");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Nombre del predio:");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Urbano", "Rural" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial Narrow", 2, 13)); // NOI18N
        jLabel26.setText("Nota: En caso de que el área para el desarrollo del aprovechamiento forestal o manejo sostenible comprenda más de dos predios a intervenir, el interesado deberá anexar una");
        jLabel26.setToolTipText("");

        jLabel27.setFont(new java.awt.Font("Arial Narrow", 2, 13)); // NOI18N
        jLabel27.setText("tabla con la información predial adicional de acuerdo a los campos descritos en el presente formato.");

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });

        btnAnterior.setText("Anterior");
        btnAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnteriorMouseClicked(evt);
            }
        });
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Dispone de matrícula inmobiliaria:");

        buttonGroup1.add(rbSi);
        rbSi.setText("Sí");
        rbSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSiActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbNo);
        rbNo.setText("No");
        rbNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoActionPerformed(evt);
            }
        });

        cmbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartamentoActionPerformed(evt);
            }
        });

        cmbMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMunicipioActionPerformed(evt);
            }
        });

        txtVereda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVeredaActionPerformed(evt);
            }
        });
        txtVereda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVeredaKeyTyped(evt);
            }
        });

        btnPrincipal.setText("Volver a la ventana principal");
        btnPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseClicked(evt);
            }
        });
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCedulaCatastral, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnAnterior)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnPrincipal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSiguiente))
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMatriculaInmobiliaria, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbSi)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(rbNo))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel12)
                                                    .addGap(10, 10, 10)
                                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(12, 12, 12)
                                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVereda, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel11)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel12)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(cmbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVereda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(rbSi)
                    .addComponent(rbNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMatriculaInmobiliaria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCedulaCatastral, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente)
                    .addComponent(btnPrincipal))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCedulaCatastralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaCatastralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaCatastralActionPerformed

    private void txtSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuperficieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuperficieActionPerformed

    private void txtMatriculaInmobiliariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaInmobiliariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaInmobiliariaActionPerformed

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
        String nombre = txtNombre.getText().trim();
        String superficie = txtSuperficie.getText().trim();
        String direccion = txtDireccion.getText().trim();
        String tipo = (String) cmbTipo.getSelectedItem();
        String departamento = (String) cmbDepartamento.getSelectedItem();
        String municipio = (String) cmbMunicipio.getSelectedItem();
        String vereda = txtVereda.getText().trim();
        String matriculaInmobiliaria = txtMatriculaInmobiliaria.getText().trim();
        String cedulaCatastral = txtCedulaCatastral.getText().trim();

        if (!nombre.equals("") && !superficie.equals("") && !direccion.equals("") && !tipo.equals("Seleccione")
                && !departamento.equals("Seleccione") && !municipio.equals("") && !vereda.equals("")) {
            if (rbSi.isSelected()) {
                if (!matriculaInmobiliaria.equals("")) {
                    controlador.guardarInformacionSeccion4_1(nombre, superficie, direccion, tipo, departamento, municipio, vereda, 
                            matriculaInmobiliaria, cedulaCatastral);
                    mostrarSiguienteVentana();
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese todos los datos solicitados.");
                }
            } else if (rbNo.isSelected()) {
                if (!cedulaCatastral.equals("")) {
                    controlador.guardarInformacionSeccion4_1(nombre, superficie, direccion, tipo, departamento, municipio, vereda, 
                            matriculaInmobiliaria, cedulaCatastral);
                    mostrarSiguienteVentana();
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese todos los datos solicitados.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese todos los datos solicitados.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos solicitados.");
        }
    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnteriorMouseClicked
        this.setVisible(false);
        controlador.mostrarSeccion3();
    }//GEN-LAST:event_btnAnteriorMouseClicked

    private void rbSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSiActionPerformed
        txtMatriculaInmobiliaria.setEnabled(true);
        txtCedulaCatastral.setEnabled(false);
    }//GEN-LAST:event_rbSiActionPerformed

    private void rbNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoActionPerformed
        txtMatriculaInmobiliaria.setEnabled(false);
        txtCedulaCatastral.setEnabled(true);
    }//GEN-LAST:event_rbNoActionPerformed

    private void cmbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartamentoActionPerformed
        if (cmbDepartamento.getSelectedIndex() == 0) {
            cmbMunicipio.removeAllItems();
            cmbMunicipio.setEnabled(false);
            txtVereda.setEnabled(false);
            txtVereda.setText("");
        } else {
            txtVereda.setText("");
            cmbMunicipio.removeAllItems();
            try {
                LinkedList<String> municipios = controlador.cargarMunicipios((String) cmbDepartamento.getSelectedItem());
                for (String municipio : municipios) {
                    cmbMunicipio.addItem(municipio);
                }
                cmbMunicipio.setEnabled(true);
                txtVereda.setEnabled(true);
            } catch (IOException ex) {
                Logger.getLogger(Seccion4_1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cmbDepartamentoActionPerformed

    private void cmbMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMunicipioActionPerformed

    private void txtVeredaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVeredaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVeredaActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (txtNombre.getText().length() > 25) {
            evt.consume();
        } else {
            if (!Character.isAlphabetic(evt.getKeyChar())) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtSuperficieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSuperficieKeyTyped
        if (txtSuperficie.getText().length() > 25) {
            evt.consume();
        } else {
            if (!Character.isDigit(evt.getKeyChar())) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtSuperficieKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        if (txtDireccion.getText().length() > 25) {
            evt.consume();
        } else {
            if (!Character.isAlphabetic(evt.getKeyChar()) && !Character.isDigit(evt.getKeyChar())) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtVeredaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVeredaKeyTyped
        if (txtVereda.getText().length() > 25) {
            evt.consume();
        } else {
            if (!Character.isAlphabetic(evt.getKeyChar())) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtVeredaKeyTyped

    private void txtMatriculaInmobiliariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaInmobiliariaKeyTyped
        if (txtMatriculaInmobiliaria.getText().length() > 12) {
            evt.consume();
        } else {
            if (!Character.isAlphabetic(evt.getKeyChar()) && !Character.isDigit(evt.getKeyChar())) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtMatriculaInmobiliariaKeyTyped

    private void txtCedulaCatastralKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaCatastralKeyTyped
        if (txtCedulaCatastral.getText().length() > 20) {
            evt.consume();
        } else {
            if (!Character.isAlphabetic(evt.getKeyChar()) && !Character.isDigit(evt.getKeyChar())) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCedulaCatastralKeyTyped

    private void btnPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseClicked
        mostrarMenuPrincipal();
    }//GEN-LAST:event_btnPrincipalMouseClicked

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(Seccion4_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seccion4_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seccion4_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seccion4_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Seccion4_1(new ControladorSolicitud()).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Seccion4_1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbDepartamento;
    private javax.swing.JComboBox<String> cmbMunicipio;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbNo;
    private javax.swing.JRadioButton rbSi;
    private javax.swing.JTextField txtCedulaCatastral;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMatriculaInmobiliaria;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSuperficie;
    private javax.swing.JTextField txtVereda;
    // End of variables declaration//GEN-END:variables
}
