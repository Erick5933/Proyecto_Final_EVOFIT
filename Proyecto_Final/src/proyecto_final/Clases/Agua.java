/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final.Clases;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author KENNY
 */
public class Agua {

    private int cantidadAgua;
    private JLabel imagenAguaLabel; // Etiqueta para mostrar la imagen del agua
    private JLabel cantidadLabel;

    private void aumentarAgua() {
        // Lógica para aumentar la cantidad de agua
        cantidadAgua = Math.min(cantidadAgua + 25, 100); // Aumentar en incrementos de 25%, hasta un máximo de 100%
        actualizarInterfaz();
    }

    private void disminuirAgua() {
        // Lógica para disminuir la cantidad de agua
        cantidadAgua = Math.max(cantidadAgua - 25, 0); // Disminuir en decrementos de 25%, hasta un mínimo de 0%
        actualizarInterfaz();
    }

    private void actualizarInterfaz() {

        cantidadLabel.setText("Cantidad de agua: " + cantidadAgua + "%");

        // Actualizar la imagen del agua
        String nombreImagen = cantidadAgua + "%.png";
        ImageIcon nuevaImagen = cargarImagen("proyecto_final/Imagenes/" + nombreImagen);
        imagenAguaLabel.setIcon(nuevaImagen);
    }
    private ImageIcon cargarImagen(String ruta) {
        return new ImageIcon(getClass().getClassLoader().getResource(ruta));
    }
}
