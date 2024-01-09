/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import Proyecto_Final_Ocultar_letra.TextPrompt;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import proyecto_final.Clases.Clase_Registrarse;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Erick
 */
public class Registro extends javax.swing.JFrame {
    public static ArrayList<Clase_Registrarse> Lista = new ArrayList<>();
        private AdminUsuario adminUsuario;


    /**
     * Creates new form Registro
     */
      

    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //this.setUndecorated(true);

        Edad.getEditor().getComponent(0).setForeground(Color.BLACK);
        Edad.getEditor().getComponent(0).setBackground(new Color(70, 86, 132));

        TextPrompt nombre = new TextPrompt("Ingrese nombre completo", Nombre);
        TextPrompt apellido = new TextPrompt("Ingrese apellido completo", Apellido);
        TextPrompt usuario = new TextPrompt("Ingrese su usuario", Usuario);
        TextPrompt contraseña = new TextPrompt("Ingrese su contraseña", Contraseña);
        TextPrompt peso = new TextPrompt("Ingrese su peso (En Kg)", Peso);
        TextPrompt altura = new TextPrompt("Ingrese su altura (En Metros)", Altura);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jScrollBar1 = new javax.swing.JScrollBar();
        fondo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        Usuario = new javax.swing.JTextField();
        Peso = new javax.swing.JTextField();
        Altura = new javax.swing.JTextField();
        Femenino = new javax.swing.JRadioButton();
        Masculino = new javax.swing.JRadioButton();
        Contraseña = new javax.swing.JPasswordField();
        Edad = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        Activo = new javax.swing.JRadioButton();
        ejemplo = new proyecto_final.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        Medio = new javax.swing.JRadioButton();
        Sedentario = new javax.swing.JRadioButton();
        regresar = new javax.swing.JButton();
        panelRound2 = new proyecto_final.PanelRound();
        panelRound1 = new proyecto_final.PanelRound();
        jLabel16 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(71, 71, 132));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(44, 44, 59));
        fondo.setEnabled(false);
        fondo.setFocusable(false);
        fondo.setRequestFocusEnabled(false);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuario:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña:");

        jLabel7.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Peso:");

        jLabel8.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Altura");

        jLabel9.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Edad:");

        jLabel10.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Actividad:");

        jLabel11.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Genero:");

        Nombre.setBackground(new java.awt.Color(70, 86, 132));
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
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

        Apellido.setBackground(new java.awt.Color(70, 86, 132));
        Apellido.setForeground(new java.awt.Color(255, 255, 255));
        Apellido.setCaretColor(new java.awt.Color(255, 255, 255));
        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });
        Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidoKeyTyped(evt);
            }
        });

        Usuario.setBackground(new java.awt.Color(70, 86, 132));
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setCaretColor(new java.awt.Color(255, 255, 255));
        Usuario.setVerifyInputWhenFocusTarget(false);
        Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UsuarioKeyTyped(evt);
            }
        });

        Peso.setBackground(new java.awt.Color(70, 86, 132));
        Peso.setForeground(new java.awt.Color(255, 255, 255));
        Peso.setCaretColor(new java.awt.Color(255, 255, 255));
        Peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesoActionPerformed(evt);
            }
        });
        Peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PesoKeyTyped(evt);
            }
        });

        Altura.setBackground(new java.awt.Color(70, 86, 132));
        Altura.setForeground(new java.awt.Color(255, 255, 255));
        Altura.setCaretColor(new java.awt.Color(255, 255, 255));
        Altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AlturaKeyTyped(evt);
            }
        });

        Femenino.setBackground(new java.awt.Color(70, 86, 132));
        buttonGroup1.add(Femenino);
        Femenino.setForeground(new java.awt.Color(255, 255, 255));
        Femenino.setText("Femenino");
        Femenino.setToolTipText("");

        Masculino.setBackground(new java.awt.Color(70, 86, 132));
        buttonGroup1.add(Masculino);
        Masculino.setForeground(new java.awt.Color(255, 255, 255));
        Masculino.setText("Masculino");

        Contraseña.setBackground(new java.awt.Color(70, 86, 132));
        Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña.setCaretColor(new java.awt.Color(255, 255, 255));
        Contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ContraseñaKeyTyped(evt);
            }
        });

        Edad.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        Edad.setModel(new javax.swing.SpinnerNumberModel(14, 14, 70, 1));
        Edad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                EdadStateChanged(evt);
            }
        });
        Edad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EdadMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Activo.setBackground(new java.awt.Color(70, 86, 132));
        buttonGroup2.add(Activo);
        Activo.setForeground(new java.awt.Color(255, 255, 255));
        Activo.setText("Activo");

        ejemplo.setBackground(new java.awt.Color(70, 86, 132));
        ejemplo.setRoundBottomLeft(30);
        ejemplo.setRoundBottomRight(30);
        ejemplo.setRoundTopLeft(30);
        ejemplo.setRoundTopRight(30);
        ejemplo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("REGISTRARSE");
        ejemplo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 170, 40));

        Medio.setBackground(new java.awt.Color(70, 86, 132));
        buttonGroup2.add(Medio);
        Medio.setForeground(new java.awt.Color(255, 255, 255));
        Medio.setText("Medio");
        Medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedioActionPerformed(evt);
            }
        });

        Sedentario.setBackground(new java.awt.Color(70, 86, 132));
        buttonGroup2.add(Sedentario);
        Sedentario.setForeground(new java.awt.Color(255, 255, 255));
        Sedentario.setText("Sedentario");
        Sedentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SedentarioActionPerformed(evt);
            }
        });

        regresar.setBackground(new java.awt.Color(255, 255, 255));
        regresar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(fondoLayout.createSequentialGroup()
                                            .addComponent(Femenino, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Masculino, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(Apellido)
                                        .addComponent(Usuario)))
                                .addComponent(Contraseña))
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addComponent(Peso)
                                .addComponent(Altura))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(regresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(Activo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Medio, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Sedentario)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ejemplo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ejemplo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Altura, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(9, 9, 9)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Edad)
                    .addComponent(Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Activo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Medio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sedentario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Masculino, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(Femenino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 470));
        fondo.getAccessibleContext().setAccessibleName("");

        panelRound2.setBackground(new java.awt.Color(44, 44, 59));

        panelRound1.setBackground(new java.awt.Color(71, 71, 132));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("EVOFIT");
        panelRound1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 50, 300, -1));
        panelRound1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 280, 28));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final/Imagenes/boton.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final/Imagenes/Logo_conCirculo-removebg-preview (2).png"))); // NOI18N
        panelRound1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 280, 250));

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 320, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoActionPerformed

    private void PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesoActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

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

    private void ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoKeyTyped
        // TODO add your handling code here:

        char c = evt.getKeyChar();
        if (campoVacioAntes && !Character.isLetter(c) && Character.isWhitespace(c)) {
            evt.consume();
        } else if (Character.isWhitespace(c) && Character.isLetter(c) || Character.isDigit(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor, ingrese solo letras y espacios.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
        campoVacioAntes = Apellido.getText().isEmpty();

        JTextField textField = (JTextField) evt.getSource();
        if (textField.getText().length() >= 50) {
            evt.consume();
        }

    }//GEN-LAST:event_ApellidoKeyTyped

    private void UsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsuarioKeyTyped
        char c = evt.getKeyChar();
        JTextField textField = (JTextField) evt.getSource();
        if (campoVacioAntes && !Character.isLetterOrDigit(c) && Character.isWhitespace(c)) {
            evt.consume();
        } else if (!Character.isLetterOrDigit(c) && Character.isWhitespace(c) && c != '-' && c != '.') {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese letras,numeros,guion,punto", "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
        campoVacioAntes = textField.getText().isEmpty();
        if (textField.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_UsuarioKeyTyped

    private void ContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñaKeyTyped
        char c = evt.getKeyChar();
        JTextField textField = (JTextField) evt.getSource();
        if (campoVacioAntes && !Character.isLetterOrDigit(c) && Character.isWhitespace(c)) {
            evt.consume();
        } else if (!Character.isLetterOrDigit(c) && Character.isWhitespace(c) && c != '-' && c != '.') {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese letras,numeros,guion,punto", "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
        campoVacioAntes = textField.getText().isEmpty();
        if (textField.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_ContraseñaKeyTyped

    private void PesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesoKeyTyped

        char c = evt.getKeyChar();

        // Verificar si el carácter ingresado es un dígito o un punto decimal
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Consumir el evento para evitar que se ingrese el carácter no válido
        }

        // Verificar la longitud total y la posición del punto decimal
        String text = Peso.getText();
        if (text.contains(".")) {
            int dotIndex = text.indexOf('.');
            // Permitir solo un punto decimal y un máximo de 2 decimales después del punto
            if (text.length() - dotIndex > 2) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_PesoKeyTyped

    private void AlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlturaKeyTyped
        char c = evt.getKeyChar();

        // Verificar si el carácter ingresado es un dígito o un punto decimal
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Consumir el evento para evitar que se ingrese el carácter no válido
        }

        // Verificar la longitud total y la posición del punto decimal
        String text = Altura.getText();
        if (text.contains(".")) {
            int dotIndex = text.indexOf('.');
            // Permitir solo un punto decimal y un máximo de 2 decimales después del punto
            if (text.length() - dotIndex > 2) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_AlturaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Verificar si todos los campos obligatorios están llenos
        if (Nombre.getText().isEmpty() || Apellido.getText().isEmpty() || Usuario.getText().isEmpty()
                || Contraseña.getText().isEmpty() || Edad.getValue() == null || Peso.getText().isEmpty()
                || Altura.getText().isEmpty() || (!Activo.isSelected() && !Medio.isSelected() && !Sedentario.isSelected())
                || (!Femenino.isSelected() && !Masculino.isSelected())) {
            // Mostrar un mensaje de advertencia y salir del método
            JOptionPane.showMessageDialog(this, "Completa todos los campos antes de guardar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Crear una nueva instancia de Clase_Registrarse y asignar valores
        Clase_Registrarse nuevoRegistro = new Clase_Registrarse();
        nuevoRegistro.setNombre(Nombre.getText());
        nuevoRegistro.setApellido(Apellido.getText());
        nuevoRegistro.setUsuario(Usuario.getText());
        nuevoRegistro.setContraseña(Contraseña.getText());

        // Validar la edad en el rango de 14 a 80
        int edadValue = (int) Edad.getValue();
        if (edadValue >= 14 && edadValue <= 80) {
            nuevoRegistro.setEdad(edadValue);
        } else {
            // Mostrar un mensaje de error y salir del método
            JOptionPane.showMessageDialog(this, "La edad debe estar en el rango de 14 a 80.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        nuevoRegistro.setPeso(Double.parseDouble(Peso.getText()));
        nuevoRegistro.setAltura(Double.parseDouble(Altura.getText()));

        if (Activo.isSelected()) {
            nuevoRegistro.setActividad("Activo");
        } else if (Medio.isSelected()) {
            nuevoRegistro.setActividad("Medio");
        } else if (Sedentario.isSelected()) {
            nuevoRegistro.setActividad("Sedentario");
        }

        if (Femenino.isSelected()) {
            nuevoRegistro.setGenero("Femenino");
        } else if (Masculino.isSelected()) {
            nuevoRegistro.setGenero("Masculino");
        }
        
        

        // Añadir el nuevo registro al ArrayList
        Lista.add(nuevoRegistro);
        

        // Mostrar un mensaje de éxito
        JOptionPane.showMessageDialog(this, "Datos guardados exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);


        // Después de guardar los datos, regresar a la pantalla de inicio de sesión
        Login ventanaLogin = new Login();  // Reemplaza con el nombre correcto de tu clase de inicio de sesión
        ventanaLogin.setVisible(true);

        // Cierra la ventana actual
        this.dispose();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void MedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedioActionPerformed

    private void SedentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SedentarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SedentarioActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        Login newFrame = new Login();
        newFrame.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_regresarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();//GEN-LAST:event_jLabel1MouseClicked
    }
    private void EdadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EdadMouseClicked
        int edadSeleccionada = (int) Edad.getValue();

        // Verificar si la edad está dentro del rango permitido
        if (edadSeleccionada < 14 || edadSeleccionada > 70) {
            // Mostrar un mensaje de error o tomar la acción correspondiente
            JOptionPane.showMessageDialog(this, "La edad debe estar entre 14 y 70 años", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // La edad está dentro del rango permitido, realizar las acciones necesarias
            // ...
        }
    }//GEN-LAST:event_EdadMouseClicked

    private void EdadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_EdadStateChanged
        // TODO add your handling code here:

        int edadSeleccionada = (int) Edad.getValue();

        // Verificar si la edad está dentro del rango permitido
        if (edadSeleccionada < 14 || edadSeleccionada > 70) {
            // Mostrar un mensaje de error o tomar la acción correspondiente
            JOptionPane.showMessageDialog(this, "La edad debe estar entre 14 y 70 años", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // La edad está dentro del rango permitido, realizar las acciones necesarias
            // ...
        }
    }//GEN-LAST:event_EdadStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Activo;
    private javax.swing.JTextField Altura;
    private javax.swing.JTextField Apellido;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JSpinner Edad;
    private javax.swing.JRadioButton Femenino;
    private javax.swing.JRadioButton Masculino;
    private javax.swing.JRadioButton Medio;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Peso;
    private javax.swing.JRadioButton Sedentario;
    private javax.swing.JTextField Usuario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private proyecto_final.PanelRound ejemplo;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator4;
    private proyecto_final.PanelRound panelRound1;
    private proyecto_final.PanelRound panelRound2;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables

}
