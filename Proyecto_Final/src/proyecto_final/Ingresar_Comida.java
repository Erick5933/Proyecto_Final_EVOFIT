/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import Proyecto_Final_Ocultar_letra.TextPrompt;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static proyecto_final.Admin_Interfaz_Inicio.listaComida;
import proyecto_final.Clases.Comidas_Clase;

/**
 *
 * @author Wendy LLivichuzhca
 */
public class Ingresar_Comida extends javax.swing.JFrame {

    
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form Ingresar_Comida
     */
    public Ingresar_Comida() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setLocationRelativeTo(null);

        TextPrompt codigo = new TextPrompt("Ejemplo: 001", Codigo);
        TextPrompt nombre = new TextPrompt("Ingrese el nombre ", Nombre);
        TextPrompt tipo = new TextPrompt("Ingrese su tipo", Tipo);
        TextPrompt proteina = new TextPrompt("Ejemplo: 200g", Proteina);
        TextPrompt carbohidrato = new TextPrompt("Ejemplo: 100g", Carbohidrato);
        TextPrompt calorias = new TextPrompt("Ejemplo: 200", Calorias);
        TextPrompt porcion = new TextPrompt("Ejemplo: 150 g", Porcion);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRound1 = new proyecto_final.PanelRound();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Tipo = new javax.swing.JTextField();
        Proteina = new javax.swing.JTextField();
        Carbohidrato = new javax.swing.JTextField();
        Calorias = new javax.swing.JTextField();
        Porcion = new javax.swing.JTextField();
        panelRound2 = new proyecto_final.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(84, 71, 132));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(70, 86, 132));
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad de proteina:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad de carbohidratos:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cantidad de calorias:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tamaño de la porcion:");

        Codigo.setBackground(new java.awt.Color(70, 86, 132));
        Codigo.setForeground(new java.awt.Color(255, 255, 255));
        Codigo.setBorder(null);
        Codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CodigoKeyTyped(evt);
            }
        });

        Nombre.setBackground(new java.awt.Color(70, 86, 132));
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setBorder(null);
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });

        Tipo.setBackground(new java.awt.Color(70, 86, 132));
        Tipo.setForeground(new java.awt.Color(255, 255, 255));
        Tipo.setBorder(null);
        Tipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TipoKeyTyped(evt);
            }
        });

        Proteina.setBackground(new java.awt.Color(70, 86, 132));
        Proteina.setForeground(new java.awt.Color(255, 255, 255));
        Proteina.setBorder(null);
        Proteina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ProteinaKeyTyped(evt);
            }
        });

        Carbohidrato.setBackground(new java.awt.Color(70, 86, 132));
        Carbohidrato.setForeground(new java.awt.Color(255, 255, 255));
        Carbohidrato.setBorder(null);
        Carbohidrato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CarbohidratoKeyTyped(evt);
            }
        });

        Calorias.setBackground(new java.awt.Color(70, 86, 132));
        Calorias.setForeground(new java.awt.Color(255, 255, 255));
        Calorias.setBorder(null);
        Calorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CaloriasKeyTyped(evt);
            }
        });

        Porcion.setBackground(new java.awt.Color(70, 86, 132));
        Porcion.setForeground(new java.awt.Color(255, 255, 255));
        Porcion.setBorder(null);
        Porcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PorcionKeyTyped(evt);
            }
        });

        panelRound2.setBackground(new java.awt.Color(238, 163, 193));
        panelRound2.setRoundBottomLeft(40);
        panelRound2.setRoundBottomRight(40);
        panelRound2.setRoundTopLeft(40);
        panelRound2.setRoundTopRight(40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ingresar");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Carbohidrato, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Codigo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Tipo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Proteina, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel5))
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator9)
                            .addComponent(Porcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Calorias, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                                .addComponent(Porcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Proteina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(Carbohidrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19))))
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 29, -1, 340));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final/Imagenes/boton.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodigoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoKeyTyped

    private boolean campoVacioAntes = true;
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

    private void TipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TipoKeyTyped
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
    }//GEN-LAST:event_TipoKeyTyped

    private void ProteinaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProteinaKeyTyped
        char c = evt.getKeyChar();
        JTextField proteinaTextField = (JTextField) evt.getSource();

        // Permitir solo dígitos, punto decimal, DELETE y BACK_SPACE
        if (!(Character.isDigit(c) || c == KeyEvent.VK_PERIOD || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }

        // Obtener el texto actual en el campo de proteína
        String proteinaText = proteinaTextField.getText() + c;

        // Validar si el texto es un número válido de gramos (mayor o igual a cero)
        try {
            double proteinaValue = Double.parseDouble(proteinaText);
            if (proteinaValue < 0) {
                evt.consume();
            }
        } catch (NumberFormatException e) {
            evt.consume(); // Consumir el evento si no se puede convertir a un número
        }
    }//GEN-LAST:event_ProteinaKeyTyped

    private void CarbohidratoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CarbohidratoKeyTyped
        char c = evt.getKeyChar();
        JTextField proteinaTextField = (JTextField) evt.getSource();

        // Permitir solo dígitos, punto decimal, DELETE y BACK_SPACE
        if (!(Character.isDigit(c) || c == KeyEvent.VK_PERIOD || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }

        // Obtener el texto actual en el campo de proteína
        String proteinaText = proteinaTextField.getText() + c;

        // Validar si el texto es un número válido de gramos (mayor o igual a cero)
        try {
            double proteinaValue = Double.parseDouble(proteinaText);
            if (proteinaValue < 0) {
                evt.consume();
            }
        } catch (NumberFormatException e) {
            evt.consume(); // Consumir el evento si no se puede convertir a un número
        }
    }//GEN-LAST:event_CarbohidratoKeyTyped

    private void CaloriasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CaloriasKeyTyped
        char c = evt.getKeyChar();
        JTextField proteinaTextField = (JTextField) evt.getSource();

        // Permitir solo dígitos, punto decimal, DELETE y BACK_SPACE
        if (!(Character.isDigit(c) || c == KeyEvent.VK_PERIOD || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }

        // Obtener el texto actual en el campo de proteína
        String proteinaText = proteinaTextField.getText() + c;

        // Validar si el texto es un número válido de gramos (mayor o igual a cero)
        try {
            double proteinaValue = Double.parseDouble(proteinaText);
            if (proteinaValue < 0) {
                evt.consume();
            }
        } catch (NumberFormatException e) {
            evt.consume(); // Consumir el evento si no se puede convertir a un número
        }
    }//GEN-LAST:event_CaloriasKeyTyped

    private void PorcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PorcionKeyTyped
        char c = evt.getKeyChar();
        JTextField proteinaTextField = (JTextField) evt.getSource();

        // Permitir solo dígitos, punto decimal, DELETE y BACK_SPACE
        if (!(Character.isDigit(c) || c == KeyEvent.VK_PERIOD || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }

        // Obtener el texto actual en el campo de proteína
        String proteinaText = proteinaTextField.getText() + c;

        // Validar si el texto es un número válido de gramos (mayor o igual a cero)
        try {
            double proteinaValue = Double.parseDouble(proteinaText);
            if (proteinaValue < 0) {
                evt.consume();
            }
        } catch (NumberFormatException e) {
            evt.consume(); // Consumir el evento si no se puede convertir a un número
        }
    }//GEN-LAST:event_PorcionKeyTyped

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:

        // Verificar si todos los campos obligatorios están llenos
        if (Codigo.getText().isEmpty() || Nombre.getText().isEmpty() || Tipo.getText().isEmpty() || Proteina.getText().isEmpty()
                || Carbohidrato.getText().isEmpty() || Calorias.getText().isEmpty()
                || Porcion.getText().isEmpty()) {
            // Mostrar un mensaje de advertencia y salir del método
            JOptionPane.showMessageDialog(this, "Completa todos los campos antes de guardar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Crear una nueva instancia de Clase_Registrarse y asignar valores
        Comidas_Clase nuevoRegistro = new Comidas_Clase();
        nuevoRegistro.setCodigo(Codigo.getText());
        nuevoRegistro.setNombre(Nombre.getText());
        nuevoRegistro.setTipo(Tipo.getText());
        nuevoRegistro.setCantidad_Proteico(Double.parseDouble(Proteina.getText()));
        nuevoRegistro.setCantidad_Carbodidratos(Double.parseDouble(Carbohidrato.getText()));

        nuevoRegistro.setCantidad_Calorías(Double.parseDouble(Calorias.getText()));
        nuevoRegistro.setTamaño_Porción(Integer.parseInt(Porcion.getText()));

        // Añadir el nuevo registro al ArrayList
        listaComida.add(nuevoRegistro);

        // Mostrar un mensaje de éxito
        JOptionPane.showMessageDialog(this, "Datos guardados exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        // Después de guardar los datos, regresar a la pantalla de inicio de sesión
        Comidas comida = new Comidas();  // Reemplaza con el nombre correcto de tu clase de inicio de sesión
        comida.setVisible(true);

        // Cierra la ventana actual
        this.dispose();


    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Ingresar_Comida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Comida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Comida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Comida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar_Comida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Calorias;
    private javax.swing.JTextField Carbohidrato;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Porcion;
    private javax.swing.JTextField Proteina;
    private javax.swing.JTextField Tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private proyecto_final.PanelRound panelRound1;
    private proyecto_final.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
