/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author GIGABYTE
 */
public class Sueño_Usuario extends javax.swing.JFrame {
// Declarar variables para almacenar la hora de sueño y despertar para cada día

    private String horaAcostarDomingo, horaLevantarDomingo;
    private String horaAcostarLunes, horaLevantarLunes;
    private String horaAcostarMartes, horaLevantarMartes;
    private String horaAcostarMiercoles, horaLevantarMiercoles;
    private String horaAcostarJueves, horaLevantarJueves;
    private String horaAcostarViernes, horaLevantarViernes;
    private String horaAcostarSabado, horaLevantarSabado;

    public Sueño_Usuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        setupListeners();
    }

    private void setupListeners() {
        // Configurar ActionListener para el botón GUARDAR
        btguardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener la hora de dormir y despertar ingresada por el usuario
                horaAcostarDomingo = txtacostar.getText();
                horaLevantarDomingo = txtlevantar.getText();
                // Repetir el proceso para los demás días de la semana

                // Aquí puedes almacenar la información en una base de datos o hacer lo que necesites
            }
        });

        // Configurar ActionListener para el botón INFORME
        btinforme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear un informe con un gráfico de barras
                generarInforme();
            }
        });
// Configurar ActionListeners para los días de la semana
        domingo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarHoras("Domingo");
            }
        });

        lunes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarHoras("Lunes");
            }
        });

        martes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarHoras("Martes");
            }
        });

        miercoles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarHoras("Miércoles");
            }
        });

        jueves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarHoras("Jueves");
            }
        });

        viernes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarHoras("Viernes");
            }
        });

        sabado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarHoras("Sábado");
            }
        });
    }

    private void generarInforme() {
        // Crear un conjunto de datos para el gráfico de barras
        CategoryDataset dataset = createDataset();

        // Crear el gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
                "Horas de Sueño por Día", // Título del gráfico
                "Día de la Semana", // Etiqueta del eje X
                "Horas de Sueño", // Etiqueta del eje Y
                dataset, // Conjunto de datos
                PlotOrientation.VERTICAL,
                true, true, false
        );

        // Mostrar el gráfico en un nuevo marco
        JFrame frame = new JFrame("Informe de Sueño");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(new ChartPanel(chart));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private CategoryDataset createDataset() {
        // Crear un conjunto de datos para el gráfico de barras
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Agregar las horas de sueño para cada día de la semana
        dataset.addValue(calcularHorasSueno(horaAcostarDomingo, horaLevantarDomingo), "Horas de Sueño", "Domingo");
        // Repetir el proceso para los demás días de la semana

        return dataset;
    }

    private void actualizarHoras(String dia) {
        // Crear un cuadro de diálogo de entrada para que el usuario ingrese las nuevas horas
        String nuevaHoraAcostar = JOptionPane.showInputDialog(this, "Ingrese la nueva hora de dormir para " + dia + " (HH:mm):");
        String nuevaHoraLevantar = JOptionPane.showInputDialog(this, "Ingrese la nueva hora de despertar para " + dia + " (HH:mm):");

        // Validar que se ingresaron valores y que son números
        if (nuevaHoraAcostar != null && nuevaHoraLevantar != null && validarNumeros(nuevaHoraAcostar) && validarNumeros(nuevaHoraLevantar)) {
            // Actualizar las variables correspondientes para el día seleccionado
            switch (dia) {
                case "Domingo":
                    horaAcostarDomingo = nuevaHoraAcostar;
                    horaLevantarDomingo = nuevaHoraLevantar;
                    break;
                case "Lunes":
                    horaAcostarLunes = nuevaHoraAcostar;
                    horaLevantarLunes = nuevaHoraLevantar;
                    break;
                case "Martes":
                    horaAcostarMartes = nuevaHoraAcostar;
                    horaLevantarMartes = nuevaHoraLevantar;
                    break;
                case "Miércoles":
                    horaAcostarMiercoles = nuevaHoraAcostar;
                    horaLevantarMiercoles = nuevaHoraLevantar;
                    break;
                case "Jueves":
                    horaAcostarJueves = nuevaHoraAcostar;
                    horaLevantarJueves = nuevaHoraLevantar;
                    break;
                case "Viernes":
                    horaAcostarViernes = nuevaHoraAcostar;
                    horaLevantarViernes = nuevaHoraLevantar;
                    break;
                case "Sábado":
                    horaAcostarSabado = nuevaHoraAcostar;
                    horaLevantarSabado = nuevaHoraLevantar;
                    break;
            }

            JOptionPane.showMessageDialog(this, "Horas de sueño actualizadas para " + dia);
        } else {
            // Mostrar un mensaje de error si se ingresaron datos incorrectos
            JOptionPane.showMessageDialog(this, "Ingrese valores válidos para las horas de sueño.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

// Método para validar si una cadena es un número
    private boolean validarNumeros(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private double calcularHorasSueno(String horaAcostar, String horaLevantar) {
    // Formato para parsear las cadenas de tiempo
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    try {
        // Convertir las cadenas de tiempo a objetos LocalTime
        LocalTime acostar = LocalTime.parse(horaAcostar, formatter);
        LocalTime levantar = LocalTime.parse(horaLevantar, formatter);

        // Calcular la diferencia entre la hora de acostarse y la hora de levantarse
        double horasSueno = acostar.until(levantar, java.time.temporal.ChronoUnit.HOURS);

        // Calcular la diferencia en minutos y convertirla a horas fraccionarias
        long minutosSueno = acostar.until(levantar, java.time.temporal.ChronoUnit.MINUTES);
        horasSueno += minutosSueno / 60.0;

        return horasSueno;
    } catch (Exception e) {
        // Manejar la excepción si las cadenas no son válidas o no pueden ser convertidas
        System.err.println("Error al calcular las horas de sueño: " + e.getMessage());
        return -1; // Retornar un valor negativo para indicar un error
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelRound4 = new proyecto_final.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new proyecto_final.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        domingo = new javax.swing.JLabel();
        lunes = new javax.swing.JLabel();
        martes = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jueves = new javax.swing.JLabel();
        viernes = new javax.swing.JLabel();
        sabado = new javax.swing.JLabel();
        miercoles = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btguardar = new javax.swing.JButton();
        txtlevantar = new javax.swing.JTextField();
        txtacostar = new javax.swing.JTextField();
        btinforme = new javax.swing.JButton();
        panelinforme = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(84, 71, 132));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_final/Imagenes/boton.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(954, 0, 30, 40));

        panelRound4.setBackground(new java.awt.Color(238, 163, 193));
        panelRound4.setRoundBottomLeft(40);
        panelRound4.setRoundBottomRight(40);
        panelRound4.setRoundTopLeft(40);
        panelRound4.setRoundTopRight(40);

        jLabel1.setBackground(new java.awt.Color(238, 163, 193));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Regresar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 600, 120, 30));

        panelRound1.setBackground(new java.awt.Color(153, 204, 255));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        jLabel6.setBackground(new java.awt.Color(0, 51, 204));
        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SUEÑO");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(jLabel4)
                .addGap(0, 247, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 610, 80));

        domingo.setBackground(new java.awt.Color(0, 51, 204));
        domingo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        domingo.setForeground(new java.awt.Color(255, 255, 255));
        domingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        domingo.setText("DOMINGO");
        domingo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                domingoMouseClicked(evt);
            }
        });
        jPanel1.add(domingo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 140, 30));

        lunes.setBackground(new java.awt.Color(153, 204, 255));
        lunes.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lunes.setForeground(new java.awt.Color(255, 255, 255));
        lunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lunes.setText("LUNES");
        lunes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lunesMouseClicked(evt);
            }
        });
        jPanel1.add(lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 120, 30));

        martes.setBackground(new java.awt.Color(0, 51, 204));
        martes.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        martes.setForeground(new java.awt.Color(255, 255, 255));
        martes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        martes.setText("MARTES");
        martes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                martesMouseClicked(evt);
            }
        });
        jPanel1.add(martes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 120, 30));

        jLabel8.setBackground(new java.awt.Color(0, 51, 204));
        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HORA DE DESPERTAR:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 260, 30));

        jueves.setBackground(new java.awt.Color(0, 51, 204));
        jueves.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jueves.setForeground(new java.awt.Color(255, 255, 255));
        jueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jueves.setText("JUEVES");
        jueves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                juevesMouseClicked(evt);
            }
        });
        jPanel1.add(jueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 140, 30));

        viernes.setBackground(new java.awt.Color(0, 51, 204));
        viernes.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        viernes.setForeground(new java.awt.Color(255, 255, 255));
        viernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viernes.setText("VIERNES");
        viernes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viernesMouseClicked(evt);
            }
        });
        jPanel1.add(viernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 140, 30));

        sabado.setBackground(new java.awt.Color(0, 51, 204));
        sabado.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        sabado.setForeground(new java.awt.Color(255, 255, 255));
        sabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sabado.setText("SABADO");
        sabado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sabadoMouseClicked(evt);
            }
        });
        jPanel1.add(sabado, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 140, 30));

        miercoles.setBackground(new java.awt.Color(0, 51, 204));
        miercoles.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        miercoles.setForeground(new java.awt.Color(255, 255, 255));
        miercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        miercoles.setText("MIERCOLES");
        miercoles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miercolesMouseClicked(evt);
            }
        });
        jPanel1.add(miercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 140, 30));

        jLabel13.setBackground(new java.awt.Color(0, 51, 204));
        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("HORA DE DORMIR:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 230, 30));

        btguardar.setText("GUARDAR");
        jPanel1.add(btguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 120, 30));
        jPanel1.add(txtlevantar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 180, 30));
        jPanel1.add(txtacostar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 180, 30));

        btinforme.setText("INFORME");
        jPanel1.add(btinforme, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 120, 30));

        javax.swing.GroupLayout panelinformeLayout = new javax.swing.GroupLayout(panelinforme);
        panelinforme.setLayout(panelinformeLayout);
        panelinformeLayout.setHorizontalGroup(
            panelinformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        panelinformeLayout.setVerticalGroup(
            panelinformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel1.add(panelinforme, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 480, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Persona_Interfaz_Inicio inicio = new Persona_Interfaz_Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void lunesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lunesMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_lunesMouseClicked

    private void martesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_martesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_martesMouseClicked

    private void miercolesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miercolesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_miercolesMouseClicked

    private void juevesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_juevesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_juevesMouseClicked

    private void viernesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viernesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viernesMouseClicked

    private void sabadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sabadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sabadoMouseClicked

    private void domingoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_domingoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_domingoMouseClicked

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
            java.util.logging.Logger.getLogger(Sueño_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sueño_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sueño_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sueño_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sueño_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btinforme;
    private javax.swing.JLabel domingo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jueves;
    private javax.swing.JLabel lunes;
    private javax.swing.JLabel martes;
    private javax.swing.JLabel miercoles;
    private proyecto_final.PanelRound panelRound1;
    private proyecto_final.PanelRound panelRound4;
    private javax.swing.JPanel panelinforme;
    private javax.swing.JLabel sabado;
    private javax.swing.JTextField txtacostar;
    private javax.swing.JTextField txtlevantar;
    private javax.swing.JLabel viernes;
    // End of variables declaration//GEN-END:variables
}
