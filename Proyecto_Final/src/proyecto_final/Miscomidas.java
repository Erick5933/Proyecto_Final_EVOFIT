/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Erick
 */
public class Miscomidas extends javax.swing.JFrame {

    /**
     * Creates new form Miscomidas
     */
    public Miscomidas() {
        initComponents();

        this.setLocationRelativeTo(null);

    }
    private boolean campoVacioAntes = true;

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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        calorias = new javax.swing.JTextField();
        panelRound7 = new proyecto_final.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        proteinas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        grasas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        carbohidratos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelRound1.setBackground(new java.awt.Color(44, 44, 59));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(71, 71, 132));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MIS COMIDAS");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final/Imagenes/boton.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final/Imagenes/modificar.png"))); // NOI18N
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final/Imagenes/eliminar.png"))); // NOI18N
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final/Imagenes/agregar.png"))); // NOI18N
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 40));

        Nombre.setBackground(new java.awt.Color(70, 86, 132));
        Nombre.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 12)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nombre.setCaretColor(new java.awt.Color(255, 255, 255));
        Nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });
        panelRound1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 180, 23));

        calorias.setBackground(new java.awt.Color(70, 86, 132));
        calorias.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 12)); // NOI18N
        calorias.setForeground(new java.awt.Color(255, 255, 255));
        calorias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        calorias.setCaretColor(new java.awt.Color(255, 255, 255));
        calorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caloriasActionPerformed(evt);
            }
        });
        calorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caloriasKeyTyped(evt);
            }
        });
        panelRound1.add(calorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 90, 23));

        panelRound7.setBackground(new java.awt.Color(53, 55, 86));
        panelRound7.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        panelRound7.setRoundBottomRight(40);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final/Imagenes/buscar_morado.png"))); // NOI18N

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        panelRound1.add(panelRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Calorias: ");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        jLabel10.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Ingredientes");
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, 30));

        proteinas.setBackground(new java.awt.Color(70, 86, 132));
        proteinas.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 12)); // NOI18N
        proteinas.setForeground(new java.awt.Color(255, 255, 255));
        proteinas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        proteinas.setCaretColor(new java.awt.Color(255, 255, 255));
        proteinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinasActionPerformed(evt);
            }
        });
        proteinas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                proteinasKeyTyped(evt);
            }
        });
        panelRound1.add(proteinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 90, 23));

        jLabel11.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Proteinas: ");
        panelRound1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 80, 20));

        grasas.setBackground(new java.awt.Color(70, 86, 132));
        grasas.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 12)); // NOI18N
        grasas.setForeground(new java.awt.Color(255, 255, 255));
        grasas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        grasas.setCaretColor(new java.awt.Color(255, 255, 255));
        grasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grasasActionPerformed(evt);
            }
        });
        grasas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                grasasKeyTyped(evt);
            }
        });
        panelRound1.add(grasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 90, 23));

        jLabel12.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Grasas: ");
        panelRound1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));

        carbohidratos.setBackground(new java.awt.Color(70, 86, 132));
        carbohidratos.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 12)); // NOI18N
        carbohidratos.setForeground(new java.awt.Color(255, 255, 255));
        carbohidratos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        carbohidratos.setCaretColor(new java.awt.Color(255, 255, 255));
        carbohidratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carbohidratosActionPerformed(evt);
            }
        });
        carbohidratos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                carbohidratosKeyTyped(evt);
            }
        });
        panelRound1.add(carbohidratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 90, 23));

        jLabel13.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Hidratos: ");
        panelRound1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 90, 20));

        jTable1.setBackground(new java.awt.Color(48, 45, 59));
        jTable1.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Calorias", "Proteinas", "Grasas", "Hidratos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 470, 120));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final/Imagenes/atras_32px.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 40, -1));

        jTextArea1.setBackground(new java.awt.Color(70, 86, 132));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        panelRound1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 100, 140));

        jLabel14.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Nombre: ");
        panelRound1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped

        char c = evt.getKeyChar();
        if (campoVacioAntes && !Character.isLetter(c) && Character.isWhitespace(c)) {
            evt.consume();
        } else if (Character.isWhitespace(c) && Character.isLetter(c) || Character.isDigit(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor, ingrese solo letras y espacios.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
        campoVacioAntes = Nombre.getText().isEmpty();

        JTextField textField = (JTextField) evt.getSource();
        if (textField.getText().length() >= 50) {
            evt.consume();
        }
    }//GEN-LAST:event_NombreKeyTyped

    private void caloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caloriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caloriasActionPerformed

    private void caloriasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caloriasKeyTyped

        char c = evt.getKeyChar();

        // Verificar si el carácter ingresado es un dígito o un punto decimal
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Consumir el evento para evitar que se ingrese el carácter no válido
        }

        // Verificar la longitud total y la posición del punto decimal
        String text = calorias.getText();
        if (text.contains(".")) {
            int dotIndex = text.indexOf('.');
            // Permitir solo un punto decimal y un máximo de 2 decimales después del punto
            if (text.length() - dotIndex > 2) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_caloriasKeyTyped

    private void proteinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinasActionPerformed

    private void proteinasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proteinasKeyTyped
        // TODO add your handling code here:

        char c = evt.getKeyChar();

        // Verificar si el carácter ingresado es un dígito o un punto decimal
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Consumir el evento para evitar que se ingrese el carácter no válido
        }

        // Verificar la longitud total y la posición del punto decimal
        String text = calorias.getText();
        if (text.contains(".")) {
            int dotIndex = text.indexOf('.');
            // Permitir solo un punto decimal y un máximo de 2 decimales después del punto
            if (text.length() - dotIndex > 2) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_proteinasKeyTyped

    private void grasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grasasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grasasActionPerformed

    private void grasasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grasasKeyTyped
        // TODO add your handling code here:

        char c = evt.getKeyChar();

        // Verificar si el carácter ingresado es un dígito o un punto decimal
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Consumir el evento para evitar que se ingrese el carácter no válido
        }

        // Verificar la longitud total y la posición del punto decimal
        String text = calorias.getText();
        if (text.contains(".")) {
            int dotIndex = text.indexOf('.');
            // Permitir solo un punto decimal y un máximo de 2 decimales después del punto
            if (text.length() - dotIndex > 2) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_grasasKeyTyped

    private void carbohidratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carbohidratosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carbohidratosActionPerformed

    private void carbohidratosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carbohidratosKeyTyped
        // TODO add your handling code here:

        char c = evt.getKeyChar();

        // Verificar si el carácter ingresado es un dígito o un punto decimal
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Consumir el evento para evitar que se ingrese el carácter no válido
        }

        // Verificar la longitud total y la posición del punto decimal
        String text = calorias.getText();
        if (text.contains(".")) {
            int dotIndex = text.indexOf('.');
            // Permitir solo un punto decimal y un máximo de 2 decimales después del punto
            if (text.length() - dotIndex > 2) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_carbohidratosKeyTyped

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        Persona_Interfaz_Inicio ventanaLogin = new Persona_Interfaz_Inicio();  // Reemplaza con el nombre correcto de tu clase de inicio de sesión
        ventanaLogin.setVisible(true);

        // Cierra la ventana actual
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Miscomidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Miscomidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Miscomidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Miscomidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Miscomidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField calorias;
    private javax.swing.JTextField carbohidratos;
    private javax.swing.JTextField grasas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private proyecto_final.PanelRound panelRound1;
    private proyecto_final.PanelRound panelRound2;
    private proyecto_final.PanelRound panelRound7;
    private javax.swing.JTextField proteinas;
    // End of variables declaration//GEN-END:variables
}
