/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import proyecto_final.Clases.frases;
import proyecto_final.Clases.noticias;

/**
 *
 * @author GIGABYTE
 */
public class Frases_Admin extends javax.swing.JFrame {
private ArrayList<frases> listaFrases = new ArrayList<>();

    /**
     * Creates new form Frases_Admin
     */
    public Frases_Admin() {
        initComponents();
        // Inicializar la tabla
        mostrarDatosEnTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new proyecto_final.PanelRound();
        panelRound2 = new proyecto_final.PanelRound();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelRound5 = new proyecto_final.PanelRound();
        panelRound3 = new proyecto_final.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        panelRound6 = new proyecto_final.PanelRound();
        panelRound8 = new proyecto_final.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtfrase = new javax.swing.JTextField();
        txtfraseautor = new javax.swing.JTextField();
        txtcategoria = new javax.swing.JTextField();
        btingresar = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btconsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        cerrar = new javax.swing.JLabel();
        botonregresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRound1.setBackground(new java.awt.Color(84, 71, 132));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(44, 44, 59));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelRound2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 305, 28));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final/Imagenes/Logo_conCirculo-removebg-preview (2).png"))); // NOI18N
        panelRound2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 320, 250));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("EVOFIT");
        panelRound2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 350, 320));

        panelRound5.setBackground(new java.awt.Color(70, 86, 132));
        panelRound5.setRoundBottomLeft(30);
        panelRound5.setRoundBottomRight(30);
        panelRound5.setRoundTopLeft(30);
        panelRound5.setRoundTopRight(30);

        panelRound3.setBackground(new java.awt.Color(239, 204, 154));
        panelRound3.setRoundBottomLeft(40);
        panelRound3.setRoundBottomRight(40);
        panelRound3.setRoundTopLeft(40);
        panelRound3.setRoundTopRight(40);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("FRASES");

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel8)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        panelRound6.setBackground(new java.awt.Color(238, 163, 193));
        panelRound6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        panelRound6.setRoundTopLeft(40);
        panelRound6.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelRound8.setBackground(new java.awt.Color(238, 163, 193));
        panelRound8.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        panelRound8.setRoundBottomRight(40);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelRound8Layout = new javax.swing.GroupLayout(panelRound8);
        panelRound8.setLayout(panelRound8Layout);
        panelRound8Layout.setHorizontalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound8Layout.setVerticalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound8Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("Codigo Noticia:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel13.setText("Autor");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel15.setText("Categoria:");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel19.setText("Frase");

        txtcodigo.setBackground(new java.awt.Color(70, 86, 132));
        txtcodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtcodigo.setBorder(null);
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        txtfrase.setBackground(new java.awt.Color(70, 86, 132));
        txtfrase.setForeground(new java.awt.Color(255, 255, 255));
        txtfrase.setBorder(null);

        txtfraseautor.setBackground(new java.awt.Color(70, 86, 132));
        txtfraseautor.setForeground(new java.awt.Color(255, 255, 255));
        txtfraseautor.setBorder(null);

        txtcategoria.setBackground(new java.awt.Color(70, 86, 132));
        txtcategoria.setForeground(new java.awt.Color(255, 255, 255));
        txtcategoria.setBorder(null);

        btingresar.setText("INGRESAR");
        btingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btingresarActionPerformed(evt);
            }
        });

        btmodificar.setText("MODIFICAR");
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });

        bteliminar.setText("ELIMINAR");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });

        btconsultar.setText("CONSULTAR");
        btconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconsultarActionPerformed(evt);
            }
        });

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladatos);

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelRound5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound5Layout.createSequentialGroup()
                        .addGap(527, 527, 527)
                        .addComponent(panelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound5Layout.createSequentialGroup()
                        .addComponent(btingresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btmodificar)
                        .addGap(18, 18, 18)
                        .addComponent(bteliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btconsultar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel19))
                        .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound5Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfraseautor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRound5Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(txtfrase, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelRound5Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btingresar)
                            .addComponent(btmodificar)
                            .addComponent(bteliminar)
                            .addComponent(btconsultar)))
                    .addGroup(panelRound5Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelRound6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txtfrase, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtfraseautor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        panelRound1.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 650, 640));

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final/Imagenes/boton.png"))); // NOI18N
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        panelRound1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 30, 40));

        botonregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final/Imagenes/atras_32px.png"))); // NOI18N
        botonregresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonregresarMouseClicked(evt);
            }
        });
        panelRound1.add(botonregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void btingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btingresarActionPerformed
        // TODO add your handling code here:
        // Agregar una nueva frase a la lista
        frases nuevaFrase = new frases();
        nuevaFrase.setAutor(txtfraseautor.getText());
        nuevaFrase.setTexto(txtfrase.getText());
        nuevaFrase.setCod_frases(txtcodigo.getText());
        nuevaFrase.setCategoria(txtcategoria.getText());

        listaFrases.add(nuevaFrase);

        // Limpiar los campos después de agregar
        limpiarCampos();

        // Actualizar la tabla
        mostrarDatosEnTabla();
       
    }//GEN-LAST:event_btingresarActionPerformed

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed
        // TODO add your handling code here:
        // Obtener la fila seleccionada en la tabla
        int filaSeleccionada = tabladatos.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Modificar la frase en la lista
            frases fraseSeleccionada = listaFrases.get(filaSeleccionada);
            fraseSeleccionada.setAutor(txtfraseautor.getText());
            fraseSeleccionada.setTexto(txtfrase.getText());
            fraseSeleccionada.setCod_frases(txtcodigo.getText());
            fraseSeleccionada.setCategoria(txtcategoria.getText());

            // Limpiar los campos después de modificar
            limpiarCampos();

            // Actualizar la tabla
            mostrarDatosEnTabla();
        } else {
            // Mostrar un mensaje indicando que no se ha seleccionado ninguna fila
        }
       
        
    }//GEN-LAST:event_btmodificarActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        // TODO add your handling code here:
         // Obtener la fila seleccionada en la tabla
        int filaSeleccionada = tabladatos.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Eliminar la frase de la lista
            listaFrases.remove(filaSeleccionada);

            // Limpiar los campos después de eliminar
            limpiarCampos();

            // Actualizar la tabla
            mostrarDatosEnTabla();
        } else {
            // Mostrar un mensaje indicando que no se ha seleccionado ninguna fila
        }
       
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconsultarActionPerformed
        // TODO add your handling code here:
         // Obtener la fila seleccionada en la tabla
        int filaSeleccionada = tabladatos.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Mostrar los datos de la frase seleccionada en los campos de texto
            frases fraseSeleccionada = listaFrases.get(filaSeleccionada);
            txtcodigo.setText(fraseSeleccionada.getCod_frases());
            txtfrase.setText(fraseSeleccionada.getTexto());
            txtfraseautor.setText(fraseSeleccionada.getAutor());
            txtcategoria.setText(fraseSeleccionada.getCategoria());
        } else {
            // Mostrar un mensaje indicando que no se ha seleccionado ninguna fila
        }
       
    }//GEN-LAST:event_btconsultarActionPerformed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void botonregresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonregresarMouseClicked
        Admin_Interfaz_Inicio volvi = new Admin_Interfaz_Inicio();
        volvi.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_botonregresarMouseClicked

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
            java.util.logging.Logger.getLogger(Frases_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frases_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frases_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frases_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frases_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonregresar;
    private javax.swing.JButton btconsultar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btingresar;
    private javax.swing.JButton btmodificar;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private proyecto_final.PanelRound panelRound1;
    private proyecto_final.PanelRound panelRound2;
    private proyecto_final.PanelRound panelRound3;
    private proyecto_final.PanelRound panelRound5;
    private proyecto_final.PanelRound panelRound6;
    private proyecto_final.PanelRound panelRound8;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTextField txtcategoria;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtfrase;
    private javax.swing.JTextField txtfraseautor;
    // End of variables declaration//GEN-END:variables
private void mostrarDatosEnTabla() {
        // Crear un DefaultTableModel
        DefaultTableModel modelo = new DefaultTableModel();
        
        // Definir las columnas de la tabla
        modelo.addColumn("Código");
        modelo.addColumn("Frase");
        modelo.addColumn("Autor");
        modelo.addColumn("Categoría");

        // Agregar filas con datos de la lista
        for (frases frase : listaFrases) {
            Object[] fila = {frase.getCod_frases(), frase.getTexto(), frase.getAutor(), frase.getCategoria()};
            modelo.addRow(fila);
        }

        // Establecer el modelo en la tabla
        tabladatos.setModel(modelo);
    }
    

private void limpiarCampos() {
        // Limpiar los campos de texto
        txtcodigo.setText("");
        txtfrase.setText("");
        txtfraseautor.setText("");
        txtcategoria.setText("");
    }

}
